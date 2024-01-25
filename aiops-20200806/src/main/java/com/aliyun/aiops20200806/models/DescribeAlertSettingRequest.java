// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertSettingRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("CustomerName")
    public String customerName;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SearchKeyword")
    public String searchKeyword;

    @NameInMap("SettingStatus")
    public String settingStatus;

    @NameInMap("Uid")
    public Long uid;

    public static DescribeAlertSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSettingRequest self = new DescribeAlertSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSettingRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAlertSettingRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public DescribeAlertSettingRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeAlertSettingRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertSettingRequest setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
        return this;
    }
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public DescribeAlertSettingRequest setSettingStatus(String settingStatus) {
        this.settingStatus = settingStatus;
        return this;
    }
    public String getSettingStatus() {
        return this.settingStatus;
    }

    public DescribeAlertSettingRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
