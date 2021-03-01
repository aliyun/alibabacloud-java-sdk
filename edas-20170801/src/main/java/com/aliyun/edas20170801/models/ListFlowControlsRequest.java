// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListFlowControlsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static ListFlowControlsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlsRequest self = new ListFlowControlsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowControlsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
