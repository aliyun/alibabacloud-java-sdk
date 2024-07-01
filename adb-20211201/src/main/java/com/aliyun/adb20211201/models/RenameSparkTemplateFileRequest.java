// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RenameSparkTemplateFileRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-d*****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The template file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the template file that you want to rename.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>new_template_name</p>
     */
    @NameInMap("Name")
    public String name;

    public static RenameSparkTemplateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameSparkTemplateFileRequest self = new RenameSparkTemplateFileRequest();
        return TeaModel.build(map, self);
    }

    public RenameSparkTemplateFileRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public RenameSparkTemplateFileRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RenameSparkTemplateFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
