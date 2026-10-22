// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MoveResourceRequest extends TeaModel {
    /**
     * <p>The unique identifier of the Data Studio file resource.</p>
     * <blockquote>
     * <p>Notice: Before SDK version 8.0.0, this field is of the Long type. In SDK version 8.0.0 and later, this field is of the String type. <strong>This change does not affect the normal use of the SDK. The parameter is still returned based on the type defined in the SDK</strong>. The type change may cause project compilation failures only when you upgrade the SDK across version 8.0.0. In this case, you must manually correct the data type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>652567824470354XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The destination path for the move operation. Do not include the file resource name in the path.</p>
     * <p>For example, to change the path of the math.py file to root/demo/math.py, set this parameter to root/demo.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>root/demo</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Configuration page to obtain the workspace ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static MoveResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceRequest self = new MoveResourceRequest();
        return TeaModel.build(map, self);
    }

    public MoveResourceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public MoveResourceRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public MoveResourceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
