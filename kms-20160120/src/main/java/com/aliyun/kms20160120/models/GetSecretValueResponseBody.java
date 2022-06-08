// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueResponseBody extends TeaModel {
    @NameInMap("AutomaticRotation")
    public String automaticRotation;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExtendedConfig")
    public String extendedConfig;

    @NameInMap("LastRotationDate")
    public String lastRotationDate;

    @NameInMap("NextRotationDate")
    public String nextRotationDate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RotationInterval")
    public String rotationInterval;

    @NameInMap("SecretData")
    public String secretData;

    @NameInMap("SecretDataType")
    public String secretDataType;

    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("SecretType")
    public String secretType;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("VersionStages")
    public GetSecretValueResponseBodyVersionStages versionStages;

    public static GetSecretValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecretValueResponseBody self = new GetSecretValueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecretValueResponseBody setAutomaticRotation(String automaticRotation) {
        this.automaticRotation = automaticRotation;
        return this;
    }
    public String getAutomaticRotation() {
        return this.automaticRotation;
    }

    public GetSecretValueResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetSecretValueResponseBody setExtendedConfig(String extendedConfig) {
        this.extendedConfig = extendedConfig;
        return this;
    }
    public String getExtendedConfig() {
        return this.extendedConfig;
    }

    public GetSecretValueResponseBody setLastRotationDate(String lastRotationDate) {
        this.lastRotationDate = lastRotationDate;
        return this;
    }
    public String getLastRotationDate() {
        return this.lastRotationDate;
    }

    public GetSecretValueResponseBody setNextRotationDate(String nextRotationDate) {
        this.nextRotationDate = nextRotationDate;
        return this;
    }
    public String getNextRotationDate() {
        return this.nextRotationDate;
    }

    public GetSecretValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecretValueResponseBody setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public GetSecretValueResponseBody setSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }
    public String getSecretData() {
        return this.secretData;
    }

    public GetSecretValueResponseBody setSecretDataType(String secretDataType) {
        this.secretDataType = secretDataType;
        return this;
    }
    public String getSecretDataType() {
        return this.secretDataType;
    }

    public GetSecretValueResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public GetSecretValueResponseBody setSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }
    public String getSecretType() {
        return this.secretType;
    }

    public GetSecretValueResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public GetSecretValueResponseBody setVersionStages(GetSecretValueResponseBodyVersionStages versionStages) {
        this.versionStages = versionStages;
        return this;
    }
    public GetSecretValueResponseBodyVersionStages getVersionStages() {
        return this.versionStages;
    }

    public static class GetSecretValueResponseBodyVersionStages extends TeaModel {
        @NameInMap("VersionStage")
        public java.util.List<String> versionStage;

        public static GetSecretValueResponseBodyVersionStages build(java.util.Map<String, ?> map) throws Exception {
            GetSecretValueResponseBodyVersionStages self = new GetSecretValueResponseBodyVersionStages();
            return TeaModel.build(map, self);
        }

        public GetSecretValueResponseBodyVersionStages setVersionStage(java.util.List<String> versionStage) {
            this.versionStage = versionStage;
            return this;
        }
        public java.util.List<String> getVersionStage() {
            return this.versionStage;
        }

    }

}
