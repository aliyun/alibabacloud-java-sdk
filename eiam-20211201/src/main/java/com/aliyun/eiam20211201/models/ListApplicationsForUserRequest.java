// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForUserRequest extends TeaModel {
    /**
     * <p>The IDs of the applications that the EIAM account can access. You can query a maximum of 100 application IDs at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

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
     * <p>The query mode. Default value: <strong>OnlyDirect</strong>. Valid values:</p>
     * <ul>
     * <li>OnlyDirect: Only the direct permissions are queried. Direct permissions are the permissions that are directly granted to the account.</li>
     * <li>IncludeInherit: Both the permissions that are directly granted to the account and the inherited permissions are queried. Inherited permissions are the permissions that an account inherits from the parent organization or the group to which the account belongs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OnlyDirect</p>
     */
    @NameInMap("QueryMode")
    public String queryMode;

    /**
     * <p>The ID of the EIAM account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListApplicationsForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForUserRequest self = new ListApplicationsForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForUserRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public ListApplicationsForUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApplicationsForUserRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationsForUserRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsForUserRequest setQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public String getQueryMode() {
        return this.queryMode;
    }

    public ListApplicationsForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
