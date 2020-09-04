// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribePublishRecommendVersionRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    public static DescribePublishRecommendVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePublishRecommendVersionRequest self = new DescribePublishRecommendVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribePublishRecommendVersionRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribePublishRecommendVersionRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

}
