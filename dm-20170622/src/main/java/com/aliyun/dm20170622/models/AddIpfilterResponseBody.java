// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class AddIpfilterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10795</p>
     */
    @NameInMap("IpFilterId")
    public String ipFilterId;

    /**
     * <strong>example:</strong>
     * <p>F814E960-5AEE-5CB1-881B-6F1A3250B55A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddIpfilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIpfilterResponseBody self = new AddIpfilterResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIpfilterResponseBody setIpFilterId(String ipFilterId) {
        this.ipFilterId = ipFilterId;
        return this;
    }
    public String getIpFilterId() {
        return this.ipFilterId;
    }

    public AddIpfilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
