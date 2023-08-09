// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class EvaluateResourceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the resources are sufficient in the region. Valid values:</p>
     * <br>
     * <p>*   **1**: The resources are sufficient.</p>
     * <p>*   **0**: The resources are insufficient.</p>
     */
    @NameInMap("DBInstanceAvailable")
    public String DBInstanceAvailable;

    /**
     * <p>The database engine of the instance. Only MongoDB is returned.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public EvaluateResourceResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
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

}
