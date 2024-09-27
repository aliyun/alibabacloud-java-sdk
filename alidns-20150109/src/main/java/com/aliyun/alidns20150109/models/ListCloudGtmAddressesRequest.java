// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAddressesRequest extends TeaModel {
    /**
     * <p>Return language value, options:</p>
     * <ul>
     * <li>zh-CN: Chinese.</li>
     * <li>en-US: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>IP address or domain name.</p>
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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Indicates the current availability of the address:</p>
     * <ul>
     * <li>enable: Enabled status</li>
     * <li>disable: Disabled status</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The health check state of the address. Valid values:</p>
     * <ul>
     * <li>ok: The address passes all health checks of the referenced health check templates.</li>
     * <li>ok_alert: The address fails some health checks of the referenced health check templates but the address is deemed normal.</li>
     * <li>ok_no_monitor: The address does not reference a health check template.</li>
     * <li>exceptional: The address fails some or all health checks of the referenced health check templates and the address is deemed abnormal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The ID of the health check template. This ID uniquely identifies the health check template.</p>
     * 
     * <strong>example:</strong>
     * <p>mtp-89518052425100**80</p>
     */
    @NameInMap("MonitorTemplateId")
    public String monitorTemplateId;

    /**
     * <p>Address name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Current page number, starting from <strong>1</strong>, default is <strong>1</strong>.</p>
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
     * <p>Address type:</p>
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
