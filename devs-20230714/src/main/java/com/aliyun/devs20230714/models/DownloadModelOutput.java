// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DownloadModelOutput extends TeaModel {
    @NameInMap("data")
    public DownloadModelOutputData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static DownloadModelOutput build(java.util.Map<String, ?> map) throws Exception {
        DownloadModelOutput self = new DownloadModelOutput();
        return TeaModel.build(map, self);
    }

    public DownloadModelOutput setData(DownloadModelOutputData data) {
        this.data = data;
        return this;
    }
    public DownloadModelOutputData getData() {
        return this.data;
    }

    public DownloadModelOutput setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DownloadModelOutput setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DownloadModelOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadModelOutput setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadModelOutputData extends TeaModel {
        @NameInMap("modelPath")
        public String modelPath;

        @NameInMap("taskType")
        public String taskType;

        public static DownloadModelOutputData build(java.util.Map<String, ?> map) throws Exception {
            DownloadModelOutputData self = new DownloadModelOutputData();
            return TeaModel.build(map, self);
        }

        public DownloadModelOutputData setModelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }
        public String getModelPath() {
            return this.modelPath;
        }

        public DownloadModelOutputData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
