// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertyDataRequest extends TeaModel {
    /**
     * <p>The order in which you want to sort the property records that are returned. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: reverse chronological order</li>
     * <li><strong>1</strong>: chronological order</li>
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
     * <p>If you specify a value for this parameter, you must also specify a value for the <strong>ProductKey</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>airconditioning</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The end of the time range to query. The value of the EndTime parameter must be greater than the value of the <strong>StartTime</strong> parameter. The value is a timestamp in milliseconds, for example, 1579249499000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1579249499000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The identifier of the property that you want to query.</p>
     * <p>You can view the property <strong>identifier</strong> on the Define Feature tab of the Product Details page in the IoT Platform console. You can also call the <a href="https://help.aliyun.com/document_detail/150321.html">QueryThingModel</a> operation and view the property identifier in the returned TSL data.</p>
     * <blockquote>
     * <p> If a property named temperature belongs to a custom module named testFb, set this parameter to <strong>testFb:temperature</strong>. The custom module is not the default module.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>temperature</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the device to which the property belongs.:</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/257184.html">QueryDeviceInfo</a> operation to query the <strong>ID</strong> of the device.</p>
     * <blockquote>
     * <p>If you specify a value for this parameter, you do not need to specify a value for the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) for the device. The value of the IotId parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify a value for the <strong>IotId</strong> parameter and values for the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
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
     * <li>If your instance has an ID, you must configure this parameter. If you do not configure this parameter, the call fails.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to configure this parameter.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <blockquote>
     * <p>If you specify a value for this parameter, you must also specify a value for the <strong>DeviceName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The start of the time range to query. The value of the StartTime parameter must be less than the value of the <strong>EndTime</strong> parameter. The value is a timestamp in milliseconds, for example, 1579249499000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1579249499000</p>
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
