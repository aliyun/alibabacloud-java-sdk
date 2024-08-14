// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeSecretRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the resource tags of the secret. Valid values:</p>
     * <ul>
     * <li>true: The resource tags are returned.</li>
     * <li>false: The resource tags are not returned. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FetchTags")
    public String fetchTags;

    /**
     * <p>The name of the secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    public static DescribeSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretRequest self = new DescribeSecretRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecretRequest setFetchTags(String fetchTags) {
        this.fetchTags = fetchTags;
        return this;
    }
    public String getFetchTags() {
        return this.fetchTags;
    }

    public DescribeSecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
