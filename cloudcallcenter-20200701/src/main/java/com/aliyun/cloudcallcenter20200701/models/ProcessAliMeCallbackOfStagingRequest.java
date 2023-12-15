// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ProcessAliMeCallbackOfStagingRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("Token")
    public String token;

    public static ProcessAliMeCallbackOfStagingRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessAliMeCallbackOfStagingRequest self = new ProcessAliMeCallbackOfStagingRequest();
        return TeaModel.build(map, self);
    }

    public ProcessAliMeCallbackOfStagingRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ProcessAliMeCallbackOfStagingRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
