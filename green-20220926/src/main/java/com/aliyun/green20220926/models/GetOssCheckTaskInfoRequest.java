// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckTaskInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>P_AAA**</p>
     */
    @NameInMap("ParentTaskId")
    public String parentTaskId;

    public static GetOssCheckTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckTaskInfoRequest self = new GetOssCheckTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetOssCheckTaskInfoRequest setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }
    public String getParentTaskId() {
        return this.parentTaskId;
    }

}
