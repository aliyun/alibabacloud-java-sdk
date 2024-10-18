// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateNetworkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("NetworkId")
    public Long networkId;

    /**
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkResponseBody self = new CreateNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkResponseBody setNetworkId(Long networkId) {
        this.networkId = networkId;
        return this;
    }
    public Long getNetworkId() {
        return this.networkId;
    }

    public CreateNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNetworkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
