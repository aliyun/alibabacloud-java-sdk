// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidDataProcessResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PidDataProcessList")
    @Validation(required = true)
    public java.util.List<ListPidDataProcessResponsePidDataProcessList> pidDataProcessList;

    public static ListPidDataProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPidDataProcessResponse self = new ListPidDataProcessResponse();
        return TeaModel.build(map, self);
    }

    public ListPidDataProcessResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPidDataProcessResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPidDataProcessResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPidDataProcessResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPidDataProcessResponse setPidDataProcessList(java.util.List<ListPidDataProcessResponsePidDataProcessList> pidDataProcessList) {
        this.pidDataProcessList = pidDataProcessList;
        return this;
    }
    public java.util.List<ListPidDataProcessResponsePidDataProcessList> getPidDataProcessList() {
        return this.pidDataProcessList;
    }

    public static class ListPidDataProcessResponsePidDataProcessList extends TeaModel {
        @NameInMap("PidDataProcessId")
        @Validation(required = true)
        public String pidDataProcessId;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("PidDataProcessStatus")
        @Validation(required = true)
        public String pidDataProcessStatus;

        @NameInMap("PidDataProcessProgress")
        @Validation(required = true)
        public String pidDataProcessProgress;

        public static ListPidDataProcessResponsePidDataProcessList build(java.util.Map<String, ?> map) throws Exception {
            ListPidDataProcessResponsePidDataProcessList self = new ListPidDataProcessResponsePidDataProcessList();
            return TeaModel.build(map, self);
        }

        public ListPidDataProcessResponsePidDataProcessList setPidDataProcessId(String pidDataProcessId) {
            this.pidDataProcessId = pidDataProcessId;
            return this;
        }
        public String getPidDataProcessId() {
            return this.pidDataProcessId;
        }

        public ListPidDataProcessResponsePidDataProcessList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListPidDataProcessResponsePidDataProcessList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListPidDataProcessResponsePidDataProcessList setPidDataProcessStatus(String pidDataProcessStatus) {
            this.pidDataProcessStatus = pidDataProcessStatus;
            return this;
        }
        public String getPidDataProcessStatus() {
            return this.pidDataProcessStatus;
        }

        public ListPidDataProcessResponsePidDataProcessList setPidDataProcessProgress(String pidDataProcessProgress) {
            this.pidDataProcessProgress = pidDataProcessProgress;
            return this;
        }
        public String getPidDataProcessProgress() {
            return this.pidDataProcessProgress;
        }

    }

}
