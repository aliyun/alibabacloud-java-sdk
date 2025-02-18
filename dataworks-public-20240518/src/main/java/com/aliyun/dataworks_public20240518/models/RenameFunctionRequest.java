// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RenameFunctionRequest extends TeaModel {
    /**
     * <p>The ID of the UDF.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>543217824470354XXXX</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The new name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Rename</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10002</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static RenameFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameFunctionRequest self = new RenameFunctionRequest();
        return TeaModel.build(map, self);
    }

    public RenameFunctionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RenameFunctionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RenameFunctionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
