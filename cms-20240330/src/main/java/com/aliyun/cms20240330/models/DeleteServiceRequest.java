// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteServiceRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run of the request. Valid values:</p>
     * <ul>
     * <li>true: Sends a check request without making actual changes.</li>
     * <li>false: Sends a normal request.
     * Default value: false.</li>
     * </ul>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static DeleteServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceRequest self = new DeleteServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
