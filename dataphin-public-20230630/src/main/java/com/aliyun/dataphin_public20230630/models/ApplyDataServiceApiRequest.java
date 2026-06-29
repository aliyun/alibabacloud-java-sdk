// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ApplyDataServiceApiRequest extends TeaModel {
    /**
     * <p>The apply command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyCommand")
    public ApplyDataServiceApiRequestApplyCommand applyCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The data service project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static ApplyDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataServiceApiRequest self = new ApplyDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDataServiceApiRequest setApplyCommand(ApplyDataServiceApiRequestApplyCommand applyCommand) {
        this.applyCommand = applyCommand;
        return this;
    }
    public ApplyDataServiceApiRequestApplyCommand getApplyCommand() {
        return this.applyCommand;
    }

    public ApplyDataServiceApiRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ApplyDataServiceApiRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class ApplyDataServiceApiRequestApplyCommandDevFieldList extends TeaModel {
        /**
         * <p>The API permission field ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Integer id;

        public static ApplyDataServiceApiRequestApplyCommandDevFieldList build(java.util.Map<String, ?> map) throws Exception {
            ApplyDataServiceApiRequestApplyCommandDevFieldList self = new ApplyDataServiceApiRequestApplyCommandDevFieldList();
            return TeaModel.build(map, self);
        }

        public ApplyDataServiceApiRequestApplyCommandDevFieldList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class ApplyDataServiceApiRequestApplyCommandProdFieldList extends TeaModel {
        /**
         * <p>The API permission field ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Integer id;

        public static ApplyDataServiceApiRequestApplyCommandProdFieldList build(java.util.Map<String, ?> map) throws Exception {
            ApplyDataServiceApiRequestApplyCommandProdFieldList self = new ApplyDataServiceApiRequestApplyCommandProdFieldList();
            return TeaModel.build(map, self);
        }

        public ApplyDataServiceApiRequestApplyCommandProdFieldList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class ApplyDataServiceApiRequestApplyCommand extends TeaModel {
        /**
         * <p>The API ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1203</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>Specifies whether to apply for permissions on operation-type APIs in the development environment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ApplyDev")
        public Boolean applyDev;

        /**
         * <p>Specifies whether to apply for permissions on operation-type APIs in the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ApplyProd")
        public Boolean applyProd;

        /**
         * <p>The application type. Valid values:</p>
         * <ul>
         * <li>APP: application.</li>
         * <li>USER: individual account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APP</p>
         */
        @NameInMap("ApplyType")
        public String applyType;

        /**
         * <p>The list of permission types.</p>
         * <ul>
         * <li><p>When the principal is an application, the following permission types are supported. To apply for delegation permissions, you must also apply for usage permissions.</p>
         * <ul>
         * <li>USE: usage permission.</li>
         * <li>DELEGATION: delegation permission.</li>
         * </ul>
         * </li>
         * <li><p>When the principal is an individual, only USE (usage) permission is supported.</p>
         * </li>
         * <li><p>If this parameter is not specified, the default value is USE (usage) permission.</p>
         * </li>
         * </ul>
         */
        @NameInMap("AuthTypes")
        public java.util.List<String> authTypes;

        /**
         * <p>The list of permission fields for query-type APIs in the development environment. This parameter is required in dev-prod mode. DevFieldList and ProdFieldList cannot both be empty.</p>
         */
        @NameInMap("DevFieldList")
        public java.util.List<ApplyDataServiceApiRequestApplyCommandDevFieldList> devFieldList;

        /**
         * <p>The expiration date in the format of yyyy-MM-dd.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>The list of permission fields for query-type APIs in the production environment. This parameter is required in basic mode.</p>
         */
        @NameInMap("ProdFieldList")
        public java.util.List<ApplyDataServiceApiRequestApplyCommandProdFieldList> prodFieldList;

        /**
         * <p>The reason for the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static ApplyDataServiceApiRequestApplyCommand build(java.util.Map<String, ?> map) throws Exception {
            ApplyDataServiceApiRequestApplyCommand self = new ApplyDataServiceApiRequestApplyCommand();
            return TeaModel.build(map, self);
        }

        public ApplyDataServiceApiRequestApplyCommand setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ApplyDataServiceApiRequestApplyCommand setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public ApplyDataServiceApiRequestApplyCommand setApplyDev(Boolean applyDev) {
            this.applyDev = applyDev;
            return this;
        }
        public Boolean getApplyDev() {
            return this.applyDev;
        }

        public ApplyDataServiceApiRequestApplyCommand setApplyProd(Boolean applyProd) {
            this.applyProd = applyProd;
            return this;
        }
        public Boolean getApplyProd() {
            return this.applyProd;
        }

        public ApplyDataServiceApiRequestApplyCommand setApplyType(String applyType) {
            this.applyType = applyType;
            return this;
        }
        public String getApplyType() {
            return this.applyType;
        }

        public ApplyDataServiceApiRequestApplyCommand setAuthTypes(java.util.List<String> authTypes) {
            this.authTypes = authTypes;
            return this;
        }
        public java.util.List<String> getAuthTypes() {
            return this.authTypes;
        }

        public ApplyDataServiceApiRequestApplyCommand setDevFieldList(java.util.List<ApplyDataServiceApiRequestApplyCommandDevFieldList> devFieldList) {
            this.devFieldList = devFieldList;
            return this;
        }
        public java.util.List<ApplyDataServiceApiRequestApplyCommandDevFieldList> getDevFieldList() {
            return this.devFieldList;
        }

        public ApplyDataServiceApiRequestApplyCommand setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public ApplyDataServiceApiRequestApplyCommand setProdFieldList(java.util.List<ApplyDataServiceApiRequestApplyCommandProdFieldList> prodFieldList) {
            this.prodFieldList = prodFieldList;
            return this;
        }
        public java.util.List<ApplyDataServiceApiRequestApplyCommandProdFieldList> getProdFieldList() {
            return this.prodFieldList;
        }

        public ApplyDataServiceApiRequestApplyCommand setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
