// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetCloudResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-heyuan</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetCloudResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudResourceResponseBody self = new GetCloudResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudResourceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetCloudResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
