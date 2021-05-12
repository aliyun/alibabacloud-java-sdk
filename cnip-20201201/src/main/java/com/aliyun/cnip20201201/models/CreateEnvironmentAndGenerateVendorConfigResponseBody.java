// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentAndGenerateVendorConfigResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateEnvironmentAndGenerateVendorConfigResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static CreateEnvironmentAndGenerateVendorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentAndGenerateVendorConfigResponseBody self = new CreateEnvironmentAndGenerateVendorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentAndGenerateVendorConfigResponseBody setData(CreateEnvironmentAndGenerateVendorConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEnvironmentAndGenerateVendorConfigResponseBodyData getData() {
        return this.data;
    }

    public CreateEnvironmentAndGenerateVendorConfigResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateEnvironmentAndGenerateVendorConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateEnvironmentAndGenerateVendorConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEnvironmentAndGenerateVendorConfigResponseBodyData extends TeaModel {
        @NameInMap("envUID")
        public String envUID;

        @NameInMap("vendorConfig")
        public String vendorConfig;

        public static CreateEnvironmentAndGenerateVendorConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentAndGenerateVendorConfigResponseBodyData self = new CreateEnvironmentAndGenerateVendorConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentAndGenerateVendorConfigResponseBodyData setEnvUID(String envUID) {
            this.envUID = envUID;
            return this;
        }
        public String getEnvUID() {
            return this.envUID;
        }

        public CreateEnvironmentAndGenerateVendorConfigResponseBodyData setVendorConfig(String vendorConfig) {
            this.vendorConfig = vendorConfig;
            return this;
        }
        public String getVendorConfig() {
            return this.vendorConfig;
        }

    }

}
