// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class SingleSendMailV2ShrinkRequest extends TeaModel {
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
    public String htmlBodyPlaceHoldersShrink;

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

    public static SingleSendMailV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleSendMailV2ShrinkRequest self = new SingleSendMailV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SingleSendMailV2ShrinkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public SingleSendMailV2ShrinkRequest setAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }
    public Integer getAddressType() {
        return this.addressType;
    }

    public SingleSendMailV2ShrinkRequest setClickTrace(String clickTrace) {
        this.clickTrace = clickTrace;
        return this;
    }
    public String getClickTrace() {
        return this.clickTrace;
    }

    public SingleSendMailV2ShrinkRequest setFromAlias(String fromAlias) {
        this.fromAlias = fromAlias;
        return this;
    }
    public String getFromAlias() {
        return this.fromAlias;
    }

    public SingleSendMailV2ShrinkRequest setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
        return this;
    }
    public String getHtmlBody() {
        return this.htmlBody;
    }

    public SingleSendMailV2ShrinkRequest setHtmlBodyPlaceHoldersShrink(String htmlBodyPlaceHoldersShrink) {
        this.htmlBodyPlaceHoldersShrink = htmlBodyPlaceHoldersShrink;
        return this;
    }
    public String getHtmlBodyPlaceHoldersShrink() {
        return this.htmlBodyPlaceHoldersShrink;
    }

    public SingleSendMailV2ShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SingleSendMailV2ShrinkRequest setReplyAddress(String replyAddress) {
        this.replyAddress = replyAddress;
        return this;
    }
    public String getReplyAddress() {
        return this.replyAddress;
    }

    public SingleSendMailV2ShrinkRequest setReplyAddressAlias(String replyAddressAlias) {
        this.replyAddressAlias = replyAddressAlias;
        return this;
    }
    public String getReplyAddressAlias() {
        return this.replyAddressAlias;
    }

    public SingleSendMailV2ShrinkRequest setReplyToAddress(Boolean replyToAddress) {
        this.replyToAddress = replyToAddress;
        return this;
    }
    public Boolean getReplyToAddress() {
        return this.replyToAddress;
    }

    public SingleSendMailV2ShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SingleSendMailV2ShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SingleSendMailV2ShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public SingleSendMailV2ShrinkRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public SingleSendMailV2ShrinkRequest setTextBody(String textBody) {
        this.textBody = textBody;
        return this;
    }
    public String getTextBody() {
        return this.textBody;
    }

    public SingleSendMailV2ShrinkRequest setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

}
