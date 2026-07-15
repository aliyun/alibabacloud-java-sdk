// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class EvaluateResourceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether resources are available in the current region. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Resources are sufficient.</p>
     * </li>
     * <li><p><strong>0</strong>: Resources are insufficient.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBInstanceAvailable")
    public String DBInstanceAvailable;

    /**
     * <p>The database engine. The value is fixed to MongoDB.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>4.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE2DE465-E45F-481F-ABD8-37D64173****</p>
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
