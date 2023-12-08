// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20240104.models;

import com.aliyun.tea.*;

public class CreateSourcingProjectShrinkRequest extends TeaModel {
    @NameInMap("Address")
    public String addressShrink;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizNo")
    public String bizNo;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Company")
    public String companyShrink;

    @NameInMap("Contact")
    public String contactShrink;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("ExtendInfo")
    public String extendInfoShrink;

    @NameInMap("SourceUrl")
    public String sourceUrl;

    @NameInMap("SubBizType")
    public String subBizType;

    @NameInMap("Subjects")
    public String subjectsShrink;

    @NameInMap("Title")
    public String title;

    public static CreateSourcingProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSourcingProjectShrinkRequest self = new CreateSourcingProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSourcingProjectShrinkRequest setAddressShrink(String addressShrink) {
        this.addressShrink = addressShrink;
        return this;
    }
    public String getAddressShrink() {
        return this.addressShrink;
    }

    public CreateSourcingProjectShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateSourcingProjectShrinkRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CreateSourcingProjectShrinkRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateSourcingProjectShrinkRequest setCompanyShrink(String companyShrink) {
        this.companyShrink = companyShrink;
        return this;
    }
    public String getCompanyShrink() {
        return this.companyShrink;
    }

    public CreateSourcingProjectShrinkRequest setContactShrink(String contactShrink) {
        this.contactShrink = contactShrink;
        return this;
    }
    public String getContactShrink() {
        return this.contactShrink;
    }

    public CreateSourcingProjectShrinkRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateSourcingProjectShrinkRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateSourcingProjectShrinkRequest setExtendInfoShrink(String extendInfoShrink) {
        this.extendInfoShrink = extendInfoShrink;
        return this;
    }
    public String getExtendInfoShrink() {
        return this.extendInfoShrink;
    }

    public CreateSourcingProjectShrinkRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public CreateSourcingProjectShrinkRequest setSubBizType(String subBizType) {
        this.subBizType = subBizType;
        return this;
    }
    public String getSubBizType() {
        return this.subBizType;
    }

    public CreateSourcingProjectShrinkRequest setSubjectsShrink(String subjectsShrink) {
        this.subjectsShrink = subjectsShrink;
        return this;
    }
    public String getSubjectsShrink() {
        return this.subjectsShrink;
    }

    public CreateSourcingProjectShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
