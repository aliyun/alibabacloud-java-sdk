// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetConnectionTicketRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppInstanceGroupIdList")
    public java.util.List<String> appInstanceGroupIdList;

    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    @NameInMap("AppStartParam")
    public String appStartParam;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("ProductType")
    public String productType;

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
