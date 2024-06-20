// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceIspsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the ISP.</p>
     */
    @NameInMap("Isps")
    public java.util.List<DescribePortViewSourceIspsResponseBodyIsps> isps;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortViewSourceIspsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortViewSourceIspsResponseBody self = new DescribePortViewSourceIspsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortViewSourceIspsResponseBody setIsps(java.util.List<DescribePortViewSourceIspsResponseBodyIsps> isps) {
        this.isps = isps;
        return this;
    }
    public java.util.List<DescribePortViewSourceIspsResponseBodyIsps> getIsps() {
        return this.isps;
    }

    public DescribePortViewSourceIspsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePortViewSourceIspsResponseBodyIsps extends TeaModel {
        /**
         * <p>The total number of requests that are sent from the ISP.</p>
         * <blockquote>
         * <p>This parameter does not indicate the accurate number of requests. You can use this parameter to calculate the proportion of requests from different ISPs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3390671</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The ID of the ISP. For more information, see the ISP codes table.</p>
         * 
         * <strong>example:</strong>
         * <p>100017</p>
         */
        @NameInMap("IspId")
        public String ispId;

        public static DescribePortViewSourceIspsResponseBodyIsps build(java.util.Map<String, ?> map) throws Exception {
            DescribePortViewSourceIspsResponseBodyIsps self = new DescribePortViewSourceIspsResponseBodyIsps();
            return TeaModel.build(map, self);
        }

        public DescribePortViewSourceIspsResponseBodyIsps setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribePortViewSourceIspsResponseBodyIsps setIspId(String ispId) {
            this.ispId = ispId;
            return this;
        }
        public String getIspId() {
            return this.ispId;
        }

    }

}
