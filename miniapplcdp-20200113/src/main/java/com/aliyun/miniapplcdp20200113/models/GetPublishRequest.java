// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetPublishRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("PublishId")
    public String publishId;

    @NameInMap("Source")
    public String source;

    public static GetPublishRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublishRequest self = new GetPublishRequest();
        return TeaModel.build(map, self);
    }

    public GetPublishRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetPublishRequest setPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }
    public String getPublishId() {
        return this.publishId;
    }

    public GetPublishRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
