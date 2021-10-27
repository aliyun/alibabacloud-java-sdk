// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetAppTemplateResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public GetAppTemplateResponseBodyResult result;

    public static GetAppTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppTemplateResponseBody self = new GetAppTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppTemplateResponseBody setResult(GetAppTemplateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAppTemplateResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAppTemplateResponseBodyResultConfigList extends TeaModel {
        // 配置项
        @NameInMap("Key")
        public String key;

        // 配置项内容
        @NameInMap("Value")
        public String value;

        public static GetAppTemplateResponseBodyResultConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetAppTemplateResponseBodyResultConfigList self = new GetAppTemplateResponseBodyResultConfigList();
            return TeaModel.build(map, self);
        }

        public GetAppTemplateResponseBodyResultConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAppTemplateResponseBodyResultConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAppTemplateResponseBodyResult extends TeaModel {
        // 应用模板创建者
        @NameInMap("AppTemplateCreator")
        public String appTemplateCreator;

        // 应用模板名称
        @NameInMap("AppTemplateName")
        public String appTemplateName;

        // 组件列表
        @NameInMap("ComponentList")
        public java.util.List<String> componentList;

        // 配置列表
        @NameInMap("ConfigList")
        public java.util.List<GetAppTemplateResponseBodyResultConfigList> configList;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 集成方式：- 一体化SDK：paasSDK - 样板间：standardRoom
        @NameInMap("IntegrationMode")
        public String integrationMode;

        // 应用模板场景，电商business，课堂classroom
        @NameInMap("Scene")
        public String scene;

        @NameInMap("SdkInfo")
        public String sdkInfo;

        // 样板间信息
        @NameInMap("StandardRoomInfo")
        public String standardRoomInfo;

        // 应用模板使用状态
        @NameInMap("Status")
        public String status;

        public static GetAppTemplateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAppTemplateResponseBodyResult self = new GetAppTemplateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAppTemplateResponseBodyResult setAppTemplateCreator(String appTemplateCreator) {
            this.appTemplateCreator = appTemplateCreator;
            return this;
        }
        public String getAppTemplateCreator() {
            return this.appTemplateCreator;
        }

        public GetAppTemplateResponseBodyResult setAppTemplateName(String appTemplateName) {
            this.appTemplateName = appTemplateName;
            return this;
        }
        public String getAppTemplateName() {
            return this.appTemplateName;
        }

        public GetAppTemplateResponseBodyResult setComponentList(java.util.List<String> componentList) {
            this.componentList = componentList;
            return this;
        }
        public java.util.List<String> getComponentList() {
            return this.componentList;
        }

        public GetAppTemplateResponseBodyResult setConfigList(java.util.List<GetAppTemplateResponseBodyResultConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<GetAppTemplateResponseBodyResultConfigList> getConfigList() {
            return this.configList;
        }

        public GetAppTemplateResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAppTemplateResponseBodyResult setIntegrationMode(String integrationMode) {
            this.integrationMode = integrationMode;
            return this;
        }
        public String getIntegrationMode() {
            return this.integrationMode;
        }

        public GetAppTemplateResponseBodyResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetAppTemplateResponseBodyResult setSdkInfo(String sdkInfo) {
            this.sdkInfo = sdkInfo;
            return this;
        }
        public String getSdkInfo() {
            return this.sdkInfo;
        }

        public GetAppTemplateResponseBodyResult setStandardRoomInfo(String standardRoomInfo) {
            this.standardRoomInfo = standardRoomInfo;
            return this;
        }
        public String getStandardRoomInfo() {
            return this.standardRoomInfo;
        }

        public GetAppTemplateResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
