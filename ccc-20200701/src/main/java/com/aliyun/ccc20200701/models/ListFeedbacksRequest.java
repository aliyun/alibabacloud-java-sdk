// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListFeedbacksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;20251216-8B9B7B02-16FE-54BE-942A-F59DE0656032&quot;]</p>
     */
    @NameInMap("TaskIdList")
    public String taskIdList;

    public static ListFeedbacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeedbacksRequest self = new ListFeedbacksRequest();
        return TeaModel.build(map, self);
    }

    public ListFeedbacksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFeedbacksRequest setTaskIdList(String taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }
    public String getTaskIdList() {
        return this.taskIdList;
    }

}
