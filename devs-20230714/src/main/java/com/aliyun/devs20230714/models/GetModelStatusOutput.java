// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GetModelStatusOutput extends TeaModel {
    @NameInMap("data")
    public GetModelStatusOutputData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetModelStatusOutput build(java.util.Map<String, ?> map) throws Exception {
        GetModelStatusOutput self = new GetModelStatusOutput();
        return TeaModel.build(map, self);
    }

    public GetModelStatusOutput setData(GetModelStatusOutputData data) {
        this.data = data;
        return this;
    }
    public GetModelStatusOutputData getData() {
        return this.data;
    }

    public GetModelStatusOutput setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetModelStatusOutput setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetModelStatusOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelStatusOutput setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetModelStatusOutputData extends TeaModel {
        @NameInMap("currentBytes")
        public Long currentBytes;

        @NameInMap("errMessage")
        public String errMessage;

        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("finished")
        public Boolean finished;

        @NameInMap("finishedTime")
        public Long finishedTime;

        @NameInMap("speed")
        public Long speed;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("total")
        public Long total;

        public static GetModelStatusOutputData build(java.util.Map<String, ?> map) throws Exception {
            GetModelStatusOutputData self = new GetModelStatusOutputData();
            return TeaModel.build(map, self);
        }

        public GetModelStatusOutputData setCurrentBytes(Long currentBytes) {
            this.currentBytes = currentBytes;
            return this;
        }
        public Long getCurrentBytes() {
            return this.currentBytes;
        }

        public GetModelStatusOutputData setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public GetModelStatusOutputData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetModelStatusOutputData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public GetModelStatusOutputData setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public GetModelStatusOutputData setSpeed(Long speed) {
            this.speed = speed;
            return this;
        }
        public Long getSpeed() {
            return this.speed;
        }

        public GetModelStatusOutputData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetModelStatusOutputData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
