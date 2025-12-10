// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UploadAICPublicKeyRequest extends TeaModel {
    /**
     * <p>Public Key</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>verify_dffeb6610035dcb77b413a59c3</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The description of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Public Key Grouping</p>
     * 
     * <strong>example:</strong>
     * <p>g-test</p>
     */
    @NameInMap("KeyGroup")
    public String keyGroup;

    /**
     * <p>Public Key Name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mykey</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <p>Public key type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adb</p>
     */
    @NameInMap("KeyType")
    public String keyType;

    public static UploadAICPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAICPublicKeyRequest self = new UploadAICPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public UploadAICPublicKeyRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UploadAICPublicKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UploadAICPublicKeyRequest setKeyGroup(String keyGroup) {
        this.keyGroup = keyGroup;
        return this;
    }
    public String getKeyGroup() {
        return this.keyGroup;
    }

    public UploadAICPublicKeyRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public UploadAICPublicKeyRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

}
