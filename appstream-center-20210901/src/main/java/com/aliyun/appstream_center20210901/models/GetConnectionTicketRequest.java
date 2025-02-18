// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetConnectionTicketRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <p> This parameter is required for the first call to this operation and optional for subsequent calls to the operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ca-e4s0puhmwi7v****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The delivery groups.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you configure this parameter, the system assigns application instances only among the specified authorized delivery groups.</p>
     * </li>
     * <li><p>This parameter is required if you configure <code>AppInstanceId</code> or <code>AppInstancePersistentId</code>.</p>
     * </li>
     * </ul>
     */
    @NameInMap("AppInstanceGroupIdList")
    public java.util.List<String> appInstanceGroupIdList;

    /**
     * <p>The ID of the application instance.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you configure this parameter, the system attempts to assign only the specified application instance.</p>
     * </li>
     * <li><p>If you configure this parameter, you must also configure <code>AppInstanceGroupIdList</code> and the number of delivery groups specified by <code>AppInstanceGroupIdList</code> must be 1.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ai-1rznfnrvsa99d****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The ID of the persistent session.</p>
     * 
     * <strong>example:</strong>
     * <p>p-0bxls9m3cl7s****</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <p>The parameters that are configured to start the application. For information about how to obtain these parameters, see <a href="https://help.aliyun.com/zh/wuying-appstreaming/user-guide/create-an-application?#how-to-get-installation-and-startup-para">Obtain parameters configured to install and start an application</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>/q /n</p>
     */
    @NameInMap("AppStartParam")
    public String appStartParam;

    /**
     * <p>The application version. If you configure this parameter, only an application of the specified version is started. If you do not configure this parameter, an application of a random authorized version is started.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p> If you configure this parameter, the system assigns application instances only among the delivery groups that reside in the specified region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The ID of the convenience account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The product type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * <li>AndroidCloud: Cloud Phone</li>
     * </ul>
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
     * <p> This parameter is required for calls other than the first call to this operation. You can use this parameter to query the task status and connection credential.</p>
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
