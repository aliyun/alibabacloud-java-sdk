// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetWhatsappHealthStatusResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetWhatsappHealthStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
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

    public static GetWhatsappHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWhatsappHealthStatusResponseBody self = new GetWhatsappHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWhatsappHealthStatusResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetWhatsappHealthStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWhatsappHealthStatusResponseBody setData(GetWhatsappHealthStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWhatsappHealthStatusResponseBodyData getData() {
        return this.data;
    }

    public GetWhatsappHealthStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWhatsappHealthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWhatsappHealthStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWhatsappHealthStatusResponseBodyDataEntitiesErrors extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>141006</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>There is an error with the payment method.</p>
         */
        @NameInMap("ErrorDescription")
        public String errorDescription;

        /**
         * <strong>example:</strong>
         * <p>There was an error with your payment method. Please add a new payment method to the account.</p>
         */
        @NameInMap("PossibleSolution")
        public String possibleSolution;

        public static GetWhatsappHealthStatusResponseBodyDataEntitiesErrors build(java.util.Map<String, ?> map) throws Exception {
            GetWhatsappHealthStatusResponseBodyDataEntitiesErrors self = new GetWhatsappHealthStatusResponseBodyDataEntitiesErrors();
            return TeaModel.build(map, self);
        }

        public GetWhatsappHealthStatusResponseBodyDataEntitiesErrors setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetWhatsappHealthStatusResponseBodyDataEntitiesErrors setErrorDescription(String errorDescription) {
            this.errorDescription = errorDescription;
            return this;
        }
        public String getErrorDescription() {
            return this.errorDescription;
        }

        public GetWhatsappHealthStatusResponseBodyDataEntitiesErrors setPossibleSolution(String possibleSolution) {
            this.possibleSolution = possibleSolution;
            return this;
        }
        public String getPossibleSolution() {
            return this.possibleSolution;
        }

    }

    public static class GetWhatsappHealthStatusResponseBodyDataEntities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3992****</p>
         */
        @NameInMap("BusinessId")
        public String businessId;

        /**
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("CanSendMessage")
        public String canSendMessage;

        /**
         * <strong>example:</strong>
         * <p>PHONE_NUMBER</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("Errors")
        public java.util.List<GetWhatsappHealthStatusResponseBodyDataEntitiesErrors> errors;

        /**
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>86138****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>939928****</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <strong>example:</strong>
         * <p>39939***</p>
         */
        @NameInMap("WabaId")
        public String wabaId;

        public static GetWhatsappHealthStatusResponseBodyDataEntities build(java.util.Map<String, ?> map) throws Exception {
            GetWhatsappHealthStatusResponseBodyDataEntities self = new GetWhatsappHealthStatusResponseBodyDataEntities();
            return TeaModel.build(map, self);
        }

        public GetWhatsappHealthStatusResponseBodyDataEntities setBusinessId(String businessId) {
            this.businessId = businessId;
            return this;
        }
        public String getBusinessId() {
            return this.businessId;
        }

        public GetWhatsappHealthStatusResponseBodyDataEntities setCanSendMessage(String canSendMessage) {
            this.canSendMessage = canSendMessage;
            return this;
        }
        public String getCanSendMessage() {
            return this.canSendMessage;
        }

        public GetWhatsappHealthStatusResponseBodyDataEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public GetWhatsappHealthStatusResponseBodyDataEntities setErrors(java.util.List<GetWhatsappHealthStatusResponseBodyDataEntitiesErrors> errors) {
            this.errors = errors;
            return this;
        }
        public java.util.List<GetWhatsappHealthStatusResponseBodyDataEntitiesErrors> getErrors() {
            return this.errors;
        }

        public GetWhatsappHealthStatusResponseBodyDataEntities setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetWhatsappHealthStatusResponseBodyDataEntities setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetWhatsappHealthStatusResponseBodyDataEntities setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetWhatsappHealthStatusResponseBodyDataEntities setWabaId(String wabaId) {
            this.wabaId = wabaId;
            return this;
        }
        public String getWabaId() {
            return this.wabaId;
        }

    }

    public static class GetWhatsappHealthStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("CanSendMessage")
        public String canSendMessage;

        @NameInMap("Entities")
        public java.util.List<GetWhatsappHealthStatusResponseBodyDataEntities> entities;

        public static GetWhatsappHealthStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWhatsappHealthStatusResponseBodyData self = new GetWhatsappHealthStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWhatsappHealthStatusResponseBodyData setCanSendMessage(String canSendMessage) {
            this.canSendMessage = canSendMessage;
            return this;
        }
        public String getCanSendMessage() {
            return this.canSendMessage;
        }

        public GetWhatsappHealthStatusResponseBodyData setEntities(java.util.List<GetWhatsappHealthStatusResponseBodyDataEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<GetWhatsappHealthStatusResponseBodyDataEntities> getEntities() {
            return this.entities;
        }

    }

}
