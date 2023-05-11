// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalServiceDataRequest extends TeaModel {
    /**
     * <p>The sorting order of the returned service call records. Valid values:</p>
     * <br>
     * <p>*   0: descending.</p>
     * <p>*   1: ascending.</p>
     * <br>
     * <p>>  **The start time** must be earlier than **the end time**. The system sorts the returned records based on the specified order.</p>
     */
    @NameInMap("Asc")
    public Integer asc;

    /**
     * <p>The name of the device.</p>
     * <br>
     * <p>>  If you specify this parameter, you must also specify the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The end of the time range to query. The value must be a 13-digit timestamp.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The identifier of the service.</p>
     * <br>
     * <p>*   If low-level verification is applied, you can perform the following steps to view the **Identifier** of a device event: Log on to the IoT Platform console and go to the Define Feature tab of the Product Details page. You can also call the [QueryThingModel](~~150321~~) operation and view the service identifier in the returned TSL data.</p>
     * <p>*   If no verification is applied, the value must be the same as the value of the custom** identifier** that is submitted by the device.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the device. It is the unique identifier that IoT Platform generated for the device.</p>
     * <br>
     * <p>>  If you specify this parameter, you do not need to specify the **ProductKey** or **DeviceName** parameter. The **IotId** parameter specifies a unique identifier for the device, and corresponds to a combination of the **ProductKey** and **DeviceName** parameters. If you specify the **IotId** parameter and a combination of the **ProductKey** and **DeviceName** parameters at the same time, the **IotId** parameter takes precedence.</p>
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
     * <p>The identifier of the next page. The response to the first request contains this parameter, which will be added to the next request.</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The **ProductKey** of the product to which the device belongs.</p>
     * <br>
     * <p>>  If you specify this parameter, you must also specify the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The start of the time range to query. The value must be a 13-digit timestamp.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryDeviceOriginalServiceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalServiceDataRequest self = new QueryDeviceOriginalServiceDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalServiceDataRequest setAsc(Integer asc) {
        this.asc = asc;
        return this;
    }
    public Integer getAsc() {
        return this.asc;
    }

    public QueryDeviceOriginalServiceDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceOriginalServiceDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDeviceOriginalServiceDataRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public QueryDeviceOriginalServiceDataRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceOriginalServiceDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceOriginalServiceDataRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryDeviceOriginalServiceDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceOriginalServiceDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDeviceOriginalServiceDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
