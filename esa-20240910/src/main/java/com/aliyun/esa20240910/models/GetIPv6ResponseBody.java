// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetIPv6ResponseBody extends TeaModel {
    /**
     * <p>Specifies whether IPv6 is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>off</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The region where IPv6 is enabled. The default value is <code>x.x</code>. Valid values:</p>
     * <ul>
     * <li><p><code>x.x</code>: Global.</p>
     * </li>
     * <li><p><code>cn.cn</code>: Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>x.x</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the request.</p>
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

    public GetIPv6ResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetIPv6ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
