// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimStandardElevationResponseBody extends TeaModel {
    @NameInMap("Datas")
    public BimStandardElevationResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BimStandardElevationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BimStandardElevationResponseBody self = new BimStandardElevationResponseBody();
        return TeaModel.build(map, self);
    }

    public BimStandardElevationResponseBody setDatas(BimStandardElevationResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public BimStandardElevationResponseBodyDatas getDatas() {
        return this.datas;
    }

    public BimStandardElevationResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public BimStandardElevationResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public BimStandardElevationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BimStandardElevationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BimStandardElevationResponseBodyDatas extends TeaModel {
        // 立面配置信息
        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        // 立面标准图纸id
        @NameInMap("Id")
        public Long id;

        // 立面标准图纸状态
        @NameInMap("Status")
        public Long status;

        public static BimStandardElevationResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            BimStandardElevationResponseBodyDatas self = new BimStandardElevationResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public BimStandardElevationResponseBodyDatas setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public BimStandardElevationResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BimStandardElevationResponseBodyDatas setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
