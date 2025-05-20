// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertContentWithOptionsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>documentId</p>
     */
    @NameInMap("DocumentId")
    public String documentId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Index")
    public Integer index;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>union_id</p>
     */
    @NameInMap("OperatorId")
    public String operatorId;

    /**
     * <strong>example:</strong>
     * <p>[0,0]</p>
     */
    @NameInMap("Path")
    public String pathShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static InsertContentWithOptionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertContentWithOptionsShrinkRequest self = new InsertContentWithOptionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsertContentWithOptionsShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public InsertContentWithOptionsShrinkRequest setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public InsertContentWithOptionsShrinkRequest setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public InsertContentWithOptionsShrinkRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public InsertContentWithOptionsShrinkRequest setPathShrink(String pathShrink) {
        this.pathShrink = pathShrink;
        return this;
    }
    public String getPathShrink() {
        return this.pathShrink;
    }

    public InsertContentWithOptionsShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
