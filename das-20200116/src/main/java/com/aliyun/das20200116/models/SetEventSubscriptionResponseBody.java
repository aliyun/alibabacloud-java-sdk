// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class SetEventSubscriptionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information.</p>
     */
    @NameInMap("Data")
    public SetEventSubscriptionResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public String success;

    public static SetEventSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetEventSubscriptionResponseBody self = new SetEventSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetEventSubscriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetEventSubscriptionResponseBody setData(SetEventSubscriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetEventSubscriptionResponseBodyData getData() {
        return this.data;
    }

    public SetEventSubscriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetEventSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetEventSubscriptionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class SetEventSubscriptionResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the event subscription feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **0**: The event subscription feature is disabled.</p>
         * <p>*   **1**: The event subscription feature is enabled.</p>
         */
        @NameInMap("active")
        public Integer active;

        /**
         * <p>The notification method. Valid values:</p>
         * <br>
         * <p>*   **hdm_alarm_sms**: text message.</p>
         * <p>*   **dingtalk**: DingTalk chatbot.</p>
         * <p>*   **hdm_alarm_sms_and_email**: text message and email.</p>
         * <p>*   **hdm_alarm_sms,dingtalk**: text message and DingTalk chatbot.</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>The name of the contact group that receives alert notifications. Multiple names are separated by commas (,).</p>
         */
        @NameInMap("contactGroupName")
        public String contactGroupName;

        /**
         * <p>The name of the contact who receives alert notifications. Multiple names are separated by commas (,).</p>
         */
        @NameInMap("contactName")
        public String contactName;

        /**
         * <p>The supported event scenarios. Only **AllContext** is returned for this parameter, which indicates that all scenarios are supported.</p>
         */
        @NameInMap("eventContext")
        public String eventContext;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The language of event notifications. Only **zh-CN** is returned for this parameter, which indicates that event notifications are sent in Chinese.</p>
         */
        @NameInMap("lang")
        public String lang;

        /**
         * <p>The risk level of the events. Valid values:</p>
         * <br>
         * <p>*   **Notice**</p>
         * <p>*   **Optimization**</p>
         * <p>*   **Warn**</p>
         * <p>*   **Critical**</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The minimum interval between consecutive event notifications. Unit: seconds.</p>
         */
        @NameInMap("minInterval")
        public Integer minInterval;

        /**
         * <p>The user ID.</p>
         */
        @NameInMap("userId")
        public String userId;

        public static SetEventSubscriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetEventSubscriptionResponseBodyData self = new SetEventSubscriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetEventSubscriptionResponseBodyData setActive(Integer active) {
            this.active = active;
            return this;
        }
        public Integer getActive() {
            return this.active;
        }

        public SetEventSubscriptionResponseBodyData setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public SetEventSubscriptionResponseBodyData setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        public SetEventSubscriptionResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public SetEventSubscriptionResponseBodyData setEventContext(String eventContext) {
            this.eventContext = eventContext;
            return this;
        }
        public String getEventContext() {
            return this.eventContext;
        }

        public SetEventSubscriptionResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SetEventSubscriptionResponseBodyData setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SetEventSubscriptionResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SetEventSubscriptionResponseBodyData setMinInterval(Integer minInterval) {
            this.minInterval = minInterval;
            return this;
        }
        public Integer getMinInterval() {
            return this.minInterval;
        }

        public SetEventSubscriptionResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
