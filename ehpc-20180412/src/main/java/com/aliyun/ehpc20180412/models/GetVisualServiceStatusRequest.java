// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetVisualServiceStatusRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetVisualServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVisualServiceStatusRequest self = new GetVisualServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetVisualServiceStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
