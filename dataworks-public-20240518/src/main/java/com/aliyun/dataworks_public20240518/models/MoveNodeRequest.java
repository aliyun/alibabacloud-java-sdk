// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MoveNodeRequest extends TeaModel {
    /**
     * <p>The ID of the node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>652567824470354XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The path to which you want to move the node. You do not need to specify a node name in the path.</p>
     * <p>For example, if you want to move the test node to root/demo/test, you must set this parameter to root/demo.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>root/demo</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>You can use this parameter to specify the DataWorks workspace on which you want to perform the API operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static MoveNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveNodeRequest self = new MoveNodeRequest();
        return TeaModel.build(map, self);
    }

    public MoveNodeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public MoveNodeRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public MoveNodeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
