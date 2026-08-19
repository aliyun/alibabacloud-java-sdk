// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountlabel20200315.models;

import com.aliyun.tea.*;

public class BatchFetchAccountLabelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Long count;

    @NameInMap("Data")
    public java.util.List<BatchFetchAccountLabelResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchFetchAccountLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchFetchAccountLabelResponseBody self = new BatchFetchAccountLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchFetchAccountLabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchFetchAccountLabelResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public BatchFetchAccountLabelResponseBody setData(java.util.List<BatchFetchAccountLabelResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchFetchAccountLabelResponseBodyData> getData() {
        return this.data;
    }

    public BatchFetchAccountLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchFetchAccountLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchFetchAccountLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchFetchAccountLabelResponseBodyData extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Kp")
        public Long kp;

        @NameInMap("Label")
        public String label;

        @NameInMap("LabelSeries")
        public String labelSeries;

        @NameInMap("StartTime")
        public String startTime;

        public static BatchFetchAccountLabelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchFetchAccountLabelResponseBodyData self = new BatchFetchAccountLabelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchFetchAccountLabelResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public BatchFetchAccountLabelResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public BatchFetchAccountLabelResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public BatchFetchAccountLabelResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public BatchFetchAccountLabelResponseBodyData setKp(Long kp) {
            this.kp = kp;
            return this;
        }
        public Long getKp() {
            return this.kp;
        }

        public BatchFetchAccountLabelResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public BatchFetchAccountLabelResponseBodyData setLabelSeries(String labelSeries) {
            this.labelSeries = labelSeries;
            return this;
        }
        public String getLabelSeries() {
            return this.labelSeries;
        }

        public BatchFetchAccountLabelResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
