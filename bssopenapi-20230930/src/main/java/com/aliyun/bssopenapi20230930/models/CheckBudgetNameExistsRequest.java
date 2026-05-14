// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CheckBudgetNameExistsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>department1</p>
     */
    @NameInMap("BudgetName")
    public String budgetName;

    @NameInMap("Nbid")
    public String nbid;

    public static CheckBudgetNameExistsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBudgetNameExistsRequest self = new CheckBudgetNameExistsRequest();
        return TeaModel.build(map, self);
    }

    public CheckBudgetNameExistsRequest setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public CheckBudgetNameExistsRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

}
