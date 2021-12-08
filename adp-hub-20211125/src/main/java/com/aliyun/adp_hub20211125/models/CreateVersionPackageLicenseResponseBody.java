// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class CreateVersionPackageLicenseResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    @NameInMap("msg")
    public String msg;

    public static CreateVersionPackageLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionPackageLicenseResponseBody self = new CreateVersionPackageLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVersionPackageLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVersionPackageLicenseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateVersionPackageLicenseResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
