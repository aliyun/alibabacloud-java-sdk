// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForApplicationRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
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
     * <p>The group IDs. You can specify up to 100 group IDs at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>group_miu8e4t4d7i4u7uwezgr54xxxx</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

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
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListGroupsForApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForApplicationRequest self = new ListGroupsForApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsForApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListGroupsForApplicationRequest setApplicationRoleId(String applicationRoleId) {
        this.applicationRoleId = applicationRoleId;
        return this;
    }
    public String getApplicationRoleId() {
        return this.applicationRoleId;
    }

    public ListGroupsForApplicationRequest setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public ListGroupsForApplicationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListGroupsForApplicationRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListGroupsForApplicationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
