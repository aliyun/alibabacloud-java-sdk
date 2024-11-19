// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalServiceDataRequest extends TeaModel {
    /**
     * <p>The sorting order of the returned service call records. Valid values:</p>
     * <ul>
     * <li>0: descending.</li>
     * <li>1: ascending.</li>
     * </ul>
     * <blockquote>
     * <p> <strong>The start time</strong> must be earlier than <strong>the end time</strong>. The system sorts the returned records based on the specified order.</p>
     * </blockquote>
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
     * <p>The end of the time range to query. The value must be a 13-digit timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1579249499000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The identifier of the service.</p>
     * <ul>
     * <li>If low-level verification is applied, you can perform the following steps to view the <strong>Identifier</strong> of a device event: Log on to the IoT Platform console and go to the Define Feature tab of the Product Details page. You can also call the <a href="https://help.aliyun.com/document_detail/150321.html">QueryThingModel</a> operation and view the service identifier in the returned TSL data.</li>
     * <li>If no verification is applied, the value must be the same as the value of the custom** identifier** that is submitted by the device.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Set</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the device. It is the unique identifier that IoT Platform generated for the device.</p>
     * <blockquote>
     * <p> If you specify this parameter, you do not need to specify the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. The <strong>IotId</strong> parameter specifies a unique identifier for the device, and corresponds to a combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify the <strong>IotId</strong> parameter and a combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters at the same time, the <strong>IotId</strong> parameter takes precedence.</p>
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
     * <p>The identifier of the next page. The response to the first request contains this parameter, which will be added to the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>Bo***x44Qx</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50.</p>
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
     * <p>The start of the time range to query. The value must be a 13-digit timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1579249498000</p>
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
