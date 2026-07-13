// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAddressesRequest extends TeaModel {
    /**
     * <p>The language of the return value. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese.</p>
     * </li>
     * <li><p>en-US: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The IP address or domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>223.5.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The unique ID of the address.</p>
     * 
     * <strong>example:</strong>
     * <p>addr-89518218114368****</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. The client must generate a unique token for each request. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The state of the address. Valid values:</p>
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
     * <p>The health status of the address. Valid values:</p>
     * <ul>
     * <li><p>ok: All health check tasks that are associated with the address are normal.</p>
     * </li>
     * <li><p>ok_alert: Some health check tasks that are associated with the address are abnormal, but the address is still considered normal.</p>
     * </li>
     * <li><p>ok_no_monitor: No health check template is associated with the address.</p>
     * </li>
     * <li><p>exceptional: Some or all health check tasks that are associated with the address are abnormal, and the address is considered abnormal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The unique ID of the health check template.</p>
     * 
     * <strong>example:</strong>
     * <p>mtp-89518052425100****</p>
     */
    @NameInMap("MonitorTemplateId")
    public String monitorTemplateId;

    /**
     * <p>The name of the address.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. The value starts from <strong>1</strong>. The default value is <strong>1</strong>.</p>
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
     * <p>The type of the address. Valid values:</p>
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

    public static ListCloudGtmAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAddressesRequest self = new ListCloudGtmAddressesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAddressesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListCloudGtmAddressesRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ListCloudGtmAddressesRequest setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public ListCloudGtmAddressesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListCloudGtmAddressesRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public ListCloudGtmAddressesRequest setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public ListCloudGtmAddressesRequest setMonitorTemplateId(String monitorTemplateId) {
        this.monitorTemplateId = monitorTemplateId;
        return this;
    }
    public String getMonitorTemplateId() {
        return this.monitorTemplateId;
    }

    public ListCloudGtmAddressesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCloudGtmAddressesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudGtmAddressesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudGtmAddressesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
