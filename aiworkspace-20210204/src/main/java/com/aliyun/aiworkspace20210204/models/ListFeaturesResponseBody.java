// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListFeaturesResponseBody extends TeaModel {
    // 特性列表
    @NameInMap("Features")
    public java.util.List<String> features;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 特性总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeaturesResponseBody self = new ListFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeaturesResponseBody setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    public ListFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFeaturesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
