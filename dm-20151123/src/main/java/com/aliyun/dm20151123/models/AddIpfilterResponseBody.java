// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

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
     * <p>0E9282E8-DC08-5445-8FB0-B9F0CA28B249</p>
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
