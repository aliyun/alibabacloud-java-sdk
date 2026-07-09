// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class UpdateBudgetResponseBody extends TeaModel {
    @NameInMap("BudgetName")
    public String budgetName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>03A59CD4-6C6B-1A62-B64C-F1F2AF7830F3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBudgetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBudgetResponseBody self = new UpdateBudgetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBudgetResponseBody setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public UpdateBudgetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
