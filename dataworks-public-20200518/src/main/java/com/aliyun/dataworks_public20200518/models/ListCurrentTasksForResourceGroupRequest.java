// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCurrentTasksForResourceGroupRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    // 3-等待资源；4-运行中
    @NameInMap("Status")
    public Integer status;

    public static ListCurrentTasksForResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCurrentTasksForResourceGroupRequest self = new ListCurrentTasksForResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListCurrentTasksForResourceGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCurrentTasksForResourceGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCurrentTasksForResourceGroupRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListCurrentTasksForResourceGroupRequest setResourceGroupIdentifier(String resourceGroupIdentifier) {
        this.resourceGroupIdentifier = resourceGroupIdentifier;
        return this;
    }
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }

    public ListCurrentTasksForResourceGroupRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
