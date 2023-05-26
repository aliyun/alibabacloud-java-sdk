// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SetRetcodeShareStatusRequest extends TeaModel {
    /**
     * <p>Turns on or turns off logon-free sharing for an application monitored by Browser Monitoring.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The call is successful.</p>
     * <p>*   `false`: The call fails.</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>SetRetcodeShareStatus</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static SetRetcodeShareStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRetcodeShareStatusRequest self = new SetRetcodeShareStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetRetcodeShareStatusRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
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
