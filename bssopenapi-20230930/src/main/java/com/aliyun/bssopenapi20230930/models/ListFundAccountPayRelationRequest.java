// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListFundAccountPayRelationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12323123</p>
     */
    @NameInMap("FundAccountId")
    public String fundAccountId;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>valid</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListFundAccountPayRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFundAccountPayRelationRequest self = new ListFundAccountPayRelationRequest();
        return TeaModel.build(map, self);
    }

    public ListFundAccountPayRelationRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListFundAccountPayRelationRequest setFundAccountId(String fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public String getFundAccountId() {
        return this.fundAccountId;
    }

    public ListFundAccountPayRelationRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public ListFundAccountPayRelationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFundAccountPayRelationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
