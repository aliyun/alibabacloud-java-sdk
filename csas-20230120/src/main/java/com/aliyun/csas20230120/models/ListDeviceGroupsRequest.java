// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDeviceGroupsRequest extends TeaModel {
    /**
     * <p>The number of the page to return in a paged query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The collection of device group IDs. Duplicate values are not allowed.</p>
     */
    @NameInMap("DeviceGroupIds")
    public java.util.List<String> deviceGroupIds;

    /**
     * <p>The device label name. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>PublicServiceSystemUserGroup</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page in a paged query. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDeviceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupsRequest self = new ListDeviceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDeviceGroupsRequest setDeviceGroupIds(java.util.List<String> deviceGroupIds) {
        this.deviceGroupIds = deviceGroupIds;
        return this;
    }
    public java.util.List<String> getDeviceGroupIds() {
        return this.deviceGroupIds;
    }

    public ListDeviceGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDeviceGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
