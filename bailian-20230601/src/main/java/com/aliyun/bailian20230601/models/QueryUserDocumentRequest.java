// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryUserDocumentRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("UserId")
    public String userId;

    public static QueryUserDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserDocumentRequest self = new QueryUserDocumentRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserDocumentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public QueryUserDocumentRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QueryUserDocumentRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
