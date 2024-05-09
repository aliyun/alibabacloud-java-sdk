// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSyncStatusResponseBody extends TeaModel {
    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SyncStatusList")
    public java.util.List<DescribeSyncStatusResponseBodySyncStatusList> syncStatusList;

    public static DescribeSyncStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncStatusResponseBody self = new DescribeSyncStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyncStatusResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeSyncStatusResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeSyncStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSyncStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSyncStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeSyncStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSyncStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSyncStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSyncStatusResponseBody setSyncStatusList(java.util.List<DescribeSyncStatusResponseBodySyncStatusList> syncStatusList) {
        this.syncStatusList = syncStatusList;
        return this;
    }
    public java.util.List<DescribeSyncStatusResponseBodySyncStatusList> getSyncStatusList() {
        return this.syncStatusList;
    }

    public static class DescribeSyncStatusResponseBodySyncStatusList extends TeaModel {
        @NameInMap("Checkpoint")
        public Long checkpoint;

        @NameInMap("Code")
        public String code;

        @NameInMap("Delay")
        public Long delay;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Rate")
        public String rate;

        @NameInMap("Status")
        public String status;

        public static DescribeSyncStatusResponseBodySyncStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncStatusResponseBodySyncStatusList self = new DescribeSyncStatusResponseBodySyncStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeSyncStatusResponseBodySyncStatusList setCheckpoint(Long checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public Long getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeSyncStatusResponseBodySyncStatusList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeSyncStatusResponseBodySyncStatusList setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeSyncStatusResponseBodySyncStatusList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeSyncStatusResponseBodySyncStatusList setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public DescribeSyncStatusResponseBodySyncStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
