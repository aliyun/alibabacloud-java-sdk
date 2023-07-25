// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteRemediationsRequest extends TeaModel {
    /**
     * <p>The ID of the remediation template. Separate multiple remediation template IDs with commas (,).</p>
     * <br>
     * <p>For more information about how to obtain the ID of a remediation template, see [ListRemediations](~~270772~~).</p>
     */
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
