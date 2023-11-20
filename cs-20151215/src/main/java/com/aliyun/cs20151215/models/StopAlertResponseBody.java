// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StopAlertResponseBody extends TeaModel {
    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("msg")
    public String msg;

    /**
     * <p>The operation result. Valid values:</p>
     * <br>
     * <p>*   True: The operation is successful.</p>
     * <p>*   False: The operation failed.</p>
     */
    @NameInMap("status")
    public Boolean status;

    public static StopAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopAlertResponseBody self = new StopAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public StopAlertResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public StopAlertResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
