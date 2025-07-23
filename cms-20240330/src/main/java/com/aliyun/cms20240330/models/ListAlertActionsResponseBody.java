// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertActionsResponseBody extends TeaModel {
    @NameInMap("alertActions")
    public java.util.List<ListAlertActionsResponseBodyAlertActions> alertActions;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
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

    public static class ListAlertActionsResponseBodyAlertActionsEbParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ebSource")
        public String ebSource;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("eventBusName")
        public String eventBusName;

        /**
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("subject")
        public String subject;

        public static ListAlertActionsResponseBodyAlertActionsEbParam build(java.util.Map<String, ?> map) throws Exception {
            ListAlertActionsResponseBodyAlertActionsEbParam self = new ListAlertActionsResponseBodyAlertActionsEbParam();
            return TeaModel.build(map, self);
        }

        public ListAlertActionsResponseBodyAlertActionsEbParam setEbSource(String ebSource) {
            this.ebSource = ebSource;
            return this;
        }
        public String getEbSource() {
            return this.ebSource;
        }

        public ListAlertActionsResponseBodyAlertActionsEbParam setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public ListAlertActionsResponseBodyAlertActionsEbParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAlertActionsResponseBodyAlertActionsEbParam setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class ListAlertActionsResponseBodyAlertActionsEssParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testId</p>
         */
        @NameInMap("essGroupId")
        public String essGroupId;

        /**
         * <strong>example:</strong>
         * <p>testId</p>
         */
        @NameInMap("essRuleId")
        public String essRuleId;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
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

    public static class ListAlertActionsResponseBodyAlertActionsFc3Param extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("function")
        public String function;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("qualifier")
        public String qualifier;

        /**
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static ListAlertActionsResponseBodyAlertActionsFc3Param build(java.util.Map<String, ?> map) throws Exception {
            ListAlertActionsResponseBodyAlertActionsFc3Param self = new ListAlertActionsResponseBodyAlertActionsFc3Param();
            return TeaModel.build(map, self);
        }

        public ListAlertActionsResponseBodyAlertActionsFc3Param setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public ListAlertActionsResponseBodyAlertActionsFc3Param setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public ListAlertActionsResponseBodyAlertActionsFc3Param setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListAlertActionsResponseBodyAlertActionsFcParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("function")
        public String function;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>queue</p>
         */
        @NameInMap("mnsType")
        public String mnsType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>fsfer4543t5t65g4t4</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p><a href="https://events.pagerduty.com/v2/enqueue">https://events.pagerduty.com/v2/enqueue</a></p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("contentType")
        public String contentType;

        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.test.com">http://www.test.com</a></p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("alertActionId")
        public String alertActionId;

        /**
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("alertActionName")
        public String alertActionName;

        @NameInMap("ebParam")
        public ListAlertActionsResponseBodyAlertActionsEbParam ebParam;

        @NameInMap("essParam")
        public ListAlertActionsResponseBodyAlertActionsEssParam essParam;

        @NameInMap("fc3Param")
        public ListAlertActionsResponseBodyAlertActionsFc3Param fc3Param;

        @NameInMap("fcParam")
        public ListAlertActionsResponseBodyAlertActionsFcParam fcParam;

        @NameInMap("mnsParam")
        public ListAlertActionsResponseBodyAlertActionsMnsParam mnsParam;

        @NameInMap("pagerDutyParam")
        public ListAlertActionsResponseBodyAlertActionsPagerDutyParam pagerDutyParam;

        @NameInMap("slsParam")
        public ListAlertActionsResponseBodyAlertActionsSlsParam slsParam;

        /**
         * <strong>example:</strong>
         * <p>FC</p>
         */
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

        public ListAlertActionsResponseBodyAlertActions setEbParam(ListAlertActionsResponseBodyAlertActionsEbParam ebParam) {
            this.ebParam = ebParam;
            return this;
        }
        public ListAlertActionsResponseBodyAlertActionsEbParam getEbParam() {
            return this.ebParam;
        }

        public ListAlertActionsResponseBodyAlertActions setEssParam(ListAlertActionsResponseBodyAlertActionsEssParam essParam) {
            this.essParam = essParam;
            return this;
        }
        public ListAlertActionsResponseBodyAlertActionsEssParam getEssParam() {
            return this.essParam;
        }

        public ListAlertActionsResponseBodyAlertActions setFc3Param(ListAlertActionsResponseBodyAlertActionsFc3Param fc3Param) {
            this.fc3Param = fc3Param;
            return this;
        }
        public ListAlertActionsResponseBodyAlertActionsFc3Param getFc3Param() {
            return this.fc3Param;
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
