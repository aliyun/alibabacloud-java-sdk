// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyOrderDeliveryAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Model")
    @Validation(required = true)
    public ModifyOrderDeliveryAddressResponseModel model;

    public static ModifyOrderDeliveryAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrderDeliveryAddressResponse self = new ModifyOrderDeliveryAddressResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOrderDeliveryAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyOrderDeliveryAddressResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyOrderDeliveryAddressResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyOrderDeliveryAddressResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ModifyOrderDeliveryAddressResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ModifyOrderDeliveryAddressResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ModifyOrderDeliveryAddressResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifyOrderDeliveryAddressResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ModifyOrderDeliveryAddressResponse setModel(ModifyOrderDeliveryAddressResponseModel model) {
        this.model = model;
        return this;
    }
    public ModifyOrderDeliveryAddressResponseModel getModel() {
        return this.model;
    }

    public static class ModifyOrderDeliveryAddressResponseModel extends TeaModel {
        @NameInMap("ResultInfo")
        @Validation(required = true)
        public java.util.Map<String, ?> resultInfo;

        public static ModifyOrderDeliveryAddressResponseModel build(java.util.Map<String, ?> map) throws Exception {
            ModifyOrderDeliveryAddressResponseModel self = new ModifyOrderDeliveryAddressResponseModel();
            return TeaModel.build(map, self);
        }

        public ModifyOrderDeliveryAddressResponseModel setResultInfo(java.util.Map<String, ?> resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public java.util.Map<String, ?> getResultInfo() {
            return this.resultInfo;
        }

    }

}
