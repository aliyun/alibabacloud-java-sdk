// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetIPv6ResponseBody extends TeaModel {
    /**
     * <p>IPv6 switch. Values:</p>
     * <ul>
     * <li><strong>on</strong>: Enable. </li>
     * <li><strong>off</strong>: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIPv6ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIPv6ResponseBody self = new GetIPv6ResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIPv6ResponseBody setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public GetIPv6ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
