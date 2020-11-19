// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbTestLinkRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    public String dbName;

    public static DescribeDrdsDbTestLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbTestLinkRequest self = new DescribeDrdsDbTestLinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbTestLinkRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsDbTestLinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
