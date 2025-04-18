// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateDeviceCodeRequest extends TeaModel {
    /**
     * <p>The authorization scope.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("scope")
    public String scope;

    public static GenerateDeviceCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceCodeRequest self = new GenerateDeviceCodeRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceCodeRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
