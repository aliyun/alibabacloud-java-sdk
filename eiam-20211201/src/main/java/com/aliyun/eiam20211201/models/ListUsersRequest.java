// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>Displayname</p>
     * 
     * <strong>example:</strong>
     * <p>name_001</p>
     */
    @NameInMap("DisplayNameStartsWith")
    public String displayNameStartsWith;

    /**
     * <p>The email address of the user who owns the account.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:user@example.com">user@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

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
     * <p>The ID of the organizational unit.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The mobile number of the user who owns the account.</p>
     * 
     * <strong>example:</strong>
     * <p>156xxxxxxx</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The country code of the mobile number. For example, the country code of China is 86 without 00 or +.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("PhoneRegion")
    public String phoneRegion;

    /**
     * <p>The status of the account. Valid values:</p>
     * <ul>
     * <li>enabled: The account is enabled.</li>
     * <li>disabled: The account is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The external ID of the account. The external ID can be used by external data to map the data of the account in IDaaS EIAM.</p>
     * <p>For accounts with the same source type and source ID, each account has a unique external ID.</p>
     * 
     * <strong>example:</strong>
     * <p>id_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("UserExternalId")
    public String userExternalId;

    /**
     * <p>User ID set</p>
     */
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    /**
     * <p>The source ID of the account.</p>
     * <p>If the account was created in IDaaS, its source ID is the ID of the IDaaS instance. If the account was imported, its source ID is the enterprise ID in the source. For example, if the account was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("UserSourceId")
    public String userSourceId;

    /**
     * <p>The source type of the account. Valid values:</p>
     * <ul>
     * <li>build_in: The account was created in IDaaS.</li>
     * <li>ding_talk: The account was imported from DingTalk.</li>
     * <li>ad: The account was imported from Microsoft Active Directory (AD).</li>
     * <li>ldap: The account was imported from a Lightweight Directory Access Protocol (LDAP) service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>build_in</p>
     */
    @NameInMap("UserSourceType")
    public String userSourceType;

    /**
     * <p>Username</p>
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
