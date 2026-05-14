// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeBudgetsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>department1</p>
     */
    @NameInMap("BudgetName")
    public String budgetName;

    /**
     * <strong>example:</strong>
     * <p>CONSUME</p>
     */
    @NameInMap("BudgetType")
    public String budgetType;

    /**
     * <strong>example:</strong>
     * <p>NOT_EXPIRED</p>
     */
    @NameInMap("ExpireStatus")
    public String expireStatus;

    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeBudgetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBudgetsRequest self = new DescribeBudgetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBudgetsRequest setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public DescribeBudgetsRequest setBudgetType(String budgetType) {
        this.budgetType = budgetType;
        return this;
    }
    public String getBudgetType() {
        return this.budgetType;
    }

    public DescribeBudgetsRequest setExpireStatus(String expireStatus) {
        this.expireStatus = expireStatus;
        return this;
    }
    public String getExpireStatus() {
        return this.expireStatus;
    }

    public DescribeBudgetsRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public DescribeBudgetsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeBudgetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
