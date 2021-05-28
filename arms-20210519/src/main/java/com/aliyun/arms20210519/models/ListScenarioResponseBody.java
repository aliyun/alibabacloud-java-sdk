// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ListScenarioResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ArmsScenarios")
    public java.util.List<ListScenarioResponseBodyArmsScenarios> armsScenarios;

    public static ListScenarioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScenarioResponseBody self = new ListScenarioResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScenarioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScenarioResponseBody setArmsScenarios(java.util.List<ListScenarioResponseBodyArmsScenarios> armsScenarios) {
        this.armsScenarios = armsScenarios;
        return this;
    }
    public java.util.List<ListScenarioResponseBodyArmsScenarios> getArmsScenarios() {
        return this.armsScenarios;
    }

    public static class ListScenarioResponseBodyArmsScenarios extends TeaModel {
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Extensions")
        public String extensions;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RegionId")
        public String regionId;

        public static ListScenarioResponseBodyArmsScenarios build(java.util.Map<String, ?> map) throws Exception {
            ListScenarioResponseBodyArmsScenarios self = new ListScenarioResponseBodyArmsScenarios();
            return TeaModel.build(map, self);
        }

        public ListScenarioResponseBodyArmsScenarios setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListScenarioResponseBodyArmsScenarios setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListScenarioResponseBodyArmsScenarios setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public ListScenarioResponseBodyArmsScenarios setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListScenarioResponseBodyArmsScenarios setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListScenarioResponseBodyArmsScenarios setExtensions(String extensions) {
            this.extensions = extensions;
            return this;
        }
        public String getExtensions() {
            return this.extensions;
        }

        public ListScenarioResponseBodyArmsScenarios setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScenarioResponseBodyArmsScenarios setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListScenarioResponseBodyArmsScenarios setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
