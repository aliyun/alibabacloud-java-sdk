// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckRecoveryConditionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("IsValid")
    public Boolean isValid;

    /**
     * <p>The ID of the resource group.</p>
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
