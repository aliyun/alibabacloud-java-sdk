// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sNamespacesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster in Enterprise Distributed Application Service (EDAS).</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static ListK8sNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListK8sNamespacesRequest self = new ListK8sNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public ListK8sNamespacesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
