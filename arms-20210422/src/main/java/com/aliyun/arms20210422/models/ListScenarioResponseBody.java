// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListScenarioResponseBody extends TeaModel {
    @NameInMap("ArmsScenarios")
    public java.util.List<ListScenarioResponseBodyArmsScenarios> armsScenarios;

    @NameInMap("RequestId")
    public String requestId;

    public static ListScenarioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScenarioResponseBody self = new ListScenarioResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScenarioResponseBody setArmsScenarios(java.util.List<ListScenarioResponseBodyArmsScenarios> armsScenarios) {
        this.armsScenarios = armsScenarios;
        return this;
    }
    public java.util.List<ListScenarioResponseBodyArmsScenarios> getArmsScenarios() {
        return this.armsScenarios;
    }

    public ListScenarioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListScenarioResponseBodyArmsScenarios extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Extensions")
        public String extensions;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public String userId;

        public static ListScenarioResponseBodyArmsScenarios build(java.util.Map<String, ?> map) throws Exception {
            ListScenarioResponseBodyArmsScenarios self = new ListScenarioResponseBodyArmsScenarios();
            return TeaModel.build(map, self);
        }

        public ListScenarioResponseBodyArmsScenarios setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListScenarioResponseBodyArmsScenarios setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListScenarioResponseBodyArmsScenarios setExtensions(String extensions) {
            this.extensions = extensions;
            return this;
        }
        public String getExtensions() {
            return this.extensions;
        }

        public ListScenarioResponseBodyArmsScenarios setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListScenarioResponseBodyArmsScenarios setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScenarioResponseBodyArmsScenarios setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListScenarioResponseBodyArmsScenarios setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public ListScenarioResponseBodyArmsScenarios setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListScenarioResponseBodyArmsScenarios setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
