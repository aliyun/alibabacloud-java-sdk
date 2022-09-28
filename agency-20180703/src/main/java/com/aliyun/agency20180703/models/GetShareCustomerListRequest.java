// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetShareCustomerListRequest extends TeaModel {
    @NameInMap("AliyunPk")
    public Long aliyunPk;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("CustomerAccount")
    public String customerAccount;

    @NameInMap("CustomerName")
    public String customerName;

    @NameInMap("CustomerType")
    public String customerType;

    @NameInMap("ExitOnGoingProject")
    public String exitOnGoingProject;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RamUid")
    public Long ramUid;

    public static GetShareCustomerListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShareCustomerListRequest self = new GetShareCustomerListRequest();
        return TeaModel.build(map, self);
    }

    public GetShareCustomerListRequest setAliyunPk(Long aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public Long getAliyunPk() {
        return this.aliyunPk;
    }

    public GetShareCustomerListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetShareCustomerListRequest setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
        return this;
    }
    public String getCustomerAccount() {
        return this.customerAccount;
    }

    public GetShareCustomerListRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public GetShareCustomerListRequest setCustomerType(String customerType) {
        this.customerType = customerType;
        return this;
    }
    public String getCustomerType() {
        return this.customerType;
    }

    public GetShareCustomerListRequest setExitOnGoingProject(String exitOnGoingProject) {
        this.exitOnGoingProject = exitOnGoingProject;
        return this;
    }
    public String getExitOnGoingProject() {
        return this.exitOnGoingProject;
    }

    public GetShareCustomerListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetShareCustomerListRequest setRamUid(Long ramUid) {
        this.ramUid = ramUid;
        return this;
    }
    public Long getRamUid() {
        return this.ramUid;
    }

}
