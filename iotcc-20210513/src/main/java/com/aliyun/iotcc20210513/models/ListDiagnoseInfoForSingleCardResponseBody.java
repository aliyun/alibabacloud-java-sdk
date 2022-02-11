// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListDiagnoseInfoForSingleCardResponseBody extends TeaModel {
    @NameInMap("DiagnoseInfo")
    public java.util.List<ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo> diagnoseInfo;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("CardIp")
        public String cardIp;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("DiagnoseTime")
        public Long diagnoseTime;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("IoTCloudConnectorId")
        public String ioTCloudConnectorId;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

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

        public ListDiagnoseInfoForSingleCardResponseBodyDiagnoseInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
