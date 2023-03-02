// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class SetDataWithSignatureRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("IotAuthType")
    public String iotAuthType;

    @NameInMap("IotDataDigest")
    public String iotDataDigest;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotIdServiceProvider")
    public String iotIdServiceProvider;

    @NameInMap("IotIdSource")
    public String iotIdSource;

    @NameInMap("IotSignature")
    public String iotSignature;

    @NameInMap("Key")
    public String key;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Value")
    public String value;

    public static SetDataWithSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDataWithSignatureRequest self = new SetDataWithSignatureRequest();
        return TeaModel.build(map, self);
    }

    public SetDataWithSignatureRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public SetDataWithSignatureRequest setIotAuthType(String iotAuthType) {
        this.iotAuthType = iotAuthType;
        return this;
    }
    public String getIotAuthType() {
        return this.iotAuthType;
    }

    public SetDataWithSignatureRequest setIotDataDigest(String iotDataDigest) {
        this.iotDataDigest = iotDataDigest;
        return this;
    }
    public String getIotDataDigest() {
        return this.iotDataDigest;
    }

    public SetDataWithSignatureRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SetDataWithSignatureRequest setIotIdServiceProvider(String iotIdServiceProvider) {
        this.iotIdServiceProvider = iotIdServiceProvider;
        return this;
    }
    public String getIotIdServiceProvider() {
        return this.iotIdServiceProvider;
    }

    public SetDataWithSignatureRequest setIotIdSource(String iotIdSource) {
        this.iotIdSource = iotIdSource;
        return this;
    }
    public String getIotIdSource() {
        return this.iotIdSource;
    }

    public SetDataWithSignatureRequest setIotSignature(String iotSignature) {
        this.iotSignature = iotSignature;
        return this;
    }
    public String getIotSignature() {
        return this.iotSignature;
    }

    public SetDataWithSignatureRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SetDataWithSignatureRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public SetDataWithSignatureRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
