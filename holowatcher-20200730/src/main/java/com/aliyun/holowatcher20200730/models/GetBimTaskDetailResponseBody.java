// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimTaskDetailResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimTaskDetailResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimTaskDetailResponseBody self = new GetBimTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimTaskDetailResponseBody setDatas(GetBimTaskDetailResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimTaskDetailResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimTaskDetailResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimTaskDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimTaskDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimTaskDetailResponseBodyDatas extends TeaModel {
        // 任务id
        @NameInMap("Id")
        public Long id;

        // 模型状态
        @NameInMap("ModelingStatus")
        public Long modelingStatus;

        // 阶段
        @NameInMap("Phase")
        public String phase;

        public static GetBimTaskDetailResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimTaskDetailResponseBodyDatas self = new GetBimTaskDetailResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimTaskDetailResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimTaskDetailResponseBodyDatas setModelingStatus(Long modelingStatus) {
            this.modelingStatus = modelingStatus;
            return this;
        }
        public Long getModelingStatus() {
            return this.modelingStatus;
        }

        public GetBimTaskDetailResponseBodyDatas setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

    }

}
