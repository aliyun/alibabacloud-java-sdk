// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SpeechCode")
    public String speechCode;

    public static QuerySpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechRequest self = new QuerySpeechRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySpeechRequest setSpeechCode(String speechCode) {
        this.speechCode = speechCode;
        return this;
    }
    public String getSpeechCode() {
        return this.speechCode;
    }

}
