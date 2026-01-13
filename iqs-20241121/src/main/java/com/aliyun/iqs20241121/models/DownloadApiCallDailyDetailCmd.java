// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class DownloadApiCallDailyDetailCmd extends TeaModel {
    @NameInMap("apiName")
    public String apiName;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("engineType")
    public String engineType;

    @NameInMap("startTime")
    public String startTime;

    public static DownloadApiCallDailyDetailCmd build(java.util.Map<String, ?> map) throws Exception {
        DownloadApiCallDailyDetailCmd self = new DownloadApiCallDailyDetailCmd();
        return TeaModel.build(map, self);
    }

    public DownloadApiCallDailyDetailCmd setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DownloadApiCallDailyDetailCmd setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DownloadApiCallDailyDetailCmd setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DownloadApiCallDailyDetailCmd setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
