// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticQpsRecordResponseBody extends TeaModel {
    @NameInMap("ElasticQpsList")
    public java.util.List<DescribeElasticQpsRecordResponseBodyElasticQpsList> elasticQpsList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeElasticQpsRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticQpsRecordResponseBody self = new DescribeElasticQpsRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticQpsRecordResponseBody setElasticQpsList(java.util.List<DescribeElasticQpsRecordResponseBodyElasticQpsList> elasticQpsList) {
        this.elasticQpsList = elasticQpsList;
        return this;
    }
    public java.util.List<DescribeElasticQpsRecordResponseBodyElasticQpsList> getElasticQpsList() {
        return this.elasticQpsList;
    }

    public DescribeElasticQpsRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeElasticQpsRecordResponseBodyElasticQpsList extends TeaModel {
        @NameInMap("Date")
        public Long date;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OpsElasticQps")
        public Long opsElasticQps;

        @NameInMap("OpsQps")
        public Long opsQps;

        @NameInMap("OriginQps")
        public Long originQps;

        @NameInMap("Qps")
        public Long qps;

        @NameInMap("QpsPeak")
        public Long qpsPeak;

        @NameInMap("Status")
        public Long status;

        public static DescribeElasticQpsRecordResponseBodyElasticQpsList build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticQpsRecordResponseBodyElasticQpsList self = new DescribeElasticQpsRecordResponseBodyElasticQpsList();
            return TeaModel.build(map, self);
        }

        public DescribeElasticQpsRecordResponseBodyElasticQpsList setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public DescribeElasticQpsRecordResponseBodyElasticQpsList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeElasticQpsRecordResponseBodyElasticQpsList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeElasticQpsRecordResponseBodyElasticQpsList setOpsElasticQps(Long opsElasticQps) {
            this.opsElasticQps = opsElasticQps;
            return this;
        }
        public Long getOpsElasticQps() {
            return this.opsElasticQps;
        }

        public DescribeElasticQpsRecordResponseBodyElasticQpsList setOpsQps(Long opsQps) {
            this.opsQps = opsQps;
            return this;
        }
        public Long getOpsQps() {
            return this.opsQps;
        }

        public DescribeElasticQpsRecordResponseBodyElasticQpsList setOriginQps(Long originQps) {
            this.originQps = originQps;
            return this;
        }
        public Long getOriginQps() {
            return this.originQps;
        }

        public DescribeElasticQpsRecordResponseBodyElasticQpsList setQps(Long qps) {
            this.qps = qps;
            return this;
        }
        public Long getQps() {
            return this.qps;
        }

        public DescribeElasticQpsRecordResponseBodyElasticQpsList setQpsPeak(Long qpsPeak) {
            this.qpsPeak = qpsPeak;
            return this;
        }
        public Long getQpsPeak() {
            return this.qpsPeak;
        }

        public DescribeElasticQpsRecordResponseBodyElasticQpsList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
