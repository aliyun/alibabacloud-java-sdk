// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DescribeEaisRequest extends TeaModel {
    @NameInMap("ClientInstanceId")
    public String clientInstanceId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;eais-id1&quot;, &quot;eais-id2&quot;]</p>
     */
    @NameInMap("ElasticAcceleratedInstanceIds")
    public String elasticAcceleratedInstanceIds;

    /**
     * <strong>example:</strong>
     * <p>eais*</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>eais.ei-a6.2xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>InUse</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<DescribeEaisRequestTag> tag;

    public static DescribeEaisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEaisRequest self = new DescribeEaisRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEaisRequest setClientInstanceId(String clientInstanceId) {
        this.clientInstanceId = clientInstanceId;
        return this;
    }
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

    public DescribeEaisRequest setElasticAcceleratedInstanceIds(String elasticAcceleratedInstanceIds) {
        this.elasticAcceleratedInstanceIds = elasticAcceleratedInstanceIds;
        return this;
    }
    public String getElasticAcceleratedInstanceIds() {
        return this.elasticAcceleratedInstanceIds;
    }

    public DescribeEaisRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeEaisRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeEaisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEaisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEaisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEaisRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeEaisRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeEaisRequest setTag(java.util.List<DescribeEaisRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeEaisRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeEaisRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeEaisRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeEaisRequestTag self = new DescribeEaisRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeEaisRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEaisRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
