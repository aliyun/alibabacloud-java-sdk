// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListDetailReportStatisticsShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static ListDetailReportStatisticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDetailReportStatisticsShrinkRequest self = new ListDetailReportStatisticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDetailReportStatisticsShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListDetailReportStatisticsShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
