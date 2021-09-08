// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddDataForApiSourceRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    @Validation(required = true)
    public String iotInstanceId;

    @NameInMap("ApiId")
    @Validation(required = true)
    public String apiId;

    @NameInMap("ContentList")
    @Validation(required = true)
    public java.util.Map<String, ?> contentList;

    public static BatchAddDataForApiSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDataForApiSourceRequest self = new BatchAddDataForApiSourceRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddDataForApiSourceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchAddDataForApiSourceRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public BatchAddDataForApiSourceRequest setContentList(java.util.Map<String, ?> contentList) {
        this.contentList = contentList;
        return this;
    }
    public java.util.Map<String, ?> getContentList() {
        return this.contentList;
    }

}
