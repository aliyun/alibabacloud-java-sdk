// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListExternalApplicationsResponseBody extends TeaModel {
    /**
     * <p>The information about the external applications.</p>
     */
    @NameInMap("ExternalApplications")
    public ListExternalApplicationsResponseBodyExternalApplications externalApplications;

    /**
     * <p>Indicates whether the response is truncated. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * <blockquote>
     * <p> This parameter is returned only when <code>IsTruncated</code> is <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>936E1D9C-157D-45BD-8A3B-81C0716EB077</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListExternalApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExternalApplicationsResponseBody self = new ListExternalApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExternalApplicationsResponseBody setExternalApplications(ListExternalApplicationsResponseBodyExternalApplications externalApplications) {
        this.externalApplications = externalApplications;
        return this;
    }
    public ListExternalApplicationsResponseBodyExternalApplications getExternalApplications() {
        return this.externalApplications;
    }

    public ListExternalApplicationsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListExternalApplicationsResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListExternalApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        /**
         * <p>The description of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>Obtains the OpenID of the user. This is the default scope and cannot be deleted.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>openid</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopesPredefinedScope self = new ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        public java.util.List<ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopes self = new ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScope extends TeaModel {
        /**
         * <p>The information about the permissions that are granted to the external application.</p>
         */
        @NameInMap("PredefinedScopes")
        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopes predefinedScopes;

        public static ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScope self = new ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScope();
            return TeaModel.build(map, self);
        }

        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScope setPredefinedScopes(ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication extends TeaModel {
        /**
         * <p>The name of the external application principal. The value is in the <code>&lt;app_name&gt;@app.&lt;account_id&gt;.onaliyun.com</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:GiteePrd@app.153082740420">GiteePrd@app.153082740420</a>****.onaliyun.com</p>
         */
        @NameInMap("AppPrincipalName")
        public String appPrincipalName;

        /**
         * <p>The time when the external application was installed. The value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1603693318000</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The information about the permissions that are granted to the external application.</p>
         */
        @NameInMap("DelegatedScope")
        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScope delegatedScope;

        /**
         * <p>The display name of the external application.</p>
         * 
         * <strong>example:</strong>
         * <p>GiteeAliyun</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the external application.</p>
         * 
         * <strong>example:</strong>
         * <p>407426893752729****</p>
         */
        @NameInMap("ForeignAppId")
        public String foreignAppId;

        /**
         * <p>The ID of the Alibaba Cloud account for which the external application was installed.</p>
         * 
         * <strong>example:</strong>
         * <p>173082740420****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The update time of the external application. The value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1603693518000</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication build(java.util.Map<String, ?> map) throws Exception {
            ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication self = new ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication();
            return TeaModel.build(map, self);
        }

        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication setAppPrincipalName(String appPrincipalName) {
            this.appPrincipalName = appPrincipalName;
            return this;
        }
        public String getAppPrincipalName() {
            return this.appPrincipalName;
        }

        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication setDelegatedScope(ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication setForeignAppId(String foreignAppId) {
            this.foreignAppId = foreignAppId;
            return this;
        }
        public String getForeignAppId() {
            return this.foreignAppId;
        }

        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

    public static class ListExternalApplicationsResponseBodyExternalApplications extends TeaModel {
        @NameInMap("ExternalApplication")
        public java.util.List<ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication> externalApplication;

        public static ListExternalApplicationsResponseBodyExternalApplications build(java.util.Map<String, ?> map) throws Exception {
            ListExternalApplicationsResponseBodyExternalApplications self = new ListExternalApplicationsResponseBodyExternalApplications();
            return TeaModel.build(map, self);
        }

        public ListExternalApplicationsResponseBodyExternalApplications setExternalApplication(java.util.List<ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication> externalApplication) {
            this.externalApplication = externalApplication;
            return this;
        }
        public java.util.List<ListExternalApplicationsResponseBodyExternalApplicationsExternalApplication> getExternalApplication() {
            return this.externalApplication;
        }

    }

}
