// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class SingleSendMailV2ResponseBody extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("RequestId")
    public String requestId;

    public static SingleSendMailV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SingleSendMailV2ResponseBody self = new SingleSendMailV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public SingleSendMailV2ResponseBody setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public SingleSendMailV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
