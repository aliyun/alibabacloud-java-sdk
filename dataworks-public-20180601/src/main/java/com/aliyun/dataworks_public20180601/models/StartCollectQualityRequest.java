// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartCollectQualityRequest extends TeaModel {
    @NameInMap("CallbackResultString")
    public String callbackResultString;

    public static StartCollectQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCollectQualityRequest self = new StartCollectQualityRequest();
        return TeaModel.build(map, self);
    }

    public StartCollectQualityRequest setCallbackResultString(String callbackResultString) {
        this.callbackResultString = callbackResultString;
        return this;
    }
    public String getCallbackResultString() {
        return this.callbackResultString;
    }

}
