// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DesktopTypes")
    @Validation(required = true)
    public java.util.List<DescribeDesktopTypesResponseDesktopTypes> desktopTypes;

    public static DescribeDesktopTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopTypesResponse self = new DescribeDesktopTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopTypesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopTypesResponse setDesktopTypes(java.util.List<DescribeDesktopTypesResponseDesktopTypes> desktopTypes) {
        this.desktopTypes = desktopTypes;
        return this;
    }
    public java.util.List<DescribeDesktopTypesResponseDesktopTypes> getDesktopTypes() {
        return this.desktopTypes;
    }

    public static class DescribeDesktopTypesResponseDesktopTypes extends TeaModel {
        @NameInMap("DesktopTypeId")
        @Validation(required = true)
        public String desktopTypeId;

        @NameInMap("InstanceTypeFamily")
        @Validation(required = true)
        public String instanceTypeFamily;

        @NameInMap("CpuCount")
        @Validation(required = true)
        public String cpuCount;

        @NameInMap("GPUCount")
        @Validation(required = true)
        public String GPUCount;

        @NameInMap("MemorySize")
        @Validation(required = true)
        public String memorySize;

        @NameInMap("SystemDiskSize")
        @Validation(required = true)
        public String systemDiskSize;

        @NameInMap("DataDiskSize")
        @Validation(required = true)
        public String dataDiskSize;

        public static DescribeDesktopTypesResponseDesktopTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopTypesResponseDesktopTypes self = new DescribeDesktopTypesResponseDesktopTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopTypesResponseDesktopTypes setDesktopTypeId(String desktopTypeId) {
            this.desktopTypeId = desktopTypeId;
            return this;
        }
        public String getDesktopTypeId() {
            return this.desktopTypeId;
        }

        public DescribeDesktopTypesResponseDesktopTypes setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeDesktopTypesResponseDesktopTypes setCpuCount(String cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public String getCpuCount() {
            return this.cpuCount;
        }

        public DescribeDesktopTypesResponseDesktopTypes setGPUCount(String GPUCount) {
            this.GPUCount = GPUCount;
            return this;
        }
        public String getGPUCount() {
            return this.GPUCount;
        }

        public DescribeDesktopTypesResponseDesktopTypes setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public DescribeDesktopTypesResponseDesktopTypes setSystemDiskSize(String systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public String getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeDesktopTypesResponseDesktopTypes setDataDiskSize(String dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

    }

}
