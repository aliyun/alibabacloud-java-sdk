// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class SingleSendMailV2Request extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AddressType")
    public Integer addressType;

    @NameInMap("ClickTrace")
    public String clickTrace;

    @NameInMap("FromAlias")
    public String fromAlias;

    @NameInMap("HtmlBody")
    public String htmlBody;

    @NameInMap("HtmlBodyPlaceHolders")
    public java.util.List<SingleSendMailV2RequestHtmlBodyPlaceHolders> htmlBodyPlaceHolders;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ReplyAddress")
    public String replyAddress;

    @NameInMap("ReplyAddressAlias")
    public String replyAddressAlias;

    @NameInMap("ReplyToAddress")
    public Boolean replyToAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("TagName")
    public String tagName;

    @NameInMap("TextBody")
    public String textBody;

    @NameInMap("ToAddress")
    public String toAddress;

    public static SingleSendMailV2Request build(java.util.Map<String, ?> map) throws Exception {
        SingleSendMailV2Request self = new SingleSendMailV2Request();
        return TeaModel.build(map, self);
    }

    public SingleSendMailV2Request setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public SingleSendMailV2Request setAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }
    public Integer getAddressType() {
        return this.addressType;
    }

    public SingleSendMailV2Request setClickTrace(String clickTrace) {
        this.clickTrace = clickTrace;
        return this;
    }
    public String getClickTrace() {
        return this.clickTrace;
    }

    public SingleSendMailV2Request setFromAlias(String fromAlias) {
        this.fromAlias = fromAlias;
        return this;
    }
    public String getFromAlias() {
        return this.fromAlias;
    }

    public SingleSendMailV2Request setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
        return this;
    }
    public String getHtmlBody() {
        return this.htmlBody;
    }

    public SingleSendMailV2Request setHtmlBodyPlaceHolders(java.util.List<SingleSendMailV2RequestHtmlBodyPlaceHolders> htmlBodyPlaceHolders) {
        this.htmlBodyPlaceHolders = htmlBodyPlaceHolders;
        return this;
    }
    public java.util.List<SingleSendMailV2RequestHtmlBodyPlaceHolders> getHtmlBodyPlaceHolders() {
        return this.htmlBodyPlaceHolders;
    }

    public SingleSendMailV2Request setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SingleSendMailV2Request setReplyAddress(String replyAddress) {
        this.replyAddress = replyAddress;
        return this;
    }
    public String getReplyAddress() {
        return this.replyAddress;
    }

    public SingleSendMailV2Request setReplyAddressAlias(String replyAddressAlias) {
        this.replyAddressAlias = replyAddressAlias;
        return this;
    }
    public String getReplyAddressAlias() {
        return this.replyAddressAlias;
    }

    public SingleSendMailV2Request setReplyToAddress(Boolean replyToAddress) {
        this.replyToAddress = replyToAddress;
        return this;
    }
    public Boolean getReplyToAddress() {
        return this.replyToAddress;
    }

    public SingleSendMailV2Request setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SingleSendMailV2Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SingleSendMailV2Request setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public SingleSendMailV2Request setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public SingleSendMailV2Request setTextBody(String textBody) {
        this.textBody = textBody;
        return this;
    }
    public String getTextBody() {
        return this.textBody;
    }

    public SingleSendMailV2Request setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public static class SingleSendMailV2RequestHtmlBodyPlaceHolders extends TeaModel {
        @NameInMap("PlaceHolders")
        public java.util.Map<String, String> placeHolders;

        @NameInMap("ToAddress")
        public String toAddress;

        public static SingleSendMailV2RequestHtmlBodyPlaceHolders build(java.util.Map<String, ?> map) throws Exception {
            SingleSendMailV2RequestHtmlBodyPlaceHolders self = new SingleSendMailV2RequestHtmlBodyPlaceHolders();
            return TeaModel.build(map, self);
        }

        public SingleSendMailV2RequestHtmlBodyPlaceHolders setPlaceHolders(java.util.Map<String, String> placeHolders) {
            this.placeHolders = placeHolders;
            return this;
        }
        public java.util.Map<String, String> getPlaceHolders() {
            return this.placeHolders;
        }

        public SingleSendMailV2RequestHtmlBodyPlaceHolders setToAddress(String toAddress) {
            this.toAddress = toAddress;
            return this;
        }
        public String getToAddress() {
            return this.toAddress;
        }

    }

}
