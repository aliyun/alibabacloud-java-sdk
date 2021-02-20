// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteSessionRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("SessionId")
    public Integer sessionId;

    public static DeleteSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSessionRequest self = new DeleteSessionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSessionRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteSessionRequest setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public Integer getSessionId() {
        return this.sessionId;
    }

}
