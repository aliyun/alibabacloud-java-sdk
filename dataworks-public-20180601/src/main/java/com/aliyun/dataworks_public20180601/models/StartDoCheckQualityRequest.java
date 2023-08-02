// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartDoCheckQualityRequest extends TeaModel {
    @NameInMap("CallbackResultString")
    public String callbackResultString;

    public static StartDoCheckQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDoCheckQualityRequest self = new StartDoCheckQualityRequest();
        return TeaModel.build(map, self);
    }

    public StartDoCheckQualityRequest setCallbackResultString(String callbackResultString) {
        this.callbackResultString = callbackResultString;
        return this;
    }
    public String getCallbackResultString() {
        return this.callbackResultString;
    }

}
