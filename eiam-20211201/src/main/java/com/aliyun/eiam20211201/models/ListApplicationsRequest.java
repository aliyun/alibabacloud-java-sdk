// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsRequest extends TeaModel {
    /**
     * <p>The application creation type. If unspecified, only user-created (<code>user_custom</code>) applications are returned. To query applications of all types, set this parameter to <code>all</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>system_init</p>
     */
    @NameInMap("ApplicationCreationType")
    public String applicationCreationType;

    /**
     * <p>The application identity type. If unspecified, only applications of the <code>application</code> type are returned. To query all identity types, set this parameter to <code>all</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("ApplicationIdentityType")
    public String applicationIdentityType;

    /**
     * <p>A list of application IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>Ram Account SSO</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>The application name. Only prefix matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Ram Account SSO</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The authorization type for application access. Valid values:</p>
     * <ul>
     * <li><p><code>authorize_required</code>: Access requires explicit authorization.</p>
     * </li>
     * <li><p><code>default_all</code>: All members have access by default.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>authorize_required</p>
     */
    @NameInMap("AuthorizationType")
    public String authorizationType;

    /**
     * <p>A list of custom fields.</p>
     */
    @NameInMap("CustomFields")
    public java.util.List<ListApplicationsRequestCustomFields> customFields;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of the M2M client identity.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("M2MClientStatus")
    public String m2MClientStatus;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The status of the resource server capability.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("ResourceServerStatus")
    public String resourceServerStatus;

    /**
     * <p>A filter for the Single Sign-On (SSO) type. You can specify multiple types, separated by a comma. Example: <code>oauth2/m2m,oidc+oauth2/m2m</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>oauth2/m2m</p>
     */
    @NameInMap("SsoType")
    public String ssoType;

    /**
     * <p>The application status. Valid values:</p>
     * <ul>
     * <li><p><code>enabled</code>: Enabled.</p>
     * </li>
     * <li><p><code>disabled</code>: Disabled.</p>
     * </li>
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

    public ListApplicationsRequest setCustomFields(java.util.List<ListApplicationsRequestCustomFields> customFields) {
        this.customFields = customFields;
        return this;
    }
    public java.util.List<ListApplicationsRequestCustomFields> getCustomFields() {
        return this.customFields;
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

    public static class ListApplicationsRequestCustomFields extends TeaModel {
        /**
         * <p>The custom field identifier. Valid values:</p>
         * <ul>
         * <li><code>agent_type</code>: The agent type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agent_type</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The custom field value.</p>
         * 
         * <strong>example:</strong>
         * <p>x-claw</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        public static ListApplicationsRequestCustomFields build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsRequestCustomFields self = new ListApplicationsRequestCustomFields();
            return TeaModel.build(map, self);
        }

        public ListApplicationsRequestCustomFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public ListApplicationsRequestCustomFields setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

}
