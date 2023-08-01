// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddDataForApiSourceRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ContentList")
    public String contentList;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchAddDataForApiSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDataForApiSourceRequest self = new BatchAddDataForApiSourceRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddDataForApiSourceRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public BatchAddDataForApiSourceRequest setContentList(String contentList) {
        this.contentList = contentList;
        return this;
    }
    public String getContentList() {
        return this.contentList;
    }

    public BatchAddDataForApiSourceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
