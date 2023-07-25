// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnFullDomainsBlockIPHistoryResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>The value of Code is not 0 in the following scenarios:</p>
     * <br>
     * <p>*   The format of the IP address is invalid.</p>
     * <p>*   The format of the time is invalid.</p>
     * <p>*   Other abnormal scenarios</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The description of the status returned.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The result of the operation.</p>
     */
    @NameInMap("IPBlockInfo")
    public java.util.List<DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo> IPBlockInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnFullDomainsBlockIPHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnFullDomainsBlockIPHistoryResponseBody self = new DescribeDcdnFullDomainsBlockIPHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnFullDomainsBlockIPHistoryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeDcdnFullDomainsBlockIPHistoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDcdnFullDomainsBlockIPHistoryResponseBody setIPBlockInfo(java.util.List<DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo> IPBlockInfo) {
        this.IPBlockInfo = IPBlockInfo;
        return this;
    }
    public java.util.List<DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo> getIPBlockInfo() {
        return this.IPBlockInfo;
    }

    public DescribeDcdnFullDomainsBlockIPHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo extends TeaModel {
        /**
         * <p>The blocked IP address or CIDR block.</p>
         */
        @NameInMap("BlockIP")
        public String blockIP;

        /**
         * <p>The delivery time.</p>
         */
        @NameInMap("DeliverTime")
        public String deliverTime;

        /**
         * <p>The delivery status.</p>
         * <br>
         * <p>*   Success</p>
         * <p>*   Failed</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo self = new DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo setBlockIP(String blockIP) {
            this.blockIP = blockIP;
            return this;
        }
        public String getBlockIP() {
            return this.blockIP;
        }

        public DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo setDeliverTime(String deliverTime) {
            this.deliverTime = deliverTime;
            return this;
        }
        public String getDeliverTime() {
            return this.deliverTime;
        }

        public DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
