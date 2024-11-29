// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DataResultValue extends TeaModel {
    @NameInMap("sqlId")
    public String sqlId;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("count")
    public Integer count;

    public static DataResultValue build(java.util.Map<String, ?> map) throws Exception {
        DataResultValue self = new DataResultValue();
        return TeaModel.build(map, self);
    }

    public DataResultValue setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public DataResultValue setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DataResultValue setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

}
