// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePrePaidInstanceStockResponseBody extends TeaModel {
    @NameInMap("AvaliableCount")
    public Integer avaliableCount;

    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("InstanceSpec")
    public String instanceSpec;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    public static DescribePrePaidInstanceStockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrePaidInstanceStockResponseBody self = new DescribePrePaidInstanceStockResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrePaidInstanceStockResponseBody setAvaliableCount(Integer avaliableCount) {
        this.avaliableCount = avaliableCount;
        return this;
    }
    public Integer getAvaliableCount() {
        return this.avaliableCount;
    }

    public DescribePrePaidInstanceStockResponseBody setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribePrePaidInstanceStockResponseBody setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public DescribePrePaidInstanceStockResponseBody setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribePrePaidInstanceStockResponseBody setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public DescribePrePaidInstanceStockResponseBody setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DescribePrePaidInstanceStockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePrePaidInstanceStockResponseBody setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

}
