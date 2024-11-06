// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>c34b69b095f8241c5a91cc2252dceb976</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterResponseBody self = new CreateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
