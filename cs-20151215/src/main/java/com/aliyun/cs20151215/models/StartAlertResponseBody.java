// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StartAlertResponseBody extends TeaModel {
    @NameInMap("msg")
    public String msg;

    @NameInMap("status")
    public Boolean status;

    public static StartAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAlertResponseBody self = new StartAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAlertResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public StartAlertResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
