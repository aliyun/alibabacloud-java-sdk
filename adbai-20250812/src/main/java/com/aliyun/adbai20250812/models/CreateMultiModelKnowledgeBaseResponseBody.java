// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateMultiModelKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The ID of the created AnalyticDB for MySQL cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-***</p>
     */
    @NameInMap("DbClusterId")
    public String dbClusterId;

    /**
     * <p>The name of the created multimodal knowledge engine service.</p>
     * 
     * <strong>example:</strong>
     * <p>mmkb-***</p>
     */
    @NameInMap("MmkbName")
    public String mmkbName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B47EED99-BFA5-529D-8D85-A6642421D390</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMultiModelKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiModelKnowledgeBaseResponseBody self = new CreateMultiModelKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMultiModelKnowledgeBaseResponseBody setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public CreateMultiModelKnowledgeBaseResponseBody setMmkbName(String mmkbName) {
        this.mmkbName = mmkbName;
        return this;
    }
    public String getMmkbName() {
        return this.mmkbName;
    }

    public CreateMultiModelKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
