// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListDiagnoseInfoForSingleCardResponseBody extends TeaModel {
    @NameInMap("DiagnoseInfo")
    public java.util.List<ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo> diagnoseInfo;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public Long nextToken;

    @NameInMap("RequestId")
    public String requestId;

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

    public ListDiagnoseInfoForSingleCardResponseBody setNextToken(Long nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Long getNextToken() {
        return this.nextToken;
    }

    public ListDiagnoseInfoForSingleCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo extends TeaModel {
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("CardIp")
        public String cardIp;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("IoTCloudConnectorId")
        public String ioTCloudConnectorId;

        @NameInMap("Status")
        public String status;

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

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setIoTCloudConnectorId(String ioTCloudConnectorId) {
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
        }

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
