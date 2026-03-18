// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectDefaultQuotaRequest extends TeaModel {
    @NameInMap("quota")
    public String quota;

    public static UpdateProjectDefaultQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectDefaultQuotaRequest self = new UpdateProjectDefaultQuotaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectDefaultQuotaRequest setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

}
