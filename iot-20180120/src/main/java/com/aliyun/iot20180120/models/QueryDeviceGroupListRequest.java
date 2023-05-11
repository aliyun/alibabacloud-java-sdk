// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the group.</p>
     * <br>
     * <p>*   If you specify this parameter, the system queries groups by group name. You can perform a fuzzy search by group name.</p>
     * <p>*   If you do not specify this parameter, the system queries all groups.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("GroupTypes")
    public java.util.List<String> groupTypes;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of the entries to return on each page. Maximum value: 200. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the parent group. If you need to query the subgroups of a parent group, specify this parameter.</p>
     */
    @NameInMap("SuperGroupId")
    public String superGroupId;

    public static QueryDeviceGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupListRequest self = new QueryDeviceGroupListRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryDeviceGroupListRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public QueryDeviceGroupListRequest setGroupTypes(java.util.List<String> groupTypes) {
        this.groupTypes = groupTypes;
        return this;
    }
    public java.util.List<String> getGroupTypes() {
        return this.groupTypes;
    }

    public QueryDeviceGroupListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceGroupListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceGroupListRequest setSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId;
        return this;
    }
    public String getSuperGroupId() {
        return this.superGroupId;
    }

}
