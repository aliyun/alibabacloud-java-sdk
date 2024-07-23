// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateAccessPageStateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a-06xnr5lyp77e7****</p>
     */
    @NameInMap("AccessPageId")
    public String accessPageId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccessPageState")
    public Integer accessPageState;

    public static UpdateAccessPageStateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessPageStateRequest self = new UpdateAccessPageStateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccessPageStateRequest setAccessPageId(String accessPageId) {
        this.accessPageId = accessPageId;
        return this;
    }
    public String getAccessPageId() {
        return this.accessPageId;
    }

    public UpdateAccessPageStateRequest setAccessPageState(Integer accessPageState) {
        this.accessPageState = accessPageState;
        return this;
    }
    public Integer getAccessPageState() {
        return this.accessPageState;
    }

}
