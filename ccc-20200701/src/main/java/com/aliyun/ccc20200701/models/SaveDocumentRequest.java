// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveDocumentRequest extends TeaModel {
    @NameInMap("DocumentId")
    public String documentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocumentJson")
    public String documentJson;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>schema id</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    public static SaveDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDocumentRequest self = new SaveDocumentRequest();
        return TeaModel.build(map, self);
    }

    public SaveDocumentRequest setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public SaveDocumentRequest setDocumentJson(String documentJson) {
        this.documentJson = documentJson;
        return this;
    }
    public String getDocumentJson() {
        return this.documentJson;
    }

    public SaveDocumentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveDocumentRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveDocumentRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

}
