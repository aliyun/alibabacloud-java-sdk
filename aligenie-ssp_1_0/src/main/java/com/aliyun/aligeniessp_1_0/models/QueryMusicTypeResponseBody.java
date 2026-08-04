// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class QueryMusicTypeResponseBody extends TeaModel {
    /**
     * <p>Status code returned by the alarm service</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>error message</p>
     * 
     * <strong>example:</strong>
     * <p>设备账号未关联</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>request ID</p>
     * 
     * <strong>example:</strong>
     * <p>43<em><strong>28C-A810-5</strong></em>-8747-EC226A086881</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of ringtone types</p>
     */
    @NameInMap("Result")
    public java.util.List<QueryMusicTypeResponseBodyResult> result;

    public static QueryMusicTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMusicTypeResponseBody self = new QueryMusicTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMusicTypeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryMusicTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMusicTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMusicTypeResponseBody setResult(java.util.List<QueryMusicTypeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryMusicTypeResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryMusicTypeResponseBodyResult extends TeaModel {
        /**
         * <p>Ringtone type ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MusicType")
        public Long musicType;

        /**
         * <p>Name of the ringtone category</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MusicTypeName")
        public String musicTypeName;

        public static QueryMusicTypeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMusicTypeResponseBodyResult self = new QueryMusicTypeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryMusicTypeResponseBodyResult setMusicType(Long musicType) {
            this.musicType = musicType;
            return this;
        }
        public Long getMusicType() {
            return this.musicType;
        }

        public QueryMusicTypeResponseBodyResult setMusicTypeName(String musicTypeName) {
            this.musicTypeName = musicTypeName;
            return this;
        }
        public String getMusicTypeName() {
            return this.musicTypeName;
        }

    }

}
