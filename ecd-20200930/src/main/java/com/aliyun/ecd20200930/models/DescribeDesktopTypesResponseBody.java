// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DesktopTypes")
    public java.util.List<DescribeDesktopTypesResponseBodyDesktopTypes> desktopTypes;

    public static DescribeDesktopTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopTypesResponseBody self = new DescribeDesktopTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopTypesResponseBody setDesktopTypes(java.util.List<DescribeDesktopTypesResponseBodyDesktopTypes> desktopTypes) {
        this.desktopTypes = desktopTypes;
        return this;
    }
    public java.util.List<DescribeDesktopTypesResponseBodyDesktopTypes> getDesktopTypes() {
        return this.desktopTypes;
    }

    public static class DescribeDesktopTypesResponseBodyDesktopTypesAllowDiskSize extends TeaModel {
        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static DescribeDesktopTypesResponseBodyDesktopTypesAllowDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopTypesResponseBodyDesktopTypesAllowDiskSize self = new DescribeDesktopTypesResponseBodyDesktopTypesAllowDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopTypesResponseBodyDesktopTypesAllowDiskSize setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypesAllowDiskSize setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

    public static class DescribeDesktopTypesResponseBodyDesktopTypes extends TeaModel {
        @NameInMap("SystemDiskSize")
        public String systemDiskSize;

        @NameInMap("DesktopTypeId")
        public String desktopTypeId;

        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        @NameInMap("CpuCount")
        public String cpuCount;

        @NameInMap("GpuCount")
        public Float gpuCount;

        @NameInMap("GpuSpec")
        public String gpuSpec;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("MemorySize")
        public String memorySize;

        @NameInMap("AllowDiskSize")
        public java.util.List<DescribeDesktopTypesResponseBodyDesktopTypesAllowDiskSize> allowDiskSize;

        public static DescribeDesktopTypesResponseBodyDesktopTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopTypesResponseBodyDesktopTypes self = new DescribeDesktopTypesResponseBodyDesktopTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setSystemDiskSize(String systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public String getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setDesktopTypeId(String desktopTypeId) {
            this.desktopTypeId = desktopTypeId;
            return this;
        }
        public String getDesktopTypeId() {
            return this.desktopTypeId;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setDataDiskSize(String dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setCpuCount(String cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public String getCpuCount() {
            return this.cpuCount;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setGpuCount(Float gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Float getGpuCount() {
            return this.gpuCount;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setAllowDiskSize(java.util.List<DescribeDesktopTypesResponseBodyDesktopTypesAllowDiskSize> allowDiskSize) {
            this.allowDiskSize = allowDiskSize;
            return this;
        }
        public java.util.List<DescribeDesktopTypesResponseBodyDesktopTypesAllowDiskSize> getAllowDiskSize() {
            return this.allowDiskSize;
        }

    }

}
