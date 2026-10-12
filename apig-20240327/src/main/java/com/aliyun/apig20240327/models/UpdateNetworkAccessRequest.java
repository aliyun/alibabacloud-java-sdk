// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateNetworkAccessRequest extends TeaModel {
    /**
     * <p>The expected network access type after the change. For example, to add public network access to a private network gateway, set this parameter to private&amp;pubnet. To remove private network access from a gateway that supports both public and private network access, set this parameter to pubnet.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>privatenet: private network only.</li>
     * <li>private&amp;pubnet: public network and private network.</li>
     * <li>pubnet: public network only.</li>
     * </ul>
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
