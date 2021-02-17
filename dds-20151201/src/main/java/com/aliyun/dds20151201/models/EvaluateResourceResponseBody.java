// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class EvaluateResourceResponseBody extends TeaModel {
    @NameInMap("DBInstanceAvailable")
    public String DBInstanceAvailable;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Engine")
    public String engine;

    public static EvaluateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluateResourceResponseBody self = new EvaluateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluateResourceResponseBody setDBInstanceAvailable(String DBInstanceAvailable) {
        this.DBInstanceAvailable = DBInstanceAvailable;
        return this;
    }
    public String getDBInstanceAvailable() {
        return this.DBInstanceAvailable;
    }

    public EvaluateResourceResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public EvaluateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EvaluateResourceResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

}
