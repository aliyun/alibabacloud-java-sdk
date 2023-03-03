// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SetRetcodeShareStatusRequest extends TeaModel {
    /**
     * <p>The name of the application that is monitored by Browser Monitoring.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The process identifier (PID) of the application. For more information about how to obtain the PID, see [Obtain the PID of an application](https://help.aliyun.com/document_detail/186100.html?spm=a2c4g.11186623.6.792.1b50654cqcDPyk#title-imy-7gj-qhr).</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>Specifies whether to turn on or turn off Logon-free Sharing. Valid values:</p>
     * <br>
     * <p>*   `true`: turns on Logon-free Sharing</p>
     * <p>*   `false`: turns off Logon-free Sharing</p>
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
