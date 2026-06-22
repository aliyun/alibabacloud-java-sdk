// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class RequestWhatsappConversionApiRequest extends TeaModel {
    /**
     * <p>The space ID or instance ID of the customer.</p>
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
     * <p>The PageId of Meta.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1939848838</p>
     */
    @NameInMap("PageId")
    public String pageId;

    /**
     * <p>The request data.</p>
     */
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
         * <p>Specifies where the conversion occurred. Knowing where the event occurred helps ensure that ads are delivered to the correct audience. By using the Conversions API, you agree that the action_source parameter is accurate to the best of your knowledge.</p>
         * <p>The values you can send in the action_source field are as follows:</p>
         * <ul>
         * <li>email: The conversion occurred through email.</li>
         * <li>website: The conversion was made on a website.</li>
         * <li>app: The conversion was made on a shift application.</li>
         * <li>phone_call: The conversion was made over the phone.</li>
         * <li>chat: The conversion was made through a messaging app, SMS, or online messaging feature.</li>
         * <li>physical_store: The conversion was made in person at a physical store entity.</li>
         * <li>system_generated: The conversion occurred automatically, such as a subscribe renewal with Settings for monthly automatic payment.</li>
         * <li>other: The conversion was made through a method not listed in this topic.</li>
         * </ul>
         * <p>Note: All action source values support ads measurement and custom audience creation. All action sources except physical_store support ads optimization.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>business_messaging</p>
         */
        @NameInMap("ActionSource")
        public String actionSource;

        /**
         * <p>Required parameters for app events.</p>
         * <p>These parameters are used to share app data and device information with the Conversions API.</p>
         */
        @NameInMap("AppData")
        public java.util.Map<String, ?> appData;

        /**
         * <p>A map that contains additional business data for the event.</p>
         */
        @NameInMap("CustomData")
        public java.util.Map<String, ?> customData;

        /**
         * <p>The processing options you want to enable for a specific event. For Limited Data Use, the currently accepted value is LDU. You can send an empty array to explicitly specify that the event must not be processed with Limited Data Use restrictions.</p>
         */
        @NameInMap("DataProcessingOptions")
        public java.util.List<String> dataProcessingOptions;

        /**
         * <p>Required if you send LDU under data_processing_options.
         * The country you want to associate with this data processing option. Currently accepted values are 1 (representing the United States) or 0 (requesting that we geolocate this event).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataProcessingOptionsCountry")
        public Long dataProcessingOptionsCountry;

        /**
         * <p>Required in some cases. (See the notes below for details.)
         * The state you want to associate with this data processing option. Currently accepted values are 1000 (representing California) or 0 (requesting that we geolocate this event).</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("DataProcessingOptionsState")
        public Long dataProcessingOptionsState;

        /**
         * <p>This ID can be any unique string chosen by the advertiser. The event_name and event_id parameters are used to deduplicate events sent by a website (through Meta Pixel), an app (through the SDK or App Events API), and the Conversions API. Although event_id is marked as optional, we recommend that you use this parameter for deduplication.</p>
         * 
         * <strong>example:</strong>
         * <p>20029399299</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <ul>
         * <li><p>The name of a standard event or custom event. This field is used to deduplicate events sent by a website (through Meta Pixel), an app (through the SDK or App Events API), and the Conversions API. The event_id parameter is also used for deduplication.</p>
         * </li>
         * <li><p>For the same customer action, the event from the browser or app should match the event_name from the server event. If a match is found between events sent within 48 hours, only the first event is considered. If server and browser/app events are received at approximately the same time (within 5 minutes of each other), the browser/app event takes priority. Learn more about deduplicating Pixel events and server events.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Purchase</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The browser URL where the event occurred. The URL must start with http:// or https:// and should match the verified domain.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://alibaba.com">http://alibaba.com</a></p>
         */
        @NameInMap("EventSourceUrl")
        public String eventSourceUrl;

        /**
         * <p>A Unix timestamp in seconds indicating when the event actually occurred. The specified time may be earlier than the time you send the event to Facebook. This is intended for batch processing and server performance optimization. You must send the date in Greenwich Mean Time (GMT) time zone format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1709201870</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        /**
         * <p>Required parameters for app events.</p>
         * <p>Extended device information, such as the width and height of the screen. This parameter is an array with values separated by commas. When using extinfo, all values are required and must be arranged in the following index order. If a value is missing, use an empty string as a placeholder.</p>
         */
        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        /**
         * <p>The source. Fixed value: whatsapp.</p>
         * 
         * <strong>example:</strong>
         * <p>whatsapp</p>
         */
        @NameInMap("MessagingChannel")
        public String messagingChannel;

        /**
         * <p>A flag that indicates this event should not be used for ad delivery optimization. When set to true, the event can only be used for attribution.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OptOut")
        public Boolean optOut;

        /**
         * <p>A map that contains customer information data.</p>
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
