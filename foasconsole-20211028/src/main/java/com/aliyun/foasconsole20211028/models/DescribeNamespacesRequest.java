// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class DescribeNamespacesRequest extends TeaModel {
    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 命名空间名称
    @NameInMap("Namespace")
    public String namespace;

    // 当前页数
    @NameInMap("PageIndex")
    public Integer pageIndex;

    // 每页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // regionId
    @NameInMap("Region")
    public String region;

    public static DescribeNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesRequest self = new DescribeNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNamespacesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeNamespacesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public DescribeNamespacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNamespacesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
