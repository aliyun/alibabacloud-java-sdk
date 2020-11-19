// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ListVersionsRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DrdsVer")
    public String drdsVer;

    public static ListVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsRequest self = new ListVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListVersionsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ListVersionsRequest setDrdsVer(String drdsVer) {
        this.drdsVer = drdsVer;
        return this;
    }
    public String getDrdsVer() {
        return this.drdsVer;
    }

}
