// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetCallRelationRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppSource")
    public String appSource;

    public static GetCallRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCallRelationRequest self = new GetCallRelationRequest();
        return TeaModel.build(map, self);
    }

    public GetCallRelationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetCallRelationRequest setAppSource(String appSource) {
        this.appSource = appSource;
        return this;
    }
    public String getAppSource() {
        return this.appSource;
    }

}
