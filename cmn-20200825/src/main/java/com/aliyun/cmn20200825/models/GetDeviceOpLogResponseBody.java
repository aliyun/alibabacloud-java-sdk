// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceOpLogResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("OperationLogs")
    public java.util.List<GetDeviceOpLogResponseBodyOperationLogs> operationLogs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetDeviceOpLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOpLogResponseBody self = new GetDeviceOpLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceOpLogResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetDeviceOpLogResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public GetDeviceOpLogResponseBody setOperationLogs(java.util.List<GetDeviceOpLogResponseBodyOperationLogs> operationLogs) {
        this.operationLogs = operationLogs;
        return this;
    }
    public java.util.List<GetDeviceOpLogResponseBodyOperationLogs> getOperationLogs() {
        return this.operationLogs;
    }

    public GetDeviceOpLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceOpLogResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetDeviceOpLogResponseBodyOperationLogs extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("Keyword")
        public String keyword;

        @NameInMap("NewValue")
        public String newValue;

        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("Operator")
        public String operator;

        public static GetDeviceOpLogResponseBodyOperationLogs build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceOpLogResponseBodyOperationLogs self = new GetDeviceOpLogResponseBodyOperationLogs();
            return TeaModel.build(map, self);
        }

        public GetDeviceOpLogResponseBodyOperationLogs setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDeviceOpLogResponseBodyOperationLogs setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetDeviceOpLogResponseBodyOperationLogs setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public GetDeviceOpLogResponseBodyOperationLogs setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public GetDeviceOpLogResponseBodyOperationLogs setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public GetDeviceOpLogResponseBodyOperationLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

}
