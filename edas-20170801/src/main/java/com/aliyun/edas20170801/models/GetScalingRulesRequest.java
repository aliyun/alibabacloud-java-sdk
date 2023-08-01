// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetScalingRulesRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance group to which the application is deployed.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the scaling rule. You can leave this parameter empty. Valid values:</p>
     * <br>
     * <p>*   SCALE_IN: scale-in rules</p>
     * <p>*   SCALE_OUT: scale-out rules</p>
     */
    @NameInMap("Mode")
    public String mode;

    public static GetScalingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScalingRulesRequest self = new GetScalingRulesRequest();
        return TeaModel.build(map, self);
    }

    public GetScalingRulesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetScalingRulesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetScalingRulesRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
