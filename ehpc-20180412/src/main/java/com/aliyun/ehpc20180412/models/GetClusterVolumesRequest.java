// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetClusterVolumesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetClusterVolumesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterVolumesRequest self = new GetClusterVolumesRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterVolumesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
