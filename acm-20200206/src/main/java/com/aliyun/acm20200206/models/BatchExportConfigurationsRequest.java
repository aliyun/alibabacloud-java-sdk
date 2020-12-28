// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class BatchExportConfigurationsRequest extends TeaModel {
    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("Data")
    public String data;

    public static BatchExportConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchExportConfigurationsRequest self = new BatchExportConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchExportConfigurationsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public BatchExportConfigurationsRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
