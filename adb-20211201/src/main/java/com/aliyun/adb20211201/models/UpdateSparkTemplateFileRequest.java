// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateSparkTemplateFileRequest extends TeaModel {
    /**
     * <p>The template data to be updated.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the application template is not updated. For information about how to configure a Spark application template, see <a href="https://help.aliyun.com/document_detail/452402.html">Configure a Spark application</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>set spark.driver.resourceSpec=medium;set spark.executor.instances=2;set spark.executor.resourceSpec=medium;set spark.app.name=Spark SQL Test;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-pz5vp4585l466****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The application template ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/456205.html">GetSparkTemplateFullTree</a> operation to query the application template ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>718056</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the job resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>adb</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static UpdateSparkTemplateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSparkTemplateFileRequest self = new UpdateSparkTemplateFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSparkTemplateFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateSparkTemplateFileRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateSparkTemplateFileRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSparkTemplateFileRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
