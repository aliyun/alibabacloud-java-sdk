// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendLogisticsSmsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendLogisticsSmsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SendLogisticsSmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendLogisticsSmsResponseBody self = new SendLogisticsSmsResponseBody();
        return TeaModel.build(map, self);
    }

    public SendLogisticsSmsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SendLogisticsSmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendLogisticsSmsResponseBody setData(SendLogisticsSmsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendLogisticsSmsResponseBodyData getData() {
        return this.data;
    }

    public SendLogisticsSmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendLogisticsSmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendLogisticsSmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendLogisticsSmsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("BizId")
        public String bizId;

        public static SendLogisticsSmsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendLogisticsSmsResponseBodyData self = new SendLogisticsSmsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendLogisticsSmsResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

}
