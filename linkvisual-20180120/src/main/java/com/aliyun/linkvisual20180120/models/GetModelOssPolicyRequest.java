// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetModelOssPolicyRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    public Long algorithmId;

    @NameInMap("Hardware")
    public String hardware;

    @NameInMap("ModelPackageStandard")
    public String modelPackageStandard;

    public static GetModelOssPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelOssPolicyRequest self = new GetModelOssPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetModelOssPolicyRequest setAlgorithmId(Long algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public Long getAlgorithmId() {
        return this.algorithmId;
    }

    public GetModelOssPolicyRequest setHardware(String hardware) {
        this.hardware = hardware;
        return this;
    }
    public String getHardware() {
        return this.hardware;
    }

    public GetModelOssPolicyRequest setModelPackageStandard(String modelPackageStandard) {
        this.modelPackageStandard = modelPackageStandard;
        return this;
    }
    public String getModelPackageStandard() {
        return this.modelPackageStandard;
    }

}
