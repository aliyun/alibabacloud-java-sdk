// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleasePublicIpAddressResponseBody extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is unavailable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("RemainTimes")
    public String remainTimes;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleasePublicIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicIpAddressResponseBody self = new ReleasePublicIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleasePublicIpAddressResponseBody setRemainTimes(String remainTimes) {
        this.remainTimes = remainTimes;
        return this;
    }
    public String getRemainTimes() {
        return this.remainTimes;
    }

    public ReleasePublicIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
