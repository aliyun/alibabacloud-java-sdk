// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeShareUrlRequest extends TeaModel {
    /**
     * <p>The logon-free URL of the application.</p>
     */
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
