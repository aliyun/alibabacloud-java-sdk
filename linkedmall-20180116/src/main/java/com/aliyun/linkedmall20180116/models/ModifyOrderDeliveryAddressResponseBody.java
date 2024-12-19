// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyOrderDeliveryAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ModifyOrderDeliveryAddressResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>5E2D59BA-4EB0-45C4-A0D7-D98C1A4B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ModifyOrderDeliveryAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrderDeliveryAddressResponseBody self = new ModifyOrderDeliveryAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOrderDeliveryAddressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyOrderDeliveryAddressResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ModifyOrderDeliveryAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyOrderDeliveryAddressResponseBody setModel(ModifyOrderDeliveryAddressResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ModifyOrderDeliveryAddressResponseBodyModel getModel() {
        return this.model;
    }

    public ModifyOrderDeliveryAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyOrderDeliveryAddressResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ModifyOrderDeliveryAddressResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ModifyOrderDeliveryAddressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifyOrderDeliveryAddressResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ModifyOrderDeliveryAddressResponseBodyModel extends TeaModel {
        @NameInMap("ResultInfo")
        public java.util.Map<String, ?> resultInfo;

        public static ModifyOrderDeliveryAddressResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ModifyOrderDeliveryAddressResponseBodyModel self = new ModifyOrderDeliveryAddressResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ModifyOrderDeliveryAddressResponseBodyModel setResultInfo(java.util.Map<String, ?> resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public java.util.Map<String, ?> getResultInfo() {
            return this.resultInfo;
        }

    }

}
