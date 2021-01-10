// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetModelSignedUrlRequest extends TeaModel {
    @NameInMap("ModelPath")
    public java.util.List<String> modelPath;

    public static GetModelSignedUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelSignedUrlRequest self = new GetModelSignedUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetModelSignedUrlRequest setModelPath(java.util.List<String> modelPath) {
        this.modelPath = modelPath;
        return this;
    }
    public java.util.List<String> getModelPath() {
        return this.modelPath;
    }

}
