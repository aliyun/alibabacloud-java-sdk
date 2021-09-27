// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateEnvironmentResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateEnvironmentResponseBodyData data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static CreateEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentResponseBody self = new CreateEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentResponseBody setData(CreateEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public CreateEnvironmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEnvironmentResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class CreateEnvironmentResponseBodyData extends TeaModel {
        @NameInMap("environmentUID")
        public String environmentUID;

        @NameInMap("vendorConfig")
        public String vendorConfig;

        public static CreateEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentResponseBodyData self = new CreateEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentResponseBodyData setEnvironmentUID(String environmentUID) {
            this.environmentUID = environmentUID;
            return this;
        }
        public String getEnvironmentUID() {
            return this.environmentUID;
        }

        public CreateEnvironmentResponseBodyData setVendorConfig(String vendorConfig) {
            this.vendorConfig = vendorConfig;
            return this;
        }
        public String getVendorConfig() {
            return this.vendorConfig;
        }

    }

}
