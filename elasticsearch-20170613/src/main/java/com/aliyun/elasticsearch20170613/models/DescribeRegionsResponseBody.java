// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The available status of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1ADFG</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The endpoint of the region.</p>
     */
    @NameInMap("Result")
    public java.util.List<DescribeRegionsResponseBodyResult> result;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponseBody setResult(java.util.List<DescribeRegionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeRegionsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://elasticsearch-cn-hangzhou.console.aliyun.com">https://elasticsearch-cn-hangzhou.console.aliyun.com</a></p>
         */
        @NameInMap("consoleEndpoint")
        public String consoleEndpoint;

        /**
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("localName")
        public String localName;

        /**
         * <strong>example:</strong>
         * <p>elasticsearch.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("regionEndpoint")
        public String regionEndpoint;

        /**
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The endpoint of the region that is exposed in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeRegionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyResult self = new DescribeRegionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyResult setConsoleEndpoint(String consoleEndpoint) {
            this.consoleEndpoint = consoleEndpoint;
            return this;
        }
        public String getConsoleEndpoint() {
            return this.consoleEndpoint;
        }

        public DescribeRegionsResponseBodyResult setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyResult setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public DescribeRegionsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
