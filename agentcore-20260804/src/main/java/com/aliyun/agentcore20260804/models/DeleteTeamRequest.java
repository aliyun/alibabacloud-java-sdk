// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteTeamRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>暂不支持</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteTeamRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTeamRequest self = new DeleteTeamRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTeamRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
