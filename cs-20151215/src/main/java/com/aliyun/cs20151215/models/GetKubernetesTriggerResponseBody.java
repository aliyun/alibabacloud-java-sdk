// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetKubernetesTriggerResponseBody extends TeaModel {
    // 触发器详情。
    @NameInMap("triggers")
    public java.util.List<GetKubernetesTriggerResponseBodyTriggers> triggers;

    public static GetKubernetesTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKubernetesTriggerResponseBody self = new GetKubernetesTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKubernetesTriggerResponseBody setTriggers(java.util.List<GetKubernetesTriggerResponseBodyTriggers> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<GetKubernetesTriggerResponseBodyTriggers> getTriggers() {
        return this.triggers;
    }

    public static class GetKubernetesTriggerResponseBodyTriggers extends TeaModel {
        // 触发器行为。
        @NameInMap("action")
        public String action;

        // 集群ID。
        @NameInMap("cluster_id")
        public String clusterId;

        // 触发器ID。
        @NameInMap("id")
        public String id;

        // 项目ID，格式为：${namepsce}/${应用名}，
        @NameInMap("project_id")
        public String projectId;

        // 触发器Token。
        @NameInMap("token")
        public String token;

        public static GetKubernetesTriggerResponseBodyTriggers build(java.util.Map<String, ?> map) throws Exception {
            GetKubernetesTriggerResponseBodyTriggers self = new GetKubernetesTriggerResponseBodyTriggers();
            return TeaModel.build(map, self);
        }

        public GetKubernetesTriggerResponseBodyTriggers setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetKubernetesTriggerResponseBodyTriggers setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetKubernetesTriggerResponseBodyTriggers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetKubernetesTriggerResponseBodyTriggers setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetKubernetesTriggerResponseBodyTriggers setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
