// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateEntityStoreRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values: true: performs a dry run without making actual changes. false: sends a normal request. Default value: false.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateEntityStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityStoreRequest self = new CreateEntityStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateEntityStoreRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
