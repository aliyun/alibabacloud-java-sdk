// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteRecordFileInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    // 本次读取的最大数据记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    public static DeleteRecordFileInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordFileInfoRequest self = new DeleteRecordFileInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRecordFileInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteRecordFileInfoRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DeleteRecordFileInfoRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
