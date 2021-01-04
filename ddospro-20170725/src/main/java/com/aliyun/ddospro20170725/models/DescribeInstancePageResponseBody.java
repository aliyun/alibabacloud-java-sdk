// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeInstancePageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("InstanceList")
    public java.util.List<DescribeInstancePageResponseBodyInstanceList> instanceList;

    public static DescribeInstancePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePageResponseBody self = new DescribeInstancePageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancePageResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeInstancePageResponseBody setInstanceList(java.util.List<DescribeInstancePageResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<DescribeInstancePageResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public static class DescribeInstancePageResponseBodyInstanceListIpList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Line")
        public String line;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("BandWidth")
        public Integer bandWidth;

        @NameInMap("ElasticBandWidth")
        public Integer elasticBandWidth;

        public static DescribeInstancePageResponseBodyInstanceListIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancePageResponseBodyInstanceListIpList self = new DescribeInstancePageResponseBodyInstanceListIpList();
            return TeaModel.build(map, self);
        }

        public DescribeInstancePageResponseBodyInstanceListIpList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeInstancePageResponseBodyInstanceListIpList setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeInstancePageResponseBodyInstanceListIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeInstancePageResponseBodyInstanceListIpList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancePageResponseBodyInstanceListIpList setBandWidth(Integer bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Integer getBandWidth() {
            return this.bandWidth;
        }

        public DescribeInstancePageResponseBodyInstanceListIpList setElasticBandWidth(Integer elasticBandWidth) {
            this.elasticBandWidth = elasticBandWidth;
            return this;
        }
        public Integer getElasticBandWidth() {
            return this.elasticBandWidth;
        }

    }

    public static class DescribeInstancePageResponseBodyInstanceList extends TeaModel {
        @NameInMap("InstanceRemark")
        public String instanceRemark;

        @NameInMap("IpList")
        public java.util.List<DescribeInstancePageResponseBodyInstanceListIpList> ipList;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeInstancePageResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancePageResponseBodyInstanceList self = new DescribeInstancePageResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstancePageResponseBodyInstanceList setInstanceRemark(String instanceRemark) {
            this.instanceRemark = instanceRemark;
            return this;
        }
        public String getInstanceRemark() {
            return this.instanceRemark;
        }

        public DescribeInstancePageResponseBodyInstanceList setIpList(java.util.List<DescribeInstancePageResponseBodyInstanceListIpList> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<DescribeInstancePageResponseBodyInstanceListIpList> getIpList() {
            return this.ipList;
        }

        public DescribeInstancePageResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
