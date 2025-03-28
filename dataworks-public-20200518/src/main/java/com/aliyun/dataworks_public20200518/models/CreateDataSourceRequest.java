// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    /**
     * <p>The details of the data source. Examples of details of some common data sources:</p>
     * <ul>
     * <li><p>odps</p>
     * <pre><code>{
     *   &quot;accessId&quot;: &quot;*****&quot;,
     *   &quot;accessKey&quot;: &quot;*****&quot;,
     *   &quot;authType&quot;: 2,
     *   &quot;endpoint&quot;: &quot;http://service.odps.aliyun.com/api&quot;,
     *   &quot;project&quot;: &quot;xsaxsax&quot;,
     *   &quot;tag&quot;: &quot;public&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>mysql</p>
     * <pre><code>{
     *   &quot;database&quot;: &quot;xsaxsa&quot;,
     *   &quot;instanceName&quot;: &quot;rm-xsaxsa&quot;,
     *   &quot;password&quot;: &quot;xsaxsa&quot;,
     *   &quot;rdsOwnerId&quot;: &quot;xasxsa&quot;,
     *   &quot;regionId&quot;: &quot;cn-shanghai&quot;,
     *   &quot;tag&quot;: &quot;rds&quot;,
     *   &quot;username&quot;: &quot;xsaxsa&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>rds</p>
     * <pre><code>{
     *   &quot;configType&quot;: 1,
     *   &quot;tag&quot;: &quot;rds&quot;,
     *   &quot;database&quot;: &quot;xsaxsa&quot;,
     *   &quot;username&quot;: &quot;xsaxsa&quot;,
     *   &quot;password&quot;: &quot;xssaxsa$32050&quot;,
     *   &quot;instanceName&quot;: &quot;rm-xsaxs&quot;,
     *   &quot;rdsOwnerId&quot;: &quot;11111111&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>oss</p>
     * <pre><code>{
     *   &quot;accessId&quot;: &quot;*****&quot;,
     *   &quot;accessKey&quot;: &quot;*****&quot;,
     *   &quot;bucket&quot;: &quot;xsa-xs-xs&quot;,
     *   &quot;endpoint&quot;: &quot;http://oss-cn-shanghai.aliyuncs.com&quot;,
     *   &quot;tag&quot;: &quot;public&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>sqlserver</p>
     * <pre><code>{
     *   &quot;jdbcUrl&quot;: &quot;jdbc:sqlserver://xsaxsa-xsaxsa.database.xxx.cn:123;DatabaseName=xsxs-xsxs&quot;,
     *   &quot;password&quot;: &quot;sdasda$fs&quot;,
     *   &quot;tag&quot;: &quot;public&quot;,
     *   &quot;username&quot;: &quot;sxaxacdacdd&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>polardb</p>
     * <pre><code>{
     *   &quot;clusterId&quot;: &quot;pc-sdadsadsa&quot;,
     *   &quot;database&quot;: &quot;dsadsadsa&quot;,
     *   &quot;ownerId&quot;: &quot;121212122&quot;,
     *   &quot;password&quot;: &quot;sdasdafssa&quot;,
     *   &quot;region&quot;: &quot;cn-shanghai&quot;,
     *   &quot;tag&quot;: &quot;polardb&quot;,
     *   &quot;username&quot;: &quot;asdadsads&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>redis</p>
     * <pre><code>{    
     * &quot;password&quot;: &quot;xxxxxx&quot;,   
     *  &quot;address&quot;:&quot;[{\\&quot;host\\&quot;:\\&quot;xxxxxxx.redis.rds.aliyuncs.com\\&quot;,\\&quot;port\\&quot;:6379}]&quot;,    
     * &quot;tag&quot;: &quot;public&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>oracle</p>
     * <pre><code>{
     *   &quot;jdbcUrl&quot;: &quot;jdbc:oracle:saaa:@xxxxx:1521:PROD&quot;,
     *   &quot;password&quot;: &quot;sxasaxsa&quot;,
     *   &quot;tag&quot;: &quot;public&quot;,
     *   &quot;username&quot;: &quot;sasfadfa&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>mongodb</p>
     * <pre><code>{
     *   &quot;address&quot;: &quot;[\\&quot;xsaxxsa.mongodb.rds.aliyuncs.com:3717\\&quot;]&quot;,
     *   &quot;database&quot;: &quot;admin&quot;,
     *   &quot;password&quot;: &quot;sadsda@&quot;,
     *   &quot;tag&quot;: &quot;public&quot;,
     *   &quot;username&quot;: &quot;dsadsadas&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>emr</p>
     * <pre><code>{
     *   &quot;accessId&quot;: &quot;*****&quot;,
     *   &quot;emrClusterId&quot;: &quot;C-dsads&quot;,
     *   &quot;emrResourceQueueName&quot;: &quot;default&quot;,
     *   &quot;emrEndpoint&quot;: &quot;emr.aliyuncs.com&quot;,
     *   &quot;accessKey&quot;: &quot;*****&quot;,
     *   &quot;emrUserId&quot;: &quot;224833315798889783&quot;,
     *   &quot;name&quot;: &quot;sasdsadsa&quot;,
     *   &quot;emrAccessMode&quot;: &quot;simple&quot;,
     *   &quot;region&quot;: &quot;cn-shanghai&quot;,
     *   &quot;authType&quot;: &quot;2&quot;,
     *   &quot;emrProjectId&quot;: &quot;FP-sdadsad&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>postgresql</p>
     * <pre><code>{
     *   &quot;jdbcUrl&quot;: &quot;jdbc:postgresql://xxxx:1921/ssss&quot;,
     *   &quot;password&quot;: &quot;sdadsads&quot;,
     *   &quot;tag&quot;: &quot;public&quot;,
     *   &quot;username&quot;: &quot;sdsasda&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>analyticdb_for_mysql</p>
     * <pre><code>{
     *   &quot;instanceId&quot;: &quot;am-sadsada&quot;,
     *   &quot;database&quot;: &quot;xsxsx&quot;,
     *   &quot;username&quot;: &quot;xsxsa&quot;,
     *   &quot;password&quot;: &quot;asdadsa&quot;,
     *   &quot;connectionString&quot;: &quot;am-xssxsxs.ads.aliyuncs.com:3306&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>hybriddb_for_postgresql</p>
     * <pre><code>{
     *   &quot;connectionString&quot;: &quot;gp-xsaxsaxa-master.gpdbmaster.rds.aliyuncs.com&quot;,
     *   &quot;database&quot;: &quot;xsaxsaxas&quot;,
     *   &quot;password&quot;: &quot;xsaxsaxsa@11&quot;,
     *   &quot;instanceId&quot;: &quot;gp-xsaxsaxsa&quot;,
     *   &quot;port&quot;: &quot;541132&quot;,
     *   &quot;ownerId&quot;: &quot;xsaxsaxsas&quot;,
     *   &quot;username&quot;: &quot;sadsad&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>holo</p>
     * <pre><code>{
     *   &quot;accessId&quot;: &quot;*****&quot;,
     *   &quot;accessKey&quot;: &quot;*****&quot;,
     *   &quot;database&quot;: &quot;xsaxsaxsa&quot;,
     *   &quot;instanceId&quot;: &quot;xsaxa&quot;,
     *   &quot;tag&quot;: &quot;aliyun&quot;
     * }
     * </code></pre>
     * </li>
     * <li><p>kafka</p>
     * <pre><code>{
     *   &quot;instanceId&quot;: &quot;xsax-cn-xsaxsa&quot;,
     *   &quot;regionId&quot;: &quot;cn-shanghai&quot;,
     *   &quot;tag&quot;: &quot;aliyun&quot;,
     *   &quot;ownerId&quot;: &quot;1212121212112&quot;
     * }
     * </code></pre>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;database&quot;:&quot;dbname&quot;,&quot;instanceName&quot;:&quot;instancename&quot;,&quot;password&quot;:&quot;password&quot;,&quot;rdsOwnerId&quot;:&quot;123&quot;,&quot;username&quot;:&quot;username&quot;}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li>odps</li>
     * <li>mysql</li>
     * <li>rds</li>
     * <li>oss</li>
     * <li>sqlserver</li>
     * <li>polardb</li>
     * <li>oracle</li>
     * <li>mongodb</li>
     * <li>emr</li>
     * <li>postgresql</li>
     * <li>analyticdb_for_mysql</li>
     * <li>hybriddb_for_postgresql</li>
     * <li>holo</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The description of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The environment in which the data source is used. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The name of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace to which the data source belongs. You can call the <a href="https://help.aliyun.com/document_detail/2780068.html">ListProjects</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The subtype of the data source.</p>
     * <ul>
     * <li>This parameter takes effect only if you set the DataSourceType parameter to rds.</li>
     * <li>If the DataSourceType parameter is set to rds, this parameter can be set to mysql, sqlserver, or postgresql.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("SubType")
    public String subType;

    public static CreateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceRequest self = new CreateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataSourceRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public CreateDataSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataSourceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataSourceRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
