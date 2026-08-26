// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRtcMPUEventSubRequest extends TeaModel {
    /**
     * <p>The ID of the subscribed application. You can view your application IDs by navigating to <strong>ApsaraVideo Live &gt; Live+ &gt; ApsaraVideo Real-time Communication &gt; Application Management</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>The application ID consists of uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum of 64 characters.</li>
     * <li>You must first call CreateRtcMPUEventSub to create a stream mixing and forwarding event subscription for this application ID.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DescribeRtcMPUEventSubRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcMPUEventSubRequest self = new DescribeRtcMPUEventSubRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcMPUEventSubRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
