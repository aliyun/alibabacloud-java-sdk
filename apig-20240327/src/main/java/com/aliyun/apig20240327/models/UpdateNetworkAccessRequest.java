// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateNetworkAccessRequest extends TeaModel {
    /**
     * <p>The expected network access type after the modification. For example, if public network access is added to a private gateway, set this parameter to private&amp;pubnet. If private network access is removed from a gateway with both public and private network access, set this parameter to pubnet.</p>
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
