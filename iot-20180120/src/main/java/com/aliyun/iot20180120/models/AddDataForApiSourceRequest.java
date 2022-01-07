// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AddDataForApiSourceRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("Content")
    public String content;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static AddDataForApiSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataForApiSourceRequest self = new AddDataForApiSourceRequest();
        return TeaModel.build(map, self);
    }

    public AddDataForApiSourceRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public AddDataForApiSourceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AddDataForApiSourceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
