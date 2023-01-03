// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SetRetcodeShareStatusRequest extends TeaModel {
    // The process identifier (PID) of the application. For more information about how to obtain the PID, see [Obtain the PID of an application](~~186100~~#title-imy-7gj-qhr).
    @NameInMap("Pid")
    public String pid;

    // Specifies whether to turn on or turn off Logon-free Sharing. Valid values:
    // 
    // *   `true`: turns on Logon-free Sharing
    // *   `false`: turns off Logon-free Sharing
    @NameInMap("Status")
    public Boolean status;

    public static SetRetcodeShareStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRetcodeShareStatusRequest self = new SetRetcodeShareStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetRetcodeShareStatusRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SetRetcodeShareStatusRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
