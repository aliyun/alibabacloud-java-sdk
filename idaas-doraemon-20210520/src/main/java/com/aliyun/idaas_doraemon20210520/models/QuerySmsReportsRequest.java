// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class QuerySmsReportsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EventId")
    public String eventId;

    public static QuerySmsReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsReportsRequest self = new QuerySmsReportsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsReportsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QuerySmsReportsRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

}
