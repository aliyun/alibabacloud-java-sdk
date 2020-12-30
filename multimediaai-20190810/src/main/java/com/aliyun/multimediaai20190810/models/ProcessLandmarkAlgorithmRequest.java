// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessLandmarkAlgorithmRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("AppKey")
    public String appKey;

    public static ProcessLandmarkAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessLandmarkAlgorithmRequest self = new ProcessLandmarkAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public ProcessLandmarkAlgorithmRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ProcessLandmarkAlgorithmRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
