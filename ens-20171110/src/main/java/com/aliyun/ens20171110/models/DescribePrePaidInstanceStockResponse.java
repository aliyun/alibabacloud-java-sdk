// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePrePaidInstanceStockResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DataDiskSize")
    @Validation(required = true)
    public Integer dataDiskSize;

    @NameInMap("EnsRegionId")
    @Validation(required = true)
    public String ensRegionId;

    @NameInMap("Cores")
    @Validation(required = true)
    public Integer cores;

    @NameInMap("Memory")
    @Validation(required = true)
    public Integer memory;

    @NameInMap("AvaliableCount")
    @Validation(required = true)
    public Integer avaliableCount;

    @NameInMap("InstanceSpec")
    @Validation(required = true)
    public String instanceSpec;

    @NameInMap("SystemDiskSize")
    @Validation(required = true)
    public Integer systemDiskSize;

    public static DescribePrePaidInstanceStockResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrePaidInstanceStockResponse self = new DescribePrePaidInstanceStockResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrePaidInstanceStockResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePrePaidInstanceStockResponse setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public DescribePrePaidInstanceStockResponse setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribePrePaidInstanceStockResponse setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribePrePaidInstanceStockResponse setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DescribePrePaidInstanceStockResponse setAvaliableCount(Integer avaliableCount) {
        this.avaliableCount = avaliableCount;
        return this;
    }
    public Integer getAvaliableCount() {
        return this.avaliableCount;
    }

    public DescribePrePaidInstanceStockResponse setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public DescribePrePaidInstanceStockResponse setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

}
