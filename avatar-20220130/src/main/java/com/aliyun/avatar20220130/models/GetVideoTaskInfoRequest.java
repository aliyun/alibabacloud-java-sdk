// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class GetVideoTaskInfoRequest extends TeaModel {
    @NameInMap("App")
    public GetVideoTaskInfoRequestApp app;

    @NameInMap("TaskUuid")
    public String taskUuid;

    @NameInMap("TenantId")
    public Long tenantId;

    public static GetVideoTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTaskInfoRequest self = new GetVideoTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoTaskInfoRequest setApp(GetVideoTaskInfoRequestApp app) {
        this.app = app;
        return this;
    }
    public GetVideoTaskInfoRequestApp getApp() {
        return this.app;
    }

    public GetVideoTaskInfoRequest setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
        return this;
    }
    public String getTaskUuid() {
        return this.taskUuid;
    }

    public GetVideoTaskInfoRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public static class GetVideoTaskInfoRequestApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static GetVideoTaskInfoRequestApp build(java.util.Map<String, ?> map) throws Exception {
            GetVideoTaskInfoRequestApp self = new GetVideoTaskInfoRequestApp();
            return TeaModel.build(map, self);
        }

        public GetVideoTaskInfoRequestApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
