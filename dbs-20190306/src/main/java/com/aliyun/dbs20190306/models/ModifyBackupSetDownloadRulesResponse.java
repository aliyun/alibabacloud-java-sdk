// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupSetDownloadRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBackupSetDownloadRulesResponseBody body;

    public static ModifyBackupSetDownloadRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupSetDownloadRulesResponse self = new ModifyBackupSetDownloadRulesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupSetDownloadRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupSetDownloadRulesResponse setBody(ModifyBackupSetDownloadRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupSetDownloadRulesResponseBody getBody() {
        return this.body;
    }

}
