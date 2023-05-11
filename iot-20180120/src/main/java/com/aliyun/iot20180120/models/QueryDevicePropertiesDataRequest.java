// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertiesDataRequest extends TeaModel {
    /**
     * <p>The sorting order of the returned property records. Valid values:</p>
     * <br>
     * <p>*   **0**: in reverse chronological order. In this case, the time that is specified by the **StartTime** parameter must be later than the time that is specified by the **EndTime** parameter.</p>
     * <p>*   **1**: in chronological order. In this case, the time that is specified by the **StartTime** parameter must be earlier than the time that is specified by the **EndTime** parameter.</p>
     */
    @NameInMap("Asc")
    public Integer asc;

    /**
     * <p>The DeviceName of the device.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The end of the time range to query. The value is a 13-digit timestamp in milliseconds, for example 1579249499000.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Identifier")
    public java.util.List<String> identifier;

    /**
     * <p>The ID of the device. The device ID is issued by IoT Platform.</p>
     * <br>
     * <p>>  The **IotId** parameter is a globally unique identifier (GUID), and corresponds to a combination of the **ProductKey** and **DeviceName** parameters. If you specify the **IotId** parameter and a combination of the **ProductKey** and **DeviceName** parameters at the same time, the **IotId** parameter is used.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The maximum number of records that is returned for each property. Maximum value: 100.</p>
     * <br>
     * <p>The number of records that are returned for an arbitrary property cannot exceed the limit.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The start of the time range to query. The value is a 13-digit timestamp in milliseconds, for example, 1579249499000.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryDevicePropertiesDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertiesDataRequest self = new QueryDevicePropertiesDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertiesDataRequest setAsc(Integer asc) {
        this.asc = asc;
        return this;
    }
    public Integer getAsc() {
        return this.asc;
    }

    public QueryDevicePropertiesDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDevicePropertiesDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDevicePropertiesDataRequest setIdentifier(java.util.List<String> identifier) {
        this.identifier = identifier;
        return this;
    }
    public java.util.List<String> getIdentifier() {
        return this.identifier;
    }

    public QueryDevicePropertiesDataRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDevicePropertiesDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDevicePropertiesDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDevicePropertiesDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDevicePropertiesDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
