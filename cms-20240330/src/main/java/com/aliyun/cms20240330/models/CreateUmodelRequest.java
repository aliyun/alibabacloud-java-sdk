// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateUmodelRequest extends TeaModel {
    /**
     * <p>The description of the Umodel.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li>true: performs a dry run. The system checks the request but does not make actual changes.</li>
     * <li>false: sends a normal request.
     * Default value: false.</li>
     * </ul>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateUmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUmodelRequest self = new CreateUmodelRequest();
        return TeaModel.build(map, self);
    }

    public CreateUmodelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUmodelRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
