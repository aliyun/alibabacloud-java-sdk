// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmAddressPoolsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>AddressPool-1</p>
     */
    @NameInMap("AddressPoolName")
    public String addressPoolName;

    /**
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressPoolType")
    public String addressPoolType;

    /**
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("AvailableStatus")
    public String availableStatus;

    /**
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static SearchCloudGtmAddressPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmAddressPoolsRequest self = new SearchCloudGtmAddressPoolsRequest();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmAddressPoolsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public SearchCloudGtmAddressPoolsRequest setAddressPoolName(String addressPoolName) {
        this.addressPoolName = addressPoolName;
        return this;
    }
    public String getAddressPoolName() {
        return this.addressPoolName;
    }

    public SearchCloudGtmAddressPoolsRequest setAddressPoolType(String addressPoolType) {
        this.addressPoolType = addressPoolType;
        return this;
    }
    public String getAddressPoolType() {
        return this.addressPoolType;
    }

    public SearchCloudGtmAddressPoolsRequest setAvailableStatus(String availableStatus) {
        this.availableStatus = availableStatus;
        return this;
    }
    public String getAvailableStatus() {
        return this.availableStatus;
    }

    public SearchCloudGtmAddressPoolsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SearchCloudGtmAddressPoolsRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public SearchCloudGtmAddressPoolsRequest setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public SearchCloudGtmAddressPoolsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCloudGtmAddressPoolsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCloudGtmAddressPoolsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
