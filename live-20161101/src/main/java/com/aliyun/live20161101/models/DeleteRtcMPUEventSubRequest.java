// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteRtcMPUEventSubRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <blockquote>
     * <p> The ID can be up to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DeleteRtcMPUEventSubRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRtcMPUEventSubRequest self = new DeleteRtcMPUEventSubRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRtcMPUEventSubRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
