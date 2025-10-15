// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationTemplateResponseBody extends TeaModel {
    @NameInMap("ApplicationTemplate")
    public GetApplicationTemplateResponseBodyApplicationTemplate applicationTemplate;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationTemplateResponseBody self = new GetApplicationTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationTemplateResponseBody setApplicationTemplate(GetApplicationTemplateResponseBodyApplicationTemplate applicationTemplate) {
        this.applicationTemplate = applicationTemplate;
        return this;
    }
    public GetApplicationTemplateResponseBodyApplicationTemplate getApplicationTemplate() {
        return this.applicationTemplate;
    }

    public GetApplicationTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationTemplateResponseBodyApplicationTemplateSaleInfo extends TeaModel {
        /**
         * <p>是否永久免费</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AlwaysFree")
        public Boolean alwaysFree;

        public static GetApplicationTemplateResponseBodyApplicationTemplateSaleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationTemplateResponseBodyApplicationTemplateSaleInfo self = new GetApplicationTemplateResponseBodyApplicationTemplateSaleInfo();
            return TeaModel.build(map, self);
        }

        public GetApplicationTemplateResponseBodyApplicationTemplateSaleInfo setAlwaysFree(Boolean alwaysFree) {
            this.alwaysFree = alwaysFree;
            return this;
        }
        public Boolean getAlwaysFree() {
            return this.alwaysFree;
        }

    }

    public static class GetApplicationTemplateResponseBodyApplicationTemplate extends TeaModel {
        /**
         * <p>应用模板Id</p>
         * 
         * <strong>example:</strong>
         * <p>apt_ramintlrole_ixxxxx</p>
         */
        @NameInMap("ApplicationTemplateId")
        public String applicationTemplateId;

        /**
         * <p>应用模板名称</p>
         */
        @NameInMap("ApplicationTemplateName")
        public String applicationTemplateName;

        /**
         * <p>应用模板创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1730341123000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>应用模板描述信息</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>应用模板对应帮助文档地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/document_detail/409xxx.html">https://example.com/document_detail/409xxx.html</a></p>
         */
        @NameInMap("HelpDocumentUrl")
        public String helpDocumentUrl;

        /**
         * <p>应用模板Logo地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/imgextra/i4/O1CN01xTLxLb1WtyKksHW1H_!!6000000002847-2-tps-xxx-xxx.png">https://example.com/imgextra/i4/O1CN01xTLxLb1WtyKksHW1H_!!6000000002847-2-tps-xxx-xxx.png</a></p>
         */
        @NameInMap("LogoUrl")
        public String logoUrl;

        /**
         * <p>托管应用模板的云产品ServiceCode。当且仅当ServiceManaged为true是返回。</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost</p>
         */
        @NameInMap("ManagedServiceCode")
        public String managedServiceCode;

        /**
         * <p>应用模板售卖信息</p>
         */
        @NameInMap("SaleInfo")
        public GetApplicationTemplateResponseBodyApplicationTemplateSaleInfo saleInfo;

        /**
         * <p>托管应用模板的云产品控制台地址。当且仅当ServiceManaged为true是返回。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/?p=bastion">https://example.com/?p=bastion</a></p>
         */
        @NameInMap("ServiceConsoleUrl")
        public String serviceConsoleUrl;

        /**
         * <p>应用模板是否被云产品托管。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>支持SSO协议</p>
         */
        @NameInMap("SsoTypes")
        public java.util.List<String> ssoTypes;

        /**
         * <p>应用模板更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>1730341124000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetApplicationTemplateResponseBodyApplicationTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationTemplateResponseBodyApplicationTemplate self = new GetApplicationTemplateResponseBodyApplicationTemplate();
            return TeaModel.build(map, self);
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setApplicationTemplateId(String applicationTemplateId) {
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }
        public String getApplicationTemplateId() {
            return this.applicationTemplateId;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setApplicationTemplateName(String applicationTemplateName) {
            this.applicationTemplateName = applicationTemplateName;
            return this;
        }
        public String getApplicationTemplateName() {
            return this.applicationTemplateName;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setHelpDocumentUrl(String helpDocumentUrl) {
            this.helpDocumentUrl = helpDocumentUrl;
            return this;
        }
        public String getHelpDocumentUrl() {
            return this.helpDocumentUrl;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setManagedServiceCode(String managedServiceCode) {
            this.managedServiceCode = managedServiceCode;
            return this;
        }
        public String getManagedServiceCode() {
            return this.managedServiceCode;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setSaleInfo(GetApplicationTemplateResponseBodyApplicationTemplateSaleInfo saleInfo) {
            this.saleInfo = saleInfo;
            return this;
        }
        public GetApplicationTemplateResponseBodyApplicationTemplateSaleInfo getSaleInfo() {
            return this.saleInfo;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setServiceConsoleUrl(String serviceConsoleUrl) {
            this.serviceConsoleUrl = serviceConsoleUrl;
            return this;
        }
        public String getServiceConsoleUrl() {
            return this.serviceConsoleUrl;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setSsoTypes(java.util.List<String> ssoTypes) {
            this.ssoTypes = ssoTypes;
            return this;
        }
        public java.util.List<String> getSsoTypes() {
            return this.ssoTypes;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
