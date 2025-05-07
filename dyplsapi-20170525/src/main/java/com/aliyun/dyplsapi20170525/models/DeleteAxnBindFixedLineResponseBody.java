// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxnBindFixedLineResponseBody extends TeaModel {
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
    public DeleteAxnBindFixedLineResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AE2D6997-643A-59CB-9B3C-918572E5CEAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAxnBindFixedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxnBindFixedLineResponseBody self = new DeleteAxnBindFixedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAxnBindFixedLineResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteAxnBindFixedLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAxnBindFixedLineResponseBody setData(DeleteAxnBindFixedLineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteAxnBindFixedLineResponseBodyData getData() {
        return this.data;
    }

    public DeleteAxnBindFixedLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAxnBindFixedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAxnBindFixedLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteAxnBindFixedLineResponseBodyData extends TeaModel {
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

        public static DeleteAxnBindFixedLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteAxnBindFixedLineResponseBodyData self = new DeleteAxnBindFixedLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteAxnBindFixedLineResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteAxnBindFixedLineResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteAxnBindFixedLineResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
