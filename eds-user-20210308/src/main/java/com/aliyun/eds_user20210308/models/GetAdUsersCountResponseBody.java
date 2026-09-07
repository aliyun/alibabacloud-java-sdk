// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class GetAdUsersCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("AdUserCount")
    public Integer adUserCount;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAdUsersCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdUsersCountResponseBody self = new GetAdUsersCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdUsersCountResponseBody setAdUserCount(Integer adUserCount) {
        this.adUserCount = adUserCount;
        return this;
    }
    public Integer getAdUserCount() {
        return this.adUserCount;
    }

    public GetAdUsersCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
