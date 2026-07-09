// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateBudgetResponseBody extends TeaModel {
    /**
     * <p>The budget name.</p>
     * 
     * <strong>example:</strong>
     * <p>Department_dev_budget</p>
     */
    @NameInMap("BudgetName")
    public String budgetName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39EDD65E-68C5-1B17-8440-C729C7591D74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBudgetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBudgetResponseBody self = new CreateBudgetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBudgetResponseBody setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public CreateBudgetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
