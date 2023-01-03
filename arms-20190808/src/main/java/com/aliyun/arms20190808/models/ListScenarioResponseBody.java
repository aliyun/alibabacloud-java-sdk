// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListScenarioResponseBody extends TeaModel {
    // The detailed information of the business monitoring job.
    @NameInMap("ArmsScenarios")
    public java.util.List<ListScenarioResponseBodyArmsScenarios> armsScenarios;

    // The ID of the request.
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
        // The ID of the application.
        @NameInMap("AppId")
        public String appId;

        // The time when the business monitoring job was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The extended information. The value is a JSON string.
        @NameInMap("Extensions")
        public String extensions;

        // The ID of the business monitoring job.
        @NameInMap("Id")
        public Long id;

        // The name of the business monitoring job.
        @NameInMap("Name")
        public String name;

        // The ID of the region.
        @NameInMap("RegionId")
        public String regionId;

        // The code of the business monitoring job.
        @NameInMap("Sign")
        public String sign;

        // The time when the business monitoring job was updated.
        @NameInMap("UpdateTime")
        public String updateTime;

        // The ID of the user.
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
