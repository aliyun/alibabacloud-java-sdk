// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribeAlarmsRequest extends TeaModel {
    @NameInMap("AlarmId")
    public String alarmId;

    @NameInMap("AlarmStatus")
    public String alarmStatus;

    @NameInMap("AlarmType")
    public String alarmType;

    @NameInMap("ErrorType")
    public String errorType;

    @NameInMap("FromAlarmTime")
    public String fromAlarmTime;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("ToAlarmTime")
    public String toAlarmTime;

    public static DescribeAlarmsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsRequest self = new DescribeAlarmsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmsRequest setAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public String getAlarmId() {
        return this.alarmId;
    }

    public DescribeAlarmsRequest setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    public DescribeAlarmsRequest setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public DescribeAlarmsRequest setErrorType(String errorType) {
        this.errorType = errorType;
        return this;
    }
    public String getErrorType() {
        return this.errorType;
    }

    public DescribeAlarmsRequest setFromAlarmTime(String fromAlarmTime) {
        this.fromAlarmTime = fromAlarmTime;
        return this;
    }
    public String getFromAlarmTime() {
        return this.fromAlarmTime;
    }

    public DescribeAlarmsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAlarmsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlarmsRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public DescribeAlarmsRequest setToAlarmTime(String toAlarmTime) {
        this.toAlarmTime = toAlarmTime;
        return this;
    }
    public String getToAlarmTime() {
        return this.toAlarmTime;
    }

}
