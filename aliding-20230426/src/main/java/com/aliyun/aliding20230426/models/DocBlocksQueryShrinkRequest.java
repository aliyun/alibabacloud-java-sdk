// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksQueryShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>heading</p>
     */
    @NameInMap("BlockType")
    public String blockType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("DocKey")
    public String docKey;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EndIndex")
    public Integer endIndex;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartIndex")
    public Integer startIndex;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static DocBlocksQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksQueryShrinkRequest self = new DocBlocksQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DocBlocksQueryShrinkRequest setBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }
    public String getBlockType() {
        return this.blockType;
    }

    public DocBlocksQueryShrinkRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public DocBlocksQueryShrinkRequest setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
        return this;
    }
    public Integer getEndIndex() {
        return this.endIndex;
    }

    public DocBlocksQueryShrinkRequest setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Integer getStartIndex() {
        return this.startIndex;
    }

    public DocBlocksQueryShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
