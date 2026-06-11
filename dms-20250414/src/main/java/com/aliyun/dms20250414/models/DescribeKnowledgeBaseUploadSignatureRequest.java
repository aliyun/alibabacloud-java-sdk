// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseUploadSignatureRequest extends TeaModel {
    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-***</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    public static DescribeKnowledgeBaseUploadSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseUploadSignatureRequest self = new DescribeKnowledgeBaseUploadSignatureRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseUploadSignatureRequest setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

}
