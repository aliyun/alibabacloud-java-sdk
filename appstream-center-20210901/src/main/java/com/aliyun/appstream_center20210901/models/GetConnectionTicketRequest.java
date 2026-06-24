// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetConnectionTicketRequest extends TeaModel {
    /**
     * <p>The access type. If you do not specify this parameter, both types are displayed. Valid values:</p>
     * <ul>
     * <li>INTERNET: Internet access.</li>
     * <li>VPC: Express Connect access.</li>
     * </ul>
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
     * <p>This parameter is required for the initial call and optional for subsequent calls.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ca-e4s0puhmwi7v****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The list of delivery groups.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify this parameter, application instances are allocated only from the specified authorized delivery groups.</li>
     * <li>If you specify the <code>AppInstanceId</code> or <code>AppInstancePersistentId</code> parameter, this parameter is required.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("AppInstanceGroupIdList")
    public java.util.List<String> appInstanceGroupIdList;

    /**
     * <p>The application instance ID.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify this parameter, only the specified application instance is allocated.</li>
     * <li>If you specify this parameter, you must also specify the <code>AppInstanceGroupIdList</code> parameter, and the number of delivery group IDs in <code>AppInstanceGroupIdList</code> must be 1.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ai-1rznfnrvsa99d****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The persistent session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p-0bxls9m3cl7s****</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    @NameInMap("AppPolicyId")
    public String appPolicyId;

    /**
     * <p>The application startup parameter. For information about how to obtain startup parameters, see <a href="https://help.aliyun.com/document_detail/426045.html">How to obtain application installation and startup parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>/q /n</p>
     */
    @NameInMap("AppStartParam")
    public String appStartParam;

    /**
     * <p>The application version. If you specify this parameter, only the specified version of the application is opened. If you do not specify this parameter, any authorized version of the application is opened.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>If you specify this parameter, application instances are allocated only from delivery groups in the specified region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The environment configuration.</p>
     */
    @NameInMap("EnvironmentConfig")
    public String environmentConfig;

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
     * <p>The task ID.</p>
     * <blockquote>
     * <p>This request parameter is required for non-initial invokes. Use this parameter to check the task status and connection credentials.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>28778acb-a469-4bc0-8e0f****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

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

    public GetConnectionTicketRequest setAppInstanceGroupIdList(java.util.List<String> appInstanceGroupIdList) {
        this.appInstanceGroupIdList = appInstanceGroupIdList;
        return this;
    }
    public java.util.List<String> getAppInstanceGroupIdList() {
        return this.appInstanceGroupIdList;
    }

    public GetConnectionTicketRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public GetConnectionTicketRequest setAppInstancePersistentId(String appInstancePersistentId) {
        this.appInstancePersistentId = appInstancePersistentId;
        return this;
    }
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    public GetConnectionTicketRequest setAppPolicyId(String appPolicyId) {
        this.appPolicyId = appPolicyId;
        return this;
    }
    public String getAppPolicyId() {
        return this.appPolicyId;
    }

    public GetConnectionTicketRequest setAppStartParam(String appStartParam) {
        this.appStartParam = appStartParam;
        return this;
    }
    public String getAppStartParam() {
        return this.appStartParam;
    }

    public GetConnectionTicketRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetConnectionTicketRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
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

    public GetConnectionTicketRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetConnectionTicketRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
