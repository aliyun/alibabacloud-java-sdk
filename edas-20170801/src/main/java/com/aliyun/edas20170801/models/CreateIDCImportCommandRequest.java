// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateIDCImportCommandRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static CreateIDCImportCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIDCImportCommandRequest self = new CreateIDCImportCommandRequest();
        return TeaModel.build(map, self);
    }

    public CreateIDCImportCommandRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
