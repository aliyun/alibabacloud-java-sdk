// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class RequestWhatsappConversionApiRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>929399382</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1939848838</p>
     */
    @NameInMap("PageId")
    public String pageId;

    @NameInMap("RequestData")
    public java.util.List<RequestWhatsappConversionApiRequestRequestData> requestData;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RequestWhatsappConversionApiRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestWhatsappConversionApiRequest self = new RequestWhatsappConversionApiRequest();
        return TeaModel.build(map, self);
    }

    public RequestWhatsappConversionApiRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public RequestWhatsappConversionApiRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RequestWhatsappConversionApiRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public RequestWhatsappConversionApiRequest setRequestData(java.util.List<RequestWhatsappConversionApiRequestRequestData> requestData) {
        this.requestData = requestData;
        return this;
    }
    public java.util.List<RequestWhatsappConversionApiRequestRequestData> getRequestData() {
        return this.requestData;
    }

    public RequestWhatsappConversionApiRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RequestWhatsappConversionApiRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class RequestWhatsappConversionApiRequestRequestData extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>business_messaging</p>
         */
        @NameInMap("ActionSource")
        public String actionSource;

        @NameInMap("AppData")
        public java.util.Map<String, ?> appData;

        @NameInMap("CustomData")
        public java.util.Map<String, ?> customData;

        @NameInMap("DataProcessingOptions")
        public java.util.List<String> dataProcessingOptions;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataProcessingOptionsCountry")
        public Long dataProcessingOptionsCountry;

        /**
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("DataProcessingOptionsState")
        public Long dataProcessingOptionsState;

        /**
         * <strong>example:</strong>
         * <p>20029399299</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Purchase</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://alibaba.com">http://alibaba.com</a></p>
         */
        @NameInMap("EventSourceUrl")
        public String eventSourceUrl;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1709201870</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        /**
         * <strong>example:</strong>
         * <p>whatsapp</p>
         */
        @NameInMap("MessagingChannel")
        public String messagingChannel;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OptOut")
        public Boolean optOut;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("UserData")
        public java.util.Map<String, ?> userData;

        public static RequestWhatsappConversionApiRequestRequestData build(java.util.Map<String, ?> map) throws Exception {
            RequestWhatsappConversionApiRequestRequestData self = new RequestWhatsappConversionApiRequestRequestData();
            return TeaModel.build(map, self);
        }

        public RequestWhatsappConversionApiRequestRequestData setActionSource(String actionSource) {
            this.actionSource = actionSource;
            return this;
        }
        public String getActionSource() {
            return this.actionSource;
        }

        public RequestWhatsappConversionApiRequestRequestData setAppData(java.util.Map<String, ?> appData) {
            this.appData = appData;
            return this;
        }
        public java.util.Map<String, ?> getAppData() {
            return this.appData;
        }

        public RequestWhatsappConversionApiRequestRequestData setCustomData(java.util.Map<String, ?> customData) {
            this.customData = customData;
            return this;
        }
        public java.util.Map<String, ?> getCustomData() {
            return this.customData;
        }

        public RequestWhatsappConversionApiRequestRequestData setDataProcessingOptions(java.util.List<String> dataProcessingOptions) {
            this.dataProcessingOptions = dataProcessingOptions;
            return this;
        }
        public java.util.List<String> getDataProcessingOptions() {
            return this.dataProcessingOptions;
        }

        public RequestWhatsappConversionApiRequestRequestData setDataProcessingOptionsCountry(Long dataProcessingOptionsCountry) {
            this.dataProcessingOptionsCountry = dataProcessingOptionsCountry;
            return this;
        }
        public Long getDataProcessingOptionsCountry() {
            return this.dataProcessingOptionsCountry;
        }

        public RequestWhatsappConversionApiRequestRequestData setDataProcessingOptionsState(Long dataProcessingOptionsState) {
            this.dataProcessingOptionsState = dataProcessingOptionsState;
            return this;
        }
        public Long getDataProcessingOptionsState() {
            return this.dataProcessingOptionsState;
        }

        public RequestWhatsappConversionApiRequestRequestData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public RequestWhatsappConversionApiRequestRequestData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public RequestWhatsappConversionApiRequestRequestData setEventSourceUrl(String eventSourceUrl) {
            this.eventSourceUrl = eventSourceUrl;
            return this;
        }
        public String getEventSourceUrl() {
            return this.eventSourceUrl;
        }

        public RequestWhatsappConversionApiRequestRequestData setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public RequestWhatsappConversionApiRequestRequestData setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public RequestWhatsappConversionApiRequestRequestData setMessagingChannel(String messagingChannel) {
            this.messagingChannel = messagingChannel;
            return this;
        }
        public String getMessagingChannel() {
            return this.messagingChannel;
        }

        public RequestWhatsappConversionApiRequestRequestData setOptOut(Boolean optOut) {
            this.optOut = optOut;
            return this;
        }
        public Boolean getOptOut() {
            return this.optOut;
        }

        public RequestWhatsappConversionApiRequestRequestData setUserData(java.util.Map<String, ?> userData) {
            this.userData = userData;
            return this;
        }
        public java.util.Map<String, ?> getUserData() {
            return this.userData;
        }

    }

}
