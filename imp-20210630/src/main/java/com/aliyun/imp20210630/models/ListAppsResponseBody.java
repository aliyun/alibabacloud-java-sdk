// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果体
    @NameInMap("Result")
    public ListAppsResponseBodyResult result;

    public static ListAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponseBody self = new ListAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsResponseBody setResult(ListAppsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListAppsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListAppsResponseBodyResultAppInfoList extends TeaModel {
        // 应用唯一标识符
        @NameInMap("AppId")
        public String appId;

        // 应用名称
        @NameInMap("AppName")
        public String appName;

        // 模板唯一标识
        @NameInMap("AppTemplateId")
        public String appTemplateId;

        // 模板名称
        @NameInMap("AppTemplateName")
        public String appTemplateName;

        // 应用Key
        @NameInMap("AppKey")
        public String appKey;

        // 应用状态
        @NameInMap("AppStatus")
        public String appStatus;

        // 应用配置状态
        @NameInMap("AppConfigStatus")
        public String appConfigStatus;

        // 应用创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 集成方式：- 一体化SDK：paasSDK - 样板间：standardRoom
        @NameInMap("IntegrationMode")
        public String integrationMode;

        // 样板间信息
        @NameInMap("StandardRoomInfo")
        public String standardRoomInfo;

        // 应用组件列表
        @NameInMap("ComponentList")
        public java.util.List<String> componentList;

        public static ListAppsResponseBodyResultAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyResultAppInfoList self = new ListAppsResponseBodyResultAppInfoList();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyResultAppInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppsResponseBodyResultAppInfoList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppsResponseBodyResultAppInfoList setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public ListAppsResponseBodyResultAppInfoList setAppTemplateName(String appTemplateName) {
            this.appTemplateName = appTemplateName;
            return this;
        }
        public String getAppTemplateName() {
            return this.appTemplateName;
        }

        public ListAppsResponseBodyResultAppInfoList setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListAppsResponseBodyResultAppInfoList setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public ListAppsResponseBodyResultAppInfoList setAppConfigStatus(String appConfigStatus) {
            this.appConfigStatus = appConfigStatus;
            return this;
        }
        public String getAppConfigStatus() {
            return this.appConfigStatus;
        }

        public ListAppsResponseBodyResultAppInfoList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppsResponseBodyResultAppInfoList setIntegrationMode(String integrationMode) {
            this.integrationMode = integrationMode;
            return this;
        }
        public String getIntegrationMode() {
            return this.integrationMode;
        }

        public ListAppsResponseBodyResultAppInfoList setStandardRoomInfo(String standardRoomInfo) {
            this.standardRoomInfo = standardRoomInfo;
            return this;
        }
        public String getStandardRoomInfo() {
            return this.standardRoomInfo;
        }

        public ListAppsResponseBodyResultAppInfoList setComponentList(java.util.List<String> componentList) {
            this.componentList = componentList;
            return this;
        }
        public java.util.List<String> getComponentList() {
            return this.componentList;
        }

    }

    public static class ListAppsResponseBodyResult extends TeaModel {
        // 总条目数
        @NameInMap("TotalCount")
        public Integer totalCount;

        // 总页数
        @NameInMap("PageTotal")
        public Integer pageTotal;

        // App信息列表
        @NameInMap("AppInfoList")
        public java.util.List<ListAppsResponseBodyResultAppInfoList> appInfoList;

        public static ListAppsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyResult self = new ListAppsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListAppsResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public ListAppsResponseBodyResult setAppInfoList(java.util.List<ListAppsResponseBodyResultAppInfoList> appInfoList) {
            this.appInfoList = appInfoList;
            return this;
        }
        public java.util.List<ListAppsResponseBodyResultAppInfoList> getAppInfoList() {
            return this.appInfoList;
        }

    }

}
