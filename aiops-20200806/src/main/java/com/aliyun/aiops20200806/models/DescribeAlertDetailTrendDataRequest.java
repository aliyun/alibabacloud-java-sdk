// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertDetailTrendDataRequest extends TeaModel {
    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeAlertDetailTrendDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertDetailTrendDataRequest self = new DescribeAlertDetailTrendDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertDetailTrendDataRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public DescribeAlertDetailTrendDataRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public DescribeAlertDetailTrendDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAlertDetailTrendDataRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
