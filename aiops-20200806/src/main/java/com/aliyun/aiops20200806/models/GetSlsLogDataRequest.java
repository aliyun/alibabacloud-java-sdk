// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSlsLogDataRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Url")
    public String url;

    public static GetSlsLogDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSlsLogDataRequest self = new GetSlsLogDataRequest();
        return TeaModel.build(map, self);
    }

    public GetSlsLogDataRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSlsLogDataRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetSlsLogDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetSlsLogDataRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetSlsLogDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetSlsLogDataRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
