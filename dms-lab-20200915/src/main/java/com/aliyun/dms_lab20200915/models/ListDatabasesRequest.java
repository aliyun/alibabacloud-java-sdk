// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_lab20200915.models;

import com.aliyun.tea.*;

public class ListDatabasesRequest extends TeaModel {
    @NameInMap("Uid")
    @Validation(required = true)
    public String uid;

    @NameInMap("Date")
    public String date;

    public static ListDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesRequest self = new ListDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabasesRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public ListDatabasesRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
