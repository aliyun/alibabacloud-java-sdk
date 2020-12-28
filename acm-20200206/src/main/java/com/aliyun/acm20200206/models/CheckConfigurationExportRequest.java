// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CheckConfigurationExportRequest extends TeaModel {
    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("Data")
    public String data;

    public static CheckConfigurationExportRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckConfigurationExportRequest self = new CheckConfigurationExportRequest();
        return TeaModel.build(map, self);
    }

    public CheckConfigurationExportRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CheckConfigurationExportRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
