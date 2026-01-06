// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>应用角色ID。</p>
     * 
     * <strong>example:</strong>
     * <p>app_role_mkv7rgt4ds8d8v0qtzev2mxxxx</p>
     */
    @NameInMap("ApplicationRoleId")
    public String applicationRoleId;

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
     * <p>The number of the page to return</p>
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
     * <p>The IDs of the accounts. You can query a maximum of 100 accounts at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static ListUsersForApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForApplicationRequest self = new ListUsersForApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersForApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListUsersForApplicationRequest setApplicationRoleId(String applicationRoleId) {
        this.applicationRoleId = applicationRoleId;
        return this;
    }
    public String getApplicationRoleId() {
        return this.applicationRoleId;
    }

    public ListUsersForApplicationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUsersForApplicationRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersForApplicationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUsersForApplicationRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
