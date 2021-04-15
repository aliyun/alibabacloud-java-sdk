// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmRulesRequest extends TeaModel {
    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AlarmMseType")
    public String alarmMseType;

    public static ListAlarmRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmRulesRequest self = new ListAlarmRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmRulesRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public ListAlarmRulesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAlarmRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlarmRulesRequest setAlarmMseType(String alarmMseType) {
        this.alarmMseType = alarmMseType;
        return this;
    }
    public String getAlarmMseType() {
        return this.alarmMseType;
    }

}
