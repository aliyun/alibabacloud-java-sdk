// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectListStatusResponseBody extends TeaModel {
    @NameInMap("Datas")
    public java.util.List<GetBimProjectListStatusResponseBodyDatas> datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimProjectListStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectListStatusResponseBody self = new GetBimProjectListStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimProjectListStatusResponseBody setDatas(java.util.List<GetBimProjectListStatusResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<GetBimProjectListStatusResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public GetBimProjectListStatusResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimProjectListStatusResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimProjectListStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimProjectListStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimProjectListStatusResponseBodyDatas extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("ModelingStatus")
        public Long modelingStatus;

        @NameInMap("Phase")
        public String phase;

        @NameInMap("Status")
        public String status;

        @NameInMap("TransStatus")
        public Long transStatus;

        public static GetBimProjectListStatusResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimProjectListStatusResponseBodyDatas self = new GetBimProjectListStatusResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimProjectListStatusResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimProjectListStatusResponseBodyDatas setModelingStatus(Long modelingStatus) {
            this.modelingStatus = modelingStatus;
            return this;
        }
        public Long getModelingStatus() {
            return this.modelingStatus;
        }

        public GetBimProjectListStatusResponseBodyDatas setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetBimProjectListStatusResponseBodyDatas setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBimProjectListStatusResponseBodyDatas setTransStatus(Long transStatus) {
            this.transStatus = transStatus;
            return this;
        }
        public Long getTransStatus() {
            return this.transStatus;
        }

    }

}
