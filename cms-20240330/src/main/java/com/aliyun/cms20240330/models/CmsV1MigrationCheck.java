// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CmsV1MigrationCheck extends TeaModel {
    /**
     * <p>The check result code, where NAME_ indicates a naming issue and UNSUPPORTED_ indicates an unsupported resource.</p>
     * 
     * <strong>example:</strong>
     * <p>NAME_INVALID</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The check result description.</p>
     * 
     * <strong>example:</strong>
     * <p>Target name must contain 1 to 256 characters</p>
     */
    @NameInMap("message")
    public String message;

    public static CmsV1MigrationCheck build(java.util.Map<String, ?> map) throws Exception {
        CmsV1MigrationCheck self = new CmsV1MigrationCheck();
        return TeaModel.build(map, self);
    }

    public CmsV1MigrationCheck setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CmsV1MigrationCheck setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
