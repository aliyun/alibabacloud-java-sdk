// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class GetMultimodeCmsUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("MultimodCmsUrl")
    public String multimodCmsUrl;

    public static GetMultimodeCmsUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultimodeCmsUrlResponseBody self = new GetMultimodeCmsUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultimodeCmsUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultimodeCmsUrlResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMultimodeCmsUrlResponseBody setMultimodCmsUrl(String multimodCmsUrl) {
        this.multimodCmsUrl = multimodCmsUrl;
        return this;
    }
    public String getMultimodCmsUrl() {
        return this.multimodCmsUrl;
    }

}
