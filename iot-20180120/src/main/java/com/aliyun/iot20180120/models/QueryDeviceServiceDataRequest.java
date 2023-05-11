// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceServiceDataRequest extends TeaModel {
    /**
     * <p>The sorting order of the returned service call records. Valid values:</p>
     * <br>
     * <p>*   **0**: reverse chronological order</p>
     * <p>*   **1**: chronological order</p>
     */
    @NameInMap("Asc")
    public Integer asc;

    /**
     * <p>The DeviceName of the device.</p>
     * <br>
     * <p>> If you specify a value for this parameter, you must configure the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The end of the time range to query. The value is a Unix timestamp. Unit: milliseconds. Example: 1579249499000.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The identifier of the service. The **identifier** of the service that is called. You can view the service identifier on the Define Feature tab in the IoT Platform console. You can also call the [QueryThingModel](~~150321~~) operation to view the service identifier.</p>
     * <br>
     * <p>>  If a service named **testService** belongs to a custom module named **testFb**, you can set this parameter to **testFb:testService**. The custom module is not the default module.</p>
     * <br>
     * <p>If you do not specify a value for this parameter, the system queries all service data of the default module and custom modules.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <br>
     * <p>> The IotId parameter specifies a GUID for the device. The value of the **IotId** parameter is equivalent to a combination of the values of the **ProductKey** and **DeviceName** parameters. If you specify a value for this parameter, you do not need to configure the **ProductKey** or **DeviceName** parameter. If you specify values for the **IotId**, **ProductKey**, and **DeviceName** parameters, the value of the **IotId** parameter takes precedence.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the ID of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</p>
     * <p>>*   If no **Overview** page or **ID** is generated for your instance, you do not need to configure this parameter.</p>
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
     * <p>>If you specify a value for this parameter, you must configure the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The beginning of the time range to query. The value is a Unix timestamp. Unit: milliseconds. Example: 1579249499000.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryDeviceServiceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceServiceDataRequest self = new QueryDeviceServiceDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceServiceDataRequest setAsc(Integer asc) {
        this.asc = asc;
        return this;
    }
    public Integer getAsc() {
        return this.asc;
    }

    public QueryDeviceServiceDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceServiceDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDeviceServiceDataRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public QueryDeviceServiceDataRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceServiceDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceServiceDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceServiceDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDeviceServiceDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
