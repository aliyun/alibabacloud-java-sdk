// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnFullDomainsBlockIPHistoryResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <p>The value of Code is not 0 in the following scenarios:</p>
     * <ul>
     * <li>The format of the IP address is invalid.</li>
     * <li>The format of the time is invalid.</li>
     * <li>Other abnormal scenarios.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The description of the status returned.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The result of the operation.</p>
     */
    @NameInMap("IPBlockInfo")
    public java.util.List<DescribeCdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo> IPBlockInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BCD7D917-76F1-442F-BB75-C810DE34C761</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnFullDomainsBlockIPHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnFullDomainsBlockIPHistoryResponseBody self = new DescribeCdnFullDomainsBlockIPHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnFullDomainsBlockIPHistoryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCdnFullDomainsBlockIPHistoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeCdnFullDomainsBlockIPHistoryResponseBody setIPBlockInfo(java.util.List<DescribeCdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo> IPBlockInfo) {
        this.IPBlockInfo = IPBlockInfo;
        return this;
    }
    public java.util.List<DescribeCdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo> getIPBlockInfo() {
        return this.IPBlockInfo;
    }

    public DescribeCdnFullDomainsBlockIPHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo extends TeaModel {
        /**
         * <p>The blocked IP address or CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>1.XXX.XXX.0~1.XXX.XXX.255</p>
         */
        @NameInMap("BlockIP")
        public String blockIP;

        /**
         * <p>The delivery time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-24 18:49:37</p>
         */
        @NameInMap("DeliverTime")
        public String deliverTime;

        /**
         * <p>The delivery status.</p>
         * <ul>
         * <li>Success</li>
         * <li>Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeCdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo self = new DescribeCdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo setBlockIP(String blockIP) {
            this.blockIP = blockIP;
            return this;
        }
        public String getBlockIP() {
            return this.blockIP;
        }

        public DescribeCdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo setDeliverTime(String deliverTime) {
            this.deliverTime = deliverTime;
            return this;
        }
        public String getDeliverTime() {
            return this.deliverTime;
        }

        public DescribeCdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
