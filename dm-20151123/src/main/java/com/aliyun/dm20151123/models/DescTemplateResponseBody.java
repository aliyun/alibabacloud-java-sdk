// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescTemplateResponseBody extends TeaModel {
    /**
     * <p>The time when the template was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-14T13:28Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>This parameter is deprecated. It is retained for historical compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>Abandoned, historical reasons for compatibility</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95xxx5F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>This parameter is deprecated. It is retained for historical compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>Abandoned, historical reasons for compatibility</p>
     */
    @NameInMap("SmsContent")
    public String smsContent;

    /**
     * <p>This parameter is deprecated. It is retained for historical compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>Abandoned, historical reasons for compatibility</p>
     */
    @NameInMap("SmsType")
    public String smsType;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>This parameter is deprecated. It is retained for historical compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>Abandoned, historical reasons for compatibility</p>
     */
    @NameInMap("TemplateNickName")
    public String templateNickName;

    /**
     * <p>The status of the template. Valid values:</p>
     * <ul>
     * <li><p>0: The template is a draft.</p>
     * </li>
     * <li><p>1: The template is pending approval.</p>
     * </li>
     * <li><p>2: The template is approved.</p>
     * </li>
     * <li><p>3: The template is rejected.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TemplateStatus")
    public String templateStatus;

    /**
     * <p>The template subject, which is used to create the email subject.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TemplateSubject")
    public String templateSubject;

    /**
     * <p>The template content.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateText")
    public String templateText;

    /**
     * <p>This parameter is deprecated. It is retained for historical compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>Abandoned, historical reasons for compatibility</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static DescTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescTemplateResponseBody self = new DescTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescTemplateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescTemplateResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescTemplateResponseBody setSmsContent(String smsContent) {
        this.smsContent = smsContent;
        return this;
    }
    public String getSmsContent() {
        return this.smsContent;
    }

    public DescTemplateResponseBody setSmsType(String smsType) {
        this.smsType = smsType;
        return this;
    }
    public String getSmsType() {
        return this.smsType;
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

    public DescTemplateResponseBody setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public DescTemplateResponseBody setTemplateSubject(String templateSubject) {
        this.templateSubject = templateSubject;
        return this;
    }
    public String getTemplateSubject() {
        return this.templateSubject;
    }

    public DescTemplateResponseBody setTemplateText(String templateText) {
        this.templateText = templateText;
        return this;
    }
    public String getTemplateText() {
        return this.templateText;
    }

    public DescTemplateResponseBody setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
