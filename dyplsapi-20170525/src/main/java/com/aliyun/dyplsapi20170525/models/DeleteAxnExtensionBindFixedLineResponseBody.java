// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxnExtensionBindFixedLineResponseBody extends TeaModel {
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
    public DeleteAxnExtensionBindFixedLineResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>conflict with subs id=1000203635098305, phoneA conflict</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3DA9D6DF-C5FA-5A0D-B6C2-547B1FD1F9B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAxnExtensionBindFixedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxnExtensionBindFixedLineResponseBody self = new DeleteAxnExtensionBindFixedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAxnExtensionBindFixedLineResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteAxnExtensionBindFixedLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAxnExtensionBindFixedLineResponseBody setData(DeleteAxnExtensionBindFixedLineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteAxnExtensionBindFixedLineResponseBodyData getData() {
        return this.data;
    }

    public DeleteAxnExtensionBindFixedLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAxnExtensionBindFixedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAxnExtensionBindFixedLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteAxnExtensionBindFixedLineResponseBodyData extends TeaModel {
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
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteAxnExtensionBindFixedLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteAxnExtensionBindFixedLineResponseBodyData self = new DeleteAxnExtensionBindFixedLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteAxnExtensionBindFixedLineResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteAxnExtensionBindFixedLineResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteAxnExtensionBindFixedLineResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
