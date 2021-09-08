// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddDataForApiSourceShrinkRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    @Validation(required = true)
    public String iotInstanceId;

    @NameInMap("ApiId")
    @Validation(required = true)
    public String apiId;

    @NameInMap("ContentList")
    @Validation(required = true)
    public String contentListShrink;

    public static BatchAddDataForApiSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDataForApiSourceShrinkRequest self = new BatchAddDataForApiSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddDataForApiSourceShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
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

}
