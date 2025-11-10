// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertActionsResponseBody extends TeaModel {
    /**
     * <p>List of alert action configurations.</p>
     */
    @NameInMap("alertActions")
    public java.util.List<ListAlertActionsResponseBodyAlertActions> alertActions;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Total number of items.</p>
     * 
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
         * <p>Event source.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ebSource")
        public String ebSource;

        /**
         * <p>Event bus name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("eventBusName")
        public String eventBusName;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Subject.</p>
         * 
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
         * <p>Elastic scaling group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        @NameInMap("essGroupId")
        public String essGroupId;

        /**
         * <p>Elastic scaling rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        @NameInMap("essRuleId")
        public String essRuleId;

        /**
         * <p>Region ID.</p>
         * 
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
         * <p>Function name of the Function Compute service.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("function")
        public String function;

        /**
         * <p>Version or alias of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("qualifier")
        public String qualifier;

        /**
         * <p>Region ID.</p>
         * 
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
         * <p>Function name in the Function Compute service.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("function")
        public String function;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Function Compute service name.</p>
         * 
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
         * <p>Resource type of the Lightweight Message Queue (formerly MNS).</p>
         * 
         * <strong>example:</strong>
         * <p>queue</p>
         */
        @NameInMap("mnsType")
        public String mnsType;

        /**
         * <p>Resource name.</p>
         * <ul>
         * <li>If the resource type is queue, the resource name is the queue name.</li>
         * <li>If the resource type is topic, the resource name is the topic name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Region ID.</p>
         * 
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
         * <p>Integration key for PagerDuty.</p>
         * 
         * <strong>example:</strong>
         * <p>fsfer4543t5t65g4t4</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>Integration webhook for PagerDuty. Supports V1 and V2 versions.</p>
         * 
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
         * <p>Logstore name of the Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>Log Service project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>Region ID.</p>
         * 
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
         * <p>Data format, effective when the request method is POST.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>Request headers.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>Webhook request method.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The URL address for the alarm callback.</p>
         * 
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
         * <p>Unique identifier for the action integration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("alertActionId")
        public String alertActionId;

        /**
         * <p>Alert action name.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("alertActionName")
        public String alertActionName;

        /**
         * <p>Event Bridge parameters.</p>
         */
        @NameInMap("ebParam")
        public ListAlertActionsResponseBodyAlertActionsEbParam ebParam;

        /**
         * <p>Elastic scaling parameters.</p>
         */
        @NameInMap("essParam")
        public ListAlertActionsResponseBodyAlertActionsEssParam essParam;

        /**
         * <p>Function Compute 3.0 parameters.</p>
         */
        @NameInMap("fc3Param")
        public ListAlertActionsResponseBodyAlertActionsFc3Param fc3Param;

        /**
         * <p>Function Compute parameters.</p>
         */
        @NameInMap("fcParam")
        public ListAlertActionsResponseBodyAlertActionsFcParam fcParam;

        /**
         * <p>Lightweight Message Queue (formerly MNS) parameters.</p>
         */
        @NameInMap("mnsParam")
        public ListAlertActionsResponseBodyAlertActionsMnsParam mnsParam;

        /**
         * <p>PagerDuty parameters</p>
         */
        @NameInMap("pagerDutyParam")
        public ListAlertActionsResponseBodyAlertActionsPagerDutyParam pagerDutyParam;

        /**
         * <p>Log Service parameters.</p>
         */
        @NameInMap("slsParam")
        public ListAlertActionsResponseBodyAlertActionsSlsParam slsParam;

        /**
         * <p>Action integration type.</p>
         * 
         * <strong>example:</strong>
         * <p>FC</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Webhook parameters</p>
         */
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
