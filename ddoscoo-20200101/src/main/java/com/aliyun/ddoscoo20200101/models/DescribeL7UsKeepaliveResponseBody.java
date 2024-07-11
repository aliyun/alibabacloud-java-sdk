// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7UsKeepaliveResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39499F01-19D9-4EA4-A0E9-C6014BA5CDBE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The value of the Back-to-origin Persistent Connections parameter.</p>
     */
    @NameInMap("RsKeepalive")
    public DescribeL7UsKeepaliveResponseBodyRsKeepalive rsKeepalive;

    public static DescribeL7UsKeepaliveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeL7UsKeepaliveResponseBody self = new DescribeL7UsKeepaliveResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeL7UsKeepaliveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeL7UsKeepaliveResponseBody setRsKeepalive(DescribeL7UsKeepaliveResponseBodyRsKeepalive rsKeepalive) {
        this.rsKeepalive = rsKeepalive;
        return this;
    }
    public DescribeL7UsKeepaliveResponseBodyRsKeepalive getRsKeepalive() {
        return this.rsKeepalive;
    }

    public static class DescribeL7UsKeepaliveResponseBodyRsKeepalive extends TeaModel {
        /**
         * <p>Indicates whether Back-to-origin Persistent Connections is turned on. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The number of requests that reuse persistent connections.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Long keepaliveRequests;

        /**
         * <p>The timeout period of idle persistent connections.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Long keepaliveTimeout;

        public static DescribeL7UsKeepaliveResponseBodyRsKeepalive build(java.util.Map<String, ?> map) throws Exception {
            DescribeL7UsKeepaliveResponseBodyRsKeepalive self = new DescribeL7UsKeepaliveResponseBodyRsKeepalive();
            return TeaModel.build(map, self);
        }

        public DescribeL7UsKeepaliveResponseBodyRsKeepalive setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeL7UsKeepaliveResponseBodyRsKeepalive setKeepaliveRequests(Long keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Long getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public DescribeL7UsKeepaliveResponseBodyRsKeepalive setKeepaliveTimeout(Long keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Long getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

    }

}
