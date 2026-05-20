// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteBudgetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>department1</p>
     */
    @NameInMap("BudgetName")
    public String budgetName;

    /**
     * <strong>example:</strong>
     * <p>7EA6C02D-06D0-4213-9C3B-E67910F7D1EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBudgetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBudgetResponseBody self = new DeleteBudgetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBudgetResponseBody setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public DeleteBudgetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
