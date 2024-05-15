// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportDocumentsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OssFileKey")
    public String ossFileKey;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>schema id</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    public static ImportDocumentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDocumentsRequest self = new ImportDocumentsRequest();
        return TeaModel.build(map, self);
    }

    public ImportDocumentsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportDocumentsRequest setOssFileKey(String ossFileKey) {
        this.ossFileKey = ossFileKey;
        return this;
    }
    public String getOssFileKey() {
        return this.ossFileKey;
    }

    public ImportDocumentsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportDocumentsRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

}
