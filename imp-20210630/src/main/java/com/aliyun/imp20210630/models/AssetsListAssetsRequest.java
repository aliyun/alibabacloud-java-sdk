// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsListAssetsRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // Optional. Used to specify a subset of fields that should be
    // returned by a get operation or modified by an update operation.
    @NameInMap("FieldMask")
    public String fieldMask;

    // 每页显示个数，最大支持20，参数为空默认显示个数为10。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 分页Token Optional.
    @NameInMap("NextToken")
    public String nextToken;

    // 参数
    @NameInMap("Params")
    public String params;

    // 订阅Topic
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
