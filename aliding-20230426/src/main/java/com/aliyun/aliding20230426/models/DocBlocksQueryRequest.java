// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksQueryRequest extends TeaModel {
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
    public DocBlocksQueryRequestTenantContext tenantContext;

    public static DocBlocksQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksQueryRequest self = new DocBlocksQueryRequest();
        return TeaModel.build(map, self);
    }

    public DocBlocksQueryRequest setBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }
    public String getBlockType() {
        return this.blockType;
    }

    public DocBlocksQueryRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public DocBlocksQueryRequest setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
        return this;
    }
    public Integer getEndIndex() {
        return this.endIndex;
    }

    public DocBlocksQueryRequest setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Integer getStartIndex() {
        return this.startIndex;
    }

    public DocBlocksQueryRequest setTenantContext(DocBlocksQueryRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DocBlocksQueryRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DocBlocksQueryRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DocBlocksQueryRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DocBlocksQueryRequestTenantContext self = new DocBlocksQueryRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DocBlocksQueryRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
