// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class CancelVideoTaskRequest extends TeaModel {
    @NameInMap("App")
    public CancelVideoTaskRequestApp app;

    @NameInMap("TaskUuid")
    public String taskUuid;

    @NameInMap("TenantId")
    public Long tenantId;

    public static CancelVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelVideoTaskRequest self = new CancelVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelVideoTaskRequest setApp(CancelVideoTaskRequestApp app) {
        this.app = app;
        return this;
    }
    public CancelVideoTaskRequestApp getApp() {
        return this.app;
    }

    public CancelVideoTaskRequest setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
        return this;
    }
    public String getTaskUuid() {
        return this.taskUuid;
    }

    public CancelVideoTaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public static class CancelVideoTaskRequestApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static CancelVideoTaskRequestApp build(java.util.Map<String, ?> map) throws Exception {
            CancelVideoTaskRequestApp self = new CancelVideoTaskRequestApp();
            return TeaModel.build(map, self);
        }

        public CancelVideoTaskRequestApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
