// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckRecoveryConditionResponseBody extends TeaModel {
    /**
     * <p>The instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1378****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Indicates whether the data of the instance can be restored. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The data of the instance can be restored.</li>
     * <li><strong>false</strong>: The data of the instance cannot be restored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsValid")
    public Boolean isValid;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D563A3E7-6010-45FE-A0CD-9283414C9657</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckRecoveryConditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckRecoveryConditionResponseBody self = new CheckRecoveryConditionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckRecoveryConditionResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CheckRecoveryConditionResponseBody setIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }
    public Boolean getIsValid() {
        return this.isValid;
    }

    public CheckRecoveryConditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
