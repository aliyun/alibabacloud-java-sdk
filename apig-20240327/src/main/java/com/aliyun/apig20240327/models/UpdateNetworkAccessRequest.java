// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateNetworkAccessRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>private&amp;pubnet</p>
     */
    @NameInMap("networkAccessType")
    public String networkAccessType;

    public static UpdateNetworkAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAccessRequest self = new UpdateNetworkAccessRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkAccessRequest setNetworkAccessType(String networkAccessType) {
        this.networkAccessType = networkAccessType;
        return this;
    }
    public String getNetworkAccessType() {
        return this.networkAccessType;
    }

}
