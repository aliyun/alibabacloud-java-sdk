// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosCountRequest extends TeaModel {
    /**
     * <p>The region ID of the asset to query.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/353250.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    /**
     * <p>The type of the asset to query. Valid values:</p>
     * <br>
     * <p>*   **ecs**: ECS instance</p>
     * <p>*   **slb**: SLB instance</p>
     * <p>*   **eip**: EIP</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    public static DescribeDdosCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosCountRequest self = new DescribeDdosCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosCountRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeDdosCountRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
