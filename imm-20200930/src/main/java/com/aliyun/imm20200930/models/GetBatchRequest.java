// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetBatchRequest extends TeaModel {
    /**
     * <p>The ID of the batch processing task. For more information about how to obtain the ID, see <a href="https://help.aliyun.com/document_detail/606694.html">CreateBatch</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>batch-4eb9223f-3e88-42d3-a578-3f2852******</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static GetBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchRequest self = new GetBatchRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetBatchRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
