// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteTaskRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The environment of the workspace.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Prod: production environment</li>
     * <li>Dev: development environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static DeleteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskRequest self = new DeleteTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteTaskRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
