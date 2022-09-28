// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetCustomerListRequest extends TeaModel {
    @NameInMap("AliyunPk")
    public Long aliyunPk;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("CustomerAccount")
    public String customerAccount;

    @NameInMap("CustomerGcLevel")
    public String customerGcLevel;

    @NameInMap("CustomerName")
    public String customerName;

    @NameInMap("CustomerStatus")
    public Integer customerStatus;

    @NameInMap("End")
    public String end;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RamUid")
    public Long ramUid;

    @NameInMap("Start")
    public String start;

    public static GetCustomerListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerListRequest self = new GetCustomerListRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomerListRequest setAliyunPk(Long aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public Long getAliyunPk() {
        return this.aliyunPk;
    }

    public GetCustomerListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetCustomerListRequest setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
        return this;
    }
    public String getCustomerAccount() {
        return this.customerAccount;
    }

    public GetCustomerListRequest setCustomerGcLevel(String customerGcLevel) {
        this.customerGcLevel = customerGcLevel;
        return this;
    }
    public String getCustomerGcLevel() {
        return this.customerGcLevel;
    }

    public GetCustomerListRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public GetCustomerListRequest setCustomerStatus(Integer customerStatus) {
        this.customerStatus = customerStatus;
        return this;
    }
    public Integer getCustomerStatus() {
        return this.customerStatus;
    }

    public GetCustomerListRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public GetCustomerListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCustomerListRequest setRamUid(Long ramUid) {
        this.ramUid = ramUid;
        return this;
    }
    public Long getRamUid() {
        return this.ramUid;
    }

    public GetCustomerListRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
