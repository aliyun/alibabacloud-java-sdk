// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeDataByQueryRequest extends TeaModel {
    @NameInMap("From")
    public Long from;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("Query")
    public String query;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("To")
    public Long to;

    public static GetRetcodeDataByQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeDataByQueryRequest self = new GetRetcodeDataByQueryRequest();
        return TeaModel.build(map, self);
    }

    public GetRetcodeDataByQueryRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetRetcodeDataByQueryRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRetcodeDataByQueryRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetRetcodeDataByQueryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRetcodeDataByQueryRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
