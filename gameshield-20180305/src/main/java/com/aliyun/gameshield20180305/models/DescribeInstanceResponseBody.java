// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("InstanceInfo")
    public DescribeInstanceResponseBodyInstanceInfo instanceInfo;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeInstanceResponseBody setInstanceInfo(DescribeInstanceResponseBodyInstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public DescribeInstanceResponseBodyInstanceInfo getInstanceInfo() {
        return this.instanceInfo;
    }

    public static class DescribeInstanceResponseBodyInstanceInfo extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("PackageCode")
        public String packageCode;

        @NameInMap("Region")
        public String region;

        @NameInMap("SpecMap")
        public java.util.Map<String, ?> specMap;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeInstanceResponseBodyInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceInfo self = new DescribeInstanceResponseBodyInstanceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInstanceResponseBodyInstanceInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeInstanceResponseBodyInstanceInfo setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public DescribeInstanceResponseBodyInstanceInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceResponseBodyInstanceInfo setSpecMap(java.util.Map<String, ?> specMap) {
            this.specMap = specMap;
            return this;
        }
        public java.util.Map<String, ?> getSpecMap() {
            return this.specMap;
        }

        public DescribeInstanceResponseBodyInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
