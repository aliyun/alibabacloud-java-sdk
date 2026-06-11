// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseStatsRequest extends TeaModel {
    /**
     * <p>The ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-***</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    public static DescribeKnowledgeBaseStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseStatsRequest self = new DescribeKnowledgeBaseStatsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseStatsRequest setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

}
