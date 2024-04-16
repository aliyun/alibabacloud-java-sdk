// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListArtifactsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("PublishId")
    public String publishId;

    @NameInMap("Source")
    public String source;

    public static ListArtifactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactsRequest self = new ListArtifactsRequest();
        return TeaModel.build(map, self);
    }

    public ListArtifactsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListArtifactsRequest setPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }
    public String getPublishId() {
        return this.publishId;
    }

    public ListArtifactsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
