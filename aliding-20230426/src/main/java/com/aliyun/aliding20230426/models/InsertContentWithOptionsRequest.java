// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertContentWithOptionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

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
    public java.util.List<Integer> path;

    @NameInMap("TenantContext")
    public InsertContentWithOptionsRequestTenantContext tenantContext;

    public static InsertContentWithOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertContentWithOptionsRequest self = new InsertContentWithOptionsRequest();
        return TeaModel.build(map, self);
    }

    public InsertContentWithOptionsRequest setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public InsertContentWithOptionsRequest setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public InsertContentWithOptionsRequest setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public InsertContentWithOptionsRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public InsertContentWithOptionsRequest setPath(java.util.List<Integer> path) {
        this.path = path;
        return this;
    }
    public java.util.List<Integer> getPath() {
        return this.path;
    }

    public InsertContentWithOptionsRequest setTenantContext(InsertContentWithOptionsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public InsertContentWithOptionsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class InsertContentWithOptionsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static InsertContentWithOptionsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            InsertContentWithOptionsRequestTenantContext self = new InsertContentWithOptionsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public InsertContentWithOptionsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
