// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeImageConstraintsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeImageConstraintsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeImageConstraintsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageConstraintsResponseBody self = new DescribeImageConstraintsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageConstraintsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeImageConstraintsResponseBody setData(DescribeImageConstraintsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageConstraintsResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageConstraintsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeImageConstraintsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeImageConstraintsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageConstraintsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageConstraintsResponseBodyDataBandwidth extends TeaModel {
        @NameInMap("Max")
        public Integer max;

        @NameInMap("Min")
        public Integer min;

        @NameInMap("Step")
        public Integer step;

        @NameInMap("Unit")
        public String unit;

        public static DescribeImageConstraintsResponseBodyDataBandwidth build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageConstraintsResponseBodyDataBandwidth self = new DescribeImageConstraintsResponseBodyDataBandwidth();
            return TeaModel.build(map, self);
        }

        public DescribeImageConstraintsResponseBodyDataBandwidth setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeImageConstraintsResponseBodyDataBandwidth setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeImageConstraintsResponseBodyDataBandwidth setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public DescribeImageConstraintsResponseBodyDataBandwidth setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeImageConstraintsResponseBodyDataCpuMemoryRange extends TeaModel {
        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        @NameInMap("MemorySizeList")
        public java.util.List<Float> memorySizeList;

        public static DescribeImageConstraintsResponseBodyDataCpuMemoryRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageConstraintsResponseBodyDataCpuMemoryRange self = new DescribeImageConstraintsResponseBodyDataCpuMemoryRange();
            return TeaModel.build(map, self);
        }

        public DescribeImageConstraintsResponseBodyDataCpuMemoryRange setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public DescribeImageConstraintsResponseBodyDataCpuMemoryRange setMemorySizeList(java.util.List<Float> memorySizeList) {
            this.memorySizeList = memorySizeList;
            return this;
        }
        public java.util.List<Float> getMemorySizeList() {
            return this.memorySizeList;
        }

    }

    public static class DescribeImageConstraintsResponseBodyDataDataDisk extends TeaModel {
        @NameInMap("Max")
        public Integer max;

        @NameInMap("Min")
        public Integer min;

        @NameInMap("Step")
        public Integer step;

        @NameInMap("Unit")
        public String unit;

        public static DescribeImageConstraintsResponseBodyDataDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageConstraintsResponseBodyDataDataDisk self = new DescribeImageConstraintsResponseBodyDataDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeImageConstraintsResponseBodyDataDataDisk setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeImageConstraintsResponseBodyDataDataDisk setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeImageConstraintsResponseBodyDataDataDisk setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public DescribeImageConstraintsResponseBodyDataDataDisk setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeImageConstraintsResponseBodyDataSystemDisk extends TeaModel {
        @NameInMap("Max")
        public Integer max;

        @NameInMap("Min")
        public Integer min;

        @NameInMap("Step")
        public Integer step;

        @NameInMap("Unit")
        public String unit;

        public static DescribeImageConstraintsResponseBodyDataSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageConstraintsResponseBodyDataSystemDisk self = new DescribeImageConstraintsResponseBodyDataSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeImageConstraintsResponseBodyDataSystemDisk setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeImageConstraintsResponseBodyDataSystemDisk setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeImageConstraintsResponseBodyDataSystemDisk setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public DescribeImageConstraintsResponseBodyDataSystemDisk setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeImageConstraintsResponseBodyData extends TeaModel {
        @NameInMap("Bandwidth")
        public DescribeImageConstraintsResponseBodyDataBandwidth bandwidth;

        @NameInMap("CpuMemoryRange")
        public java.util.List<DescribeImageConstraintsResponseBodyDataCpuMemoryRange> cpuMemoryRange;

        @NameInMap("DataDisk")
        public DescribeImageConstraintsResponseBodyDataDataDisk dataDisk;

        @NameInMap("SystemDisk")
        public DescribeImageConstraintsResponseBodyDataSystemDisk systemDisk;

        @NameInMap("TrackId")
        public String trackId;

        public static DescribeImageConstraintsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageConstraintsResponseBodyData self = new DescribeImageConstraintsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageConstraintsResponseBodyData setBandwidth(DescribeImageConstraintsResponseBodyDataBandwidth bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public DescribeImageConstraintsResponseBodyDataBandwidth getBandwidth() {
            return this.bandwidth;
        }

        public DescribeImageConstraintsResponseBodyData setCpuMemoryRange(java.util.List<DescribeImageConstraintsResponseBodyDataCpuMemoryRange> cpuMemoryRange) {
            this.cpuMemoryRange = cpuMemoryRange;
            return this;
        }
        public java.util.List<DescribeImageConstraintsResponseBodyDataCpuMemoryRange> getCpuMemoryRange() {
            return this.cpuMemoryRange;
        }

        public DescribeImageConstraintsResponseBodyData setDataDisk(DescribeImageConstraintsResponseBodyDataDataDisk dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public DescribeImageConstraintsResponseBodyDataDataDisk getDataDisk() {
            return this.dataDisk;
        }

        public DescribeImageConstraintsResponseBodyData setSystemDisk(DescribeImageConstraintsResponseBodyDataSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public DescribeImageConstraintsResponseBodyDataSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeImageConstraintsResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
