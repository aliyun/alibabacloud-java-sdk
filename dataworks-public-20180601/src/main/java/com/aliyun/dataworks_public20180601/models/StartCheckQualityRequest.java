// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartCheckQualityRequest extends TeaModel {
    @NameInMap("CallbackResultString")
    public String callbackResultString;

    public static StartCheckQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCheckQualityRequest self = new StartCheckQualityRequest();
        return TeaModel.build(map, self);
    }

    public StartCheckQualityRequest setCallbackResultString(String callbackResultString) {
        this.callbackResultString = callbackResultString;
        return this;
    }
    public String getCallbackResultString() {
        return this.callbackResultString;
    }

}
