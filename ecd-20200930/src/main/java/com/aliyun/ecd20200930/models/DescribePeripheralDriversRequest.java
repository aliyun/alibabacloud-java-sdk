// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePeripheralDriversRequest extends TeaModel {
    /**
     * <p>The brand identifier. Exact match. The value is based on the actual configuration and has no fixed enumeration. If this parameter is not specified, the brand is not limited. The example is used only to illustrate the format.</p>
     * 
     * <strong>example:</strong>
     * <p>hp</p>
     */
    @NameInMap("Brand")
    public String brand;

    /**
     * <p>The device type identifier. Exact match. The value is based on the actual configuration. For example, printer indicates a printer. If this parameter is not specified, the device type is not limited.</p>
     * 
     * <strong>example:</strong>
     * <p>printer</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>The list of driver IDs. If this parameter is not specified or an empty array is passed, the driver ID is not limited. Only the drivers that are visible to the current account and match the conditions are returned. Unmatched IDs do not generate corresponding records.</p>
     */
    @NameInMap("DriverIds")
    public java.util.List<String> driverIds;

    /**
     * <p>The search keyword. Matches the driver ID, brand identifier, driver name, description, device type, or brand display name. A match in any field is considered a hit. The percent sign (%) matches characters of any length, and the underscore (_) matches a single character. If this parameter is not specified, keyword filtering is not performed.</p>
     * 
     * <strong>example:</strong>
     * <p>LaserJet</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The reserved parameter. This parameter is not used for querying or pagination. Do not specify this parameter. Use PageSize to set the number of entries to return on each page. The sample value 20 is used only to demonstrate the integer type. It is not the default value of this parameter and does not take effect even if specified.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The reserved parameter. Token-based pagination is not supported. Do not specify this parameter. Use PageNumber to specify the page number. The sample value token-for-format-only is used only to demonstrate the string type and is not a usable pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>token-for-format-only</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The driver ownership. Valid values: WUYING: Wuying official drivers. CUSTOMER: custom drivers of the current account. If this parameter is not specified, both types of drivers are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOMER</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>The page number. Specify a value starting from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 500. Default value: 20.</p>
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
