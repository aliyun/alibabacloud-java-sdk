// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateEnvironmentLicenseResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    // 业务数据
    @NameInMap("data")
    public CreateEnvironmentLicenseResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static CreateEnvironmentLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentLicenseResponseBody self = new CreateEnvironmentLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEnvironmentLicenseResponseBody setData(CreateEnvironmentLicenseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEnvironmentLicenseResponseBodyData getData() {
        return this.data;
    }

    public CreateEnvironmentLicenseResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class CreateEnvironmentLicenseResponseBodyData extends TeaModel {
        // license uid
        @NameInMap("uid")
        public String uid;

        public static CreateEnvironmentLicenseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentLicenseResponseBodyData self = new CreateEnvironmentLicenseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentLicenseResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
