// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAddressesRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Address")
    public String address;

    @NameInMap("AddressId")
    public String addressId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EnableStatus")
    public String enableStatus;

    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("MonitorTemplateId")
    public String monitorTemplateId;

    @NameInMap("Name")
    public String name;

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
