// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticQpsRecordResponseBody extends TeaModel {
    /**
     * <p>The QPS information about the instance.</p>
     */
    @NameInMap("ElasticQpsList")
    public java.util.List<DescribeElasticQpsRecordResponseBodyElasticQpsList> elasticQpsList;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F68B34E2-570C-508D-95FD-DFB6611D518F</p>
     */
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
        /**
         * <p>The timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1688140799999</p>
         */
        @NameInMap("Date")
        public Long date;

        /**
         * <p>The ID of the Anti-DDoS Proxy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-7e225i41****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address of the Anti-DDoS Proxy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203.<em><strong>.</strong></em>.199</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The burstable QPS value. A value of 0 indicates that the burstable QPS feature is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>300000</p>
         */
        @NameInMap("OpsElasticQps")
        public Long opsElasticQps;

        /**
         * <p>The service QPS (active).</p>
         * 
         * <strong>example:</strong>
         * <p>1345</p>
         */
        @NameInMap("OpsQps")
        public Long opsQps;

        /**
         * <p>The service QPS (purchased).</p>
         * 
         * <strong>example:</strong>
         * <p>1345</p>
         */
        @NameInMap("OriginQps")
        public Long originQps;

        /**
         * <p>The daily peak 95th percentile QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>4367</p>
         */
        @NameInMap("Qps")
        public Long qps;

        /**
         * <p>The daily peak traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>122</p>
         */
        @NameInMap("QpsPeak")
        public Long qpsPeak;

        /**
         * <p>Indicates whether the instance has expired or is released. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The instance runs as expected.</li>
         * <li><strong>2</strong>: The instance has expired.</li>
         * <li><strong>4</strong>: The instance is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
