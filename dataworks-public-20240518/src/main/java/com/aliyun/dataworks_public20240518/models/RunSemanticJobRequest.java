// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RunSemanticJobRequest extends TeaModel {
    /**
     * <p>The name of the job to run. Use the Data.Name value returned by CreateSemanticJob or the Name field from the ListSemanticJobs response. The Source, ResourceGroupId, and reference files of the job are determined by the definition saved at creation time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>semantic-job-demo</p>
     */
    @NameInMap("Name")
    public String name;

    public static RunSemanticJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSemanticJobRequest self = new RunSemanticJobRequest();
        return TeaModel.build(map, self);
    }

    public RunSemanticJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
