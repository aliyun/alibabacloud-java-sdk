// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForUserRequest extends TeaModel {
    /**
     * <p>The list of application IDs. A single request supports up to 100 application IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;app_mkv7rgt4d7i4u7zqtzev2mxxxx&quot;]</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

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
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The query mode. Default value: <strong>OnlyDirect</strong>. Valid values:</p>
     * <ul>
     * <li>OnlyDirect: Queries only the direct permissions of the account, which are the applications directly assigned to the account.</li>
     * <li>IncludeInherit: Queries both the direct permissions and inherited permissions of the account. Inherited permissions refer to the permissions that the account inherits from its parent organizations or the groups to which it belongs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OnlyDirect</p>
     */
    @NameInMap("QueryMode")
    public String queryMode;

    /**
     * <p>The account ID.</p>
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
