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

    public static class DescribeNamespacesRequestDescribeNamespacesRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeNamespacesRequestDescribeNamespacesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesRequestDescribeNamespacesRequestTags self = new DescribeNamespacesRequestDescribeNamespacesRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesRequestDescribeNamespacesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNamespacesRequestDescribeNamespacesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeNamespacesRequestDescribeNamespacesRequest extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Region")
        public String region;

        @NameInMap("Tags")
        public java.util.List<DescribeNamespacesRequestDescribeNamespacesRequestTags> tags;

        public static DescribeNamespacesRequestDescribeNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesRequestDescribeNamespacesRequest self = new DescribeNamespacesRequestDescribeNamespacesRequest();
            return TeaModel.build(map, self);
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

        public DescribeNamespacesRequestDescribeNamespacesRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeNamespacesRequestDescribeNamespacesRequest setTags(java.util.List<DescribeNamespacesRequestDescribeNamespacesRequestTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeNamespacesRequestDescribeNamespacesRequestTags> getTags() {
            return this.tags;
        }

    }

}
