// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListK8sClusterSourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vpc-xxxx</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static ListK8sClusterSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListK8sClusterSourcesRequest self = new ListK8sClusterSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListK8sClusterSourcesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
