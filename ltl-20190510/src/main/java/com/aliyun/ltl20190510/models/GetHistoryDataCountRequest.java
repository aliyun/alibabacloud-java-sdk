// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class GetHistoryDataCountRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Key")
    public String key;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetHistoryDataCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryDataCountRequest self = new GetHistoryDataCountRequest();
        return TeaModel.build(map, self);
    }

    public GetHistoryDataCountRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GetHistoryDataCountRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetHistoryDataCountRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GetHistoryDataCountRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public GetHistoryDataCountRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
