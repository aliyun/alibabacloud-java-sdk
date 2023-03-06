// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of returned database shards.</p>
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
         * <p>The endpoint of the region that is exposed in the console.</p>
         */
        @NameInMap("consoleEndpoint")
        public String consoleEndpoint;

        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("localName")
        public String localName;

        /**
         * <p>The endpoint of the region.</p>
         */
        @NameInMap("regionEndpoint")
        public String regionEndpoint;

        /**
         * <p>The region ID of the cluster.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The available status of the region.</p>
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
