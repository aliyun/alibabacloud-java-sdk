// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePeripheralDriversResponseBody extends TeaModel {
    /**
     * <p>The total number of matched drivers, not the length of the list on the current page. If no data exists on the current page, 0 may be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The list of driver information on the current page. An empty list is returned if no data exists.</p>
     */
    @NameInMap("DriverInfos")
    public java.util.List<DescribePeripheralDriversResponseBodyDriverInfos> driverInfos;

    /**
     * <p>The reserved field. This field does not provide a valid return value and may not be returned. This operation uses PageSize and PageNumber for pagination. Do not rely on this field. The sample value 20 is used only to demonstrate the integer type and does not represent the actual return value, default value, or page size of the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The reserved field. This field does not provide token-based pagination and may not be returned. Do not rely on this field for subsequent queries. The sample value token-for-format-only is used only to demonstrate the string type and is not an actual return value or a usable pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>token-for-format-only</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID. You can provide this value for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-1111-4222-8333-444444444444</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePeripheralDriversResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePeripheralDriversResponseBody self = new DescribePeripheralDriversResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePeripheralDriversResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribePeripheralDriversResponseBody setDriverInfos(java.util.List<DescribePeripheralDriversResponseBodyDriverInfos> driverInfos) {
        this.driverInfos = driverInfos;
        return this;
    }
    public java.util.List<DescribePeripheralDriversResponseBodyDriverInfos> getDriverInfos() {
        return this.driverInfos;
    }

    public DescribePeripheralDriversResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePeripheralDriversResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePeripheralDriversResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePeripheralDriversResponseBodyDriverInfos extends TeaModel {
        /**
         * <p>The brand to which the driver belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>hp</p>
         */
        @NameInMap("Brand")
        public String brand;

        /**
         * <p>The time when the driver record was created. The time is in the ISO 8601 (RFC 3339) format with time zone offset. The time zone offset is subject to the returned value. If the time information does not exist, this field may be empty or not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01T10:30:00+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The device type to which the driver applies.</p>
         * 
         * <strong>example:</strong>
         * <p>printer</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The URL of the brand icon. If no icon is configured, this field may be empty or not returned. The example is a placeholder address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/icons/printer.png">https://example.com/icons/printer.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The driver ID, which can be used for subsequent queries.</p>
         * 
         * <strong>example:</strong>
         * <p>11111111-2222-4333-8444-555555555555</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The driver name.</p>
         * 
         * <strong>example:</strong>
         * <p>HP Universal Printing PCL 6</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operating system to which the driver applies, such as Windows. The actual returned value prevails.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The driver ownership. Valid values: WUYING: Wuying official drivers. CUSTOMER: custom drivers of the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>WUYING</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The driver source. Valid values: OpsApp: uploaded from the management console. WuyingHelper: uploaded from Wuying Assistant. Wuying: from Wuying. Unrecognized sources may also be classified as Wuying. To distinguish between official and custom drivers, use OwnerType.</p>
         * 
         * <strong>example:</strong>
         * <p>Wuying</p>
         */
        @NameInMap("Source")
        public String source;

        public static DescribePeripheralDriversResponseBodyDriverInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribePeripheralDriversResponseBodyDriverInfos self = new DescribePeripheralDriversResponseBodyDriverInfos();
            return TeaModel.build(map, self);
        }

        public DescribePeripheralDriversResponseBodyDriverInfos setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public DescribePeripheralDriversResponseBodyDriverInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePeripheralDriversResponseBodyDriverInfos setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribePeripheralDriversResponseBodyDriverInfos setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public DescribePeripheralDriversResponseBodyDriverInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePeripheralDriversResponseBodyDriverInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePeripheralDriversResponseBodyDriverInfos setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribePeripheralDriversResponseBodyDriverInfos setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public DescribePeripheralDriversResponseBodyDriverInfos setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
