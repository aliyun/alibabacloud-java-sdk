// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public GetAppResponseBodyResult result;

    public static GetAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponseBody self = new GetAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppResponseBody setResult(GetAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAppResponseBodyResult extends TeaModel {
        // 应用名称
        @NameInMap("AppName")
        public String appName;

        // 模板唯一标识
        @NameInMap("AppTemplateId")
        public String appTemplateId;

        // 模板名称
        @NameInMap("AppTemplateName")
        public String appTemplateName;

        // 应用状态
        @NameInMap("AppStatus")
        public String appStatus;

        // 应用Key
        @NameInMap("AppKey")
        public String appKey;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 组件列表。
        @NameInMap("ComponentList")
        public java.util.List<String> componentList;

        public static GetAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyResult self = new GetAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetAppResponseBodyResult setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public GetAppResponseBodyResult setAppTemplateName(String appTemplateName) {
            this.appTemplateName = appTemplateName;
            return this;
        }
        public String getAppTemplateName() {
            return this.appTemplateName;
        }

        public GetAppResponseBodyResult setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public GetAppResponseBodyResult setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetAppResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAppResponseBodyResult setComponentList(java.util.List<String> componentList) {
            this.componentList = componentList;
            return this;
        }
        public java.util.List<String> getComponentList() {
            return this.componentList;
        }

    }

}
