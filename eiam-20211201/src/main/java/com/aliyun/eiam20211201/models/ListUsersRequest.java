// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    // 邮箱
    @NameInMap("Email")
    public String email;

    // IDaaS EIAM实例的ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 机构ID
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    // 当前查询的列表页码，默认为1。
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 当前查询的列表页码，默认为20。
    @NameInMap("PageSize")
    public Long pageSize;

    // 手机区号
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    // 手机区号
    @NameInMap("PhoneRegion")
    public String phoneRegion;

    // 账户状态
    @NameInMap("Status")
    public String status;

    // 外部关联ID
    @NameInMap("UserExternalId")
    public String userExternalId;

    // 自建类型为实例ID，非自建类型，为对应企业ID，比如钉钉，对应的corpId
    @NameInMap("UserSourceId")
    public String userSourceId;

    // build_in(自建),ding_talk(钉钉导入),ad(AD导入),ldap(LDAP导入)
    @NameInMap("UserSourceType")
    public String userSourceType;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
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

}
