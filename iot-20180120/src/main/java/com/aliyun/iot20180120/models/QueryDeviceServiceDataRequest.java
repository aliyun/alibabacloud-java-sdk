// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceServiceDataRequest extends TeaModel {
    /**
     * <p>The sorting order of the returned service call records. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: reverse chronological order</li>
     * <li><strong>1</strong>: chronological order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Asc")
    public Integer asc;

    /**
     * <p>The DeviceName of the device.</p>
     * <blockquote>
     * <p>If you specify a value for this parameter, you must configure the <strong>ProductKey</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>light</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The end of the time range to query. The value is a Unix timestamp. Unit: milliseconds. Example: 1579249499000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1579249499000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The identifier of the service. The <strong>identifier</strong> of the service that is called. You can view the service identifier on the Define Feature tab in the IoT Platform console. You can also call the <a href="https://help.aliyun.com/document_detail/150321.html">QueryThingModel</a> operation to view the service identifier.</p>
     * <blockquote>
     * <p> If a service named <strong>testService</strong> belongs to a custom module named <strong>testFb</strong>, you can set this parameter to <strong>testFb:testService</strong>. The custom module is not the default module.</p>
     * </blockquote>
     * <p>If you do not specify a value for this parameter, the system queries all service data of the default module and custom modules.</p>
     * 
     * <strong>example:</strong>
     * <p>Set</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <blockquote>
     * <p>The IotId parameter specifies a GUID for the device. The value of the <strong>IotId</strong> parameter is equivalent to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify a value for this parameter, you do not need to configure the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. If you specify values for the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Q7uOhVRdZRRlDnTLv****00100</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
     * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
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
     * <p>The number of entries to return on each page. Valid values: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <blockquote>
     * <p>If you specify a value for this parameter, you must configure the <strong>DeviceName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The beginning of the time range to query. The value is a Unix timestamp. Unit: milliseconds. Example: 1579249499000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1579249499000</p>
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
