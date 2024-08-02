// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetSubscriptionItemDetailResponseBody extends TeaModel {
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
     * <p>FF1EFA25-9DB3-13E4-9643-5D3AD301C1D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionItemDetail")
    public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail subscriptionItemDetail;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSubscriptionItemDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionItemDetailResponseBody self = new GetSubscriptionItemDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionItemDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubscriptionItemDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionItemDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubscriptionItemDetailResponseBody setSubscriptionItemDetail(GetSubscriptionItemDetailResponseBodySubscriptionItemDetail subscriptionItemDetail) {
        this.subscriptionItemDetail = subscriptionItemDetail;
        return this;
    }
    public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail getSubscriptionItemDetail() {
        return this.subscriptionItemDetail;
    }

    public GetSubscriptionItemDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts extends TeaModel {
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
         * <p>false</p>
         */
        @NameInMap("IsVerifiedMobile")
        public Boolean isVerifiedMobile;

        /**
         * <p>上封验证邮件发送时间</p>
         * 
         * <strong>example:</strong>
         * <p>1629429213</p>
         */
        @NameInMap("LastEmailVerificationTimeStamp")
        public Long lastEmailVerificationTimeStamp;

        /**
         * <p>上条验证短信发送时间</p>
         * 
         * <strong>example:</strong>
         * <p>1629429213</p>
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

        public static GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts self = new GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setAccountUID(Long accountUID) {
            this.accountUID = accountUID;
            return this;
        }
        public Long getAccountUID() {
            return this.accountUID;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setIsAccount(Boolean isAccount) {
            this.isAccount = isAccount;
            return this;
        }
        public Boolean getIsAccount() {
            return this.isAccount;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setIsObsolete(Boolean isObsolete) {
            this.isObsolete = isObsolete;
            return this;
        }
        public Boolean getIsObsolete() {
            return this.isObsolete;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setIsVerifiedEmail(Boolean isVerifiedEmail) {
            this.isVerifiedEmail = isVerifiedEmail;
            return this;
        }
        public Boolean getIsVerifiedEmail() {
            return this.isVerifiedEmail;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setIsVerifiedMobile(Boolean isVerifiedMobile) {
            this.isVerifiedMobile = isVerifiedMobile;
            return this;
        }
        public Boolean getIsVerifiedMobile() {
            return this.isVerifiedMobile;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setLastEmailVerificationTimeStamp(Long lastEmailVerificationTimeStamp) {
            this.lastEmailVerificationTimeStamp = lastEmailVerificationTimeStamp;
            return this;
        }
        public Long getLastEmailVerificationTimeStamp() {
            return this.lastEmailVerificationTimeStamp;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setLastMobileVerificationTimeStamp(Long lastMobileVerificationTimeStamp) {
            this.lastMobileVerificationTimeStamp = lastMobileVerificationTimeStamp;
            return this;
        }
        public Long getLastMobileVerificationTimeStamp() {
            return this.lastMobileVerificationTimeStamp;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

    public static class GetSubscriptionItemDetailResponseBodySubscriptionItemDetailWebhooks extends TeaModel {
        /**
         * <p>名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>回调地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=62ed0b442f4319b2060ee72a3ef833088b6cfc01aad2dd574b4b4eabe907dfff">https://oapi.dingtalk.com/robot/send?access_token=62ed0b442f4319b2060ee72a3ef833088b6cfc01aad2dd574b4b4eabe907dfff</a></p>
         */
        @NameInMap("ServerUrl")
        public String serverUrl;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>4539</p>
         */
        @NameInMap("WebhookId")
        public Long webhookId;

        public static GetSubscriptionItemDetailResponseBodySubscriptionItemDetailWebhooks build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionItemDetailResponseBodySubscriptionItemDetailWebhooks self = new GetSubscriptionItemDetailResponseBodySubscriptionItemDetailWebhooks();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailWebhooks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailWebhooks setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public String getServerUrl() {
            return this.serverUrl;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetailWebhooks setWebhookId(Long webhookId) {
            this.webhookId = webhookId;
            return this;
        }
        public Long getWebhookId() {
            return this.webhookId;
        }

    }

    public static class GetSubscriptionItemDetailResponseBodySubscriptionItemDetail extends TeaModel {
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
        public java.util.List<GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts> contacts;

        /**
         * <p>订阅项描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>邮件订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EmailStatus")
        public Integer emailStatus;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
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
         * <p>-1</p>
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
         * <p>-2</p>
         */
        @NameInMap("TtsStatus")
        public Integer ttsStatus;

        /**
         * <p>回调订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("WebhookStatus")
        public Integer webhookStatus;

        /**
         * <p>订阅webhooks</p>
         */
        @NameInMap("Webhooks")
        public java.util.List<GetSubscriptionItemDetailResponseBodySubscriptionItemDetailWebhooks> webhooks;

        public static GetSubscriptionItemDetailResponseBodySubscriptionItemDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionItemDetailResponseBodySubscriptionItemDetail self = new GetSubscriptionItemDetailResponseBodySubscriptionItemDetail();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setContacts(java.util.List<GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts> getContacts() {
            return this.contacts;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setEmailStatus(Integer emailStatus) {
            this.emailStatus = emailStatus;
            return this;
        }
        public Integer getEmailStatus() {
            return this.emailStatus;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setItemId(Integer itemId) {
            this.itemId = itemId;
            return this;
        }
        public Integer getItemId() {
            return this.itemId;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setPmsgStatus(Integer pmsgStatus) {
            this.pmsgStatus = pmsgStatus;
            return this;
        }
        public Integer getPmsgStatus() {
            return this.pmsgStatus;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setSmsStatus(Integer smsStatus) {
            this.smsStatus = smsStatus;
            return this;
        }
        public Integer getSmsStatus() {
            return this.smsStatus;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setTtsStatus(Integer ttsStatus) {
            this.ttsStatus = ttsStatus;
            return this;
        }
        public Integer getTtsStatus() {
            return this.ttsStatus;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setWebhookStatus(Integer webhookStatus) {
            this.webhookStatus = webhookStatus;
            return this;
        }
        public Integer getWebhookStatus() {
            return this.webhookStatus;
        }

        public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail setWebhooks(java.util.List<GetSubscriptionItemDetailResponseBodySubscriptionItemDetailWebhooks> webhooks) {
            this.webhooks = webhooks;
            return this;
        }
        public java.util.List<GetSubscriptionItemDetailResponseBodySubscriptionItemDetailWebhooks> getWebhooks() {
            return this.webhooks;
        }

    }

}
