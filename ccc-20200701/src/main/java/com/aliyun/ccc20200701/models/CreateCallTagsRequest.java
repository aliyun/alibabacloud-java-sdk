// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCallTagsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallTagNameList")
    public String callTagNameList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateCallTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCallTagsRequest self = new CreateCallTagsRequest();
        return TeaModel.build(map, self);
    }

    public CreateCallTagsRequest setCallTagNameList(String callTagNameList) {
        this.callTagNameList = callTagNameList;
        return this;
    }
    public String getCallTagNameList() {
        return this.callTagNameList;
    }

    public CreateCallTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
