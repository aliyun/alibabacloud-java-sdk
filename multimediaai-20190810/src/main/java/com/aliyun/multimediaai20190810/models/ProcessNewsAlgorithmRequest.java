// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessNewsAlgorithmRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("AppKey")
    public String appKey;

    public static ProcessNewsAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessNewsAlgorithmRequest self = new ProcessNewsAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public ProcessNewsAlgorithmRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ProcessNewsAlgorithmRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
