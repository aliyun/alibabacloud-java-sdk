// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalEventDataRequest extends TeaModel {
    /**
     * <p>The sorting order of the returned event records. Value values:</p>
     * <ul>
     * <li>0: descending.</li>
     * <li>1: ascending.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Asc")
    public Integer asc;

    /**
     * <p>The name of the device.</p>
     * <blockquote>
     * <p> If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>light</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The end of the time range to query. The value is a 13-digit timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1516541900303</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The event identifier that you want to query.</p>
     * <ul>
     * <li>If low-level verification is applied, you can perform the following steps to view the <strong>Identifier</strong> of a device event: Log on to the IoT Platform console and go to the Define Feature tab of the Product Details page. You can also call the <a href="https://help.aliyun.com/document_detail/150321.html">QueryThingModel</a> operation and view the service identifier in the returned TSL data.</li>
     * <li>If no verification is applied, the value must be the same as the value of the custom** identifier** that is submitted by the device.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PowerOff</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the device. It is the unique identifier that IoT Platform generated for the device.</p>
     * <blockquote>
     * <p> If you specify this parameter, you do not need to specify the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. The <strong>IotId</strong> parameter specifies a unique identifier for the device, and corresponds to a combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify the <strong>IotId</strong> parameter and the combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters at the same time, only the <strong>IotId</strong> parameter is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Q7uOhVRdZRRlDnTLv****00100</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The identifier of the next page. If the next page exists, this parameter is returned. In this case, you must add the value of the parameter to the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>Bo***x44Qx</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50. Default value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
     * <blockquote>
     * <p> If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The start of the time range to query. The value is a 13-digit timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1516538300303</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryDeviceOriginalEventDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalEventDataRequest self = new QueryDeviceOriginalEventDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalEventDataRequest setAsc(Integer asc) {
        this.asc = asc;
        return this;
    }
    public Integer getAsc() {
        return this.asc;
    }

    public QueryDeviceOriginalEventDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceOriginalEventDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDeviceOriginalEventDataRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public QueryDeviceOriginalEventDataRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceOriginalEventDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceOriginalEventDataRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryDeviceOriginalEventDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceOriginalEventDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDeviceOriginalEventDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
