// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UploadIoTDataToBlockchainRequest extends TeaModel {
    @NameInMap("IotAuthType")
    public String iotAuthType;

    @NameInMap("IotDataDID")
    public String iotDataDID;

    @NameInMap("IotDataDigest")
    public String iotDataDigest;

    @NameInMap("IotDataToken")
    public String iotDataToken;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotIdServiceProvider")
    public String iotIdServiceProvider;

    @NameInMap("IotIdSource")
    public String iotIdSource;

    @NameInMap("PlainData")
    public String plainData;

    @NameInMap("PrivacyData")
    public String privacyData;

    public static UploadIoTDataToBlockchainRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadIoTDataToBlockchainRequest self = new UploadIoTDataToBlockchainRequest();
        return TeaModel.build(map, self);
    }

    public UploadIoTDataToBlockchainRequest setIotAuthType(String iotAuthType) {
        this.iotAuthType = iotAuthType;
        return this;
    }
    public String getIotAuthType() {
        return this.iotAuthType;
    }

    public UploadIoTDataToBlockchainRequest setIotDataDID(String iotDataDID) {
        this.iotDataDID = iotDataDID;
        return this;
    }
    public String getIotDataDID() {
        return this.iotDataDID;
    }

    public UploadIoTDataToBlockchainRequest setIotDataDigest(String iotDataDigest) {
        this.iotDataDigest = iotDataDigest;
        return this;
    }
    public String getIotDataDigest() {
        return this.iotDataDigest;
    }

    public UploadIoTDataToBlockchainRequest setIotDataToken(String iotDataToken) {
        this.iotDataToken = iotDataToken;
        return this;
    }
    public String getIotDataToken() {
        return this.iotDataToken;
    }

    public UploadIoTDataToBlockchainRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public UploadIoTDataToBlockchainRequest setIotIdServiceProvider(String iotIdServiceProvider) {
        this.iotIdServiceProvider = iotIdServiceProvider;
        return this;
    }
    public String getIotIdServiceProvider() {
        return this.iotIdServiceProvider;
    }

    public UploadIoTDataToBlockchainRequest setIotIdSource(String iotIdSource) {
        this.iotIdSource = iotIdSource;
        return this;
    }
    public String getIotIdSource() {
        return this.iotIdSource;
    }

    public UploadIoTDataToBlockchainRequest setPlainData(String plainData) {
        this.plainData = plainData;
        return this;
    }
    public String getPlainData() {
        return this.plainData;
    }

    public UploadIoTDataToBlockchainRequest setPrivacyData(String privacyData) {
        this.privacyData = privacyData;
        return this;
    }
    public String getPrivacyData() {
        return this.privacyData;
    }

}
