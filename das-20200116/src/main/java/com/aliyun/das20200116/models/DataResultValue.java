// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DataResultValue extends TeaModel {
    @NameInMap("sqlId")
    public String sqlId;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("count")
    public Long count;

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

    public DataResultValue setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DataResultValue setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
