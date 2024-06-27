// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SetDataShareInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for PostgreSQL instance in Serverless mode.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceList")
    public String instanceListShrink;

    /**
     * <p>Specifies whether to enable or disable data sharing. Valid values:</p>
     * <ul>
     * <li><strong>add</strong>: enables data sharing.</li>
     * <li><strong>remove</strong>: disables data sharing.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetDataShareInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDataShareInstanceShrinkRequest self = new SetDataShareInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetDataShareInstanceShrinkRequest setInstanceListShrink(String instanceListShrink) {
        this.instanceListShrink = instanceListShrink;
        return this;
    }
    public String getInstanceListShrink() {
        return this.instanceListShrink;
    }

    public SetDataShareInstanceShrinkRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public SetDataShareInstanceShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetDataShareInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
