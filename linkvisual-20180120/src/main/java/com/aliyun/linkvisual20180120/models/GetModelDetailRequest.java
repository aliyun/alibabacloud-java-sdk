// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetModelDetailRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    public Long algorithmId;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    public static GetModelDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelDetailRequest self = new GetModelDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetModelDetailRequest setAlgorithmId(Long algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public Long getAlgorithmId() {
        return this.algorithmId;
    }

    public GetModelDetailRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
