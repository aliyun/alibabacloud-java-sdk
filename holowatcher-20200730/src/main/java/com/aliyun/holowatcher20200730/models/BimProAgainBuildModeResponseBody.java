// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimProAgainBuildModeResponseBody extends TeaModel {
    @NameInMap("Datas")
    public BimProAgainBuildModeResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BimProAgainBuildModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BimProAgainBuildModeResponseBody self = new BimProAgainBuildModeResponseBody();
        return TeaModel.build(map, self);
    }

    public BimProAgainBuildModeResponseBody setDatas(BimProAgainBuildModeResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public BimProAgainBuildModeResponseBodyDatas getDatas() {
        return this.datas;
    }

    public BimProAgainBuildModeResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public BimProAgainBuildModeResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public BimProAgainBuildModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BimProAgainBuildModeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BimProAgainBuildModeResponseBodyDatas extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public Long taskId;

        public static BimProAgainBuildModeResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            BimProAgainBuildModeResponseBodyDatas self = new BimProAgainBuildModeResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public BimProAgainBuildModeResponseBodyDatas setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BimProAgainBuildModeResponseBodyDatas setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
