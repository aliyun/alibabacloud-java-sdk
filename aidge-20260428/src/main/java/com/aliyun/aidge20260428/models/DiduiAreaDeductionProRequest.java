// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DiduiAreaDeductionProRequest extends TeaModel {
    /**
     * <p>The HTTP(S) URL of the overall floor display image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/image.jpg">https://example.com/image.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The ID of the SKU asset knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rag_9c1f2b7d4e5a4c8fa1b2c3d4e5f60718</p>
     */
    @NameInMap("RagId")
    public String ragId;

    public static DiduiAreaDeductionProRequest build(java.util.Map<String, ?> map) throws Exception {
        DiduiAreaDeductionProRequest self = new DiduiAreaDeductionProRequest();
        return TeaModel.build(map, self);
    }

    public DiduiAreaDeductionProRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DiduiAreaDeductionProRequest setRagId(String ragId) {
        this.ragId = ragId;
        return this;
    }
    public String getRagId() {
        return this.ragId;
    }

}
