// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteBudgetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>department1</p>
     */
    @NameInMap("BudgetName")
    public String budgetName;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static DeleteBudgetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBudgetRequest self = new DeleteBudgetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBudgetRequest setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public DeleteBudgetRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

}
