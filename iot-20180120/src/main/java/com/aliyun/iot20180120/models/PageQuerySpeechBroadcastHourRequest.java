// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PageQuerySpeechBroadcastHourRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageToken")
    public String pageToken;

    @NameInMap("QueryDateTimeHour")
    public String queryDateTimeHour;

    @NameInMap("ShareTaskCode")
    public String shareTaskCode;

    public static PageQuerySpeechBroadcastHourRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQuerySpeechBroadcastHourRequest self = new PageQuerySpeechBroadcastHourRequest();
        return TeaModel.build(map, self);
    }

    public PageQuerySpeechBroadcastHourRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PageQuerySpeechBroadcastHourRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageQuerySpeechBroadcastHourRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public PageQuerySpeechBroadcastHourRequest setQueryDateTimeHour(String queryDateTimeHour) {
        this.queryDateTimeHour = queryDateTimeHour;
        return this;
    }
    public String getQueryDateTimeHour() {
        return this.queryDateTimeHour;
    }

    public PageQuerySpeechBroadcastHourRequest setShareTaskCode(String shareTaskCode) {
        this.shareTaskCode = shareTaskCode;
        return this;
    }
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

}
