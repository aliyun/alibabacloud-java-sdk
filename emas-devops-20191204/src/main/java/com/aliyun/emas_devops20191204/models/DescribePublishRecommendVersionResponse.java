// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribePublishRecommendVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LatestVersion")
    @Validation(required = true)
    public String latestVersion;

    @NameInMap("RecommendVersion")
    @Validation(required = true)
    public String recommendVersion;

    @NameInMap("LatestVersionCode")
    @Validation(required = true)
    public Integer latestVersionCode;

    @NameInMap("RecommendVersionCode")
    @Validation(required = true)
    public Integer recommendVersionCode;

    public static DescribePublishRecommendVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePublishRecommendVersionResponse self = new DescribePublishRecommendVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribePublishRecommendVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePublishRecommendVersionResponse setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public String getLatestVersion() {
        return this.latestVersion;
    }

    public DescribePublishRecommendVersionResponse setRecommendVersion(String recommendVersion) {
        this.recommendVersion = recommendVersion;
        return this;
    }
    public String getRecommendVersion() {
        return this.recommendVersion;
    }

    public DescribePublishRecommendVersionResponse setLatestVersionCode(Integer latestVersionCode) {
        this.latestVersionCode = latestVersionCode;
        return this;
    }
    public Integer getLatestVersionCode() {
        return this.latestVersionCode;
    }

    public DescribePublishRecommendVersionResponse setRecommendVersionCode(Integer recommendVersionCode) {
        this.recommendVersionCode = recommendVersionCode;
        return this;
    }
    public Integer getRecommendVersionCode() {
        return this.recommendVersionCode;
    }

}
