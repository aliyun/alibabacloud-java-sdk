// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListScenarioResponseBody extends TeaModel {
    /**
     * <p>The detailed information of the business monitoring job.</p>
     */
    @NameInMap("ArmsScenarios")
    public java.util.List<ListScenarioResponseBodyArmsScenarios> armsScenarios;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>98027D1F-3AEB-492C-A4AA-E9217992****</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>b590lhguqs@28f515462******</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the business monitoring job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1585214916000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The extended information. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;_MODE&quot;: &quot;CUSTOM-TRANSACTION&quot;,&quot;_SCENARIO&quot;: &quot;USER-DEFINED&quot;}</p>
         */
        @NameInMap("Extensions")
        public String extensions;

        /**
         * <p>The ID of the business monitoring job.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the business monitoring job.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s_deployment_css-guns-vip-main-prod_silence</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The code of the business monitoring job.</p>
         * 
         * <strong>example:</strong>
         * <p>a9f8****</p>
         */
        @NameInMap("Sign")
        public String sign;

        /**
         * <p>The time when the business monitoring job was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1585214916000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>113197164949****</p>
         */
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
