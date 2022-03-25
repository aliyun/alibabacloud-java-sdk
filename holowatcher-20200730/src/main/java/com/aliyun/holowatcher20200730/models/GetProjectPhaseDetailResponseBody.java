// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetProjectPhaseDetailResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetProjectPhaseDetailResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetProjectPhaseDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectPhaseDetailResponseBody self = new GetProjectPhaseDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectPhaseDetailResponseBody setDatas(GetProjectPhaseDetailResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetProjectPhaseDetailResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetProjectPhaseDetailResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetProjectPhaseDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetProjectPhaseDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectPhaseDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectPhaseDetailResponseBodyDatasList extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Phase")
        public String phase;

        @NameInMap("Status")
        public Long status;

        public static GetProjectPhaseDetailResponseBodyDatasList build(java.util.Map<String, ?> map) throws Exception {
            GetProjectPhaseDetailResponseBodyDatasList self = new GetProjectPhaseDetailResponseBodyDatasList();
            return TeaModel.build(map, self);
        }

        public GetProjectPhaseDetailResponseBodyDatasList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetProjectPhaseDetailResponseBodyDatasList setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetProjectPhaseDetailResponseBodyDatasList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class GetProjectPhaseDetailResponseBodyDatas extends TeaModel {
        // 当前阶段返回时list下标
        @NameInMap("CurrentPhase")
        public Long currentPhase;

        @NameInMap("List")
        public java.util.List<GetProjectPhaseDetailResponseBodyDatasList> list;

        public static GetProjectPhaseDetailResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetProjectPhaseDetailResponseBodyDatas self = new GetProjectPhaseDetailResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetProjectPhaseDetailResponseBodyDatas setCurrentPhase(Long currentPhase) {
            this.currentPhase = currentPhase;
            return this;
        }
        public Long getCurrentPhase() {
            return this.currentPhase;
        }

        public GetProjectPhaseDetailResponseBodyDatas setList(java.util.List<GetProjectPhaseDetailResponseBodyDatasList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetProjectPhaseDetailResponseBodyDatasList> getList() {
            return this.list;
        }

    }

}
