// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportCustomCallTaggingRequest extends TeaModel {
    /**
     * <p>The ObjectKey of the OSS object that contains the inbound number mark file. OSS is configured with the public customer storage bucket for Cloud Call Center. You can upload the inbound number mark file to this public customer storage bucket through the inbound management page of Cloud Call Center. After the upload succeeds, invoking this API reads the file content from OSS and imports it in batch. We do not recommend directly invoking this API. Instead, you can perform this operation through the default public cloud CRM System provided by Cloud Call Center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>temp/ImportCustomCallTagging.xlsx</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ImportCustomCallTaggingRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCustomCallTaggingRequest self = new ImportCustomCallTaggingRequest();
        return TeaModel.build(map, self);
    }

    public ImportCustomCallTaggingRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ImportCustomCallTaggingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
