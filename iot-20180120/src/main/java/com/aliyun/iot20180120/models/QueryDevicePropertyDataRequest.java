// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertyDataRequest extends TeaModel {
    /**
     * <p>The order in which you want to sort the property records that are returned. Valid values:</p>
     * <br>
     * <p>*   **0**: reverse chronological order</p>
     * <p>*   **1**: chronological order</p>
     */
    @NameInMap("Asc")
    public Integer asc;

    /**
     * <p>The name of the device.</p>
     * <br>
     * <p>>If you specify a value for this parameter, you must also specify a value for the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The end of the time range to query. The value of the EndTime parameter must be greater than the value of the **StartTime** parameter. The value is a timestamp in milliseconds, for example, 1579249499000.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The identifier of the property that you want to query.</p>
     * <br>
     * <p>You can view the property **identifier** on the Define Feature tab of the Product Details page in the IoT Platform console. You can also call the [QueryThingModel](~~150321~~) operation and view the property identifier in the returned TSL data.</p>
     * <br>
     * <p>>  If a property named temperature belongs to a custom module named testFb, set this parameter to **testFb:temperature**. The custom module is not the default module.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the device to which the property belongs.:</p>
     * <br>
     * <p>You can call the [QueryDeviceInfo](~~257184~~) operation to query the **ID** of the device.</p>
     * <br>
     * <p>>If you specify a value for this parameter, you do not need to specify a value for the **ProductKey** or **DeviceName** parameter. The **IotId** parameter specifies a globally unique identifier (GUID) for the device. The value of the IotId parameter corresponds to a combination of the values of the **ProductKey** and **DeviceName** parameters. If you specify a value for the **IotId** parameter and values for the **ProductKey** and **DeviceName** parameters, the value of the **IotId** parameter takes precedence.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not configure this parameter, the call fails.</p>
     * <p>*   If your instance has no **Overview** page or ID, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <br>
     * <p>>If you specify a value for this parameter, you must also specify a value for the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The start of the time range to query. The value of the StartTime parameter must be less than the value of the **EndTime** parameter. The value is a timestamp in milliseconds, for example, 1579249499000.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryDevicePropertyDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertyDataRequest self = new QueryDevicePropertyDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertyDataRequest setAsc(Integer asc) {
        this.asc = asc;
        return this;
    }
    public Integer getAsc() {
        return this.asc;
    }

    public QueryDevicePropertyDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDevicePropertyDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDevicePropertyDataRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public QueryDevicePropertyDataRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDevicePropertyDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDevicePropertyDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDevicePropertyDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDevicePropertyDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
