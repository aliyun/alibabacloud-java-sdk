// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class BatchImportConfigurationsRequest extends TeaModel {
    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("FileUrl")
    public String fileUrl;

    public static BatchImportConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchImportConfigurationsRequest self = new BatchImportConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchImportConfigurationsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public BatchImportConfigurationsRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public BatchImportConfigurationsRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
