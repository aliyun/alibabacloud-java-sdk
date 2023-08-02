// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StopCollectQualityRequest extends TeaModel {
    @NameInMap("CallbackResultString")
    public String callbackResultString;

    public static StopCollectQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCollectQualityRequest self = new StopCollectQualityRequest();
        return TeaModel.build(map, self);
    }

    public StopCollectQualityRequest setCallbackResultString(String callbackResultString) {
        this.callbackResultString = callbackResultString;
        return this;
    }
    public String getCallbackResultString() {
        return this.callbackResultString;
    }

}
