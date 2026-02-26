// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class MNS extends TeaModel {
    /**
     * <p>The SMQ topic. You can check topics within a region in the <a href="https://mns.console.aliyun.com/">SMQ console</a>. This parameter is required if you want to use SMQ for notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>topic1</p>
     */
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
