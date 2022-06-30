// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("error")
    public String error;

    public static DescribeMigrationJobConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobConfigResponseBody self = new DescribeMigrationJobConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMigrationJobConfigResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DescribeMigrationJobConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMigrationJobConfigResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

}
