// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeClustersRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<DescribeClustersRequestTag> tag;

    public static DescribeClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersRequest self = new DescribeClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClustersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClustersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeClustersRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeClustersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeClustersRequest setTag(java.util.List<DescribeClustersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeClustersRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeClustersRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeClustersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersRequestTag self = new DescribeClustersRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeClustersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClustersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
