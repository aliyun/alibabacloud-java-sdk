// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiRequest extends TeaModel {
    /**
     * <p>The description of the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test API description</p>
     */
    @NameInMap("ApiDescription")
    public String apiDescription;

    /**
     * <p>The type of the API. Valid values: 0 (wizard API), 1 (script API), and 2 (registration API).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ApiMode")
    public Integer apiMode;

    /**
     * <p>The name of the API. The name can contain Chinese characters, letters, digits, and underscores (_), and must start with a letter or a Chinese character. The name must be 4 to 50 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test API name</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The path of the API. The path can contain letters, digits, underscores (_), and hyphens (-), and must start with a forward slash (/). The path cannot exceed 200 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/1</p>
     */
    @NameInMap("ApiPath")
    public String apiPath;

    /**
     * <p>The ID of the destination folder in which the API is created. The ID of the root folder under a business process is 0. The ID of a user-created folder is greater than 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FolderId")
    public Long folderId;

    /**
     * <p>The ID of the business process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Business process ID</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The protocol of the API. Valid values: 0 (HTTP) and 1 (HTTPS). Multiple values are supported. Separate multiple values with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0,1</p>
     */
    @NameInMap("Protocols")
    public String protocols;

    /**
     * <p>The details of the registration API. For more information, see the JSON string of the registrationDetails field in the <a href="https://help.aliyun.com/document_detail/174013.html">GetDataServiceApi</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;failedResultSample&quot;:&quot;fail&quot;,&quot;registrationErrorCodes&quot;:[{&quot;errorCode&quot;:&quot;e1&quot;,&quot;errorMessage&quot;:&quot;msg1&quot;,&quot;errorSolution&quot;:&quot;sol1&quot;},{&quot;errorCode&quot;:&quot;e2&quot;,&quot;errorMessage&quot;:&quot;msg2&quot;,&quot;errorSolution&quot;:&quot;sol2&quot;}],&quot;registrationRequestParameters&quot;:[{&quot;columnName&quot;:&quot;&quot;,&quot;defaultValue&quot;:&quot;&quot;,&quot;exampleValue&quot;:&quot;&quot;,&quot;isRequiredParameter&quot;:true,&quot;parameterDataType&quot;:0,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;id&quot;,&quot;parameterOperator&quot;:0,&quot;parameterPosition&quot;:1},{&quot;columnName&quot;:&quot;&quot;,&quot;defaultValue&quot;:&quot;xx&quot;,&quot;exampleValue&quot;:&quot;&quot;,&quot;isRequiredParameter&quot;:true,&quot;parameterDataType&quot;:0,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;cc&quot;,&quot;parameterOperator&quot;:2,&quot;parameterPosition&quot;:2}],&quot;serviceContentType&quot;:1,&quot;serviceHost&quot;:&quot;<a href="http://www.baidu.com%22,%22servicePath%22:%22/%5Buid%5D%22,%22serviceRequestBodyDescription%22:%22body%22,%22successfulResultSample%22:%22success%22%7D">http://www.baidu.com&quot;,&quot;servicePath&quot;:&quot;/[uid]&quot;,&quot;serviceRequestBodyDescription&quot;:&quot;body&quot;,&quot;successfulResultSample&quot;:&quot;success&quot;}</a></p>
     */
    @NameInMap("RegistrationDetails")
    public String registrationDetails;

    /**
     * <p>The request content type. Valid values:</p>
     * <ul>
     * <li><p>0: XML</p>
     * </li>
     * <li><p>1: JSON</p>
     * </li>
     * <li><p>2: form</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RequestContentType")
    public Integer requestContentType;

    /**
     * <p>The request method of the API. Valid values: 0 (GET), 1 (POST), 2 (PUT), and 3 (DELETE). Wizard and script APIs support GET and POST. Registration APIs support GET, POST, PUT, and DELETE.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RequestMethod")
    public Integer requestMethod;

    /**
     * <p>The ID of the exclusive resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>3242432423</p>
     */
    @NameInMap("ResourceGroupId")
    public Long resourceGroupId;

    /**
     * <p>The response data type of the API. Valid values: 0 (JSON) and 1 (XML). Wizard and script APIs support JSON. Registration APIs support JSON and XML.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ResponseContentType")
    public Integer responseContentType;

    /**
     * <p>The details of the script API. For more information, see the JSON string of the scriptDetails field in the <a href="https://help.aliyun.com/document_detail/174013.html">GetDataServiceApi</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;isPagedResponse&quot;:false,&quot;script&quot;:&quot;select id as id1, name as name1 from person where id=${inputid}&quot;,&quot;scriptConnection&quot;:{&quot;connectionId&quot;:122786,&quot;tableName&quot;:&quot;person&quot;},&quot;scriptRequestParameters&quot;:[{&quot;defaultValue&quot;:&quot;&quot;,&quot;exampleValue&quot;:&quot;&quot;,&quot;isRequiredParameter&quot;:true,&quot;parameterDataType&quot;:0,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;inputid&quot;,&quot;parameterOperator&quot;:0,&quot;parameterPosition&quot;:1}],&quot;scriptResponseParameters&quot;:[{&quot;exampleValue&quot;:&quot;&quot;,&quot;parameterDataType&quot;:0,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;id1&quot;},{&quot;exampleValue&quot;:&quot;&quot;,&quot;parameterDataType&quot;:0,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;name1&quot;}]}</p>
     */
    @NameInMap("ScriptDetails")
    public String scriptDetails;

    /**
     * <ul>
     * <li><p>0: basic mode.</p>
     * </li>
     * <li><p>1: MyBatis mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SqlMode")
    public Long sqlMode;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    /**
     * <p>The timeout period, in milliseconds (ms). Valid values: (0, 30000].</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The visibility. Valid values: 0 (workspace) and 1 (private).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VisibleRange")
    public Integer visibleRange;

    /**
     * <p>The details of the wizard API. For more information, see the JSON string of the wizardDetails field in the <a href="https://help.aliyun.com/document_detail/174013.html">GetDataServiceApi</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;isPagedResponse&quot;:true,&quot;wizardConnection&quot;:{&quot;connectionId&quot;:122786,&quot;tableName&quot;:&quot;person&quot;},&quot;wizardRequestParameters&quot;:[{&quot;columnName&quot;:&quot;id&quot;,&quot;defaultValue&quot;:&quot;&quot;,&quot;exampleValue&quot;:&quot;1&quot;,&quot;isRequiredParameter&quot;:true,&quot;parameterDataType&quot;:2,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;id&quot;,&quot;parameterOperator&quot;:0,&quot;parameterPosition&quot;:0}],&quot;wizardResponseParameters&quot;:[{&quot;columnName&quot;:&quot;id&quot;,&quot;exampleValue&quot;:&quot;11&quot;,&quot;parameterDataType&quot;:2,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;id&quot;}]}</p>
     */
    @NameInMap("WizardDetails")
    public String wizardDetails;

    public static CreateDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceApiRequest self = new CreateDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceApiRequest setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
        return this;
    }
    public String getApiDescription() {
        return this.apiDescription;
    }

    public CreateDataServiceApiRequest setApiMode(Integer apiMode) {
        this.apiMode = apiMode;
        return this;
    }
    public Integer getApiMode() {
        return this.apiMode;
    }

    public CreateDataServiceApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public CreateDataServiceApiRequest setApiPath(String apiPath) {
        this.apiPath = apiPath;
        return this;
    }
    public String getApiPath() {
        return this.apiPath;
    }

    public CreateDataServiceApiRequest setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public CreateDataServiceApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateDataServiceApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataServiceApiRequest setProtocols(String protocols) {
        this.protocols = protocols;
        return this;
    }
    public String getProtocols() {
        return this.protocols;
    }

    public CreateDataServiceApiRequest setRegistrationDetails(String registrationDetails) {
        this.registrationDetails = registrationDetails;
        return this;
    }
    public String getRegistrationDetails() {
        return this.registrationDetails;
    }

    public CreateDataServiceApiRequest setRequestContentType(Integer requestContentType) {
        this.requestContentType = requestContentType;
        return this;
    }
    public Integer getRequestContentType() {
        return this.requestContentType;
    }

    public CreateDataServiceApiRequest setRequestMethod(Integer requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
    public Integer getRequestMethod() {
        return this.requestMethod;
    }

    public CreateDataServiceApiRequest setResourceGroupId(Long resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public Long getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDataServiceApiRequest setResponseContentType(Integer responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public Integer getResponseContentType() {
        return this.responseContentType;
    }

    public CreateDataServiceApiRequest setScriptDetails(String scriptDetails) {
        this.scriptDetails = scriptDetails;
        return this;
    }
    public String getScriptDetails() {
        return this.scriptDetails;
    }

    public CreateDataServiceApiRequest setSqlMode(Long sqlMode) {
        this.sqlMode = sqlMode;
        return this;
    }
    public Long getSqlMode() {
        return this.sqlMode;
    }

    public CreateDataServiceApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public CreateDataServiceApiRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public CreateDataServiceApiRequest setVisibleRange(Integer visibleRange) {
        this.visibleRange = visibleRange;
        return this;
    }
    public Integer getVisibleRange() {
        return this.visibleRange;
    }

    public CreateDataServiceApiRequest setWizardDetails(String wizardDetails) {
        this.wizardDetails = wizardDetails;
        return this;
    }
    public String getWizardDetails() {
        return this.wizardDetails;
    }

}
