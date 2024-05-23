// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePrePaidInstanceStockRequest extends TeaModel {
    /**
     * <p>The ID of the datadisk.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    /**
     * <p>The ID of the edge node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The size of the system disk. Unit: GB.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>The ID of the systemdisk</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    public static DescribePrePaidInstanceStockRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePrePaidInstanceStockRequest self = new DescribePrePaidInstanceStockRequest();
        return TeaModel.build(map, self);
    }

    public DescribePrePaidInstanceStockRequest setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public DescribePrePaidInstanceStockRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribePrePaidInstanceStockRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public DescribePrePaidInstanceStockRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

}
