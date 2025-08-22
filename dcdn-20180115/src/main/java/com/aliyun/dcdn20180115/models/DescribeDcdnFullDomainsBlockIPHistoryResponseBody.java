// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnFullDomainsBlockIPHistoryResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <p>The value of Code is not 0 in the following scenarios:</p>
     * <ul>
     * <li>The format of the IP address is invalid.</li>
     * <li>The format of the time is invalid.</li>
     * <li>Other abnormal scenarios</li>
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
    public java.util.List<DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo> IPBlockInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>13A2B792-9212-1CC9-8525-59EBEF3FFE01</p>
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
         * 
         * <strong>example:</strong>
         * <p>1.XXX.XXX.0~1.XXX.XXX.255</p>
         */
        @NameInMap("BlockIP")
        public String blockIP;

        @NameInMap("BlockInterval")
        public String blockInterval;

        /**
         * <p>The delivery time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-24 18:49:37</p>
         */
        @NameInMap("DeliverTime")
        public String deliverTime;

        @NameInMap("OperationType")
        public String operationType;

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

        @NameInMap("UpdateType")
        public String updateType;

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

        public DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo setBlockInterval(String blockInterval) {
            this.blockInterval = blockInterval;
            return this;
        }
        public String getBlockInterval() {
            return this.blockInterval;
        }

        public DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo setDeliverTime(String deliverTime) {
            this.deliverTime = deliverTime;
            return this;
        }
        public String getDeliverTime() {
            return this.deliverTime;
        }

        public DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDcdnFullDomainsBlockIPHistoryResponseBodyIPBlockInfo setUpdateType(String updateType) {
            this.updateType = updateType;
            return this;
        }
        public String getUpdateType() {
            return this.updateType;
        }

    }

}
