// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListSubscriptionItemGroupDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BA7CC0BA-31E6-18B7-8B78-AA97682099A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionItemGroupDetails")
    public java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetails> subscriptionItemGroupDetails;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSubscriptionItemGroupDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionItemGroupDetailsResponseBody self = new ListSubscriptionItemGroupDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionItemGroupDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubscriptionItemGroupDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubscriptionItemGroupDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscriptionItemGroupDetailsResponseBody setSubscriptionItemGroupDetails(java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetails> subscriptionItemGroupDetails) {
        this.subscriptionItemGroupDetails = subscriptionItemGroupDetails;
        return this;
    }
    public java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetails> getSubscriptionItemGroupDetails() {
        return this.subscriptionItemGroupDetails;
    }

    public ListSubscriptionItemGroupDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts extends TeaModel {
        /**
         * <p>账号UID</p>
         * 
         * <strong>example:</strong>
         * <p>12306</p>
         */
        @NameInMap("AccountUID")
        public Long accountUID;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>联系人电子邮箱</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:turing@addr.cs">turing@addr.cs</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>是否是账号本身</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAccount")
        public Boolean isAccount;

        /**
         * <p>是否过期</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsObsolete")
        public Boolean isObsolete;

        /**
         * <p>电子邮箱是否验证</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsVerifiedEmail")
        public Boolean isVerifiedEmail;

        /**
         * <p>电话是否验证</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsVerifiedMobile")
        public Boolean isVerifiedMobile;

        /**
         * <p>上封验证邮件发送时间</p>
         * 
         * <strong>example:</strong>
         * <p>1629423313</p>
         */
        @NameInMap("LastEmailVerificationTimeStamp")
        public Long lastEmailVerificationTimeStamp;

        /**
         * <p>上条验证短信发送时间</p>
         * 
         * <strong>example:</strong>
         * <p>1629423313</p>
         */
        @NameInMap("LastMobileVerificationTimeStamp")
        public Long lastMobileVerificationTimeStamp;

        /**
         * <p>用户电话</p>
         * 
         * <strong>example:</strong>
         * <p>1399999999</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>联系人名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>职位</p>
         */
        @NameInMap("Position")
        public String position;

        public static ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts self = new ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setAccountUID(Long accountUID) {
            this.accountUID = accountUID;
            return this;
        }
        public Long getAccountUID() {
            return this.accountUID;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setIsAccount(Boolean isAccount) {
            this.isAccount = isAccount;
            return this;
        }
        public Boolean getIsAccount() {
            return this.isAccount;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setIsObsolete(Boolean isObsolete) {
            this.isObsolete = isObsolete;
            return this;
        }
        public Boolean getIsObsolete() {
            return this.isObsolete;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setIsVerifiedEmail(Boolean isVerifiedEmail) {
            this.isVerifiedEmail = isVerifiedEmail;
            return this;
        }
        public Boolean getIsVerifiedEmail() {
            return this.isVerifiedEmail;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setIsVerifiedMobile(Boolean isVerifiedMobile) {
            this.isVerifiedMobile = isVerifiedMobile;
            return this;
        }
        public Boolean getIsVerifiedMobile() {
            return this.isVerifiedMobile;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setLastEmailVerificationTimeStamp(Long lastEmailVerificationTimeStamp) {
            this.lastEmailVerificationTimeStamp = lastEmailVerificationTimeStamp;
            return this;
        }
        public Long getLastEmailVerificationTimeStamp() {
            return this.lastEmailVerificationTimeStamp;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setLastMobileVerificationTimeStamp(Long lastMobileVerificationTimeStamp) {
            this.lastMobileVerificationTimeStamp = lastMobileVerificationTimeStamp;
            return this;
        }
        public Long getLastMobileVerificationTimeStamp() {
            return this.lastMobileVerificationTimeStamp;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

    public static class ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsWebhooks extends TeaModel {
        /**
         * <p>名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>回调地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a></p>
         */
        @NameInMap("ServerUrl")
        public String serverUrl;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("WebhookId")
        public Long webhookId;

        public static ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsWebhooks build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsWebhooks self = new ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsWebhooks();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsWebhooks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsWebhooks setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public String getServerUrl() {
            return this.serverUrl;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsWebhooks setWebhookId(Long webhookId) {
            this.webhookId = webhookId;
            return this;
        }
        public Long getWebhookId() {
            return this.webhookId;
        }

    }

    public static class ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails extends TeaModel {
        /**
         * <p>属于通道</p>
         * 
         * <strong>example:</strong>
         * <p>tts</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>订阅联系人</p>
         */
        @NameInMap("Contacts")
        public java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts> contacts;

        /**
         * <p>订阅项描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>邮件订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("EmailStatus")
        public Integer emailStatus;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ItemId")
        public Integer itemId;

        /**
         * <p>订阅项名称</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>站内信订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>-2</p>
         */
        @NameInMap("PmsgStatus")
        public Integer pmsgStatus;

        /**
         * <p>地域id</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>短信订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SmsStatus")
        public Integer smsStatus;

        /**
         * <p>语音短信订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TtsStatus")
        public Integer ttsStatus;

        /**
         * <p>回调订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebhookStatus")
        public Integer webhookStatus;

        /**
         * <p>订阅webhooks</p>
         */
        @NameInMap("Webhooks")
        public java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsWebhooks> webhooks;

        public static ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails self = new ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setContacts(java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsContacts> getContacts() {
            return this.contacts;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setEmailStatus(Integer emailStatus) {
            this.emailStatus = emailStatus;
            return this;
        }
        public Integer getEmailStatus() {
            return this.emailStatus;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setItemId(Integer itemId) {
            this.itemId = itemId;
            return this;
        }
        public Integer getItemId() {
            return this.itemId;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setPmsgStatus(Integer pmsgStatus) {
            this.pmsgStatus = pmsgStatus;
            return this;
        }
        public Integer getPmsgStatus() {
            return this.pmsgStatus;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setSmsStatus(Integer smsStatus) {
            this.smsStatus = smsStatus;
            return this;
        }
        public Integer getSmsStatus() {
            return this.smsStatus;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setTtsStatus(Integer ttsStatus) {
            this.ttsStatus = ttsStatus;
            return this;
        }
        public Integer getTtsStatus() {
            return this.ttsStatus;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setWebhookStatus(Integer webhookStatus) {
            this.webhookStatus = webhookStatus;
            return this;
        }
        public Integer getWebhookStatus() {
            return this.webhookStatus;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails setWebhooks(java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsWebhooks> webhooks) {
            this.webhooks = webhooks;
            return this;
        }
        public java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetailsWebhooks> getWebhooks() {
            return this.webhooks;
        }

    }

    public static class ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetails extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ItemDetails")
        public java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails> itemDetails;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ItemGroupId")
        public Integer itemGroupId;

        @NameInMap("ItemGroupName")
        public String itemGroupName;

        public static ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetails build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetails self = new ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetails();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetails setItemDetails(java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails> itemDetails) {
            this.itemDetails = itemDetails;
            return this;
        }
        public java.util.List<ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetailsItemDetails> getItemDetails() {
            return this.itemDetails;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetails setItemGroupId(Integer itemGroupId) {
            this.itemGroupId = itemGroupId;
            return this;
        }
        public Integer getItemGroupId() {
            return this.itemGroupId;
        }

        public ListSubscriptionItemGroupDetailsResponseBodySubscriptionItemGroupDetails setItemGroupName(String itemGroupName) {
            this.itemGroupName = itemGroupName;
            return this;
        }
        public String getItemGroupName() {
            return this.itemGroupName;
        }

    }

}
