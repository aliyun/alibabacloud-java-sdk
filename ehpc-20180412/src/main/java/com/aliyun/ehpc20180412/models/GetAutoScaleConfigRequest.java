// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAutoScaleConfigRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetAutoScaleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScaleConfigRequest self = new GetAutoScaleConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoScaleConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
