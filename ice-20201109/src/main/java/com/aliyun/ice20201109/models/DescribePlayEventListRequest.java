// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayEventListRequest extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlayTs")
    public String playTs;

    @NameInMap("SessionId")
    public String sessionId;

    public static DescribePlayEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayEventListRequest self = new DescribePlayEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayEventListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribePlayEventListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePlayEventListRequest setPlayTs(String playTs) {
        this.playTs = playTs;
        return this;
    }
    public String getPlayTs() {
        return this.playTs;
    }

    public DescribePlayEventListRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
