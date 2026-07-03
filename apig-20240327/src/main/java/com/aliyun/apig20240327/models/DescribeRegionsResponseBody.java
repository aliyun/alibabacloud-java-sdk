// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of regions.</p>
     */
    @NameInMap("data")
    public java.util.List<DescribeRegionsResponseBodyData> data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E6BD6C79-32B1-5D7E-A89A-93C5A6B7xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

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

    public DescribeRegionsResponseBody setData(java.util.List<DescribeRegionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyData> getData() {
        return this.data;
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

    public static class DescribeRegionsResponseBodyData extends TeaModel {
        /**
         * <p>The display name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Beijing)</p>
         */
        @NameInMap("localName")
        public String localName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static DescribeRegionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyData self = new DescribeRegionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyData setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
