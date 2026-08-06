// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteSemanticJobRequest extends TeaModel {
    /**
     * <p>The name of the job to delete. Use the Data.Name value from the CreateSemanticJob response or the Name value from a ListSemanticJobs list item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>semantic-job-demo</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteSemanticJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSemanticJobRequest self = new DeleteSemanticJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSemanticJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
