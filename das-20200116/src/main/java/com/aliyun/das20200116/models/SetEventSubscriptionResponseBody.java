// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class SetEventSubscriptionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SetEventSubscriptionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("active")
        public Integer active;

        @NameInMap("channelType")
        public String channelType;

        @NameInMap("contactGroupName")
        public String contactGroupName;

        @NameInMap("contactName")
        public String contactName;

        @NameInMap("eventContext")
        public String eventContext;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("lang")
        public String lang;

        @NameInMap("level")
        public String level;

        @NameInMap("minInterval")
        public Integer minInterval;

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
