// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmRulesRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AlarmMseType")
    public String alarmMseType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestPars")
    public String requestPars;

    public static ListAlarmRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmRulesRequest self = new ListAlarmRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmRulesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListAlarmRulesRequest setAlarmMseType(String alarmMseType) {
        this.alarmMseType = alarmMseType;
        return this;
    }
    public String getAlarmMseType() {
        return this.alarmMseType;
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

    public ListAlarmRulesRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
