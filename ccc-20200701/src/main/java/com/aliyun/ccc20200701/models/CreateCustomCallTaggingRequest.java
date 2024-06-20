// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCustomCallTaggingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomNumberList")
    public String customNumberList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateCustomCallTaggingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomCallTaggingRequest self = new CreateCustomCallTaggingRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomCallTaggingRequest setCustomNumberList(String customNumberList) {
        this.customNumberList = customNumberList;
        return this;
    }
    public String getCustomNumberList() {
        return this.customNumberList;
    }

    public CreateCustomCallTaggingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
