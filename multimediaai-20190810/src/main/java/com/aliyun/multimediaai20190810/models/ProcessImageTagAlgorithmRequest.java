// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessImageTagAlgorithmRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("AppKey")
    public String appKey;

    public static ProcessImageTagAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessImageTagAlgorithmRequest self = new ProcessImageTagAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public ProcessImageTagAlgorithmRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ProcessImageTagAlgorithmRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
