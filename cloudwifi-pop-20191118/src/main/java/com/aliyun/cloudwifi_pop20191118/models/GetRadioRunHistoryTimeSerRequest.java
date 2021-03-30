// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetRadioRunHistoryTimeSerRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Start")
    public Long start;

    @NameInMap("ApMac")
    public String apMac;

    @NameInMap("End")
    public Long end;

    public static GetRadioRunHistoryTimeSerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRadioRunHistoryTimeSerRequest self = new GetRadioRunHistoryTimeSerRequest();
        return TeaModel.build(map, self);
    }

    public GetRadioRunHistoryTimeSerRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetRadioRunHistoryTimeSerRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetRadioRunHistoryTimeSerRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public GetRadioRunHistoryTimeSerRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public GetRadioRunHistoryTimeSerRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

}
