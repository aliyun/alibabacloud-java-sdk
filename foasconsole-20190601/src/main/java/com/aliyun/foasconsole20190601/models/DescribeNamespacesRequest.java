// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeNamespacesRequest extends TeaModel {
    @NameInMap("DescribeNamespacesRequest")
    public DescribeNamespacesRequestDescribeNamespacesRequest describeNamespacesRequest;

    public static DescribeNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesRequest self = new DescribeNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesRequest setDescribeNamespacesRequest(DescribeNamespacesRequestDescribeNamespacesRequest describeNamespacesRequest) {
        this.describeNamespacesRequest = describeNamespacesRequest;
        return this;
    }
    public DescribeNamespacesRequestDescribeNamespacesRequest getDescribeNamespacesRequest() {
        return this.describeNamespacesRequest;
    }

    public static class DescribeNamespacesRequestDescribeNamespacesRequest extends TeaModel {
        // regionId
        @NameInMap("Region")
        public String region;

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

        public static DescribeNamespacesRequestDescribeNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesRequestDescribeNamespacesRequest self = new DescribeNamespacesRequestDescribeNamespacesRequest();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesRequestDescribeNamespacesRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeNamespacesRequestDescribeNamespacesRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNamespacesRequestDescribeNamespacesRequest setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeNamespacesRequestDescribeNamespacesRequest setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public DescribeNamespacesRequestDescribeNamespacesRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
