// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePeripheralDriversResponseBody extends TeaModel {
    /**
     * <p>The total number of matching drivers, not the length of the current page list. This value may be 0 when the current page contains no data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The list of driver information on the current page. An empty list is returned when no data is available.</p>
     */
    @NameInMap("DriverInfos")
    public java.util.List<DescribePeripheralDriversResponseBodyDriverInfos> driverInfos;

    /**
     * <p>Reserved field. This field does not provide a valid return value and may not be returned. This operation uses PageSize and PageNumber for pagination. Do not rely on this field. The example value 20 is provided only to illustrate the integer type and does not represent the actual return value, default value, or page size of this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Reserved field. Token-based pagination is not supported and this field may not be returned. Do not rely on this field for continued queries. The example value token-for-format-only is provided only to illustrate the string type and is not an actual return value or a usable pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>token-for-format-only</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID. Provide this value when troubleshooting issues.</p>
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
         * <p>The time when the driver record was created, in ISO 8601 (RFC 3339) format with a time zone offset. The time zone offset is based on the returned value. This field may be empty or not returned if the time information does not exist.</p>
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
         * <p>The brand icon URL. This field may be empty or not returned if no icon is configured. The example value is for illustration purposes only.</p>
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
         * <p>The driver ownership. Valid values:</p>
         * <ul>
         * <li>WUYING: Wuying official driver.</li>
         * <li>CUSTOMER: Custom driver of the current account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WUYING</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The driver source. Valid values:</p>
         * <ul>
         * <li>OpsApp: Uploaded from the management console.</li>
         * <li>WuyingHelper: Uploaded from Wuying Helper.</li>
         * <li>Wuying: Wuying source.</li>
         * </ul>
         * <p>Unrecognized sources may also be classified as Wuying. To distinguish between official and custom drivers, use OwnerType.</p>
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
