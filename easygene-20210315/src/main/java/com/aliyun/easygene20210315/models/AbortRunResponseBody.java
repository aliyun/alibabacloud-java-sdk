// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class AbortRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AbortRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortRunResponseBody self = new AbortRunResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortRunResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public AbortRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
