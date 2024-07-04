// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePrePaidInstanceStockResponseBody extends TeaModel {
    /**
     * <p>The number of resources that you can purchase.</p>
     * 
     * <strong>example:</strong>
     * <p>84</p>
     */
    @NameInMap("AvaliableCount")
    public Integer avaliableCount;

    /**
     * <p>The number of vCPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The size of the data disk.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    /**
     * <p>The ID of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-suzhou-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ens.sn1.stiny</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>The memory size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>007833C8-E819-4122-B636-0D48D7BF6DFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The reasons for resource scarcity</p>
     * 
     * <strong>example:</strong>
     * <p>StockNotEnough</p>
     */
    @NameInMap("ResourceGap")
    public String resourceGap;

    /**
     * <p>The size of the system disk. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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

    public DescribePrePaidInstanceStockResponseBody setResourceGap(String resourceGap) {
        this.resourceGap = resourceGap;
        return this;
    }
    public String getResourceGap() {
        return this.resourceGap;
    }

    public DescribePrePaidInstanceStockResponseBody setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

}
