// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanShareAccountsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EcIdAccountIds")
    public java.util.List<GetSavingPlanShareAccountsRequestEcIdAccountIds> ecIdAccountIds;

    @NameInMap("Nbid")
    public String nbid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SpnInstanceCode")
    public String spnInstanceCode;

    public static GetSavingPlanShareAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanShareAccountsRequest self = new GetSavingPlanShareAccountsRequest();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanShareAccountsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSavingPlanShareAccountsRequest setEcIdAccountIds(java.util.List<GetSavingPlanShareAccountsRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<GetSavingPlanShareAccountsRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public GetSavingPlanShareAccountsRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public GetSavingPlanShareAccountsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSavingPlanShareAccountsRequest setSpnInstanceCode(String spnInstanceCode) {
        this.spnInstanceCode = spnInstanceCode;
        return this;
    }
    public String getSpnInstanceCode() {
        return this.spnInstanceCode;
    }

    public static class GetSavingPlanShareAccountsRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static GetSavingPlanShareAccountsRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanShareAccountsRequestEcIdAccountIds self = new GetSavingPlanShareAccountsRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanShareAccountsRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public GetSavingPlanShareAccountsRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
