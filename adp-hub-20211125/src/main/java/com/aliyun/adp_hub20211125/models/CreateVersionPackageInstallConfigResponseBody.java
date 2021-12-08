// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class CreateVersionPackageInstallConfigResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    @NameInMap("msg")
    public String msg;

    public static CreateVersionPackageInstallConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionPackageInstallConfigResponseBody self = new CreateVersionPackageInstallConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVersionPackageInstallConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVersionPackageInstallConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateVersionPackageInstallConfigResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
