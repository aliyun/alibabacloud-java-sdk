// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckRecoveryConditionResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Indicates whether the recovery conditions are met. Valid values:</p>
     * <br>
     * <p>*   **true**: The recovery conditions are met.</p>
     * <p>*   **false**: The recovery conditions are not met.</p>
     */
    @NameInMap("IsValid")
    public Boolean isValid;

    /**
     * <p>The ID of the request.</p>
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
