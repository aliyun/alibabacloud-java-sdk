// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAdvancedBackupStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAdvancedBackupStatusResponseBody body;

    public static ModifyAdvancedBackupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvancedBackupStatusResponse self = new ModifyAdvancedBackupStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAdvancedBackupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAdvancedBackupStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAdvancedBackupStatusResponse setBody(ModifyAdvancedBackupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAdvancedBackupStatusResponseBody getBody() {
        return this.body;
    }

}
