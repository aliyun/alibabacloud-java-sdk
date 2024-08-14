// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RotateSecretResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:kms:cn-hangzhou:154035569884****:secret/RdsSecret/Mysql5.4/MyCred</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>10257c86-269d-43aa-aaf3-90ed4144bb7c</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>RdsSecret/Mysql5.4/MyCred</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The version number of the secret after the secret is rotated.</p>
     * 
     * <strong>example:</strong>
     * <p>000000123</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static RotateSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RotateSecretResponseBody self = new RotateSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public RotateSecretResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public RotateSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RotateSecretResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public RotateSecretResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
