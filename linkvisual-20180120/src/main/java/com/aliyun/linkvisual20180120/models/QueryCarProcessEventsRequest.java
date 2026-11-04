// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryCarProcessEventsRequest extends TeaModel {
    /**
     * <p>The action type of the vehicle. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enter.</li>
     * <li><strong>2</strong>: Stay.</li>
     * <li><strong>3</strong>: Leave.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ActionType")
    public Integer actionType;

    /**
     * <p>The detection box of the IPC device. You can call the <a href="https://help.aliyun.com/document_detail/69584.html">InvokeThingService</a> operation to query the number of detection boxes. Set <strong>identifier</strong> to <strong>QueryAlgoTaskDetails</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AreaIndex")
    public Integer areaIndex;

    /**
     * <p>The start time of the query range. The time is a 13-digit timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1646288487368</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The page number of the returned page. Pages start from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time of the query range. The time is a 13-digit timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1646288488368</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>If the instance has an ID, you must specify this ID. Otherwise, the call fails.</li>
     * <li>If the instance does not have an ID&lt;props=&quot;intl&quot;&gt;<ph> or the <strong>Instance Overview</strong> page is not displayed</ph>, you do not need to specify this parameter.</li>
     * </ul>
     * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iotx-oxsshare****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 20. Default value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The license plate number. The value can be up to 15 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheAM****</p>
     */
    @NameInMap("PlateNo")
    public String plateNo;

    /**
     * <p>The name of the IPC device.
     * You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>car_test</p>
     */
    @NameInMap("SubDeviceName")
    public String subDeviceName;

    /**
     * <p>The ID of the IP camera (IPC) device. The ID is issued by IoT Platform and uniquely identifies the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the ID.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> uniquely identifies the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ImP6ECd1aQ****CAfWTO000101</p>
     */
    @NameInMap("SubIotId")
    public String subIotId;

    /**
     * <p>The ProductKey of the product to which the IPC device belongs.
     * You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information about all products under the current account.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1Duh0F****</p>
     */
    @NameInMap("SubProductKey")
    public String subProductKey;

    public static QueryCarProcessEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarProcessEventsRequest self = new QueryCarProcessEventsRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarProcessEventsRequest setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }
    public Integer getActionType() {
        return this.actionType;
    }

    public QueryCarProcessEventsRequest setAreaIndex(Integer areaIndex) {
        this.areaIndex = areaIndex;
        return this;
    }
    public Integer getAreaIndex() {
        return this.areaIndex;
    }

    public QueryCarProcessEventsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QueryCarProcessEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryCarProcessEventsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryCarProcessEventsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryCarProcessEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryCarProcessEventsRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public QueryCarProcessEventsRequest setSubDeviceName(String subDeviceName) {
        this.subDeviceName = subDeviceName;
        return this;
    }
    public String getSubDeviceName() {
        return this.subDeviceName;
    }

    public QueryCarProcessEventsRequest setSubIotId(String subIotId) {
        this.subIotId = subIotId;
        return this;
    }
    public String getSubIotId() {
        return this.subIotId;
    }

    public QueryCarProcessEventsRequest setSubProductKey(String subProductKey) {
        this.subProductKey = subProductKey;
        return this;
    }
    public String getSubProductKey() {
        return this.subProductKey;
    }

}
