// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmAddressesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US (default): English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Query by service address with precise conditions, supporting IP addresses or domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>223.5.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The address ID. This ID uniquely identifies the address.</p>
     * 
     * <strong>example:</strong>
     * <p>addr-89518218114368**92</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    /**
     * <p>Search by address availability status with precise conditions:</p>
     * <ul>
     * <li>available</li>
     * <li>unavailable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("AvailableStatus")
    public String availableStatus;

    /**
     * <p>Query by exact address enable status:</p>
     * <ul>
     * <li>enable: enabled status</li>
     * <li>disable: disabled status</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The health state of the addresses that you want to query. Valid values:</p>
     * <ul>
     * <li>ok: The addresses pass all health checks of the referenced health check templates.</li>
     * <li>ok_alert: The addresses fail some health checks of the referenced health check templates, but the addresses are deemed available.</li>
     * <li>ok_no_monitor: The addresses do not reference any health check template.</li>
     * <li>exceptional: The addresses fail some or all health checks of the referenced health check templates, and the addresses are deemed unavailable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>Health check template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Ping-IPv4</p>
     */
    @NameInMap("MonitorTemplateName")
    public String monitorTemplateName;

    /**
     * <p>The logical condition for querying addresses by name. This parameter is required if you want to query addresses by name. Valid values:</p>
     * <ul>
     * <li>and: displays the results that match all search conditions.</li>
     * <li>or: displays the results that match some or all search conditions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("NameSearchCondition")
    public String nameSearchCondition;

    /**
     * <p>Address name, usually for users to distinguish between different addresses.</p>
     */
    @NameInMap("Names")
    public java.util.List<String> names;

    /**
     * <p>Current page number, starting from 1, default is 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The logical condition for querying addresses by additional description. This parameter is required if you want to query addresses by additional description. Valid values:</p>
     * <p>and: displays the results that match all search conditions.</p>
     * <p>or: displays the results that match some or all search conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("RemarkSearchCondition")
    public String remarkSearchCondition;

    /**
     * <p>Remarks for the address.</p>
     */
    @NameInMap("Remarks")
    public java.util.List<String> remarks;

    /**
     * <p>Search precisely by address type conditions:</p>
     * <ul>
     * <li>IPv4</li>
     * <li>IPv6</li>
     * <li>domain</li>
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
