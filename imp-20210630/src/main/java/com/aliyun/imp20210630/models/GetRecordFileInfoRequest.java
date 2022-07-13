// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetRecordFileInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static GetRecordFileInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordFileInfoRequest self = new GetRecordFileInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordFileInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetRecordFileInfoRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetRecordFileInfoRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
