// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordRequest extends TeaModel {
    /**
     * <p>The start time of the query range. The time is a 10-digit timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1508200012</p>
     */
    @NameInMap("BeginTime")
    public Integer beginTime;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The DeviceName of the IP camera. You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>camera1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The end time of the query range. The time is a 10-digit timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1582420940</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The ID of the IP camera. The ID is issued by IoT Platform and is the unique identifier of the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the ID.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> is the unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>C47T6xwp6ms4bNlkHRWCg4****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the ID of the current instance on the <strong>Overview</strong> tab in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the <strong>ID</strong>. Otherwise, the call fails.</li>
     * <li>If your instance does not have an ID, you do not need to specify this parameter.</li>
     * </ul>
     * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-060a****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>Specifies whether to return thumbnails. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong> (default): no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedSnapshot")
    public Boolean needSnapshot;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ProductKey of the product to which the IP camera belongs. You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information of all products under the current account.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The recording type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: continuous recording.</li>
     * <li><strong>1</strong>: intelligent alert event recording.</li>
     * <li><strong>2</strong> (default): manual recording.</li>
     * </ul>
     * <p>If this parameter is left empty, all recording types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecordType")
    public Integer recordType;

    /**
     * <p>The stream type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): main stream.</li>
     * <li><strong>1</strong>: sub stream.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StreamType")
    public Integer streamType;

    public static QueryRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordRequest self = new QueryRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordRequest setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Integer getBeginTime() {
        return this.beginTime;
    }

    public QueryRecordRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryRecordRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryRecordRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public QueryRecordRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryRecordRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryRecordRequest setNeedSnapshot(Boolean needSnapshot) {
        this.needSnapshot = needSnapshot;
        return this;
    }
    public Boolean getNeedSnapshot() {
        return this.needSnapshot;
    }

    public QueryRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRecordRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryRecordRequest setRecordType(Integer recordType) {
        this.recordType = recordType;
        return this;
    }
    public Integer getRecordType() {
        return this.recordType;
    }

    public QueryRecordRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
