// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstanceUserPermissionsRequest extends TeaModel {
    // The ID of the instance. You can call the [ListInstances](~~141936~~) or [GetInstance](~~141567~~) operation to query the ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the tenant.
    // 
    // >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
    @NameInMap("Tid")
    public Long tid;

    // The nickname of the user. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to query the nickname of the user.
    // 
    // >  The value of the NickName parameter is that of the UserName parameter.
    @NameInMap("UserName")
    public String userName;

    public static ListInstanceUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceUserPermissionsRequest self = new ListInstanceUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceUserPermissionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceUserPermissionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceUserPermissionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstanceUserPermissionsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListInstanceUserPermissionsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
