// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetSubscriptionItemDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionItemDetail")
    public GetSubscriptionItemDetailResponseBodySubscriptionItemDetail subscriptionItemDetail;

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
        @NameInMap("AccountUID")
        public Long accountUID;

        @NameInMap("ContactId")
        public Long contactId;

        @NameInMap("Email")
        public String email;

        @NameInMap("IsAccount")
        public Boolean isAccount;

        @NameInMap("IsObsolete")
        public Boolean isObsolete;

        @NameInMap("IsVerifiedEmail")
        public Boolean isVerifiedEmail;

        @NameInMap("IsVerifiedMobile")
        public Boolean isVerifiedMobile;

        @NameInMap("LastEmailVerificationTimeStamp")
        public Long lastEmailVerificationTimeStamp;

        @NameInMap("LastMobileVerificationTimeStamp")
        public Long lastMobileVerificationTimeStamp;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("ServerUrl")
        public String serverUrl;

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
        @NameInMap("Channel")
        public String channel;

        @NameInMap("Contacts")
        public java.util.List<GetSubscriptionItemDetailResponseBodySubscriptionItemDetailContacts> contacts;

        @NameInMap("Description")
        public String description;

        @NameInMap("EmailStatus")
        public Integer emailStatus;

        @NameInMap("ItemId")
        public Integer itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("PmsgStatus")
        public Integer pmsgStatus;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SmsStatus")
        public Integer smsStatus;

        @NameInMap("TtsStatus")
        public Integer ttsStatus;

        @NameInMap("WebhookStatus")
        public Integer webhookStatus;

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
