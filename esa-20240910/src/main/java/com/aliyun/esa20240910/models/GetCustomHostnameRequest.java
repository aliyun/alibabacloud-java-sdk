// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCustomHostnameRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("HostnameId")
    public Long hostnameId;

    public static GetCustomHostnameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomHostnameRequest self = new GetCustomHostnameRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomHostnameRequest setHostnameId(Long hostnameId) {
        this.hostnameId = hostnameId;
        return this;
    }
    public Long getHostnameId() {
        return this.hostnameId;
    }

}
