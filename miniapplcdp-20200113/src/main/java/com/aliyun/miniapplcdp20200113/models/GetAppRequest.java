// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Source")
    public String source;

    public static GetAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppRequest self = new GetAppRequest();
        return TeaModel.build(map, self);
    }

    public GetAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
