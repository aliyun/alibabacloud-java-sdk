// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessOcrAlgorithmRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Data")
    public String data;

    public static ProcessOcrAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessOcrAlgorithmRequest self = new ProcessOcrAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public ProcessOcrAlgorithmRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ProcessOcrAlgorithmRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
