// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmAddressesRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Address")
    public String address;

    @NameInMap("AddressId")
    public String addressId;

    @NameInMap("AvailableStatus")
    public String availableStatus;

    @NameInMap("EnableStatus")
    public String enableStatus;

    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("MonitorTemplateName")
    public String monitorTemplateName;

    @NameInMap("NameSearchCondition")
    public String nameSearchCondition;

    @NameInMap("Names")
    public java.util.List<String> names;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RemarkSearchCondition")
    public String remarkSearchCondition;

    @NameInMap("Remarks")
    public java.util.List<String> remarks;

    @NameInMap("Type")
    public String type;

    public static SearchCloudGtmAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmAddressesRequest self = new SearchCloudGtmAddressesRequest();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmAddressesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public SearchCloudGtmAddressesRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SearchCloudGtmAddressesRequest setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public SearchCloudGtmAddressesRequest setAvailableStatus(String availableStatus) {
        this.availableStatus = availableStatus;
        return this;
    }
    public String getAvailableStatus() {
        return this.availableStatus;
    }

    public SearchCloudGtmAddressesRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public SearchCloudGtmAddressesRequest setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public SearchCloudGtmAddressesRequest setMonitorTemplateName(String monitorTemplateName) {
        this.monitorTemplateName = monitorTemplateName;
        return this;
    }
    public String getMonitorTemplateName() {
        return this.monitorTemplateName;
    }

    public SearchCloudGtmAddressesRequest setNameSearchCondition(String nameSearchCondition) {
        this.nameSearchCondition = nameSearchCondition;
        return this;
    }
    public String getNameSearchCondition() {
        return this.nameSearchCondition;
    }

    public SearchCloudGtmAddressesRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public SearchCloudGtmAddressesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCloudGtmAddressesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCloudGtmAddressesRequest setRemarkSearchCondition(String remarkSearchCondition) {
        this.remarkSearchCondition = remarkSearchCondition;
        return this;
    }
    public String getRemarkSearchCondition() {
        return this.remarkSearchCondition;
    }

    public SearchCloudGtmAddressesRequest setRemarks(java.util.List<String> remarks) {
        this.remarks = remarks;
        return this;
    }
    public java.util.List<String> getRemarks() {
        return this.remarks;
    }

    public SearchCloudGtmAddressesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
