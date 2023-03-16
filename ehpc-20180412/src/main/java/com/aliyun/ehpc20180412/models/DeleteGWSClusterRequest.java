// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteGWSClusterRequest extends TeaModel {
    /**
     * <p>The ID of the visualization service.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DeleteGWSClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGWSClusterRequest self = new DeleteGWSClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGWSClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
