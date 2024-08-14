// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateSecretResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:kms:cn-hangzhou:154035569884****:secret/mydbconninfo</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The type of the secret. Valid values:</p>
     * <ul>
     * <li>Generic: indicates a generic secret.</li>
     * <li>Rds: indicates a managed ApsaraDB RDS secret.</li>
     * <li>RAMCredentials: indicates a managed RAM secret.</li>
     * <li>ECS: indicates a managed ECS secret.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("AutomaticRotation")
    public String automaticRotation;

    /**
     * <strong>example:</strong>
     * <p>kst-bjj62d8f5e0sgtx8h****</p>
     */
    @NameInMap("DKMSInstanceId")
    public String DKMSInstanceId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;SecretSubType\&quot;:\&quot;SingleUser\&quot;, \&quot;DBInstanceId\&quot;:\&quot;rm-uf667446pc955****\&quot;,  \&quot;CustomData\&quot;:{} }</p>
     */
    @NameInMap("ExtendedConfig")
    public String extendedConfig;

    /**
     * <p>The extended configuration of the secret.</p>
     * <blockquote>
     * <p> This parameter is returned if you set the SecretType parameter to Rds, RAMCredentials, or ECS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-07-06T18:22:03Z</p>
     */
    @NameInMap("NextRotationDate")
    public String nextRotationDate;

    /**
     * <p>The time when the next rotation will be performed.</p>
     * <blockquote>
     * <p> This parameter is returned if automatic rotation is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3bf02f7a-015b-4f93-be0f-cc043fda2dd3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>604800s</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The interval for automatic rotation.</p>
     * <p>The value is in the <code>integer[unit]</code> format. The value of the <code>unit</code> field is fixed as s. For example, if the value is 604800s, automatic rotation is performed at a 7-day interval.</p>
     * <blockquote>
     * <p> This parameter is returned if automatic rotation is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mydbconninfo</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The ID of the dedicated KMS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Rds</p>
     */
    @NameInMap("SecretType")
    public String secretType;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static CreateSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretResponseBody self = new CreateSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecretResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public CreateSecretResponseBody setAutomaticRotation(String automaticRotation) {
        this.automaticRotation = automaticRotation;
        return this;
    }
    public String getAutomaticRotation() {
        return this.automaticRotation;
    }

    public CreateSecretResponseBody setDKMSInstanceId(String DKMSInstanceId) {
        this.DKMSInstanceId = DKMSInstanceId;
        return this;
    }
    public String getDKMSInstanceId() {
        return this.DKMSInstanceId;
    }

    public CreateSecretResponseBody setExtendedConfig(String extendedConfig) {
        this.extendedConfig = extendedConfig;
        return this;
    }
    public String getExtendedConfig() {
        return this.extendedConfig;
    }

    public CreateSecretResponseBody setNextRotationDate(String nextRotationDate) {
        this.nextRotationDate = nextRotationDate;
        return this;
    }
    public String getNextRotationDate() {
        return this.nextRotationDate;
    }

    public CreateSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSecretResponseBody setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public CreateSecretResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public CreateSecretResponseBody setSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }
    public String getSecretType() {
        return this.secretType;
    }

    public CreateSecretResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
