// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecResponseBody extends TeaModel {
    /**
     * <p>The bandwidth limit for a single instance. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BandwidthLimit")
    public Integer bandwidthLimit;

    /**
     * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The maximum capacity of a data disk. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>20015</p>
     */
    @NameInMap("DataDiskMaxSize")
    public Integer dataDiskMaxSize;

    /**
     * <p>The minimum capacity of a data disk. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DataDiskMinSize")
    public Integer dataDiskMinSize;

    /**
     * <p>The information about instance specifications.</p>
     */
    @NameInMap("InstanceSpecs")
    public DescribeInstanceSpecResponseBodyInstanceSpecs instanceSpecs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1ECC937A-AE0E-4626-BE51-DED1D6D1C888</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum capacity of the system disk. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("SystemDiskMaxSize")
    public Integer systemDiskMaxSize;

    public static DescribeInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecResponseBody self = new DescribeInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecResponseBody setBandwidthLimit(Integer bandwidthLimit) {
        this.bandwidthLimit = bandwidthLimit;
        return this;
    }
    public Integer getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    public DescribeInstanceSpecResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeInstanceSpecResponseBody setDataDiskMaxSize(Integer dataDiskMaxSize) {
        this.dataDiskMaxSize = dataDiskMaxSize;
        return this;
    }
    public Integer getDataDiskMaxSize() {
        return this.dataDiskMaxSize;
    }

    public DescribeInstanceSpecResponseBody setDataDiskMinSize(Integer dataDiskMinSize) {
        this.dataDiskMinSize = dataDiskMinSize;
        return this;
    }
    public Integer getDataDiskMinSize() {
        return this.dataDiskMinSize;
    }

    public DescribeInstanceSpecResponseBody setInstanceSpecs(DescribeInstanceSpecResponseBodyInstanceSpecs instanceSpecs) {
        this.instanceSpecs = instanceSpecs;
        return this;
    }
    public DescribeInstanceSpecResponseBodyInstanceSpecs getInstanceSpecs() {
        return this.instanceSpecs;
    }

    public DescribeInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSpecResponseBody setSystemDiskMaxSize(Integer systemDiskMaxSize) {
        this.systemDiskMaxSize = systemDiskMaxSize;
        return this;
    }
    public Integer getSystemDiskMaxSize() {
        return this.systemDiskMaxSize;
    }

    public static class DescribeInstanceSpecResponseBodyInstanceSpecsInstanceSpec extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Core")
        public String core;

        /**
         * <p>The display name of the instance type.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ens.sn1.stiny</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The memory size. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Memory")
        public String memory;

        public static DescribeInstanceSpecResponseBodyInstanceSpecsInstanceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecResponseBodyInstanceSpecsInstanceSpec self = new DescribeInstanceSpecResponseBodyInstanceSpecsInstanceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecResponseBodyInstanceSpecsInstanceSpec setCore(String core) {
            this.core = core;
            return this;
        }
        public String getCore() {
            return this.core;
        }

        public DescribeInstanceSpecResponseBodyInstanceSpecsInstanceSpec setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeInstanceSpecResponseBodyInstanceSpecsInstanceSpec setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceSpecResponseBodyInstanceSpecsInstanceSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

    }

    public static class DescribeInstanceSpecResponseBodyInstanceSpecs extends TeaModel {
        @NameInMap("InstanceSpec")
        public java.util.List<DescribeInstanceSpecResponseBodyInstanceSpecsInstanceSpec> instanceSpec;

        public static DescribeInstanceSpecResponseBodyInstanceSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecResponseBodyInstanceSpecs self = new DescribeInstanceSpecResponseBodyInstanceSpecs();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecResponseBodyInstanceSpecs setInstanceSpec(java.util.List<DescribeInstanceSpecResponseBodyInstanceSpecsInstanceSpec> instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public java.util.List<DescribeInstanceSpecResponseBodyInstanceSpecsInstanceSpec> getInstanceSpec() {
            return this.instanceSpec;
        }

    }

}
