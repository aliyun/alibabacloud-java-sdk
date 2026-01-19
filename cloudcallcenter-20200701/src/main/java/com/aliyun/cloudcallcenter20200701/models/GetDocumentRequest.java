// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class GetDocumentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51e155ce-3747-4f21-b402-13c69597b920</p>
     */
    @NameInMap("DocumentId")
    public String documentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>FCEFE806-E67C-577E-865B-4ED398F2F648</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>schema id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>profile</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    public static GetDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentRequest self = new GetDocumentRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentRequest setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public GetDocumentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDocumentRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

}
