// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SetRetcodeShareStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the application. Log on to the ARMS console. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is xxx%4074xxx, you must replace %40 with the at sign (@) to obtain xxx@74xxx.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>Specifies whether to turn on logon-free sharing. Valid values:</p>
     * <br>
     * <p>*   `true`: turns on logon-free sharing.</p>
     * <p>*   `false`: turns off logon-free sharing.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetRetcodeShareStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRetcodeShareStatusResponseBody self = new SetRetcodeShareStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRetcodeShareStatusResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public SetRetcodeShareStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
