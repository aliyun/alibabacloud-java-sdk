// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class MNS extends TeaModel {
    /**
     * <p>Specifies the name of the ApsaraMQ for MNS topic, which can be found in the topic list for the current region in the left-side navigation pane of the <a href="https://mns.console.aliyun.com/">ApsaraMQ for MNS console</a>. This parameter is required for ApsaraMQ for MNS message notification.</p>
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
