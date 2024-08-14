// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyVersionRequest extends TeaModel {
    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <blockquote>
     * <p> You can also set the value to an alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Overview of aliases</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0b30658a-ed1a-4922-b8f7-a673ca9c****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    public static CreateKeyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyVersionRequest self = new CreateKeyVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateKeyVersionRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
