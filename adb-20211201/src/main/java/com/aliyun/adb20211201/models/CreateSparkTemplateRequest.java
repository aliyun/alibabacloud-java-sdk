// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateSparkTemplateRequest extends TeaModel {
    /**
     * <p>The application type. Valid values:</p>
     * <ul>
     * <li><strong>SQL</strong></li>
     * <li><strong>STREAMING</strong></li>
     * <li><strong>BATCH</strong></li>
     * </ul>
     * <blockquote>
     * <p> You do not need to specify this parameter when Type is set to folder.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the application template. The name can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>batchfile</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the directory to which the application template belongs.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/456218.html">GetSparkTemplateFolderTree</a> operation to query the directory ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The type of the application template. Valid values:</p>
     * <ul>
     * <li><strong>folder</strong>: directory.</li>
     * <li><strong>file</strong>: application.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateSparkTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSparkTemplateRequest self = new CreateSparkTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateSparkTemplateRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateSparkTemplateRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateSparkTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSparkTemplateRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateSparkTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
