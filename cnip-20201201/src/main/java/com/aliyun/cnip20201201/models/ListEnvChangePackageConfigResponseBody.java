// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangePackageConfigResponseBody extends TeaModel {
    @NameInMap("data")
    public String data;

    public static ListEnvChangePackageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangePackageConfigResponseBody self = new ListEnvChangePackageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvChangePackageConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
