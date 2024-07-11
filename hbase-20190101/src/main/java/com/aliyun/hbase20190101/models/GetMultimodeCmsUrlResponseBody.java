// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class GetMultimodeCmsUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn******</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>htpp://***********</p>
     */
    @NameInMap("MultimodCmsUrl")
    public String multimodCmsUrl;

    /**
     * <strong>example:</strong>
     * <p>44183B05-852E-4716-B902-52977140190F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMultimodeCmsUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultimodeCmsUrlResponseBody self = new GetMultimodeCmsUrlResponseBody();
        return TeaModel.build(map, self);
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

    public GetMultimodeCmsUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
