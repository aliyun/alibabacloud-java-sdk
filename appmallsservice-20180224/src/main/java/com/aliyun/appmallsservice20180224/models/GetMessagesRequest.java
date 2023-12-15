// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class GetMessagesRequest extends TeaModel {
    @NameInMap("ParamsJson")
    public String paramsJson;

    @NameInMap("Topic")
    public String topic;

    public static GetMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessagesRequest self = new GetMessagesRequest();
        return TeaModel.build(map, self);
    }

    public GetMessagesRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

    public GetMessagesRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
