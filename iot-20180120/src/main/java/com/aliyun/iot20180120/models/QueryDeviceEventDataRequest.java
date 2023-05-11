// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventDataRequest extends TeaModel {
    /**
     * <p>The order in which you want to sort the returned event records. Valid values:</p>
     * <br>
     * <p>*   **0**: in reverse chronological order. This is the default value.</p>
     * <p>*   **1**: in chronological order.</p>
     * <br>
     * <p>>  If you do not configure this parameter, the default value **0** is used. The system sorts the returned event records in reverse chronological order.</p>
     */
    @NameInMap("Asc")
    public Integer asc;

    /**
     * <p>The DeviceName of the device.</p>
     * <br>
     * <p>>  If you specify a value for this parameter, you must also specify a value for the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The end of the time range to query. The value is a 13-digit timestamp in milliseconds. Example: 1516541900303.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The type of the event that you want to query. Valid values:</p>
     * <br>
     * <p>*   **info**: Information.</p>
     * <p>*   **alert**: Alert.</p>
     * <p>*   **error**: Error.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The identifier of the event that you want to query. You can view the event identifier on the Define Feature tab of the Product Details page in the IoT Platform console. You can also call the [QueryThingModel](~~150321~~) operation and view the event identifier in the returned TSL data.</p>
     * <br>
     * <p>>  If the PowerOff event belongs to a custom module named testFb, this parameter is set to **testFb:PowerOff**.</p>
     * <br>
     * <p>If you do not specify this parameter, the system queries all event data of the default module and custom modules.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <br>
     * <p>>  If you specify a value for this parameter, you do not need to specify a value for the **ProductKey** or **DeviceName** parameter. The **IotId** parameter specifies a globally unique identifier (GUID) for the device. The value of the IotId parameter corresponds to a combination of the values of the **ProductKey** and **DeviceName** parameters. If you specify a value for the **IotId** parameter and values for the **ProductKey** and **DeviceName** parameters, the value of the **IotId** parameter takes precedence.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</p>
     * <p>>*   If the **Overview** page does not appear in the IoT Platform console or no ID is generated for your instance, you do not need to specify this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <br>
     * <p>>  If you specify this parameter, you must also specify the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The beginning of the time range to query. The value is a 13-digit timestamp in milliseconds. Example: 1516538300303.</p>
     * <br>
     * <p>>  You can query the event data only of the most recent 30 days.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryDeviceEventDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventDataRequest self = new QueryDeviceEventDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventDataRequest setAsc(Integer asc) {
        this.asc = asc;
        return this;
    }
    public Integer getAsc() {
        return this.asc;
    }

    public QueryDeviceEventDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceEventDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDeviceEventDataRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public QueryDeviceEventDataRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public QueryDeviceEventDataRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceEventDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceEventDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceEventDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDeviceEventDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
