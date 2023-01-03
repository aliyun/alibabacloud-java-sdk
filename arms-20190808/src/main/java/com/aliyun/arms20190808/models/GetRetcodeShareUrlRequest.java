// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeShareUrlRequest extends TeaModel {
    // The process identifier (PID) of the application. For more information about how to obtain the PID, see [Obtain the PID of an application](~~186100~~#title-imy-7gj-qhr).
    @NameInMap("Pid")
    public String pid;

    public static GetRetcodeShareUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeShareUrlRequest self = new GetRetcodeShareUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetRetcodeShareUrlRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

}
