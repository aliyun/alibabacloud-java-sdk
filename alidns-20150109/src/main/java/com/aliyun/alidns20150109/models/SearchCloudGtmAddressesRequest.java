// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmAddressesRequest extends TeaModel {
    /**
     * <p>The language of the return value. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese.</p>
     * </li>
     * <li><p>en-US: English. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Performs an exact search by endpoint. IP addresses and domain names are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>223.5.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ID of the address. The address ID is a unique identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>addr-89518218114368****</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    /**
     * <p>Performs an exact search by the availability status of the address.</p>
     * <ul>
     * <li><p>available: The address is available.</p>
     * </li>
     * <li><p>unavailable: The address is unavailable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("AvailableStatus")
    public String availableStatus;

    /**
     * <p>Performs an exact search by the status of the address.</p>
     * <ul>
     * <li><p>enable: The address is enabled.</p>
     * </li>
     * <li><p>disable: The address is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>Performs an exact search by the health status of the address.</p>
     * <ul>
     * <li><p>ok: All health check tasks for the referenced health check template are normal.</p>
     * </li>
     * <li><p>ok_alert: Some health check tasks for the referenced health check template are abnormal, but the address is still considered normal.</p>
     * </li>
     * <li><p>ok_no_monitor: The address does not reference any health check templates.</p>
     * </li>
     * <li><p>exceptional: Some or all health check tasks for the referenced health check template are abnormal, and the address is considered abnormal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The name of the health check template.</p>
     * 
     * <strong>example:</strong>
     * <p>Ping-IPv4</p>
     */
    @NameInMap("MonitorTemplateName")
    public String monitorTemplateName;

    /**
     * <p>The search logic for querying by address name. This parameter is required when you query by address name.</p>
     * <ul>
     * <li><p>and: The query returns results that match all the specified keywords.</p>
     * </li>
     * <li><p>or: The query returns results that match some or all of the specified keywords.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("NameSearchCondition")
    public String nameSearchCondition;

    /**
     * <p>The name of the address. This name is used for easy identification.</p>
     */
    @NameInMap("Names")
    public java.util.List<String> names;

    /**
     * <p>The current page number. The value starts from 1. The default value is 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. The maximum value is 100. The default value is 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search logic for querying by address remarks. This parameter is required when you query by address remarks.</p>
     * <p>and: The query returns results that match all the specified keywords.</p>
     * <p>or: The query returns results that match some or all of the specified keywords.</p>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("RemarkSearchCondition")
    public String remarkSearchCondition;

    /**
     * <p>The remarks for the address.</p>
     */
    @NameInMap("Remarks")
    public java.util.List<String> remarks;

    /**
     * <p>Performs an exact search by the address type.</p>
     * <ul>
     * <li><p>IPv4</p>
     * </li>
     * <li><p>IPv6</p>
     * </li>
     * <li><p>domain</p>
     * </li>
     * </ul>
     * 
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
