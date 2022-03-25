// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimStandardDetailResponseBody extends TeaModel {
    @NameInMap("Datas")
    public BimStandardDetailResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BimStandardDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BimStandardDetailResponseBody self = new BimStandardDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public BimStandardDetailResponseBody setDatas(BimStandardDetailResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public BimStandardDetailResponseBodyDatas getDatas() {
        return this.datas;
    }

    public BimStandardDetailResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public BimStandardDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public BimStandardDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BimStandardDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BimStandardDetailResponseBodyDatas extends TeaModel {
        // 门窗表配置
        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        // 门窗表图纸id
        @NameInMap("Id")
        public Long id;

        // 门窗表图纸状态
        @NameInMap("Status")
        public Long status;

        public static BimStandardDetailResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            BimStandardDetailResponseBodyDatas self = new BimStandardDetailResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public BimStandardDetailResponseBodyDatas setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public BimStandardDetailResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BimStandardDetailResponseBodyDatas setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
