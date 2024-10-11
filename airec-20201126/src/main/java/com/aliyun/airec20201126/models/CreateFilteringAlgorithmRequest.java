// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateFilteringAlgorithmRequest extends TeaModel {
    /**
     * <p>xxx</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public String dryRun;

    public static CreateFilteringAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFilteringAlgorithmRequest self = new CreateFilteringAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public CreateFilteringAlgorithmRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

}
