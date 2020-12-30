// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescTemplateResponseBody extends TeaModel {
    @NameInMap("SmsType")
    public String smsType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("TemplateText")
    public String templateText;

    @NameInMap("SmsContent")
    public String smsContent;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateNickName")
    public String templateNickName;

    @NameInMap("TemplateType")
    public String templateType;

    @NameInMap("TemplateSubject")
    public String templateSubject;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("TemplateStatus")
    public String templateStatus;

    public static DescTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescTemplateResponseBody self = new DescTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescTemplateResponseBody setSmsType(String smsType) {
        this.smsType = smsType;
        return this;
    }
    public String getSmsType() {
        return this.smsType;
    }

    public DescTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescTemplateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescTemplateResponseBody setTemplateText(String templateText) {
        this.templateText = templateText;
        return this;
    }
    public String getTemplateText() {
        return this.templateText;
    }

    public DescTemplateResponseBody setSmsContent(String smsContent) {
        this.smsContent = smsContent;
        return this;
    }
    public String getSmsContent() {
        return this.smsContent;
    }

    public DescTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public DescTemplateResponseBody setTemplateNickName(String templateNickName) {
        this.templateNickName = templateNickName;
        return this;
    }
    public String getTemplateNickName() {
        return this.templateNickName;
    }

    public DescTemplateResponseBody setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public DescTemplateResponseBody setTemplateSubject(String templateSubject) {
        this.templateSubject = templateSubject;
        return this;
    }
    public String getTemplateSubject() {
        return this.templateSubject;
    }

    public DescTemplateResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescTemplateResponseBody setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

}
