// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayDetailRequest extends TeaModel {
    @NameInMap("PlayTs")
    public String playTs;

    @NameInMap("SessionId")
    public String sessionId;

    public static DescribePlayDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayDetailRequest self = new DescribePlayDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayDetailRequest setPlayTs(String playTs) {
        this.playTs = playTs;
        return this;
    }
    public String getPlayTs() {
        return this.playTs;
    }

    public DescribePlayDetailRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
