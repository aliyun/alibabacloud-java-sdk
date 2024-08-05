// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportOASRequest extends TeaModel {
    /**
     * <p>The security authentication method of the API. Valid values:</p>
     * <ul>
     * <li><p><strong>APP: Only authorized applications can call the API.</strong></p>
     * </li>
     * <li><p><strong>ANONYMOUS: The API can be anonymously called. In this mode, you must take note of the following rules:</strong></p>
     * <ul>
     * <li>All users who have obtained the API service information can call this API. API Gateway does not authenticate callers and cannot set user-specific throttling policies. If you make this API public, set API-specific throttling policies.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The name of the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>testBackendService</p>
     */
    @NameInMap("BackendName")
    public String backendName;

    /**
     * <p>The OAS-compliant text file or OSS object URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>swagger: &quot;2.0&quot;
     * info:
     *   version: &quot;1.0.0&quot;
     *   title: &quot;Swagger Petstore 2.0&quot;
     * basePath: &quot;/&quot;
     * schemes:</p>
     * <ul>
     * <li>&quot;https&quot;</li>
     * <li>&quot;http&quot;
     * paths:
     * /pet/findByStatus:
     *   get:
     * tags:
     * - &quot;pet&quot;
     * summary: &quot;Finds Pets by status&quot;
     * operationId: &quot;findPetsByStatus&quot;
     * parameters:
     * - name: &quot;status&quot;
     *   in: &quot;query&quot;
     *   required: true
     *   type: &quot;array&quot;
     *   items:
     *     type: &quot;string&quot;
     *     enum:
     *     - &quot;available&quot;
     *     - &quot;pending&quot;
     *     - &quot;sold&quot;
     *     default: &quot;available&quot;
     *   collectionFormat: &quot;multi&quot;
     * responses:
     *   &quot;200&quot;:
     *     description: &quot;successful operation&quot;
     *     schema:
     *       type: &quot;array&quot;
     *       items:
     *         $ref: &quot;#/definitions/Pet&quot;
     *   &quot;400&quot;:
     *     description: &quot;Invalid status value&quot;</li>
     * </ul>
     * <p>definitions:
     *   Category:
     *     type: &quot;object&quot;
     *     properties:
     *       id:
     *         type: &quot;integer&quot;
     *         format: &quot;int64&quot;
     *       name:
     *         type: &quot;string&quot;
     *   Tag:
     *     type: &quot;object&quot;
     *     properties:
     *       id:
     *         type: &quot;integer&quot;
     *         format: &quot;int64&quot;
     *       name:
     *         type: &quot;string&quot;
     *   Pet:
     *     type: &quot;object&quot;
     *     required:
     *     - &quot;name&quot;
     *     - &quot;photoUrls&quot;
     *     properties:
     *       id:
     *         type: &quot;integer&quot;
     *         format: &quot;int64&quot;
     *       category:
     *         $ref: &quot;#/definitions/Category&quot;
     *       name:
     *         type: &quot;string&quot;
     *         example: &quot;doggie&quot;
     *       photoUrls:
     *         type: &quot;array&quot;
     *         items:
     *           type: &quot;string&quot;
     *       tags:
     *         type: &quot;array&quot;
     *         items:
     *           $ref: &quot;#/definitions/Tag&quot;
     *       status:
     *         type: &quot;string&quot;
     *         description: &quot;pet status in the store&quot;
     *         enum:
     *         - &quot;available&quot;
     *         - &quot;pending&quot;
     *         - &quot;sold&quot;</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the API group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>08ae4aa0f95e4321849ee57f4e0b3077</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies whether to ignore alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IgnoreWarning")
    public Boolean ignoreWarning;

    /**
     * <p>The OAS version.</p>
     * 
     * <strong>example:</strong>
     * <p>OAS2</p>
     */
    @NameInMap("OASVersion")
    public String OASVersion;

    /**
     * <p>Specifies whether to overwrite an existing API.</p>
     * <p>If an existing API has the same HTTP request type and backend request path as the API to be imported, the existing API is overwritten.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <p>The request mode. Valid values:</p>
     * <ul>
     * <li>MAPPING: Parameters are mapped. Unknown parameters are filtered out.</li>
     * <li>PASSTHROUGH: Parameters are passed through.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PASSTHROUGH</p>
     */
    @NameInMap("RequestMode")
    public String requestMode;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specifies whether to directly import the API without performing a precheck.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SkipDryRun")
    public Boolean skipDryRun;

    public static ImportOASRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportOASRequest self = new ImportOASRequest();
        return TeaModel.build(map, self);
    }

    public ImportOASRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ImportOASRequest setBackendName(String backendName) {
        this.backendName = backendName;
        return this;
    }
    public String getBackendName() {
        return this.backendName;
    }

    public ImportOASRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ImportOASRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ImportOASRequest setIgnoreWarning(Boolean ignoreWarning) {
        this.ignoreWarning = ignoreWarning;
        return this;
    }
    public Boolean getIgnoreWarning() {
        return this.ignoreWarning;
    }

    public ImportOASRequest setOASVersion(String OASVersion) {
        this.OASVersion = OASVersion;
        return this;
    }
    public String getOASVersion() {
        return this.OASVersion;
    }

    public ImportOASRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public ImportOASRequest setRequestMode(String requestMode) {
        this.requestMode = requestMode;
        return this;
    }
    public String getRequestMode() {
        return this.requestMode;
    }

    public ImportOASRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ImportOASRequest setSkipDryRun(Boolean skipDryRun) {
        this.skipDryRun = skipDryRun;
        return this;
    }
    public Boolean getSkipDryRun() {
        return this.skipDryRun;
    }

}
