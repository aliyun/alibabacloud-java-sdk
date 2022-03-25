// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardStatusByIdsResponseBody extends TeaModel {
    @NameInMap("Datas")
    public java.util.List<GetBimStandardStatusByIdsResponseBodyDatas> datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimStandardStatusByIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardStatusByIdsResponseBody self = new GetBimStandardStatusByIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimStandardStatusByIdsResponseBody setDatas(java.util.List<GetBimStandardStatusByIdsResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<GetBimStandardStatusByIdsResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public GetBimStandardStatusByIdsResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimStandardStatusByIdsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimStandardStatusByIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimStandardStatusByIdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimStandardStatusByIdsResponseBodyDatas extends TeaModel {
        // 标准图纸id
        @NameInMap("Id")
        public Long id;

        // 标准图纸状态
        @NameInMap("Status")
        public Long status;

        public static GetBimStandardStatusByIdsResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardStatusByIdsResponseBodyDatas self = new GetBimStandardStatusByIdsResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimStandardStatusByIdsResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimStandardStatusByIdsResponseBodyDatas setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
