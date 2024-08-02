// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateContactGroupForAlertResponseBody extends TeaModel {
    @NameInMap("msg")
    public String msg;

    @NameInMap("status")
    public Boolean status;

    public static UpdateContactGroupForAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactGroupForAlertResponseBody self = new UpdateContactGroupForAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContactGroupForAlertResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UpdateContactGroupForAlertResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
