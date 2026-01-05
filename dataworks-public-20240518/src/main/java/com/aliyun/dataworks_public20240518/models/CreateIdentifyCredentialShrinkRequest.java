// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateIdentifyCredentialShrinkRequest extends TeaModel {
    /**
     * <p>The user credential object.</p>
     */
    @NameInMap("IdentifyCredential")
    public String identifyCredentialShrink;

    public static CreateIdentifyCredentialShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentifyCredentialShrinkRequest self = new CreateIdentifyCredentialShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateIdentifyCredentialShrinkRequest setIdentifyCredentialShrink(String identifyCredentialShrink) {
        this.identifyCredentialShrink = identifyCredentialShrink;
        return this;
    }
    public String getIdentifyCredentialShrink() {
        return this.identifyCredentialShrink;
    }

}
