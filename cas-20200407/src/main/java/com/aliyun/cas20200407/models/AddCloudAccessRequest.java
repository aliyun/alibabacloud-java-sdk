// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class AddCloudAccessRequest extends TeaModel {
    /**
     * <p>The cloud service provider. This API supports multiple providers as detailed in the SecretKey parameter description. For example, to add credentials for Tencent Cloud, set this parameter to <strong>Tencent</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
    @NameInMap("CloudName")
    public String cloudName;

    /**
     * <p>The Secret ID for accessing the cloud resource set.</p>
     * 
     * <strong>example:</strong>
     * <p>xcxx</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    /**
     * <p>The secret corresponding to the AccessKey. The value is determined by the <code>AkType</code> parameter as follows:</p>
     * <p>1\. If <code>AkType</code> is set to <code>primary</code>:</p>
     * <ul>
     * <li><p><strong>Tencent</strong>: The SecretAccessKey of the primary account.</p>
     * </li>
     * <li><p><strong>HUAWEI CLOUD</strong>: The SecretAccessKey of the primary account.</p>
     * </li>
     * <li><p><strong>Azure</strong>: The ClientSecret.</p>
     * </li>
     * <li><p><strong>AWS</strong>: The SecretAccessKey of the primary account.</p>
     * </li>
     * </ul>
     * <p>2\. If <code>AkType</code> is set to <code>sub</code>:</p>
     * <ul>
     * <li><p><strong>Tencent</strong>: The SecretAccessKey of the sub-account.</p>
     * </li>
     * <li><p><strong>HUAWEI CLOUD</strong>: The SecretAccessKey of the sub-account.</p>
     * </li>
     * <li><p><strong>Azure</strong>: The ClientSecret.</p>
     * </li>
     * <li><p><strong>AWS</strong>: The SecretAccessKey of the sub-account.</p>
     * </li>
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
