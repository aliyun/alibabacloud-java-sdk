// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateAxnExtensionBindFixedLineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateAxnExtensionBindFixedLineResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>31031C54-7727-5057-9ED1-FA276B64205E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateAxnExtensionBindFixedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAxnExtensionBindFixedLineResponseBody self = new UpdateAxnExtensionBindFixedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAxnExtensionBindFixedLineResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateAxnExtensionBindFixedLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAxnExtensionBindFixedLineResponseBody setData(UpdateAxnExtensionBindFixedLineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAxnExtensionBindFixedLineResponseBodyData getData() {
        return this.data;
    }

    public UpdateAxnExtensionBindFixedLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAxnExtensionBindFixedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAxnExtensionBindFixedLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateAxnExtensionBindFixedLineResponseBodyData extends TeaModel {
        /**
         * <p>响应码 0：成功，其它失败，具体见文档</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static UpdateAxnExtensionBindFixedLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAxnExtensionBindFixedLineResponseBodyData self = new UpdateAxnExtensionBindFixedLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAxnExtensionBindFixedLineResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateAxnExtensionBindFixedLineResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateAxnExtensionBindFixedLineResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
