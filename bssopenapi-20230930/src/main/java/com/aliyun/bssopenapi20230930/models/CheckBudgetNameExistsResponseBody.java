// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CheckBudgetNameExistsResponseBody extends TeaModel {
    /**
     * <p>The budget name.</p>
     * 
     * <strong>example:</strong>
     * <p>department1</p>
     */
    @NameInMap("BudgetName")
    public String budgetName;

    /**
     * <p>Indicates whether the budget name already exists.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Exists")
    public Boolean exists;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F1E2D3C4-B5A6-7890-1234-567890ABCDEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckBudgetNameExistsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckBudgetNameExistsResponseBody self = new CheckBudgetNameExistsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckBudgetNameExistsResponseBody setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public CheckBudgetNameExistsResponseBody setExists(Boolean exists) {
        this.exists = exists;
        return this;
    }
    public Boolean getExists() {
        return this.exists;
    }

    public CheckBudgetNameExistsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
