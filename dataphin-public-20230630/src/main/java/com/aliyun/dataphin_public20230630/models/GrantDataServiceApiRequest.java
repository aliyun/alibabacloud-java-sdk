// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GrantDataServiceApiRequest extends TeaModel {
    /**
     * <p>The grant command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GrantCommand")
    public GrantDataServiceApiRequestGrantCommand grantCommand;

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
         * <p>The API permission field ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The API permission field ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>1201</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>Specifies whether to request development environment permissions for operation-type APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ApplyDev")
        public Boolean applyDev;

        /**
         * <p>Specifies whether to request production environment permissions for operation-type APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ApplyProd")
        public Boolean applyProd;

        /**
         * <p>The list of authorization permission types. Valid values:</p>
         * <ul>
         * <li>When the grantee is an application, the following permission types are supported. To grant delegation permissions, you must also grant usage permissions.<ul>
         * <li>USE: usage permission.</li>
         * <li>DELEGATION: delegation permission.</li>
         * </ul>
         * </li>
         * <li>When the grantee is an individual, only USE (usage) permission is supported.</li>
         * <li>If this parameter is not specified, the default value is USE (usage) permission.</li>
         * </ul>
         */
        @NameInMap("AuthTypes")
        public java.util.List<String> authTypes;

        /**
         * <p>The list of development environment permission fields for query-type APIs. This parameter is required in dev-prod mode. DevFieldList and ProdFieldList cannot both be empty. This parameter is not required for operation-type APIs.</p>
         */
        @NameInMap("DevFieldList")
        public java.util.List<GrantDataServiceApiRequestGrantCommandDevFieldList> devFieldList;

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
         * <p>The authorization object type. Valid values:</p>
         * <ul>
         * <li>APP: application.</li>
         * <li>USER: user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APP</p>
         */
        @NameInMap("GranteeType")
        public String granteeType;

        /**
         * <p>The list of production environment permission fields for query-type APIs. This parameter is required in basic mode. This parameter is not required for operation-type APIs.</p>
         */
        @NameInMap("ProdFieldList")
        public java.util.List<GrantDataServiceApiRequestGrantCommandProdFieldList> prodFieldList;

        /**
         * <p>The reason for the authorization request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("UserId")
        public String userId;

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

        public GrantDataServiceApiRequestGrantCommand setAuthTypes(java.util.List<String> authTypes) {
            this.authTypes = authTypes;
            return this;
        }
        public java.util.List<String> getAuthTypes() {
            return this.authTypes;
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

        public GrantDataServiceApiRequestGrantCommand setGranteeType(String granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public String getGranteeType() {
            return this.granteeType;
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

        public GrantDataServiceApiRequestGrantCommand setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
