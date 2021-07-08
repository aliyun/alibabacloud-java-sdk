// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListAppTemplatesResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 返回结果
    @NameInMap("Result")
    public ListAppTemplatesResponseBodyResult result;

    public static ListAppTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppTemplatesResponseBody self = new ListAppTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppTemplatesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAppTemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAppTemplatesResponseBody setResult(ListAppTemplatesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListAppTemplatesResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListAppTemplatesResponseBodyResultAppTemplateInfoListConfigList extends TeaModel {
        // 配置项
        @NameInMap("Key")
        public String key;

        // 配置项内容
        @NameInMap("Value")
        public String value;

        public static ListAppTemplatesResponseBodyResultAppTemplateInfoListConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListAppTemplatesResponseBodyResultAppTemplateInfoListConfigList self = new ListAppTemplatesResponseBodyResultAppTemplateInfoListConfigList();
            return TeaModel.build(map, self);
        }

        public ListAppTemplatesResponseBodyResultAppTemplateInfoListConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAppTemplatesResponseBodyResultAppTemplateInfoListConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAppTemplatesResponseBodyResultAppTemplateInfoList extends TeaModel {
        // 应用模板唯一标识
        @NameInMap("AppTemplateId")
        public String appTemplateId;

        // 应用模板名称
        @NameInMap("AppTemplateName")
        public String appTemplateName;

        // 应用模板创建者
        @NameInMap("AppTemplateCreator")
        public String appTemplateCreator;

        // 应用模板使用状态
        @NameInMap("Status")
        public String status;

        // 组件列表
        @NameInMap("ComponentList")
        public java.util.List<String> componentList;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // SDK信息
        @NameInMap("SdkInfo")
        public String sdkInfo;

        // 配置列表
        @NameInMap("ConfigList")
        public java.util.List<ListAppTemplatesResponseBodyResultAppTemplateInfoListConfigList> configList;

        public static ListAppTemplatesResponseBodyResultAppTemplateInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAppTemplatesResponseBodyResultAppTemplateInfoList self = new ListAppTemplatesResponseBodyResultAppTemplateInfoList();
            return TeaModel.build(map, self);
        }

        public ListAppTemplatesResponseBodyResultAppTemplateInfoList setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public ListAppTemplatesResponseBodyResultAppTemplateInfoList setAppTemplateName(String appTemplateName) {
            this.appTemplateName = appTemplateName;
            return this;
        }
        public String getAppTemplateName() {
            return this.appTemplateName;
        }

        public ListAppTemplatesResponseBodyResultAppTemplateInfoList setAppTemplateCreator(String appTemplateCreator) {
            this.appTemplateCreator = appTemplateCreator;
            return this;
        }
        public String getAppTemplateCreator() {
            return this.appTemplateCreator;
        }

        public ListAppTemplatesResponseBodyResultAppTemplateInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppTemplatesResponseBodyResultAppTemplateInfoList setComponentList(java.util.List<String> componentList) {
            this.componentList = componentList;
            return this;
        }
        public java.util.List<String> getComponentList() {
            return this.componentList;
        }

        public ListAppTemplatesResponseBodyResultAppTemplateInfoList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppTemplatesResponseBodyResultAppTemplateInfoList setSdkInfo(String sdkInfo) {
            this.sdkInfo = sdkInfo;
            return this;
        }
        public String getSdkInfo() {
            return this.sdkInfo;
        }

        public ListAppTemplatesResponseBodyResultAppTemplateInfoList setConfigList(java.util.List<ListAppTemplatesResponseBodyResultAppTemplateInfoListConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<ListAppTemplatesResponseBodyResultAppTemplateInfoListConfigList> getConfigList() {
            return this.configList;
        }

    }

    public static class ListAppTemplatesResponseBodyResult extends TeaModel {
        // 总条目数
        @NameInMap("TotalCount")
        public Integer totalCount;

        // 总页数
        @NameInMap("PageTotal")
        public Integer pageTotal;

        // 应用模板信息列表
        @NameInMap("AppTemplateInfoList")
        public java.util.List<ListAppTemplatesResponseBodyResultAppTemplateInfoList> appTemplateInfoList;

        public static ListAppTemplatesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAppTemplatesResponseBodyResult self = new ListAppTemplatesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAppTemplatesResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListAppTemplatesResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public ListAppTemplatesResponseBodyResult setAppTemplateInfoList(java.util.List<ListAppTemplatesResponseBodyResultAppTemplateInfoList> appTemplateInfoList) {
            this.appTemplateInfoList = appTemplateInfoList;
            return this;
        }
        public java.util.List<ListAppTemplatesResponseBodyResultAppTemplateInfoList> getAppTemplateInfoList() {
            return this.appTemplateInfoList;
        }

    }

}
