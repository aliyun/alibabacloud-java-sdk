// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateServiceObservabilityRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li>true: The system checks the request but does not perform the actual operation.</li>
     * <li>false: The system processes the request normally.
     * Default value: false.</li>
     * </ul>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateServiceObservabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceObservabilityRequest self = new CreateServiceObservabilityRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceObservabilityRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
