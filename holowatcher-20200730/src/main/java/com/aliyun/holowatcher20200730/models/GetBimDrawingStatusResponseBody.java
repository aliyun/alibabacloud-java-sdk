// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingStatusResponseBody extends TeaModel {
    @NameInMap("Datas")
    public java.util.List<GetBimDrawingStatusResponseBodyDatas> datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimDrawingStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingStatusResponseBody self = new GetBimDrawingStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingStatusResponseBody setDatas(java.util.List<GetBimDrawingStatusResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<GetBimDrawingStatusResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public GetBimDrawingStatusResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimDrawingStatusResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimDrawingStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimDrawingStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimDrawingStatusResponseBodyDatas extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Status")
        public String status;

        public static GetBimDrawingStatusResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimDrawingStatusResponseBodyDatas self = new GetBimDrawingStatusResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimDrawingStatusResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimDrawingStatusResponseBodyDatas setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetBimDrawingStatusResponseBodyDatas setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
