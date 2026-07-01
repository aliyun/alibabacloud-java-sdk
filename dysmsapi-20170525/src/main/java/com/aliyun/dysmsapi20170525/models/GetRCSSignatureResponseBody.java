// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetRCSSignatureResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRCSSignatureResponseBodyData data;

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

    public static GetRCSSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRCSSignatureResponseBody self = new GetRCSSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRCSSignatureResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetRCSSignatureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRCSSignatureResponseBody setData(GetRCSSignatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRCSSignatureResponseBodyData getData() {
        return this.data;
    }

    public GetRCSSignatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRCSSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRCSSignatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRCSSignatureResponseBodyDataRegisterResultListRegisterStatusReasons extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        @NameInMap("ReasonDescList")
        public java.util.List<String> reasonDescList;

        public static GetRCSSignatureResponseBodyDataRegisterResultListRegisterStatusReasons build(java.util.Map<String, ?> map) throws Exception {
            GetRCSSignatureResponseBodyDataRegisterResultListRegisterStatusReasons self = new GetRCSSignatureResponseBodyDataRegisterResultListRegisterStatusReasons();
            return TeaModel.build(map, self);
        }

        public GetRCSSignatureResponseBodyDataRegisterResultListRegisterStatusReasons setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public GetRCSSignatureResponseBodyDataRegisterResultListRegisterStatusReasons setReasonDescList(java.util.List<String> reasonDescList) {
            this.reasonDescList = reasonDescList;
            return this;
        }
        public java.util.List<String> getReasonDescList() {
            return this.reasonDescList;
        }

    }

    public static class GetRCSSignatureResponseBodyDataRegisterResultList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("OperatorCode")
        public String operatorCode;

        /**
         * <strong>example:</strong>
         * <p>46</p>
         */
        @NameInMap("ProductType")
        public Long productType;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("RegisterCompleteTime")
        public String registerCompleteTime;

        /**
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("RegisterStatus")
        public Long registerStatus;

        @NameInMap("RegisterStatusReasons")
        public java.util.List<GetRCSSignatureResponseBodyDataRegisterResultListRegisterStatusReasons> registerStatusReasons;

        public static GetRCSSignatureResponseBodyDataRegisterResultList build(java.util.Map<String, ?> map) throws Exception {
            GetRCSSignatureResponseBodyDataRegisterResultList self = new GetRCSSignatureResponseBodyDataRegisterResultList();
            return TeaModel.build(map, self);
        }

        public GetRCSSignatureResponseBodyDataRegisterResultList setOperatorCode(String operatorCode) {
            this.operatorCode = operatorCode;
            return this;
        }
        public String getOperatorCode() {
            return this.operatorCode;
        }

        public GetRCSSignatureResponseBodyDataRegisterResultList setProductType(Long productType) {
            this.productType = productType;
            return this;
        }
        public Long getProductType() {
            return this.productType;
        }

        public GetRCSSignatureResponseBodyDataRegisterResultList setRegisterCompleteTime(String registerCompleteTime) {
            this.registerCompleteTime = registerCompleteTime;
            return this;
        }
        public String getRegisterCompleteTime() {
            return this.registerCompleteTime;
        }

        public GetRCSSignatureResponseBodyDataRegisterResultList setRegisterStatus(Long registerStatus) {
            this.registerStatus = registerStatus;
            return this;
        }
        public Long getRegisterStatus() {
            return this.registerStatus;
        }

        public GetRCSSignatureResponseBodyDataRegisterResultList setRegisterStatusReasons(java.util.List<GetRCSSignatureResponseBodyDataRegisterResultListRegisterStatusReasons> registerStatusReasons) {
            this.registerStatusReasons = registerStatusReasons;
            return this;
        }
        public java.util.List<GetRCSSignatureResponseBodyDataRegisterResultListRegisterStatusReasons> getRegisterStatusReasons() {
            return this.registerStatusReasons;
        }

    }

    public static class GetRCSSignatureResponseBodyDataShelfResultListShelfStatusReasons extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        @NameInMap("ReasonDescList")
        public java.util.List<String> reasonDescList;

        public static GetRCSSignatureResponseBodyDataShelfResultListShelfStatusReasons build(java.util.Map<String, ?> map) throws Exception {
            GetRCSSignatureResponseBodyDataShelfResultListShelfStatusReasons self = new GetRCSSignatureResponseBodyDataShelfResultListShelfStatusReasons();
            return TeaModel.build(map, self);
        }

        public GetRCSSignatureResponseBodyDataShelfResultListShelfStatusReasons setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public GetRCSSignatureResponseBodyDataShelfResultListShelfStatusReasons setReasonDescList(java.util.List<String> reasonDescList) {
            this.reasonDescList = reasonDescList;
            return this;
        }
        public java.util.List<String> getReasonDescList() {
            return this.reasonDescList;
        }

    }

    public static class GetRCSSignatureResponseBodyDataShelfResultList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("OperatorCode")
        public String operatorCode;

        /**
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("ProductType")
        public Long productType;

        /**
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("ShelfStatus")
        public Long shelfStatus;

        @NameInMap("ShelfStatusReasons")
        public java.util.List<GetRCSSignatureResponseBodyDataShelfResultListShelfStatusReasons> shelfStatusReasons;

        public static GetRCSSignatureResponseBodyDataShelfResultList build(java.util.Map<String, ?> map) throws Exception {
            GetRCSSignatureResponseBodyDataShelfResultList self = new GetRCSSignatureResponseBodyDataShelfResultList();
            return TeaModel.build(map, self);
        }

        public GetRCSSignatureResponseBodyDataShelfResultList setOperatorCode(String operatorCode) {
            this.operatorCode = operatorCode;
            return this;
        }
        public String getOperatorCode() {
            return this.operatorCode;
        }

        public GetRCSSignatureResponseBodyDataShelfResultList setProductType(Long productType) {
            this.productType = productType;
            return this;
        }
        public Long getProductType() {
            return this.productType;
        }

        public GetRCSSignatureResponseBodyDataShelfResultList setShelfStatus(Long shelfStatus) {
            this.shelfStatus = shelfStatus;
            return this;
        }
        public Long getShelfStatus() {
            return this.shelfStatus;
        }

        public GetRCSSignatureResponseBodyDataShelfResultList setShelfStatusReasons(java.util.List<GetRCSSignatureResponseBodyDataShelfResultListShelfStatusReasons> shelfStatusReasons) {
            this.shelfStatusReasons = shelfStatusReasons;
            return this;
        }
        public java.util.List<GetRCSSignatureResponseBodyDataShelfResultListShelfStatusReasons> getShelfStatusReasons() {
            return this.shelfStatusReasons;
        }

    }

    public static class GetRCSSignatureResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("BackgroundImage")
        public String backgroundImage;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("BubbleColor")
        public String bubbleColor;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Category")
        public Long category;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ChatbotCode")
        public String chatbotCode;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ChatbotName")
        public String chatbotName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Latitude")
        public String latitude;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Logo")
        public String logo;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Longitude")
        public String longitude;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("OfficeAddress")
        public String officeAddress;

        @NameInMap("RegisterResultList")
        public java.util.List<GetRCSSignatureResponseBodyDataRegisterResultList> registerResultList;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ServiceEmail")
        public String serviceEmail;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ServicePhone")
        public String servicePhone;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ServiceTerms")
        public String serviceTerms;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ServiceWebsite")
        public String serviceWebsite;

        @NameInMap("ShelfResultList")
        public java.util.List<GetRCSSignatureResponseBodyDataShelfResultList> shelfResultList;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("SignId")
        public Long signId;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("SignName")
        public String signName;

        public static GetRCSSignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRCSSignatureResponseBodyData self = new GetRCSSignatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRCSSignatureResponseBodyData setBackgroundImage(String backgroundImage) {
            this.backgroundImage = backgroundImage;
            return this;
        }
        public String getBackgroundImage() {
            return this.backgroundImage;
        }

        public GetRCSSignatureResponseBodyData setBubbleColor(String bubbleColor) {
            this.bubbleColor = bubbleColor;
            return this;
        }
        public String getBubbleColor() {
            return this.bubbleColor;
        }

        public GetRCSSignatureResponseBodyData setCategory(Long category) {
            this.category = category;
            return this;
        }
        public Long getCategory() {
            return this.category;
        }

        public GetRCSSignatureResponseBodyData setChatbotCode(String chatbotCode) {
            this.chatbotCode = chatbotCode;
            return this;
        }
        public String getChatbotCode() {
            return this.chatbotCode;
        }

        public GetRCSSignatureResponseBodyData setChatbotName(String chatbotName) {
            this.chatbotName = chatbotName;
            return this;
        }
        public String getChatbotName() {
            return this.chatbotName;
        }

        public GetRCSSignatureResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRCSSignatureResponseBodyData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public GetRCSSignatureResponseBodyData setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public GetRCSSignatureResponseBodyData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public GetRCSSignatureResponseBodyData setOfficeAddress(String officeAddress) {
            this.officeAddress = officeAddress;
            return this;
        }
        public String getOfficeAddress() {
            return this.officeAddress;
        }

        public GetRCSSignatureResponseBodyData setRegisterResultList(java.util.List<GetRCSSignatureResponseBodyDataRegisterResultList> registerResultList) {
            this.registerResultList = registerResultList;
            return this;
        }
        public java.util.List<GetRCSSignatureResponseBodyDataRegisterResultList> getRegisterResultList() {
            return this.registerResultList;
        }

        public GetRCSSignatureResponseBodyData setServiceEmail(String serviceEmail) {
            this.serviceEmail = serviceEmail;
            return this;
        }
        public String getServiceEmail() {
            return this.serviceEmail;
        }

        public GetRCSSignatureResponseBodyData setServicePhone(String servicePhone) {
            this.servicePhone = servicePhone;
            return this;
        }
        public String getServicePhone() {
            return this.servicePhone;
        }

        public GetRCSSignatureResponseBodyData setServiceTerms(String serviceTerms) {
            this.serviceTerms = serviceTerms;
            return this;
        }
        public String getServiceTerms() {
            return this.serviceTerms;
        }

        public GetRCSSignatureResponseBodyData setServiceWebsite(String serviceWebsite) {
            this.serviceWebsite = serviceWebsite;
            return this;
        }
        public String getServiceWebsite() {
            return this.serviceWebsite;
        }

        public GetRCSSignatureResponseBodyData setShelfResultList(java.util.List<GetRCSSignatureResponseBodyDataShelfResultList> shelfResultList) {
            this.shelfResultList = shelfResultList;
            return this;
        }
        public java.util.List<GetRCSSignatureResponseBodyDataShelfResultList> getShelfResultList() {
            return this.shelfResultList;
        }

        public GetRCSSignatureResponseBodyData setSignId(Long signId) {
            this.signId = signId;
            return this;
        }
        public Long getSignId() {
            return this.signId;
        }

        public GetRCSSignatureResponseBodyData setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

    }

}
