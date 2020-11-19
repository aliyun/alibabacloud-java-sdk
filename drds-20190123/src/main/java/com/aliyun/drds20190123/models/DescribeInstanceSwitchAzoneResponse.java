// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceSwitchAzoneResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Result")
    @Validation(required = true)
    public DescribeInstanceSwitchAzoneResponseResult result;

    public static DescribeInstanceSwitchAzoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSwitchAzoneResponse self = new DescribeInstanceSwitchAzoneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSwitchAzoneResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSwitchAzoneResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceSwitchAzoneResponse setResult(DescribeInstanceSwitchAzoneResponseResult result) {
        this.result = result;
        return this;
    }
    public DescribeInstanceSwitchAzoneResponseResult getResult() {
        return this.result;
    }

    public static class DescribeInstanceSwitchAzoneResponseResultTargetAzones extends TeaModel {
        // TargetAzone
        @NameInMap("TargetAzone")
        @Validation(required = true)
        public java.util.List<String> targetAzone;

        public static DescribeInstanceSwitchAzoneResponseResultTargetAzones build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchAzoneResponseResultTargetAzones self = new DescribeInstanceSwitchAzoneResponseResultTargetAzones();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchAzoneResponseResultTargetAzones setTargetAzone(java.util.List<String> targetAzone) {
            this.targetAzone = targetAzone;
            return this;
        }
        public java.util.List<String> getTargetAzone() {
            return this.targetAzone;
        }

    }

    public static class DescribeInstanceSwitchAzoneResponseResult extends TeaModel {
        @NameInMap("OriginAzoneId")
        @Validation(required = true)
        public String originAzoneId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("SwitchAble")
        @Validation(required = true)
        public Boolean switchAble;

        @NameInMap("TargetAzones")
        @Validation(required = true)
        public DescribeInstanceSwitchAzoneResponseResultTargetAzones targetAzones;

        public static DescribeInstanceSwitchAzoneResponseResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchAzoneResponseResult self = new DescribeInstanceSwitchAzoneResponseResult();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchAzoneResponseResult setOriginAzoneId(String originAzoneId) {
            this.originAzoneId = originAzoneId;
            return this;
        }
        public String getOriginAzoneId() {
            return this.originAzoneId;
        }

        public DescribeInstanceSwitchAzoneResponseResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceSwitchAzoneResponseResult setSwitchAble(Boolean switchAble) {
            this.switchAble = switchAble;
            return this;
        }
        public Boolean getSwitchAble() {
            return this.switchAble;
        }

        public DescribeInstanceSwitchAzoneResponseResult setTargetAzones(DescribeInstanceSwitchAzoneResponseResultTargetAzones targetAzones) {
            this.targetAzones = targetAzones;
            return this;
        }
        public DescribeInstanceSwitchAzoneResponseResultTargetAzones getTargetAzones() {
            return this.targetAzones;
        }

    }

}
