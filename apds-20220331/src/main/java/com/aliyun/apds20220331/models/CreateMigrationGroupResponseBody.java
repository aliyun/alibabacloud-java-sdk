// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class CreateMigrationGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Error")
    public String error;

    @NameInMap("Success")
    public Boolean success;

    public static CreateMigrationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationGroupResponseBody self = new CreateMigrationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMigrationGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMigrationGroupResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public CreateMigrationGroupResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public CreateMigrationGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
