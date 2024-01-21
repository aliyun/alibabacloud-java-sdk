// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DeleteDocRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DocId")
    public String docId;

    public static DeleteDocRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocRequest self = new DeleteDocRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDocRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteDocRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

}
