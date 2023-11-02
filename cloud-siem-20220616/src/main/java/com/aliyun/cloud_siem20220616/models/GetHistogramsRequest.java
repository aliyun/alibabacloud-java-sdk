// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetHistogramsRequest extends TeaModel {
    @NameInMap("From")
    public Integer from;

    @NameInMap("Query")
    public String query;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("To")
    public Integer to;

    public static GetHistogramsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistogramsRequest self = new GetHistogramsRequest();
        return TeaModel.build(map, self);
    }

    public GetHistogramsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public GetHistogramsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetHistogramsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetHistogramsRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
