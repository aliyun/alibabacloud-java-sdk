// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmAddressesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>223.5.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>addr-89518218114368**92</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    /**
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("AvailableStatus")
    public String availableStatus;

    /**
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <strong>example:</strong>
     * <p>Ping-IPv4</p>
     */
    @NameInMap("MonitorTemplateName")
    public String monitorTemplateName;

    /**
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("NameSearchCondition")
    public String nameSearchCondition;

    @NameInMap("Names")
    public java.util.List<String> names;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("RemarkSearchCondition")
    public String remarkSearchCondition;

    @NameInMap("Remarks")
    public java.util.List<String> remarks;

    /**
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
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
