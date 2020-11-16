// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsControlHistoryRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    public static DescribeLiveStreamsControlHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsControlHistoryRequest self = new DescribeLiveStreamsControlHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsControlHistoryRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeLiveStreamsControlHistoryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamsControlHistoryRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveStreamsControlHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveStreamsControlHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
