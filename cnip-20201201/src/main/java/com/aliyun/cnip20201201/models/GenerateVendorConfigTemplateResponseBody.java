// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GenerateVendorConfigTemplateResponseBody extends TeaModel {
    @NameInMap("data")
    public GenerateVendorConfigTemplateResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GenerateVendorConfigTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateVendorConfigTemplateResponseBody self = new GenerateVendorConfigTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateVendorConfigTemplateResponseBody setData(GenerateVendorConfigTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateVendorConfigTemplateResponseBodyData getData() {
        return this.data;
    }

    public GenerateVendorConfigTemplateResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GenerateVendorConfigTemplateResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GenerateVendorConfigTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateVendorConfigTemplateResponseBodyData extends TeaModel {
        @NameInMap("vendorConfig")
        public String vendorConfig;

        public static GenerateVendorConfigTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateVendorConfigTemplateResponseBodyData self = new GenerateVendorConfigTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateVendorConfigTemplateResponseBodyData setVendorConfig(String vendorConfig) {
            this.vendorConfig = vendorConfig;
            return this;
        }
        public String getVendorConfig() {
            return this.vendorConfig;
        }

    }

}
