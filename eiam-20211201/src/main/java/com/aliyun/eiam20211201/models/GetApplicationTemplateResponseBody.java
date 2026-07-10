// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationTemplateResponseBody extends TeaModel {
    /**
     * <p>The application template information.</p>
     */
    @NameInMap("ApplicationTemplate")
    public GetApplicationTemplateResponseBodyApplicationTemplate applicationTemplate;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>Indicates whether the application template is always free.</p>
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
         * <p>The application template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>apt_ramintlrole_ixxxxx</p>
         */
        @NameInMap("ApplicationTemplateId")
        public String applicationTemplateId;

        /**
         * <p>The application template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        @NameInMap("ApplicationTemplateName")
        public String applicationTemplateName;

        /**
         * <p>The time when the application template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1730341123000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The application template description.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud SSO</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The help document URL of the application template.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/document_detail/409xxx.html">https://example.com/document_detail/409xxx.html</a></p>
         */
        @NameInMap("HelpDocumentUrl")
        public String helpDocumentUrl;

        /**
         * <p>The logo URL of the application template.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/imgextra/i4/O1CN01xTLxLb1WtyKksHW1H_!!6000000002847-2-tps-xxx-xxx.png">https://example.com/imgextra/i4/O1CN01xTLxLb1WtyKksHW1H_!!6000000002847-2-tps-xxx-xxx.png</a></p>
         */
        @NameInMap("LogoUrl")
        public String logoUrl;

        /**
         * <p>The service code of the Alibaba Cloud service that manages the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost</p>
         */
        @NameInMap("ManagedServiceCode")
        public String managedServiceCode;

        /**
         * <p>The sale information of the application template.</p>
         */
        @NameInMap("SaleInfo")
        public GetApplicationTemplateResponseBodyApplicationTemplateSaleInfo saleInfo;

        /**
         * <p>The console URL of the Alibaba Cloud service that manages the application template.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/?p=bastion">https://example.com/?p=bastion</a></p>
         */
        @NameInMap("ServiceConsoleUrl")
        public String serviceConsoleUrl;

        /**
         * <p>Indicates whether the application template is managed by an Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The supported SSO protocols.</p>
         */
        @NameInMap("SsoTypes")
        public java.util.List<String> ssoTypes;

        /**
         * <p>The time when the application template was last updated.</p>
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
