// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetSpareIpResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the secondary IP address. Valid values:</p>
     * <ul>
     * <li><strong>active:</strong> The secondary IP address is available.</li>
     * <li><strong>inuse:</strong> The secondary IP address is in use.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    public static GetSpareIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpareIpResponseBody self = new GetSpareIpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpareIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpareIpResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
