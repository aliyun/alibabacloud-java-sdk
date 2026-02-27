// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ApplyDataServiceApiRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyCommand")
    public ApplyDataServiceApiRequestApplyCommand applyCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>AppId</p>
         * 
         * <strong>example:</strong>
         * <p>1203</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        @NameInMap("ApplyDev")
        public Boolean applyDev;

        @NameInMap("ApplyProd")
        public Boolean applyProd;

        /**
         * <strong>example:</strong>
         * <p>APP</p>
         */
        @NameInMap("ApplyType")
        public String applyType;

        @NameInMap("AuthTypes")
        public java.util.List<String> authTypes;

        @NameInMap("DevFieldList")
        public java.util.List<ApplyDataServiceApiRequestApplyCommandDevFieldList> devFieldList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("ProdFieldList")
        public java.util.List<ApplyDataServiceApiRequestApplyCommandProdFieldList> prodFieldList;

        /**
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
