// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetConnectionRequest extends TeaModel {
    /**
     * <p>The encryption settings. Valid values:</p>
     * <ul>
     * <li>PlainText</li>
     * <li>Secret</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("EncryptOption")
    public String encryptOption;

    public static GetConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionRequest self = new GetConnectionRequest();
        return TeaModel.build(map, self);
    }

    public GetConnectionRequest setEncryptOption(String encryptOption) {
        this.encryptOption = encryptOption;
        return this;
    }
    public String getEncryptOption() {
        return this.encryptOption;
    }

}
