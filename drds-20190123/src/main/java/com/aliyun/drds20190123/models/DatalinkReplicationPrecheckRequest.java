// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DatalinkReplicationPrecheckRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("SrcTableName")
    @Validation(required = true)
    public String srcTableName;

    @NameInMap("DstTableName")
    @Validation(required = true)
    public String dstTableName;

    public static DatalinkReplicationPrecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        DatalinkReplicationPrecheckRequest self = new DatalinkReplicationPrecheckRequest();
        return TeaModel.build(map, self);
    }

    public DatalinkReplicationPrecheckRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DatalinkReplicationPrecheckRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DatalinkReplicationPrecheckRequest setSrcTableName(String srcTableName) {
        this.srcTableName = srcTableName;
        return this;
    }
    public String getSrcTableName() {
        return this.srcTableName;
    }

    public DatalinkReplicationPrecheckRequest setDstTableName(String dstTableName) {
        this.dstTableName = dstTableName;
        return this;
    }
    public String getDstTableName() {
        return this.dstTableName;
    }

}
