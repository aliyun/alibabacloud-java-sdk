// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class MNS extends TeaModel {
    @NameInMap("TopicName")
    public String topicName;

    public static MNS build(java.util.Map<String, ?> map) throws Exception {
        MNS self = new MNS();
        return TeaModel.build(map, self);
    }

    public MNS setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
