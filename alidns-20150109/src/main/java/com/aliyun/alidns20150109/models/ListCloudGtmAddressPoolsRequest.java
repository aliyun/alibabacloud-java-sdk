// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAddressPoolsRequest extends TeaModel {
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
     * <p>Address pool name.</p>
     * 
     * <strong>example:</strong>
     * <p>AddressPool-1</p>
     */
    @NameInMap("AddressPoolName")
    public String addressPoolName;

    /**
     * <p>The type of the address pool. Valid values:</p>
     * <ul>
     * <li>IPv4: indicates that the service address to be resolved is an IPv4 address.</li>
     * <li>IPv6: indicates that the service address to be resolved is an IPv6 address.</li>
     * <li>domain: indicates that the service address to be resolved is a domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressPoolType")
    public String addressPoolType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The enabling state of the address pool. Valid values:</p>
     * <ul>
     * <li>enable: The address pool is enabled.</li>
     * <li>disable: The address pool is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>Current page number, starting at <strong>1</strong>, default is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page when paginating queries, with a maximum value of <strong>100</strong>, and a default of <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The additional description of the address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static ListCloudGtmAddressPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAddressPoolsRequest self = new ListCloudGtmAddressPoolsRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAddressPoolsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListCloudGtmAddressPoolsRequest setAddressPoolName(String addressPoolName) {
        this.addressPoolName = addressPoolName;
        return this;
    }
    public String getAddressPoolName() {
        return this.addressPoolName;
    }

    public ListCloudGtmAddressPoolsRequest setAddressPoolType(String addressPoolType) {
        this.addressPoolType = addressPoolType;
        return this;
    }
    public String getAddressPoolType() {
        return this.addressPoolType;
    }

    public ListCloudGtmAddressPoolsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListCloudGtmAddressPoolsRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public ListCloudGtmAddressPoolsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudGtmAddressPoolsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudGtmAddressPoolsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
