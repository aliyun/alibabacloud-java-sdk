// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DataResultValue extends TeaModel {
    /**
     * <p>The SQL template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>61f45ee381b2fa4e8a6545e3bee9</p>
     */
    @NameInMap("sqlId")
    public String sqlId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-xxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The number of errors.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
