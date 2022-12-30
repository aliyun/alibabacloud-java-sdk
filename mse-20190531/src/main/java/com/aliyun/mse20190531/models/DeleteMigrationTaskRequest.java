// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteMigrationTaskRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestPars")
    public String requestPars;

    public static DeleteMigrationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMigrationTaskRequest self = new DeleteMigrationTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMigrationTaskRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteMigrationTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteMigrationTaskRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
