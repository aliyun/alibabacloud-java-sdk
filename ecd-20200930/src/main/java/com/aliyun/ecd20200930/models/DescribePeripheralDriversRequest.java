// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePeripheralDriversRequest extends TeaModel {
    /**
     * <p>The brand identifier. Exact match is used. The value depends on the actual configuration and is not a fixed enumeration. If this parameter is not specified, drivers of all brands are returned. The example value is provided to illustrate the format only.</p>
     * 
     * <strong>example:</strong>
     * <p>hp</p>
     */
    @NameInMap("Brand")
    public String brand;

    /**
     * <p>The device type identifier. Exact match is used. The value depends on the actual configuration. For example, printer indicates a printer. If this parameter is not specified, drivers of all device types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>printer</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>The list of driver IDs. If this parameter is not specified or an empty array is passed in, no filtering by driver ID is applied. Only drivers that are visible to the current account and match the specified IDs are returned. IDs that do not match any driver do not produce corresponding records.</p>
     */
    @NameInMap("DriverIds")
    public java.util.List<String> driverIds;

    /**
     * <p>The search keyword. The keyword is matched against the driver ID, brand identifier, driver name, description, device type, or brand display name. A hit on any field qualifies the driver. The wildcard % matches any number of characters, and _ matches a single character. If this parameter is not specified, no keyword filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>LaserJet</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Reserved parameter. This parameter does not participate in queries or pagination. Do not specify this parameter. Use PageSize to set the number of entries per page. The example value 20 is provided only to illustrate the integer type. It is not the default value of this parameter and does not take effect if specified.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Reserved parameter. Token-based pagination is not supported. Do not specify this parameter. Use PageNumber to specify the page number. The example value token-for-format-only is provided only to illustrate the string type and is not a usable pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>token-for-format-only</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The driver ownership. Valid values:</p>
     * <ul>
     * <li>WUYING: Wuying official driver.</li>
     * <li>CUSTOMER: Custom driver of the current account.</li>
     * </ul>
     * <p>If this parameter is not specified, both types of drivers are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOMER</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>The page number. Start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 500. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribePeripheralDriversRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePeripheralDriversRequest self = new DescribePeripheralDriversRequest();
        return TeaModel.build(map, self);
    }

    public DescribePeripheralDriversRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public DescribePeripheralDriversRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public DescribePeripheralDriversRequest setDriverIds(java.util.List<String> driverIds) {
        this.driverIds = driverIds;
        return this;
    }
    public java.util.List<String> getDriverIds() {
        return this.driverIds;
    }

    public DescribePeripheralDriversRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribePeripheralDriversRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePeripheralDriversRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePeripheralDriversRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public DescribePeripheralDriversRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePeripheralDriversRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
