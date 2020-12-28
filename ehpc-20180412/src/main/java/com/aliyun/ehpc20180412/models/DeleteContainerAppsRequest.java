// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteContainerAppsRequest extends TeaModel {
    @NameInMap("ContainerApp")
    public java.util.List<DeleteContainerAppsRequestContainerApp> containerApp;

    public static DeleteContainerAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerAppsRequest self = new DeleteContainerAppsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContainerAppsRequest setContainerApp(java.util.List<DeleteContainerAppsRequestContainerApp> containerApp) {
        this.containerApp = containerApp;
        return this;
    }
    public java.util.List<DeleteContainerAppsRequestContainerApp> getContainerApp() {
        return this.containerApp;
    }

    public static class DeleteContainerAppsRequestContainerApp extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static DeleteContainerAppsRequestContainerApp build(java.util.Map<String, ?> map) throws Exception {
            DeleteContainerAppsRequestContainerApp self = new DeleteContainerAppsRequestContainerApp();
            return TeaModel.build(map, self);
        }

        public DeleteContainerAppsRequestContainerApp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
