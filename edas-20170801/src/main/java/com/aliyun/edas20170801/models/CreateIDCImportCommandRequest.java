// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateIDCImportCommandRequest extends TeaModel {
    /**
     * <p>The cluster ID. You can call the ListCluster operation to query the cluster ID. For more information, see <a href="https://help.aliyun.com/document_detail/154995.html">ListCluster</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7246cxxx-53xx-xxxx-xxxx-xxxxxxxx</p>
     */
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
