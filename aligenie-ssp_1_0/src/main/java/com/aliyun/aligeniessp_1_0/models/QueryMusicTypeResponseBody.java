// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class QueryMusicTypeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("MusicType")
        public Long musicType;

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
