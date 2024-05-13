// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportCustomCallTaggingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>This parameter is required.</p>
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
