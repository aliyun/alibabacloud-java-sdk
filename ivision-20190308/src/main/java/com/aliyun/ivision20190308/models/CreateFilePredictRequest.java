// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class CreateFilePredictRequest extends TeaModel {
    @NameInMap("AlgorithmCode")
    public String algorithmCode;

    @NameInMap("ResourceUrl")
    public String resourceUrl;

    @NameInMap("PushConfig")
    public String pushConfig;

    @NameInMap("DecryptConfig")
    public String decryptConfig;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OutputOss")
    public String outputOss;

    @NameInMap("OutputRegion")
    public String outputRegion;

    public static CreateFilePredictRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFilePredictRequest self = new CreateFilePredictRequest();
        return TeaModel.build(map, self);
    }

    public CreateFilePredictRequest setAlgorithmCode(String algorithmCode) {
        this.algorithmCode = algorithmCode;
        return this;
    }
    public String getAlgorithmCode() {
        return this.algorithmCode;
    }

    public CreateFilePredictRequest setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
        return this;
    }
    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public CreateFilePredictRequest setPushConfig(String pushConfig) {
        this.pushConfig = pushConfig;
        return this;
    }
    public String getPushConfig() {
        return this.pushConfig;
    }

    public CreateFilePredictRequest setDecryptConfig(String decryptConfig) {
        this.decryptConfig = decryptConfig;
        return this;
    }
    public String getDecryptConfig() {
        return this.decryptConfig;
    }

    public CreateFilePredictRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFilePredictRequest setOutputOss(String outputOss) {
        this.outputOss = outputOss;
        return this;
    }
    public String getOutputOss() {
        return this.outputOss;
    }

    public CreateFilePredictRequest setOutputRegion(String outputRegion) {
        this.outputRegion = outputRegion;
        return this;
    }
    public String getOutputRegion() {
        return this.outputRegion;
    }

}
