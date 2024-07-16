// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListDiagnoseInfoForSingleCardResponseBody extends TeaModel {
    @NameInMap("DiagnoseInfo")
    public java.util.List<ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo> diagnoseInfo;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>E1E237B1-EED7-55D5-AE5F-671E642DB3B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDiagnoseInfoForSingleCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseInfoForSingleCardResponseBody self = new ListDiagnoseInfoForSingleCardResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseInfoForSingleCardResponseBody setDiagnoseInfo(java.util.List<ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo> diagnoseInfo) {
        this.diagnoseInfo = diagnoseInfo;
        return this;
    }
    public java.util.List<ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo> getDiagnoseInfo() {
        return this.diagnoseInfo;
    }

    public ListDiagnoseInfoForSingleCardResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListDiagnoseInfoForSingleCardResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDiagnoseInfoForSingleCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDiagnoseInfoForSingleCardResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1662307200000</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <strong>example:</strong>
         * <p>10.176.78.61</p>
         */
        @NameInMap("CardIp")
        public String cardIp;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.xxx.com">www.xxx.com</a></p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <strong>example:</strong>
         * <p>Domain</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <strong>example:</strong>
         * <p>diagnoseTask-bp2x7tzkdl655liw3mhbg</p>
         */
        @NameInMap("DiagnoseTaskId")
        public String diagnoseTaskId;

        /**
         * <strong>example:</strong>
         * <p>1662307202400</p>
         */
        @NameInMap("DiagnoseTime")
        public Long diagnoseTime;

        /**
         * <strong>example:</strong>
         * <p>1662307201200</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>89860477102170127555</p>
         */
        @NameInMap("IccId")
        public String iccId;

        /**
         * <strong>example:</strong>
         * <p>89860477102170127555</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>Iccid</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>failed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>cc5g-xxxx</p>
         */
        @NameInMap("WirelessCloudConnectorId")
        public String wirelessCloudConnectorId;

        public static ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo self = new ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo();
            return TeaModel.build(map, self);
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setCardIp(String cardIp) {
            this.cardIp = cardIp;
            return this;
        }
        public String getCardIp() {
            return this.cardIp;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setDiagnoseTaskId(String diagnoseTaskId) {
            this.diagnoseTaskId = diagnoseTaskId;
            return this;
        }
        public String getDiagnoseTaskId() {
            return this.diagnoseTaskId;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setDiagnoseTime(Long diagnoseTime) {
            this.diagnoseTime = diagnoseTime;
            return this;
        }
        public Long getDiagnoseTime() {
            return this.diagnoseTime;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setIccId(String iccId) {
            this.iccId = iccId;
            return this;
        }
        public String getIccId() {
            return this.iccId;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }
        public String getWirelessCloudConnectorId() {
            return this.wirelessCloudConnectorId;
        }

    }

}
