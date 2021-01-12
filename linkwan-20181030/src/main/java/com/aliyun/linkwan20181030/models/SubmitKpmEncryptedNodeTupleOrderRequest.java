// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkwan20181030.models;

import com.aliyun.tea.*;

public class SubmitKpmEncryptedNodeTupleOrderRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("LoraVersion")
    public String loraVersion;

    @NameInMap("RequiredCount")
    public Long requiredCount;

    public static SubmitKpmEncryptedNodeTupleOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitKpmEncryptedNodeTupleOrderRequest self = new SubmitKpmEncryptedNodeTupleOrderRequest();
        return TeaModel.build(map, self);
    }

    public SubmitKpmEncryptedNodeTupleOrderRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public SubmitKpmEncryptedNodeTupleOrderRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public SubmitKpmEncryptedNodeTupleOrderRequest setLoraVersion(String loraVersion) {
        this.loraVersion = loraVersion;
        return this;
    }
    public String getLoraVersion() {
        return this.loraVersion;
    }

    public SubmitKpmEncryptedNodeTupleOrderRequest setRequiredCount(Long requiredCount) {
        this.requiredCount = requiredCount;
        return this;
    }
    public Long getRequiredCount() {
        return this.requiredCount;
    }

}
