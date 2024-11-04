// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertActionsResponseBody extends TeaModel {
    @NameInMap("alertActions")
    public java.util.List<ListAlertActionsResponseBodyAlertActions> alertActions;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Integer total;

    public static ListAlertActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertActionsResponseBody self = new ListAlertActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertActionsResponseBody setAlertActions(java.util.List<ListAlertActionsResponseBodyAlertActions> alertActions) {
        this.alertActions = alertActions;
        return this;
    }
    public java.util.List<ListAlertActionsResponseBodyAlertActions> getAlertActions() {
        return this.alertActions;
    }

    public ListAlertActionsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertActionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertActionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertActionsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAlertActionsResponseBodyAlertActionsEssParam extends TeaModel {
        @NameInMap("essGroupId")
        public String essGroupId;

        @NameInMap("essRuleId")
        public String essRuleId;

        @NameInMap("regionId")
        public String regionId;

        public static ListAlertActionsResponseBodyAlertActionsEssParam build(java.util.Map<String, ?> map) throws Exception {
            ListAlertActionsResponseBodyAlertActionsEssParam self = new ListAlertActionsResponseBodyAlertActionsEssParam();
            return TeaModel.build(map, self);
        }

        public ListAlertActionsResponseBodyAlertActionsEssParam setEssGroupId(String essGroupId) {
            this.essGroupId = essGroupId;
            return this;
        }
        public String getEssGroupId() {
            return this.essGroupId;
        }

        public ListAlertActionsResponseBodyAlertActionsEssParam setEssRuleId(String essRuleId) {
            this.essRuleId = essRuleId;
            return this;
        }
        public String getEssRuleId() {
            return this.essRuleId;
        }

        public ListAlertActionsResponseBodyAlertActionsEssParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListAlertActionsResponseBodyAlertActionsFcParam extends TeaModel {
        @NameInMap("function")
        public String function;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("service")
        public String service;

        public static ListAlertActionsResponseBodyAlertActionsFcParam build(java.util.Map<String, ?> map) throws Exception {
            ListAlertActionsResponseBodyAlertActionsFcParam self = new ListAlertActionsResponseBodyAlertActionsFcParam();
            return TeaModel.build(map, self);
        }

        public ListAlertActionsResponseBodyAlertActionsFcParam setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public ListAlertActionsResponseBodyAlertActionsFcParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAlertActionsResponseBodyAlertActionsFcParam setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

    public static class ListAlertActionsResponseBodyAlertActionsMnsParam extends TeaModel {
        @NameInMap("mnsType")
        public String mnsType;

        @NameInMap("name")
        public String name;

        @NameInMap("regionId")
        public String regionId;

        public static ListAlertActionsResponseBodyAlertActionsMnsParam build(java.util.Map<String, ?> map) throws Exception {
            ListAlertActionsResponseBodyAlertActionsMnsParam self = new ListAlertActionsResponseBodyAlertActionsMnsParam();
            return TeaModel.build(map, self);
        }

        public ListAlertActionsResponseBodyAlertActionsMnsParam setMnsType(String mnsType) {
            this.mnsType = mnsType;
            return this;
        }
        public String getMnsType() {
            return this.mnsType;
        }

        public ListAlertActionsResponseBodyAlertActionsMnsParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertActionsResponseBodyAlertActionsMnsParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListAlertActionsResponseBodyAlertActionsPagerDutyParam extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("url")
        public String url;

        public static ListAlertActionsResponseBodyAlertActionsPagerDutyParam build(java.util.Map<String, ?> map) throws Exception {
            ListAlertActionsResponseBodyAlertActionsPagerDutyParam self = new ListAlertActionsResponseBodyAlertActionsPagerDutyParam();
            return TeaModel.build(map, self);
        }

        public ListAlertActionsResponseBodyAlertActionsPagerDutyParam setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAlertActionsResponseBodyAlertActionsPagerDutyParam setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListAlertActionsResponseBodyAlertActionsSlsParam extends TeaModel {
        @NameInMap("logstore")
        public String logstore;

        @NameInMap("project")
        public String project;

        @NameInMap("regionId")
        public String regionId;

        public static ListAlertActionsResponseBodyAlertActionsSlsParam build(java.util.Map<String, ?> map) throws Exception {
            ListAlertActionsResponseBodyAlertActionsSlsParam self = new ListAlertActionsResponseBodyAlertActionsSlsParam();
            return TeaModel.build(map, self);
        }

        public ListAlertActionsResponseBodyAlertActionsSlsParam setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListAlertActionsResponseBodyAlertActionsSlsParam setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListAlertActionsResponseBodyAlertActionsSlsParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListAlertActionsResponseBodyAlertActionsWebhookParam extends TeaModel {
        @NameInMap("contentType")
        public String contentType;

        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        @NameInMap("method")
        public String method;

        @NameInMap("url")
        public String url;

        public static ListAlertActionsResponseBodyAlertActionsWebhookParam build(java.util.Map<String, ?> map) throws Exception {
            ListAlertActionsResponseBodyAlertActionsWebhookParam self = new ListAlertActionsResponseBodyAlertActionsWebhookParam();
            return TeaModel.build(map, self);
        }

        public ListAlertActionsResponseBodyAlertActionsWebhookParam setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListAlertActionsResponseBodyAlertActionsWebhookParam setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public ListAlertActionsResponseBodyAlertActionsWebhookParam setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListAlertActionsResponseBodyAlertActionsWebhookParam setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListAlertActionsResponseBodyAlertActions extends TeaModel {
        @NameInMap("alertActionId")
        public String alertActionId;

        @NameInMap("alertActionName")
        public String alertActionName;

        @NameInMap("essParam")
        public ListAlertActionsResponseBodyAlertActionsEssParam essParam;

        @NameInMap("fcParam")
        public ListAlertActionsResponseBodyAlertActionsFcParam fcParam;

        @NameInMap("mnsParam")
        public ListAlertActionsResponseBodyAlertActionsMnsParam mnsParam;

        @NameInMap("pagerDutyParam")
        public ListAlertActionsResponseBodyAlertActionsPagerDutyParam pagerDutyParam;

        @NameInMap("slsParam")
        public ListAlertActionsResponseBodyAlertActionsSlsParam slsParam;

        @NameInMap("type")
        public String type;

        @NameInMap("webhookParam")
        public ListAlertActionsResponseBodyAlertActionsWebhookParam webhookParam;

        public static ListAlertActionsResponseBodyAlertActions build(java.util.Map<String, ?> map) throws Exception {
            ListAlertActionsResponseBodyAlertActions self = new ListAlertActionsResponseBodyAlertActions();
            return TeaModel.build(map, self);
        }

        public ListAlertActionsResponseBodyAlertActions setAlertActionId(String alertActionId) {
            this.alertActionId = alertActionId;
            return this;
        }
        public String getAlertActionId() {
            return this.alertActionId;
        }

        public ListAlertActionsResponseBodyAlertActions setAlertActionName(String alertActionName) {
            this.alertActionName = alertActionName;
            return this;
        }
        public String getAlertActionName() {
            return this.alertActionName;
        }

        public ListAlertActionsResponseBodyAlertActions setEssParam(ListAlertActionsResponseBodyAlertActionsEssParam essParam) {
            this.essParam = essParam;
            return this;
        }
        public ListAlertActionsResponseBodyAlertActionsEssParam getEssParam() {
            return this.essParam;
        }

        public ListAlertActionsResponseBodyAlertActions setFcParam(ListAlertActionsResponseBodyAlertActionsFcParam fcParam) {
            this.fcParam = fcParam;
            return this;
        }
        public ListAlertActionsResponseBodyAlertActionsFcParam getFcParam() {
            return this.fcParam;
        }

        public ListAlertActionsResponseBodyAlertActions setMnsParam(ListAlertActionsResponseBodyAlertActionsMnsParam mnsParam) {
            this.mnsParam = mnsParam;
            return this;
        }
        public ListAlertActionsResponseBodyAlertActionsMnsParam getMnsParam() {
            return this.mnsParam;
        }

        public ListAlertActionsResponseBodyAlertActions setPagerDutyParam(ListAlertActionsResponseBodyAlertActionsPagerDutyParam pagerDutyParam) {
            this.pagerDutyParam = pagerDutyParam;
            return this;
        }
        public ListAlertActionsResponseBodyAlertActionsPagerDutyParam getPagerDutyParam() {
            return this.pagerDutyParam;
        }

        public ListAlertActionsResponseBodyAlertActions setSlsParam(ListAlertActionsResponseBodyAlertActionsSlsParam slsParam) {
            this.slsParam = slsParam;
            return this;
        }
        public ListAlertActionsResponseBodyAlertActionsSlsParam getSlsParam() {
            return this.slsParam;
        }

        public ListAlertActionsResponseBodyAlertActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlertActionsResponseBodyAlertActions setWebhookParam(ListAlertActionsResponseBodyAlertActionsWebhookParam webhookParam) {
            this.webhookParam = webhookParam;
            return this;
        }
        public ListAlertActionsResponseBodyAlertActionsWebhookParam getWebhookParam() {
            return this.webhookParam;
        }

    }

}
