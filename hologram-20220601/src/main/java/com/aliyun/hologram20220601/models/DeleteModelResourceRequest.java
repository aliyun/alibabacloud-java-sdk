// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteModelResourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hologram_aicombo_public_cn-yi34cxxxx</p>
     */
    @NameInMap("aiInstanceId")
    public String aiInstanceId;

    public static DeleteModelResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelResourceRequest self = new DeleteModelResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelResourceRequest setAiInstanceId(String aiInstanceId) {
        this.aiInstanceId = aiInstanceId;
        return this;
    }
    public String getAiInstanceId() {
        return this.aiInstanceId;
    }

}
