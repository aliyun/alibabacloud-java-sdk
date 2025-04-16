// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocUpdateContentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>markdown</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4j6OJzVEG4jJO3p8</p>
     */
    @NameInMap("DocKey")
    public String docKey;

    @NameInMap("TenantContext")
    public DocUpdateContentRequestTenantContext tenantContext;

    public static DocUpdateContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DocUpdateContentRequest self = new DocUpdateContentRequest();
        return TeaModel.build(map, self);
    }

    public DocUpdateContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DocUpdateContentRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DocUpdateContentRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public DocUpdateContentRequest setTenantContext(DocUpdateContentRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DocUpdateContentRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DocUpdateContentRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DocUpdateContentRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DocUpdateContentRequestTenantContext self = new DocUpdateContentRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DocUpdateContentRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
