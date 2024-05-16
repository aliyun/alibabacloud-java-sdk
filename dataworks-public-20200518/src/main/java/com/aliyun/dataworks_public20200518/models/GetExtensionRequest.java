// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetExtensionRequest extends TeaModel {
    /**
     * <p>The unique code of the extension.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    public static GetExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExtensionRequest self = new GetExtensionRequest();
        return TeaModel.build(map, self);
    }

    public GetExtensionRequest setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode;
        return this;
    }
    public String getExtensionCode() {
        return this.extensionCode;
    }

}
