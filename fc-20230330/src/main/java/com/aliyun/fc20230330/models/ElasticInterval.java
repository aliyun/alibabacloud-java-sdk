// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ElasticInterval extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("startTime")
    public String startTime;

    public static ElasticInterval build(java.util.Map<String, ?> map) throws Exception {
        ElasticInterval self = new ElasticInterval();
        return TeaModel.build(map, self);
    }

    public ElasticInterval setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ElasticInterval setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
