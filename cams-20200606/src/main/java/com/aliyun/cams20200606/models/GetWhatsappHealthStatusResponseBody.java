// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetWhatsappHealthStatusResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetWhatsappHealthStatusResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DAC72B08-3327-33EF-BEDC-8EC3E83A6575</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>141006</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The description of the error.</p>
         * 
         * <strong>example:</strong>
         * <p>There is an error with the payment method.</p>
         */
        @NameInMap("ErrorDescription")
        public String errorDescription;

        /**
         * <p>The possible solution to the error.</p>
         * 
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
         * <p>The Business Manager ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3992****</p>
         */
        @NameInMap("BusinessId")
        public String businessId;

        /**
         * <p>Indicates whether the messages can be sent.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("CanSendMessage")
        public String canSendMessage;

        /**
         * <p>The entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>PHONE_NUMBER</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The reasons why the messages failed to be sent.</p>
         */
        @NameInMap("Errors")
        public java.util.List<GetWhatsappHealthStatusResponseBodyDataEntitiesErrors> errors;

        /**
         * <p>The template language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The phone number to which the messages are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>86138****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The template code. This parameter is returned when the NodeType parameter is set to <strong>template</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>939928****</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The WABA ID. You can view the WABA ID in the Chat App Message Service console after you create the WABA.</p>
         * 
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
         * <p>Indicates whether the messages can be sent.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("CanSendMessage")
        public String canSendMessage;

        /**
         * <p>The queried entities.</p>
         */
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
