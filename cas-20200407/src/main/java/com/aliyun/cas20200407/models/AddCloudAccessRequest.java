// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class AddCloudAccessRequest extends TeaModel {
    /**
     * <p>The cloud service provider. Currently, only Tencent Cloud (<strong>Tencent</strong>) is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
    @NameInMap("CloudName")
    public String cloudName;

    /**
     * <p>The secret ID for cloud resource access.</p>
     * 
     * <strong>example:</strong>
     * <p>xcxx</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    /**
     * <p>The secret of the access key. Valid values:</p>
     * <ol>
     * <li>If AkType is set to primary:</li>
     * </ol>
     * <ul>
     * <li><strong>Tencent</strong>: the SecretAccessKey of the primary account.</li>
     * <li><strong>HUAWEICLOUD</strong>: the SecretAccessKey of the primary account.</li>
     * <li><strong>Azure</strong>: the ClientSecret.</li>
     * <li><strong>AWS</strong>: the SecretAccessKey of the primary account.</li>
     * </ul>
     * <ol start="2">
     * <li>If AkType is set to sub:</li>
     * </ol>
     * <ul>
     * <li><strong>Tencent</strong>: the SecretAccessKey of the sub-account.</li>
     * <li><strong>HUAWEICLOUD</strong>: the SecretAccessKey of the sub-account.</li>
     * <li><strong>Azure</strong>: the ClientSecret.</li>
     * <li><strong>AWS</strong>: the SecretAccessKey of the sub-account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    public static AddCloudAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCloudAccessRequest self = new AddCloudAccessRequest();
        return TeaModel.build(map, self);
    }

    public AddCloudAccessRequest setCloudName(String cloudName) {
        this.cloudName = cloudName;
        return this;
    }
    public String getCloudName() {
        return this.cloudName;
    }

    public AddCloudAccessRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public AddCloudAccessRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

}
