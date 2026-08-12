// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class DescribeInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The architecture type.</p>
     * 
     * <strong>example:</strong>
     * <p>X86</p>
     */
    @NameInMap("ArchitectureType")
    public String architectureType;

    /**
     * <p>The payment type.</p>
     * 
     * <strong>example:</strong>
     * <p>PRE</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Specifies whether mixed billing is used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Elastic")
    public Boolean elastic;

    /**
     * <p>The order instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f-cn-wwo36qj4g06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>e2e-test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The namespace name.</p>
     * 
     * <strong>example:</strong>
     * <p>e2e-test-default</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page for a paged query. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the instance.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static DescribeInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesShrinkRequest self = new DescribeInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesShrinkRequest setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
        return this;
    }
    public String getArchitectureType() {
        return this.architectureType;
    }

    public DescribeInstancesShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeInstancesShrinkRequest setElastic(Boolean elastic) {
        this.elastic = elastic;
        return this;
    }
    public Boolean getElastic() {
        return this.elastic;
    }

    public DescribeInstancesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstancesShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstancesShrinkRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public DescribeInstancesShrinkRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public DescribeInstancesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeInstancesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstancesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
