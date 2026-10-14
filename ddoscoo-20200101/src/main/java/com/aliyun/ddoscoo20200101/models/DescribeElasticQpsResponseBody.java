// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticQpsResponseBody extends TeaModel {
    /**
     * <p>The time-series data of elastic QPS.</p>
     */
    @NameInMap("ElasticQps")
    public java.util.List<DescribeElasticQpsResponseBodyElasticQps> elasticQps;

    /**
     * <p>The unique ID generated for the request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2E7F7F7B-39A8-5D92-BAB4-D89D9DCE7D4F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeElasticQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticQpsResponseBody self = new DescribeElasticQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticQpsResponseBody setElasticQps(java.util.List<DescribeElasticQpsResponseBodyElasticQps> elasticQps) {
        this.elasticQps = elasticQps;
        return this;
    }
    public java.util.List<DescribeElasticQpsResponseBodyElasticQps> getElasticQps() {
        return this.elasticQps;
    }

    public DescribeElasticQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeElasticQpsResponseBodyElasticQps extends TeaModel {
        /**
         * <p>The index of the returned data point.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The peak normal business QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("MaxNormalQps")
        public Long maxNormalQps;

        /**
         * <p>The peak inbound QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxQps")
        public Long maxQps;

        /**
         * <p>The total number of requests within the sampling interval.</p>
         * 
         * <strong>example:</strong>
         * <p>15104</p>
         */
        @NameInMap("Pv")
        public Long pv;

        /**
         * <p>The number of 2xx status codes within the sampling interval.</p>
         * 
         * <strong>example:</strong>
         * <p>455</p>
         */
        @NameInMap("Status2")
        public Long status2;

        /**
         * <p>The number of 3xx status codes within the sampling interval.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Status3")
        public Long status3;

        /**
         * <p>The number of 4xx status codes within the sampling interval.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("Status4")
        public Long status4;

        /**
         * <p>The number of 410 status codes within the sampling interval.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Status410Pv")
        public Long status410Pv;

        /**
         * <p>The number of 5xx status codes within the sampling interval.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status5")
        public Long status5;

        /**
         * <p>The total number of origin-pull requests within the sampling interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1223</p>
         */
        @NameInMap("Ups")
        public Long ups;

        public static DescribeElasticQpsResponseBodyElasticQps build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticQpsResponseBodyElasticQps self = new DescribeElasticQpsResponseBodyElasticQps();
            return TeaModel.build(map, self);
        }

        public DescribeElasticQpsResponseBodyElasticQps setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeElasticQpsResponseBodyElasticQps setMaxNormalQps(Long maxNormalQps) {
            this.maxNormalQps = maxNormalQps;
            return this;
        }
        public Long getMaxNormalQps() {
            return this.maxNormalQps;
        }

        public DescribeElasticQpsResponseBodyElasticQps setMaxQps(Long maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Long getMaxQps() {
            return this.maxQps;
        }

        public DescribeElasticQpsResponseBodyElasticQps setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public DescribeElasticQpsResponseBodyElasticQps setStatus2(Long status2) {
            this.status2 = status2;
            return this;
        }
        public Long getStatus2() {
            return this.status2;
        }

        public DescribeElasticQpsResponseBodyElasticQps setStatus3(Long status3) {
            this.status3 = status3;
            return this;
        }
        public Long getStatus3() {
            return this.status3;
        }

        public DescribeElasticQpsResponseBodyElasticQps setStatus4(Long status4) {
            this.status4 = status4;
            return this;
        }
        public Long getStatus4() {
            return this.status4;
        }

        public DescribeElasticQpsResponseBodyElasticQps setStatus410Pv(Long status410Pv) {
            this.status410Pv = status410Pv;
            return this;
        }
        public Long getStatus410Pv() {
            return this.status410Pv;
        }

        public DescribeElasticQpsResponseBodyElasticQps setStatus5(Long status5) {
            this.status5 = status5;
            return this;
        }
        public Long getStatus5() {
            return this.status5;
        }

        public DescribeElasticQpsResponseBodyElasticQps setUps(Long ups) {
            this.ups = ups;
            return this;
        }
        public Long getUps() {
            return this.ups;
        }

    }

}
