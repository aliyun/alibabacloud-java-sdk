// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyOrderDeliveryAddressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ModifyOrderDeliveryAddressResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

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
