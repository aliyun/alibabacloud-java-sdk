// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SubmitSparkAppRequest extends TeaModel {
    /**
     * <p>The type of the client. The value can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>CONSOLE</p>
     */
    @NameInMap("AgentSource")
    public String agentSource;

    /**
     * <p>The version of the client. The value can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1.091</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>The name of the application. The value can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>TestApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The type of the application. Valid values:</p>
     * <ul>
     * <li><strong>SQL</strong></li>
     * <li><strong>STREAMING</strong></li>
     * <li><strong>BATCH</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The data of the application template.</p>
     * <blockquote>
     * <p>For information about the application template configuration, see <a href="https://help.aliyun.com/document_detail/452402.html">Spark application configuration guide</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>conf spark.driver.resourceSpec=small; conf spark.executor.instances=1; conf spark.executor.resourceSpec=small; conf spark.app.name=TestApp;</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The name of the job resource group.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/612410.html">DescribeDBResourceGroup</a> operation to query the resource group ID of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adb</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <p>The ID of the application template.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/456205.html">GetSparkTemplateFullTree</a> operation to query the application template ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TemplateFileId")
    public Long templateFileId;

    public static SubmitSparkAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkAppRequest self = new SubmitSparkAppRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSparkAppRequest setAgentSource(String agentSource) {
        this.agentSource = agentSource;
        return this;
    }
    public String getAgentSource() {
        return this.agentSource;
    }

    public SubmitSparkAppRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public SubmitSparkAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SubmitSparkAppRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SubmitSparkAppRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public SubmitSparkAppRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SubmitSparkAppRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public SubmitSparkAppRequest setTemplateFileId(Long templateFileId) {
        this.templateFileId = templateFileId;
        return this;
    }
    public Long getTemplateFileId() {
        return this.templateFileId;
    }

}
