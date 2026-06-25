// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class GetNetworkBlacklistRequest extends TeaModel {
    /**
     * <p>The query type. Valid values: IP and Domain. If you do not specify this parameter, information for both types is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>IP</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetNetworkBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkBlacklistRequest self = new GetNetworkBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public GetNetworkBlacklistRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
