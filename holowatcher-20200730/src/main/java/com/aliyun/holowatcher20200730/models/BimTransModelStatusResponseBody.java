// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimTransModelStatusResponseBody extends TeaModel {
    @NameInMap("Datas")
    public java.util.List<BimTransModelStatusResponseBodyDatas> datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BimTransModelStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BimTransModelStatusResponseBody self = new BimTransModelStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public BimTransModelStatusResponseBody setDatas(java.util.List<BimTransModelStatusResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<BimTransModelStatusResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public BimTransModelStatusResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public BimTransModelStatusResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public BimTransModelStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BimTransModelStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BimTransModelStatusResponseBodyDatas extends TeaModel {
        // 转换模型id
        @NameInMap("Id")
        public Long id;

        // 转换模型状态
        @NameInMap("Status")
        public Long status;

        public static BimTransModelStatusResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            BimTransModelStatusResponseBodyDatas self = new BimTransModelStatusResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public BimTransModelStatusResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BimTransModelStatusResponseBodyDatas setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
