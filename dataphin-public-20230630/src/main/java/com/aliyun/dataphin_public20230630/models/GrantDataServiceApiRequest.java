// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GrantDataServiceApiRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GrantCommand")
    public GrantDataServiceApiRequestGrantCommand grantCommand;

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

    public static GrantDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantDataServiceApiRequest self = new GrantDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public GrantDataServiceApiRequest setGrantCommand(GrantDataServiceApiRequestGrantCommand grantCommand) {
        this.grantCommand = grantCommand;
        return this;
    }
    public GrantDataServiceApiRequestGrantCommand getGrantCommand() {
        return this.grantCommand;
    }

    public GrantDataServiceApiRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GrantDataServiceApiRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class GrantDataServiceApiRequestGrantCommandDevFieldList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Id")
        public Integer id;

        public static GrantDataServiceApiRequestGrantCommandDevFieldList build(java.util.Map<String, ?> map) throws Exception {
            GrantDataServiceApiRequestGrantCommandDevFieldList self = new GrantDataServiceApiRequestGrantCommandDevFieldList();
            return TeaModel.build(map, self);
        }

        public GrantDataServiceApiRequestGrantCommandDevFieldList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class GrantDataServiceApiRequestGrantCommandProdFieldList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Id")
        public Integer id;

        public static GrantDataServiceApiRequestGrantCommandProdFieldList build(java.util.Map<String, ?> map) throws Exception {
            GrantDataServiceApiRequestGrantCommandProdFieldList self = new GrantDataServiceApiRequestGrantCommandProdFieldList();
            return TeaModel.build(map, self);
        }

        public GrantDataServiceApiRequestGrantCommandProdFieldList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class GrantDataServiceApiRequestGrantCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>AppID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1201</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        @NameInMap("ApplyDev")
        public Boolean applyDev;

        @NameInMap("ApplyProd")
        public Boolean applyProd;

        @NameInMap("DevFieldList")
        public java.util.List<GrantDataServiceApiRequestGrantCommandDevFieldList> devFieldList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("ProdFieldList")
        public java.util.List<GrantDataServiceApiRequestGrantCommandProdFieldList> prodFieldList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static GrantDataServiceApiRequestGrantCommand build(java.util.Map<String, ?> map) throws Exception {
            GrantDataServiceApiRequestGrantCommand self = new GrantDataServiceApiRequestGrantCommand();
            return TeaModel.build(map, self);
        }

        public GrantDataServiceApiRequestGrantCommand setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GrantDataServiceApiRequestGrantCommand setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public GrantDataServiceApiRequestGrantCommand setApplyDev(Boolean applyDev) {
            this.applyDev = applyDev;
            return this;
        }
        public Boolean getApplyDev() {
            return this.applyDev;
        }

        public GrantDataServiceApiRequestGrantCommand setApplyProd(Boolean applyProd) {
            this.applyProd = applyProd;
            return this;
        }
        public Boolean getApplyProd() {
            return this.applyProd;
        }

        public GrantDataServiceApiRequestGrantCommand setDevFieldList(java.util.List<GrantDataServiceApiRequestGrantCommandDevFieldList> devFieldList) {
            this.devFieldList = devFieldList;
            return this;
        }
        public java.util.List<GrantDataServiceApiRequestGrantCommandDevFieldList> getDevFieldList() {
            return this.devFieldList;
        }

        public GrantDataServiceApiRequestGrantCommand setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public GrantDataServiceApiRequestGrantCommand setProdFieldList(java.util.List<GrantDataServiceApiRequestGrantCommandProdFieldList> prodFieldList) {
            this.prodFieldList = prodFieldList;
            return this;
        }
        public java.util.List<GrantDataServiceApiRequestGrantCommandProdFieldList> getProdFieldList() {
            return this.prodFieldList;
        }

        public GrantDataServiceApiRequestGrantCommand setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
