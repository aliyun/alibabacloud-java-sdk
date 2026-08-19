// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BatchDeletePrivateAccessApplicationRequest extends TeaModel {
    /**
     * <p>The IDs of internal-facing access applications. You can specify up to 100 application IDs.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    public static BatchDeletePrivateAccessApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePrivateAccessApplicationRequest self = new BatchDeletePrivateAccessApplicationRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeletePrivateAccessApplicationRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

}
