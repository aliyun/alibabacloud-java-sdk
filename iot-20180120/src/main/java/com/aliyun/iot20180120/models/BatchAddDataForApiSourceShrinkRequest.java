// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddDataForApiSourceShrinkRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ContentList")
    public String contentListShrink;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchAddDataForApiSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDataForApiSourceShrinkRequest self = new BatchAddDataForApiSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddDataForApiSourceShrinkRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public BatchAddDataForApiSourceShrinkRequest setContentListShrink(String contentListShrink) {
        this.contentListShrink = contentListShrink;
        return this;
    }
    public String getContentListShrink() {
        return this.contentListShrink;
    }

    public BatchAddDataForApiSourceShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
