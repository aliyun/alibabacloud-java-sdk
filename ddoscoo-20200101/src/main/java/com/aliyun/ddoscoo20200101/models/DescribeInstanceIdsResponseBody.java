// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceIdsResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<DescribeInstanceIdsResponseBodyInstanceIds> instanceIds;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIdsResponseBody self = new DescribeInstanceIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIdsResponseBody setInstanceIds(java.util.List<DescribeInstanceIdsResponseBodyInstanceIds> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<DescribeInstanceIdsResponseBodyInstanceIds> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstanceIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceIdsResponseBodyInstanceIds extends TeaModel {
        @NameInMap("Edition")
        public Integer edition;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IpMode")
        public String ipMode;

        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("Remark")
        public String remark;

        public static DescribeInstanceIdsResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceIdsResponseBodyInstanceIds self = new DescribeInstanceIdsResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceIdsResponseBodyInstanceIds setEdition(Integer edition) {
            this.edition = edition;
            return this;
        }
        public Integer getEdition() {
            return this.edition;
        }

        public DescribeInstanceIdsResponseBodyInstanceIds setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceIdsResponseBodyInstanceIds setIpMode(String ipMode) {
            this.ipMode = ipMode;
            return this;
        }
        public String getIpMode() {
            return this.ipMode;
        }

        public DescribeInstanceIdsResponseBodyInstanceIds setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeInstanceIdsResponseBodyInstanceIds setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
