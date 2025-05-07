// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxbBindFixedLineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>isp.SYSTEM_ERROR</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteAxbBindFixedLineResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F036366A-0182-5066-A686-19C4C82F2D51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAxbBindFixedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxbBindFixedLineResponseBody self = new DeleteAxbBindFixedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAxbBindFixedLineResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteAxbBindFixedLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAxbBindFixedLineResponseBody setData(DeleteAxbBindFixedLineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteAxbBindFixedLineResponseBodyData getData() {
        return this.data;
    }

    public DeleteAxbBindFixedLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAxbBindFixedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAxbBindFixedLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteAxbBindFixedLineResponseBodyData extends TeaModel {
        /**
         * <p>响应码  0-成功</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>响应消息</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>是否处理成功  true-成功  false-失败</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteAxbBindFixedLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteAxbBindFixedLineResponseBodyData self = new DeleteAxbBindFixedLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteAxbBindFixedLineResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteAxbBindFixedLineResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteAxbBindFixedLineResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
