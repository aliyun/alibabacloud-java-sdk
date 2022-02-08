// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartTaskQualityRequest extends TeaModel {
    @NameInMap("CallbackResultString")
    public String callbackResultString;

    public static StartTaskQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTaskQualityRequest self = new StartTaskQualityRequest();
        return TeaModel.build(map, self);
    }

    public StartTaskQualityRequest setCallbackResultString(String callbackResultString) {
        this.callbackResultString = callbackResultString;
        return this;
    }
    public String getCallbackResultString() {
        return this.callbackResultString;
    }

}
