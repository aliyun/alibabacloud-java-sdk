// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSpecInfoResponseBody extends TeaModel {
    /**
     * <p>The number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CPU")
    public String CPU;

    /**
     * <p>The description of the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>2核8GB（独享型）</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The memory size, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Memory")
    public String memory;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6B82A9EF-9961-5A31-A19F-009B709xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceSpecInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSpecInfoResponseBody self = new DescribeDBInstanceSpecInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSpecInfoResponseBody setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public String getCPU() {
        return this.CPU;
    }

    public DescribeDBInstanceSpecInfoResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDBInstanceSpecInfoResponseBody setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public DescribeDBInstanceSpecInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
