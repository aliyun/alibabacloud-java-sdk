// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class FunctionResource extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    public static FunctionResource build(java.util.Map<String, ?> map) throws Exception {
        FunctionResource self = new FunctionResource();
        return TeaModel.build(map, self);
    }

    public FunctionResource setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public FunctionResource setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

}
