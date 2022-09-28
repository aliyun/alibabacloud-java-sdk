// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetShareAccountListRequest extends TeaModel {
    @NameInMap("AliyunPk")
    public Long aliyunPk;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("CustomerAccount")
    public String customerAccount;

    @NameInMap("CustomerName")
    public String customerName;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RamUid")
    public Long ramUid;

    public static GetShareAccountListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShareAccountListRequest self = new GetShareAccountListRequest();
        return TeaModel.build(map, self);
    }

    public GetShareAccountListRequest setAliyunPk(Long aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public Long getAliyunPk() {
        return this.aliyunPk;
    }

    public GetShareAccountListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetShareAccountListRequest setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
        return this;
    }
    public String getCustomerAccount() {
        return this.customerAccount;
    }

    public GetShareAccountListRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public GetShareAccountListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetShareAccountListRequest setRamUid(Long ramUid) {
        this.ramUid = ramUid;
        return this;
    }
    public Long getRamUid() {
        return this.ramUid;
    }

}
