// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePrePaidInstanceStockRequest extends TeaModel {
    @NameInMap("Version")
    public String version;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    @NameInMap("InstanceSpec")
    public String instanceSpec;

    public static DescribePrePaidInstanceStockRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePrePaidInstanceStockRequest self = new DescribePrePaidInstanceStockRequest();
        return TeaModel.build(map, self);
    }

    public DescribePrePaidInstanceStockRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribePrePaidInstanceStockRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribePrePaidInstanceStockRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public DescribePrePaidInstanceStockRequest setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public DescribePrePaidInstanceStockRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

}
