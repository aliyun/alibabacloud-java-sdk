// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>system_init</p>
     */
    @NameInMap("ApplicationCreationType")
    public String applicationCreationType;

    /**
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("ApplicationIdentityType")
    public String applicationIdentityType;

    /**
     * <p>The IDs of the applications.</p>
     * 
     * <strong>example:</strong>
     * <p>Ram Account SSO</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>The name of the application. Only fuzzy match from the leftmost character is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Ram Account SSO</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The authorization of the application. Valid values:</p>
     * <ul>
     * <li>authorize_required: Only the user with explicit authorization can access the application.</li>
     * <li>default_all: By default, all users can access the application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>authorize_required</p>
     */
    @NameInMap("AuthorizationType")
    public String authorizationType;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Used to determine whether M2M client identity is enabled.</p>
     * <ul>
     * <li>enabled</li>
     * <li>disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("M2MClientStatus")
    public String m2MClientStatus;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Used to determine whether the ResourceServer capability is enabled.</p>
     * <ul>
     * <li>enabled</li>
     * <li>disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("ResourceServerStatus")
    public String resourceServerStatus;

    /**
     * <p>SSO type.</p>
     * <ul>
     * <li>oidc</li>
     * <li>saml2</li>
     * <li>oauth2/m2m</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oauth2/m2m</p>
     */
    @NameInMap("SsoType")
    public String ssoType;

    /**
     * <p>The status of the application. Valid values:</p>
     * <ul>
     * <li>Enabled: The application is enabled.</li>
     * <li>Disabled: The application is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsRequest self = new ListApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsRequest setApplicationCreationType(String applicationCreationType) {
        this.applicationCreationType = applicationCreationType;
        return this;
    }
    public String getApplicationCreationType() {
        return this.applicationCreationType;
    }

    public ListApplicationsRequest setApplicationIdentityType(String applicationIdentityType) {
        this.applicationIdentityType = applicationIdentityType;
        return this;
    }
    public String getApplicationIdentityType() {
        return this.applicationIdentityType;
    }

    public ListApplicationsRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public ListApplicationsRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListApplicationsRequest setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    public ListApplicationsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApplicationsRequest setM2MClientStatus(String m2MClientStatus) {
        this.m2MClientStatus = m2MClientStatus;
        return this;
    }
    public String getM2MClientStatus() {
        return this.m2MClientStatus;
    }

    public ListApplicationsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsRequest setResourceServerStatus(String resourceServerStatus) {
        this.resourceServerStatus = resourceServerStatus;
        return this;
    }
    public String getResourceServerStatus() {
        return this.resourceServerStatus;
    }

    public ListApplicationsRequest setSsoType(String ssoType) {
        this.ssoType = ssoType;
        return this;
    }
    public String getSsoType() {
        return this.ssoType;
    }

    public ListApplicationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
