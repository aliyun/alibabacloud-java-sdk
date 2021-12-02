// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListInstanceTypesResponseBody extends TeaModel {
    @NameInMap("InstanceTypes")
    public ListInstanceTypesResponseBodyInstanceTypes instanceTypes;

    @NameInMap("RequestId")
    public String requestId;

    public static ListInstanceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTypesResponseBody self = new ListInstanceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceTypesResponseBody setInstanceTypes(ListInstanceTypesResponseBodyInstanceTypes instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public ListInstanceTypesResponseBodyInstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    public ListInstanceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstanceTypesResponseBodyInstanceTypesInstanceTypeResolutions extends TeaModel {
        @NameInMap("Resolution")
        public java.util.List<String> resolution;

        public static ListInstanceTypesResponseBodyInstanceTypesInstanceTypeResolutions build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceTypesResponseBodyInstanceTypesInstanceTypeResolutions self = new ListInstanceTypesResponseBodyInstanceTypesInstanceTypeResolutions();
            return TeaModel.build(map, self);
        }

        public ListInstanceTypesResponseBodyInstanceTypesInstanceTypeResolutions setResolution(java.util.List<String> resolution) {
            this.resolution = resolution;
            return this;
        }
        public java.util.List<String> getResolution() {
            return this.resolution;
        }

    }

    public static class ListInstanceTypesResponseBodyInstanceTypesInstanceType extends TeaModel {
        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        @NameInMap("DefaultResolution")
        public String defaultResolution;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("MemorySize")
        public String memorySize;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameEn")
        public String nameEn;

        @NameInMap("Resolutions")
        public ListInstanceTypesResponseBodyInstanceTypesInstanceTypeResolutions resolutions;

        public static ListInstanceTypesResponseBodyInstanceTypesInstanceType build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceTypesResponseBodyInstanceTypesInstanceType self = new ListInstanceTypesResponseBodyInstanceTypesInstanceType();
            return TeaModel.build(map, self);
        }

        public ListInstanceTypesResponseBodyInstanceTypesInstanceType setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public ListInstanceTypesResponseBodyInstanceTypesInstanceType setDefaultResolution(String defaultResolution) {
            this.defaultResolution = defaultResolution;
            return this;
        }
        public String getDefaultResolution() {
            return this.defaultResolution;
        }

        public ListInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public ListInstanceTypesResponseBodyInstanceTypesInstanceType setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public ListInstanceTypesResponseBodyInstanceTypesInstanceType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstanceTypesResponseBodyInstanceTypesInstanceType setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public ListInstanceTypesResponseBodyInstanceTypesInstanceType setResolutions(ListInstanceTypesResponseBodyInstanceTypesInstanceTypeResolutions resolutions) {
            this.resolutions = resolutions;
            return this;
        }
        public ListInstanceTypesResponseBodyInstanceTypesInstanceTypeResolutions getResolutions() {
            return this.resolutions;
        }

    }

    public static class ListInstanceTypesResponseBodyInstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        public java.util.List<ListInstanceTypesResponseBodyInstanceTypesInstanceType> instanceType;

        public static ListInstanceTypesResponseBodyInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceTypesResponseBodyInstanceTypes self = new ListInstanceTypesResponseBodyInstanceTypes();
            return TeaModel.build(map, self);
        }

        public ListInstanceTypesResponseBodyInstanceTypes setInstanceType(java.util.List<ListInstanceTypesResponseBodyInstanceTypesInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<ListInstanceTypesResponseBodyInstanceTypesInstanceType> getInstanceType() {
            return this.instanceType;
        }

    }

}
