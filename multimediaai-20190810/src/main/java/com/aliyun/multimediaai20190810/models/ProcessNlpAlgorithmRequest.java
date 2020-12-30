// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessNlpAlgorithmRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Data")
    public String data;

    public static ProcessNlpAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessNlpAlgorithmRequest self = new ProcessNlpAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public ProcessNlpAlgorithmRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ProcessNlpAlgorithmRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
