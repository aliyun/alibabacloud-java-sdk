// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class GetConnectionTicketRequest extends TeaModel {
    /**
     * <p>The access type. If this parameter is not passed, both types are displayed. Valid values: INTERNET (Internet) and VPC (Express Connect circuit).</p>
     * 
     * <strong>example:</strong>
     * <p>INTERNET</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <p>Required for the first call, and optional for subsequent calls.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ca-etn4zizga******</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The delivery group ID.</p>
     * <blockquote>
     * <ul>
     * <li>When this parameter is passed, an application instance is assigned only from the specified and authorized delivery groups.</li>
     * <li>When the AppInstanceId parameter is passed, this parameter is required.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aig-bw1o1gcwv******</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The application instance ID.</p>
     * <blockquote>
     * <ul>
     * <li>When this parameter is passed, the system only attempts to assign the specified application instance.</li>
     * <li>When this parameter is passed, the AppInstanceGroupId parameter must also be passed.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ai-ij4a6kd4bn2******</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-0clfzcy0adpcf****</p>
     */
    @NameInMap("AppPolicyId")
    public String appPolicyId;

    /**
     * <p>The application version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.1</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>Specifies whether to automatically connect when the turn is reached.</p>
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoConnectInQueue")
    public Boolean autoConnectInQueue;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>When this parameter is passed, an application instance is assigned only from the delivery groups in the specified region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The client ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f2463208-ec89-4309-8e8c-8b1******</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>22.21.<em>.</em></p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The client operating system.</p>
     * 
     * <strong>example:</strong>
     * <p>windows_&quot;Windows 10 Enterprise LTSC 2019&quot; 10.0 (Build 17763)</p>
     */
    @NameInMap("ClientOS")
    public String clientOS;

    /**
     * <p>The client type.</p>
     * 
     * <strong>example:</strong>
     * <p>html5</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <p>The client version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.1-D-20211008.101607</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The connection properties in JSON format.
     * The following parameters are supported:</p>
     * <ul>
     * <li>authMode: the authorization mode, which is determined based on the authorization mode of the delivery group. Valid values: App (application authorization), AppInstanceGroup (delivery group authorization), and Session (persistent session authorization).</li>
     * <li>appInstanceGroupScheduleTags: the delivery group scheduling tags. Multiple tag key-value pairs are supported for filtering. Multiple tag pairs have an AND relationship. The key must have a value, and the value can be empty. Format example: [{&quot;key&quot;:&quot;Resolution&quot;,&quot;value&quot;:&quot;720p&quot;},{&quot;key&quot;:&quot;Name&quot;}].</li>
     * <li>appInstanceGroupIds: the list of specified delivery group IDs.</li>
     * <li>appInstancePersistentId: the specified persistent session ID.</li>
     * <li>avatarId: the user avatar ID. Default value: default. This parameter is used to support assigning multiple session instances to a single user.</li>
     * </ul>
     * <blockquote>
     * <p>Used when connecting to a cloud phone. Pass the fixed value <code>{&quot;authMode&quot;:&quot;Session&quot;}</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;authMode&quot;:&quot;Session&quot;}</p>
     */
    @NameInMap("ConnectionProperties")
    public String connectionProperties;

    /**
     * <p>The username of the convenience account.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The environment configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;screenWidth&quot;:2560,&quot;screenHeight&quot;:1564}</p>
     */
    @NameInMap("EnvironmentConfig")
    public String environmentConfig;

    /**
     * <p>The logon region ID. When a user logs on to a workspace, this parameter specifies the ID of the region to which the workspace belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LoginRegionId")
    public String loginRegionId;

    /**
     * <p>The logon token.
     * Obtained by calling the GetLoginToken or GetStsToken API operation.
     * The GetLoginToken and GetStsToken API operations belong to the client logon authentication APIs of the 2021-02-20 version of WUYING Cloud App (product code: appstream-center). These two API operations are not provided in the 2021-09-03 version. OpenAPI Explorer links: <a href="https://api.aliyun.com/api/appstream-center/2021-02-20/GetLoginToken">https://api.aliyun.com/api/appstream-center/2021-02-20/GetLoginToken</a> and <a href="https://api.aliyun.com/api/appstream-center/2021-02-20/GetStsToken">https://api.aliyun.com/api/appstream-center/2021-02-20/GetStsToken</a>.
     * Note: This parameter is required. If it is not provided, the API returns InvalidParameter.loginToken(400).</p>
     * 
     * <strong>example:</strong>
     * <p>v2c4e2ef03d62******</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The application startup parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>/q /n</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The product type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Specifies whether UUID validation is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RequireUuidValidation")
    public Boolean requireUuidValidation;

    /**
     * <p>The resource ID.</p>
     * <blockquote>
     * <p>Used when connecting to a cloud phone. Pass the persistent session ID that corresponds to the cloud phone instance.
     * When connecting to a cloud browser, pass the cloud browser ID.
     * When connecting to a cloud application, pass the application ID for the application authorization scenario, the delivery group ID for the delivery group authorization scenario, or the persistent session ID for the persistent session authorization scenario.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>p-0cdr5c9kl******</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The logon session ID. Obtained by calling the GetLoginToken or GetStsToken API operation. This parameter is used together with LoginToken.
     * The GetLoginToken and GetStsToken API operations belong to the client logon authentication APIs of the 2021-02-20 version of WUYING Cloud App (product code: appstream-center). These two API operations are not provided in the 2021-09-03 version. OpenAPI Explorer links: <a href="https://api.aliyun.com/api/appstream-center/2021-02-20/GetLoginToken">https://api.aliyun.com/api/appstream-center/2021-02-20/GetLoginToken</a> and <a href="https://api.aliyun.com/api/appstream-center/2021-02-20/GetStsToken">https://api.aliyun.com/api/appstream-center/2021-02-20/GetStsToken</a>.
     * Note: This parameter is required. If it is not provided, the API returns InvalidParameter.sessionId(400). This parameter must be used together with LoginToken.</p>
     * 
     * <strong>example:</strong>
     * <p>09e2b2e6-3181******</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p>Required when you invoke the API not for the first time. Use this parameter query to check the node status and connection credentials.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6f41731b-7091-4******</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The tenant ID, which is the Alibaba Cloud account UID.</p>
     * 
     * <strong>example:</strong>
     * <p>1126819517******</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The unique identifier of the logon device.</p>
     * 
     * <strong>example:</strong>
     * <p>A8B35215993FBF283F28D61******</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetConnectionTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionTicketRequest self = new GetConnectionTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetConnectionTicketRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public GetConnectionTicketRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetConnectionTicketRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public GetConnectionTicketRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public GetConnectionTicketRequest setAppPolicyId(String appPolicyId) {
        this.appPolicyId = appPolicyId;
        return this;
    }
    public String getAppPolicyId() {
        return this.appPolicyId;
    }

    public GetConnectionTicketRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetConnectionTicketRequest setAutoConnectInQueue(Boolean autoConnectInQueue) {
        this.autoConnectInQueue = autoConnectInQueue;
        return this;
    }
    public Boolean getAutoConnectInQueue() {
        return this.autoConnectInQueue;
    }

    public GetConnectionTicketRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public GetConnectionTicketRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetConnectionTicketRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public GetConnectionTicketRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public GetConnectionTicketRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public GetConnectionTicketRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GetConnectionTicketRequest setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
    }
    public String getConnectionProperties() {
        return this.connectionProperties;
    }

    public GetConnectionTicketRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetConnectionTicketRequest setEnvironmentConfig(String environmentConfig) {
        this.environmentConfig = environmentConfig;
        return this;
    }
    public String getEnvironmentConfig() {
        return this.environmentConfig;
    }

    public GetConnectionTicketRequest setLoginRegionId(String loginRegionId) {
        this.loginRegionId = loginRegionId;
        return this;
    }
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    public GetConnectionTicketRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public GetConnectionTicketRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public GetConnectionTicketRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetConnectionTicketRequest setRequireUuidValidation(Boolean requireUuidValidation) {
        this.requireUuidValidation = requireUuidValidation;
        return this;
    }
    public Boolean getRequireUuidValidation() {
        return this.requireUuidValidation;
    }

    public GetConnectionTicketRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetConnectionTicketRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetConnectionTicketRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetConnectionTicketRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetConnectionTicketRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
