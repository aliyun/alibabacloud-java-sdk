// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The prefix of the display name. The query is performed based on the prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("DisplayNameStartsWith")
    public String displayNameStartsWith;

    /**
     * <p>The email address of the user.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:user@example.com">user@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the organizational unit.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    /**
     * <p>The page number. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. The default value is 20. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The mobile number of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>156xxxxxxx</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The country calling code. For example, the country calling code of China is <code>86</code>. Do not add <code>00</code> or <code>+</code> to the country calling code.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("PhoneRegion")
    public String phoneRegion;

    /**
     * <p>The status of the user. Valid values:</p>
     * <ul>
     * <li><p><code>enabled</code>: The user is enabled.</p>
     * </li>
     * <li><p><code>disabled</code>: The user is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The external ID of the user. The external ID can be used to associate the user with a user in an external system.</p>
     * <blockquote>
     * <p>The external ID must be unique within the same source type and source ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>id_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("UserExternalId")
    public String userExternalId;

    /**
     * <p>The list of user IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    /**
     * <p>The source ID of the user.</p>
     * <p>If the user is created in EIAM, the value of this parameter is the ID of the EIAM instance. If the user is imported from an external system, the value of this parameter is the enterprise ID of the user in the external system. For example, if the user is imported from DingTalk, the value of this parameter is the <code>corpId</code> of the enterprise in DingTalk.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("UserSourceId")
    public String userSourceId;

    /**
     * <p>The source type of the user. Valid values:</p>
     * <ul>
     * <li><p><code>build_in</code>: The user is created in EIAM.</p>
     * </li>
     * <li><p><code>ding_talk</code>: The user is imported from DingTalk.</p>
     * </li>
     * <li><p><code>ad</code>: The user is imported from Active Directory (AD).</p>
     * </li>
     * <li><p><code>ldap</code>: The user is imported from a Lightweight Directory Access Protocol (LDAP) directory.</p>
     * </li>
     * <li><p><code>we_com</code>: The user is imported from WeCom.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>build_in</p>
     */
    @NameInMap("UserSourceType")
    public String userSourceType;

    /**
     * <p>The prefix of the username. The query is performed based on the prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>name_001</p>
     */
    @NameInMap("UsernameStartsWith")
    public String usernameStartsWith;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setDisplayNameStartsWith(String displayNameStartsWith) {
        this.displayNameStartsWith = displayNameStartsWith;
        return this;
    }
    public String getDisplayNameStartsWith() {
        return this.displayNameStartsWith;
    }

    public ListUsersRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ListUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUsersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUsersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUsersRequest setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    public ListUsersRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUsersRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ListUsersRequest setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
        return this;
    }
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    public ListUsersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListUsersRequest setUserExternalId(String userExternalId) {
        this.userExternalId = userExternalId;
        return this;
    }
    public String getUserExternalId() {
        return this.userExternalId;
    }

    public ListUsersRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public ListUsersRequest setUserSourceId(String userSourceId) {
        this.userSourceId = userSourceId;
        return this;
    }
    public String getUserSourceId() {
        return this.userSourceId;
    }

    public ListUsersRequest setUserSourceType(String userSourceType) {
        this.userSourceType = userSourceType;
        return this;
    }
    public String getUserSourceType() {
        return this.userSourceType;
    }

    public ListUsersRequest setUsernameStartsWith(String usernameStartsWith) {
        this.usernameStartsWith = usernameStartsWith;
        return this;
    }
    public String getUsernameStartsWith() {
        return this.usernameStartsWith;
    }

}
