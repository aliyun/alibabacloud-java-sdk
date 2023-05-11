// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalPropertyDataRequest extends TeaModel {
    /**
     * <p>The order in which you want to sort the returned property records. Valid values:</p>
     * <br>
     * <p>*   0: descending.</p>
     * <p>*   1: ascending.</p>
     * <br>
     * <p>>  The **start time** must be earlier than the **end time**. The system sorts the returned records based on the specified order.</p>
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
     * <p>The end of the time range to query. The value must be a 13-digit timestamp.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The identifier of the property.</p>
     * <br>
     * <p>*   If weak verification is used, you can perform the following steps to view the **Identifier** of a device property: Log on to the IoT Platform console and go to the Define Feature tab of the Product Details page. You can also call the [QueryThingModel](~~150321~~) operation and view the property identifier in the returned TSL data.</p>
     * <p>*   If no verification is used, the value must be the same as the custom **identifier** that is submitted by the device.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <br>
     * <p>> The IotId parameter specifies a unique ID for the device. The value of the **IotId** parameter is equivalent to a combination of the values of the **ProductKey** and **DeviceName.N** parameters. If you specify the IotId parameter, you do not need to configure the **ProductKey** or **DeviceName.N** parameter. If you specify values for the **IotId**, **ProductKey**, and **DeviceName.N** parameters, the value of the **IotId** parameter takes precedence.</p>
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
     * <p>The token that is used to retrieve the next page of the query results. If the next page exists, this parameter is returned. In this case, you must add the value of the parameter to the next request.</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The maximum number of records that can be returned for each property. Maximum value: 100.</p>
     * <br>
     * <p>The number of records that are returned for an arbitrary property cannot exceed the limit.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ProductKey of the product to which the device belongs.****</p>
     * <br>
     * <br>
     * <br>
     * <p>> If you specify a value for this parameter, you must configure the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The start of the time range to query. The value must be a 13-digit timestamp.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryDeviceOriginalPropertyDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalPropertyDataRequest self = new QueryDeviceOriginalPropertyDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalPropertyDataRequest setAsc(Integer asc) {
        this.asc = asc;
        return this;
    }
    public Integer getAsc() {
        return this.asc;
    }

    public QueryDeviceOriginalPropertyDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceOriginalPropertyDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDeviceOriginalPropertyDataRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public QueryDeviceOriginalPropertyDataRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceOriginalPropertyDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceOriginalPropertyDataRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryDeviceOriginalPropertyDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceOriginalPropertyDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDeviceOriginalPropertyDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
