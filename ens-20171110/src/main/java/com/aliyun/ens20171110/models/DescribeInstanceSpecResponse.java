// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataDiskMinSize")
    @Validation(required = true)
    public Integer dataDiskMinSize;

    @NameInMap("DataDiskMaxSize")
    @Validation(required = true)
    public Integer dataDiskMaxSize;

    @NameInMap("SystemDiskMaxSize")
    @Validation(required = true)
    public Integer systemDiskMaxSize;

    @NameInMap("BandwidthLimit")
    @Validation(required = true)
    public Integer bandwidthLimit;

    @NameInMap("InstanceSpecs")
    @Validation(required = true)
    public DescribeInstanceSpecResponseInstanceSpecs instanceSpecs;

    public static DescribeInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecResponse self = new DescribeInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSpecResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeInstanceSpecResponse setDataDiskMinSize(Integer dataDiskMinSize) {
        this.dataDiskMinSize = dataDiskMinSize;
        return this;
    }
    public Integer getDataDiskMinSize() {
        return this.dataDiskMinSize;
    }

    public DescribeInstanceSpecResponse setDataDiskMaxSize(Integer dataDiskMaxSize) {
        this.dataDiskMaxSize = dataDiskMaxSize;
        return this;
    }
    public Integer getDataDiskMaxSize() {
        return this.dataDiskMaxSize;
    }

    public DescribeInstanceSpecResponse setSystemDiskMaxSize(Integer systemDiskMaxSize) {
        this.systemDiskMaxSize = systemDiskMaxSize;
        return this;
    }
    public Integer getSystemDiskMaxSize() {
        return this.systemDiskMaxSize;
    }

    public DescribeInstanceSpecResponse setBandwidthLimit(Integer bandwidthLimit) {
        this.bandwidthLimit = bandwidthLimit;
        return this;
    }
    public Integer getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    public DescribeInstanceSpecResponse setInstanceSpecs(DescribeInstanceSpecResponseInstanceSpecs instanceSpecs) {
        this.instanceSpecs = instanceSpecs;
        return this;
    }
    public DescribeInstanceSpecResponseInstanceSpecs getInstanceSpecs() {
        return this.instanceSpecs;
    }

    public static class DescribeInstanceSpecResponseInstanceSpecsInstanceSpec extends TeaModel {
        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("Core")
        @Validation(required = true)
        public String core;

        @NameInMap("Memory")
        @Validation(required = true)
        public String memory;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        public static DescribeInstanceSpecResponseInstanceSpecsInstanceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecResponseInstanceSpecsInstanceSpec self = new DescribeInstanceSpecResponseInstanceSpecsInstanceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecResponseInstanceSpecsInstanceSpec setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceSpecResponseInstanceSpecsInstanceSpec setCore(String core) {
            this.core = core;
            return this;
        }
        public String getCore() {
            return this.core;
        }

        public DescribeInstanceSpecResponseInstanceSpecsInstanceSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public DescribeInstanceSpecResponseInstanceSpecsInstanceSpec setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class DescribeInstanceSpecResponseInstanceSpecs extends TeaModel {
        @NameInMap("InstanceSpec")
        @Validation(required = true)
        public java.util.List<DescribeInstanceSpecResponseInstanceSpecsInstanceSpec> instanceSpec;

        public static DescribeInstanceSpecResponseInstanceSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecResponseInstanceSpecs self = new DescribeInstanceSpecResponseInstanceSpecs();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecResponseInstanceSpecs setInstanceSpec(java.util.List<DescribeInstanceSpecResponseInstanceSpecsInstanceSpec> instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public java.util.List<DescribeInstanceSpecResponseInstanceSpecsInstanceSpec> getInstanceSpec() {
            return this.instanceSpec;
        }

    }

}
