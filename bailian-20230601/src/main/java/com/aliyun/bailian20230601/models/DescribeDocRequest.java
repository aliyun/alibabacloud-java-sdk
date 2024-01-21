// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DescribeDocRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DocId")
    public String docId;

    public static DescribeDocRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocRequest self = new DescribeDocRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDocRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DescribeDocRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

}
