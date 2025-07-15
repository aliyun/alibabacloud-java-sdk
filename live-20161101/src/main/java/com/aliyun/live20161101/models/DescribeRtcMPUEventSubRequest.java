// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRtcMPUEventSubRequest extends TeaModel {
    /**
     * <p>The ID of your application.</p>
     * <blockquote>
     * <p>The ID can be up to 64 characters in length and can contain letters, digits, underscores, and hyphens (-).</p>
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
