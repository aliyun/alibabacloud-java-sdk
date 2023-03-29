// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIpStatusResponseBody extends TeaModel {
    /**
     * <p>The status of the node IP addresses.</p>
     */
    @NameInMap("IpStatus")
    public java.util.List<DescribeIpStatusResponseBodyIpStatus> ipStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIpStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpStatusResponseBody self = new DescribeIpStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpStatusResponseBody setIpStatus(java.util.List<DescribeIpStatusResponseBodyIpStatus> ipStatus) {
        this.ipStatus = ipStatus;
        return this;
    }
    public java.util.List<DescribeIpStatusResponseBodyIpStatus> getIpStatus() {
        return this.ipStatus;
    }

    public DescribeIpStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIpStatusResponseBodyIpStatus extends TeaModel {
        /**
         * <p>The IP address of the node.</p>
         */
        @NameInMap("ip")
        public String ip;

        /**
         * <p>The status. Valid values:</p>
         * <br>
         * <p>*   **nonali**: The node is not an Alibaba Cloud CDN edge node.</p>
         * <p>*   **normal**: The node is an available Alibaba Cloud CDN edge node.</p>
         * <p>*   **abnormal**: The node is an unavailable Alibaba Cloud CDN edge node.</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeIpStatusResponseBodyIpStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpStatusResponseBodyIpStatus self = new DescribeIpStatusResponseBodyIpStatus();
            return TeaModel.build(map, self);
        }

        public DescribeIpStatusResponseBodyIpStatus setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeIpStatusResponseBodyIpStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
