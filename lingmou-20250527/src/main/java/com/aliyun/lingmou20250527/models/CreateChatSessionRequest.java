// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateChatSessionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-9t946y43m1d</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>b9be4b25c2d38c409c376ffd2372be1</p>
     */
    @NameInMap("license")
    public String license;

    /**
     * <strong>example:</strong>
     * <p>Web | Android | iOS</p>
     */
    @NameInMap("platform")
    public String platform;

    public static CreateChatSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatSessionRequest self = new CreateChatSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatSessionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateChatSessionRequest setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public CreateChatSessionRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
