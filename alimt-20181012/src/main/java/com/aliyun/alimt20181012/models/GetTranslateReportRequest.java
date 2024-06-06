// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTranslateReportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Group")
    public String group;

    public static GetTranslateReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranslateReportRequest self = new GetTranslateReportRequest();
        return TeaModel.build(map, self);
    }

    public GetTranslateReportRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public GetTranslateReportRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public GetTranslateReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetTranslateReportRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

}
