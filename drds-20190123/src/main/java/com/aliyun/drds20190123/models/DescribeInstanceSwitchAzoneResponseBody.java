// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceSwitchAzoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeInstanceSwitchAzoneResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeInstanceSwitchAzoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSwitchAzoneResponseBody self = new DescribeInstanceSwitchAzoneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSwitchAzoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSwitchAzoneResponseBody setResult(DescribeInstanceSwitchAzoneResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeInstanceSwitchAzoneResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeInstanceSwitchAzoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInstanceSwitchAzoneResponseBodyResultTargetAzones extends TeaModel {
        @NameInMap("TargetAzone")
        public java.util.List<String> targetAzone;

        public static DescribeInstanceSwitchAzoneResponseBodyResultTargetAzones build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchAzoneResponseBodyResultTargetAzones self = new DescribeInstanceSwitchAzoneResponseBodyResultTargetAzones();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchAzoneResponseBodyResultTargetAzones setTargetAzone(java.util.List<String> targetAzone) {
            this.targetAzone = targetAzone;
            return this;
        }
        public java.util.List<String> getTargetAzone() {
            return this.targetAzone;
        }

    }

    public static class DescribeInstanceSwitchAzoneResponseBodyResult extends TeaModel {
        @NameInMap("OriginAzoneId")
        public String originAzoneId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SwitchAble")
        public Boolean switchAble;

        @NameInMap("TargetAzones")
        public DescribeInstanceSwitchAzoneResponseBodyResultTargetAzones targetAzones;

        public static DescribeInstanceSwitchAzoneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchAzoneResponseBodyResult self = new DescribeInstanceSwitchAzoneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchAzoneResponseBodyResult setOriginAzoneId(String originAzoneId) {
            this.originAzoneId = originAzoneId;
            return this;
        }
        public String getOriginAzoneId() {
            return this.originAzoneId;
        }

        public DescribeInstanceSwitchAzoneResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceSwitchAzoneResponseBodyResult setSwitchAble(Boolean switchAble) {
            this.switchAble = switchAble;
            return this;
        }
        public Boolean getSwitchAble() {
            return this.switchAble;
        }

        public DescribeInstanceSwitchAzoneResponseBodyResult setTargetAzones(DescribeInstanceSwitchAzoneResponseBodyResultTargetAzones targetAzones) {
            this.targetAzones = targetAzones;
            return this;
        }
        public DescribeInstanceSwitchAzoneResponseBodyResultTargetAzones getTargetAzones() {
            return this.targetAzones;
        }

    }

}
