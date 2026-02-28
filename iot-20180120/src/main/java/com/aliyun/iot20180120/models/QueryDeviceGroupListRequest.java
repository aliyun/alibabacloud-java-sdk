// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("GroupTypes")
    public java.util.List<String> groupTypes;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

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
