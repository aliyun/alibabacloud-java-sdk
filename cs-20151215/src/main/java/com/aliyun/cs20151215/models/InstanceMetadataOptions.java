// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstanceMetadataOptions extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("http_tokens")
    public String httpTokens;

    public static InstanceMetadataOptions build(java.util.Map<String, ?> map) throws Exception {
        InstanceMetadataOptions self = new InstanceMetadataOptions();
        return TeaModel.build(map, self);
    }

    public InstanceMetadataOptions setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

}
