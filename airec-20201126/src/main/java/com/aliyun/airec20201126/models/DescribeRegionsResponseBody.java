// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16B78383-2803-4964-9605-37B30C073B0E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<DescribeRegionsResponseBodyResult> result;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
         * <p>The console URL.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("consoleUrl")
        public String consoleUrl;

        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>47.109.94.218</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The region name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("localName")
        public String localName;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The instance state. Valid values: NotOpen, Processing, and Running.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeRegionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyResult self = new DescribeRegionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyResult setConsoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }
        public String getConsoleUrl() {
            return this.consoleUrl;
        }

        public DescribeRegionsResponseBodyResult setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeRegionsResponseBodyResult setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
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
