// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsTemplateResponseBody extends TeaModel {
    /**
     * <p>应用场景内容。</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplyScene")
    public String applyScene;

    /**
     * <p>审核信息。</p>
     */
    @NameInMap("AuditInfo")
    public GetSmsTemplateResponseBodyAuditInfo auditInfo;

    /**
     * <p>请求状态码。取值：</p>
     * <ul>
     * <li>OK：代表请求成功。</li>
     * <li>其他错误码，请参见<a href="https://help.aliyun.com/document_detail/101346.html">API错误码</a>。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>创建短信模板的时间。</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-03 10:02:34</p>
     */
    @NameInMap("CreateDate")
    public String createDate;

    @NameInMap("FileUrlList")
    public GetSmsTemplateResponseBodyFileUrlList fileUrlList;

    /**
     * <p>国际/港澳台模板类型。当<strong>TemplateType</strong>参数返回值为<strong>3</strong>时，此参数取值：</p>
     * <ul>
     * <li><strong>0</strong>：短信通知。</li>
     * <li><strong>1</strong>：推广短信。</li>
     * <li><strong>2</strong>：验证码。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IntlType")
    public Integer intlType;

    /**
     * <p>状态码的描述。</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("MoreDataFileUrlList")
    public GetSmsTemplateResponseBodyMoreDataFileUrlList moreDataFileUrlList;

    /**
     * <p>工单号。</p>
     * <p>审核人员查询审核时会用到此参数。您需要审核加急时需要提供此工单号。</p>
     * 
     * <strong>example:</strong>
     * <p>2003019****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>申请模板时，关联的短信签名。</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("RelatedSignName")
    public String relatedSignName;

    /**
     * <p>短信模板申请说明，是模板审核的参考信息之一。</p>
     * 
     * <strong>example:</strong>
     * <p>申请验证码模板</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>本次调用请求的ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignList")
    public GetSmsTemplateResponseBodySignList signList;

    /**
     * <p>短信模板Code。</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_20375****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>短信模板内容。</p>
     * 
     * <strong>example:</strong>
     * <p>您正在申请手机注册，验证码为：${code}，5分钟内有效！</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>短信模板名称。</p>
     * 
     * <strong>example:</strong>
     * <p>验证码</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>模板审核状态。返回值：</p>
     * <ul>
     * <li><strong>0</strong>：审核中。</li>
     * <li><strong>1</strong>：通过审核。</li>
     * <li><strong>2</strong>：未通过审核，会返回审核失败的原因，请参考<a href="https://www.alibabacloud.com/help/en/sms/user-guide/causes-of-application-failures-and-suggestions">短信审核失败的处理建议</a>，调用<a href="https://www.alibabacloud.com/help/en/sms/developer-reference/api-dysmsapi-2017-05-25-updatesmstemplate">UpdateSmsTemplate</a>接口或在<a href="https://dysms.console.aliyun.com/domestic/text/template">模板管理</a>页面修改短信模板。</li>
     * <li><strong>10</strong>：取消审核。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TemplateStatus")
    public String templateStatus;

    /**
     * <p>模板标识。取值：</p>
     * <ul>
     * <li><p>2：用户自定义创建模板。</p>
     * </li>
     * <li><p>3：系统赠送模板。</p>
     * </li>
     * <li><p>4：测试模板。</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TemplateTag")
    public Integer templateTag;

    /**
     * <p>短信类型。取值：</p>
     * <ul>
     * <li><strong>0</strong>：验证码。</li>
     * <li><strong>1</strong>：短信通知。</li>
     * <li><strong>2</strong>：推广短信。</li>
     * <li><strong>3</strong>：国际/港澳台消息。</li>
     * </ul>
     * <blockquote>
     * <p>仅支持企业认证用户申请推广短信和国际/港澳台消息。个人用户与企业用户权益区别详情请参见<a href="https://www.alibabacloud.com/help/en/sms/user-guide/usage-notes">使用须知</a>。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>模板变量规则。</p>
     * <p>模板变量规则详情，请参见<a href="https://www.alibabacloud.com/help/en/sms/templaterule-template-variable-parameter-filling-example">示例文档</a>。</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;characterWithNumber&quot;}</p>
     */
    @NameInMap("VariableAttribute")
    public String variableAttribute;

    /**
     * <p>各运营商审核状态，仅数字短信会返回该参数。</p>
     * <p>key代表运营商。取值：</p>
     * <ul>
     * <li><p>MOBILE_VENDOR：中国移动。</p>
     * </li>
     * <li><p>TELECOM_VENDOR：中国电信。</p>
     * </li>
     * <li><p>UNICOM_VENDOR：中国联通。</p>
     * </li>
     * </ul>
     * <p> value代表审核状态。取值： </p>
     * <ul>
     * <li><p>0：审核中。</p>
     * </li>
     * <li><p>1：通过。</p>
     * </li>
     * <li><p>2：不通过。</p>
     * </li>
     * <li><p>15：已失效。</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;MOBILE_VENDOR&quot;: 0,
     *     &quot;TELCOM_VENDOR&quot;: 0,
     *     &quot;UNICOM_VENDOR&quot;: 0
     *   }</p>
     */
    @NameInMap("VendorAuditStatus")
    public java.util.Map<String, ?> vendorAuditStatus;

    public static GetSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmsTemplateResponseBody self = new GetSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmsTemplateResponseBody setApplyScene(String applyScene) {
        this.applyScene = applyScene;
        return this;
    }
    public String getApplyScene() {
        return this.applyScene;
    }

    public GetSmsTemplateResponseBody setAuditInfo(GetSmsTemplateResponseBodyAuditInfo auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public GetSmsTemplateResponseBodyAuditInfo getAuditInfo() {
        return this.auditInfo;
    }

    public GetSmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmsTemplateResponseBody setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public GetSmsTemplateResponseBody setFileUrlList(GetSmsTemplateResponseBodyFileUrlList fileUrlList) {
        this.fileUrlList = fileUrlList;
        return this;
    }
    public GetSmsTemplateResponseBodyFileUrlList getFileUrlList() {
        return this.fileUrlList;
    }

    public GetSmsTemplateResponseBody setIntlType(Integer intlType) {
        this.intlType = intlType;
        return this;
    }
    public Integer getIntlType() {
        return this.intlType;
    }

    public GetSmsTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmsTemplateResponseBody setMoreDataFileUrlList(GetSmsTemplateResponseBodyMoreDataFileUrlList moreDataFileUrlList) {
        this.moreDataFileUrlList = moreDataFileUrlList;
        return this;
    }
    public GetSmsTemplateResponseBodyMoreDataFileUrlList getMoreDataFileUrlList() {
        return this.moreDataFileUrlList;
    }

    public GetSmsTemplateResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetSmsTemplateResponseBody setRelatedSignName(String relatedSignName) {
        this.relatedSignName = relatedSignName;
        return this;
    }
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    public GetSmsTemplateResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public GetSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmsTemplateResponseBody setSignList(GetSmsTemplateResponseBodySignList signList) {
        this.signList = signList;
        return this;
    }
    public GetSmsTemplateResponseBodySignList getSignList() {
        return this.signList;
    }

    public GetSmsTemplateResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public GetSmsTemplateResponseBody setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public GetSmsTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetSmsTemplateResponseBody setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public GetSmsTemplateResponseBody setTemplateTag(Integer templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public Integer getTemplateTag() {
        return this.templateTag;
    }

    public GetSmsTemplateResponseBody setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public GetSmsTemplateResponseBody setVariableAttribute(String variableAttribute) {
        this.variableAttribute = variableAttribute;
        return this;
    }
    public String getVariableAttribute() {
        return this.variableAttribute;
    }

    public GetSmsTemplateResponseBody setVendorAuditStatus(java.util.Map<String, ?> vendorAuditStatus) {
        this.vendorAuditStatus = vendorAuditStatus;
        return this;
    }
    public java.util.Map<String, ?> getVendorAuditStatus() {
        return this.vendorAuditStatus;
    }

    public static class GetSmsTemplateResponseBodyAuditInfo extends TeaModel {
        /**
         * <p>审核时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-03 11:20:34</p>
         */
        @NameInMap("AuditDate")
        public String auditDate;

        /**
         * <p>审核未通过的原因。</p>
         * 
         * <strong>example:</strong>
         * <p>模板内容中包含错别字。</p>
         */
        @NameInMap("RejectInfo")
        public String rejectInfo;

        public static GetSmsTemplateResponseBodyAuditInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSmsTemplateResponseBodyAuditInfo self = new GetSmsTemplateResponseBodyAuditInfo();
            return TeaModel.build(map, self);
        }

        public GetSmsTemplateResponseBodyAuditInfo setAuditDate(String auditDate) {
            this.auditDate = auditDate;
            return this;
        }
        public String getAuditDate() {
            return this.auditDate;
        }

        public GetSmsTemplateResponseBodyAuditInfo setRejectInfo(String rejectInfo) {
            this.rejectInfo = rejectInfo;
            return this;
        }
        public String getRejectInfo() {
            return this.rejectInfo;
        }

    }

    public static class GetSmsTemplateResponseBodyFileUrlList extends TeaModel {
        @NameInMap("FileUrl")
        public java.util.List<String> fileUrl;

        public static GetSmsTemplateResponseBodyFileUrlList build(java.util.Map<String, ?> map) throws Exception {
            GetSmsTemplateResponseBodyFileUrlList self = new GetSmsTemplateResponseBodyFileUrlList();
            return TeaModel.build(map, self);
        }

        public GetSmsTemplateResponseBodyFileUrlList setFileUrl(java.util.List<String> fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public java.util.List<String> getFileUrl() {
            return this.fileUrl;
        }

    }

    public static class GetSmsTemplateResponseBodyMoreDataFileUrlList extends TeaModel {
        @NameInMap("MoreDataFileUrl")
        public java.util.List<String> moreDataFileUrl;

        public static GetSmsTemplateResponseBodyMoreDataFileUrlList build(java.util.Map<String, ?> map) throws Exception {
            GetSmsTemplateResponseBodyMoreDataFileUrlList self = new GetSmsTemplateResponseBodyMoreDataFileUrlList();
            return TeaModel.build(map, self);
        }

        public GetSmsTemplateResponseBodyMoreDataFileUrlList setMoreDataFileUrl(java.util.List<String> moreDataFileUrl) {
            this.moreDataFileUrl = moreDataFileUrl;
            return this;
        }
        public java.util.List<String> getMoreDataFileUrl() {
            return this.moreDataFileUrl;
        }

    }

    public static class GetSmsTemplateResponseBodySignList extends TeaModel {
        @NameInMap("SignList")
        public java.util.List<String> signList;

        public static GetSmsTemplateResponseBodySignList build(java.util.Map<String, ?> map) throws Exception {
            GetSmsTemplateResponseBodySignList self = new GetSmsTemplateResponseBodySignList();
            return TeaModel.build(map, self);
        }

        public GetSmsTemplateResponseBodySignList setSignList(java.util.List<String> signList) {
            this.signList = signList;
            return this;
        }
        public java.util.List<String> getSignList() {
            return this.signList;
        }

    }

}
