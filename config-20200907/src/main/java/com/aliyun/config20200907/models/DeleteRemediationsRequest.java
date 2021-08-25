// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteRemediationsRequest extends TeaModel {
    @NameInMap("RemediationIds")
    public String remediationIds;

    public static DeleteRemediationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRemediationsRequest self = new DeleteRemediationsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRemediationsRequest setRemediationIds(String remediationIds) {
        this.remediationIds = remediationIds;
        return this;
    }
    public String getRemediationIds() {
        return this.remediationIds;
    }

}
