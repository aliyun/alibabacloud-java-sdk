// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class PutSecretValueResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the secret.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The new version of the secret value.</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    /**
     * <p>The stage labels that are used to mark the new version.</p>
     */
    @NameInMap("VersionStages")
    public PutSecretValueResponseBodyVersionStages versionStages;

    public static PutSecretValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutSecretValueResponseBody self = new PutSecretValueResponseBody();
        return TeaModel.build(map, self);
    }

    public PutSecretValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutSecretValueResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public PutSecretValueResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public PutSecretValueResponseBody setVersionStages(PutSecretValueResponseBodyVersionStages versionStages) {
        this.versionStages = versionStages;
        return this;
    }
    public PutSecretValueResponseBodyVersionStages getVersionStages() {
        return this.versionStages;
    }

    public static class PutSecretValueResponseBodyVersionStages extends TeaModel {
        @NameInMap("VersionStage")
        public java.util.List<String> versionStage;

        public static PutSecretValueResponseBodyVersionStages build(java.util.Map<String, ?> map) throws Exception {
            PutSecretValueResponseBodyVersionStages self = new PutSecretValueResponseBodyVersionStages();
            return TeaModel.build(map, self);
        }

        public PutSecretValueResponseBodyVersionStages setVersionStage(java.util.List<String> versionStage) {
            this.versionStage = versionStage;
            return this;
        }
        public java.util.List<String> getVersionStage() {
            return this.versionStage;
        }

    }

}
