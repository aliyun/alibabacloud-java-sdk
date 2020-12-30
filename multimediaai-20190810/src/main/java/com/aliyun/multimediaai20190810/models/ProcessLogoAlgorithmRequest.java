// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessLogoAlgorithmRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("AppKey")
    public String appKey;

    public static ProcessLogoAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessLogoAlgorithmRequest self = new ProcessLogoAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public ProcessLogoAlgorithmRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ProcessLogoAlgorithmRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
