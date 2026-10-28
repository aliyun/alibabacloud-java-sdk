// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetBrowserInstanceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the cloud browser group. This parameter is required. Specify the ID of a browser group that is created within the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>big-0c7loey7fzjq****</p>
     */
    @NameInMap("BrowserInstanceGroupId")
    public String browserInstanceGroupId;

    public static GetBrowserInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBrowserInstanceGroupRequest self = new GetBrowserInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetBrowserInstanceGroupRequest setBrowserInstanceGroupId(String browserInstanceGroupId) {
        this.browserInstanceGroupId = browserInstanceGroupId;
        return this;
    }
    public String getBrowserInstanceGroupId() {
        return this.browserInstanceGroupId;
    }

}
