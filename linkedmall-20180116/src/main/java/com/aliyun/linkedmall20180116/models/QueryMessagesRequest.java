// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMessagesRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("ExtJson")
    public String extJson;

    public static QueryMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMessagesRequest self = new QueryMessagesRequest();
        return TeaModel.build(map, self);
    }

    public QueryMessagesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMessagesRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public QueryMessagesRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

}
