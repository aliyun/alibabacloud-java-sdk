// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class EnableExtensionRequest extends TeaModel {
    @NameInMap("ExtensionId")
    public String extensionId;

    public static EnableExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableExtensionRequest self = new EnableExtensionRequest();
        return TeaModel.build(map, self);
    }

    public EnableExtensionRequest setExtensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    public String getExtensionId() {
        return this.extensionId;
    }

}
