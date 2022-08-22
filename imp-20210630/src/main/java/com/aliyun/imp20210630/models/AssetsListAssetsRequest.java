// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsListAssetsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("FieldMask")
    public String fieldMask;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Params")
    public String params;

    @NameInMap("Topic")
    public String topic;

    public static AssetsListAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        AssetsListAssetsRequest self = new AssetsListAssetsRequest();
        return TeaModel.build(map, self);
    }

    public AssetsListAssetsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AssetsListAssetsRequest setFieldMask(String fieldMask) {
        this.fieldMask = fieldMask;
        return this;
    }
    public String getFieldMask() {
        return this.fieldMask;
    }

    public AssetsListAssetsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public AssetsListAssetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public AssetsListAssetsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public AssetsListAssetsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
