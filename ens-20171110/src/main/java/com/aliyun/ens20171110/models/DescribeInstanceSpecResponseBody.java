// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecResponseBody extends TeaModel {
    @NameInMap("BandwidthLimit")
    public Integer bandwidthLimit;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("DataDiskMaxSize")
    public Integer dataDiskMaxSize;

    @NameInMap("DataDiskMinSize")
    public Integer dataDiskMinSize;

    @NameInMap("InstanceSpecs")
    public DescribeInstanceSpecResponseBodyInstanceSpecs instanceSpecs;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Core")
        public String core;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("InstanceType")
        public String instanceType;

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
