// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SetDataShareInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for PostgreSQL instance in Serverless mode.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    /**
     * <p>Specifies whether to enable or disable data sharing. Valid values:</p>
     * <br>
     * <p>*   **add**: enables data sharing.</p>
     * <p>*   **remove**: disables data sharing.</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetDataShareInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDataShareInstanceRequest self = new SetDataShareInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SetDataShareInstanceRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public SetDataShareInstanceRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public SetDataShareInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetDataShareInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
