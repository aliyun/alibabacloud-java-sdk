// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteInstanceSPInfoRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBInstanceInfos")
    public String DBInstanceInfos;

    public static DeleteInstanceSPInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceSPInfoRequest self = new DeleteInstanceSPInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceSPInfoRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteInstanceSPInfoRequest setDBInstanceInfos(String DBInstanceInfos) {
        this.DBInstanceInfos = DBInstanceInfos;
        return this;
    }
    public String getDBInstanceInfos() {
        return this.DBInstanceInfos;
    }

}
