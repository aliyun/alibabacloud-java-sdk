// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationL7SwitchesRequest extends TeaModel {
    /**
     * <p>The IDs of internal-facing applications. You can specify up to 100 internal-facing application IDs.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    public static ListPrivateAccessApplicationL7SwitchesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessApplicationL7SwitchesRequest self = new ListPrivateAccessApplicationL7SwitchesRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessApplicationL7SwitchesRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

}
