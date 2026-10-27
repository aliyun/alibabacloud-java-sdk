// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertNotifyTemplatesResponseBody extends TeaModel {
    @NameInMap("alertNotifyTemplates")
    public java.util.List<ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates> alertNotifyTemplates;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>CD8BA7D6-995D-578D-9941-**********</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAlertNotifyTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertNotifyTemplatesResponseBody self = new ListAlertNotifyTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertNotifyTemplatesResponseBody setAlertNotifyTemplates(java.util.List<ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates> alertNotifyTemplates) {
        this.alertNotifyTemplates = alertNotifyTemplates;
        return this;
    }
    public java.util.List<ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates> getAlertNotifyTemplates() {
        return this.alertNotifyTemplates;
    }

    public ListAlertNotifyTemplatesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertNotifyTemplatesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertNotifyTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertNotifyTemplatesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>template-abc123</p>
         */
        @NameInMap("alertNotifyTemplateId")
        public String alertNotifyTemplateId;

        /**
         * <strong>example:</strong>
         * <p>高可用性告警模板</p>
         */
        @NameInMap("alertNotifyTemplateName")
        public String alertNotifyTemplateName;

        /**
         * <strong>example:</strong>
         * <p>GO</p>
         */
        @NameInMap("programLang")
        public String programLang;

        /**
         * <strong>example:</strong>
         * <p>{&quot;zh&quot;:{&quot;title&quot;:&quot;云监控报警: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>报警标题:</strong> {{.incident.title}}\n<strong>级别:</strong> {{.incident.severity}}\n<strong>事件数:</strong> {{len .events}}&quot;,&quot;incidentLifeCycleNotifyTemplates&quot;:{&quot;IncidentCreationNotify&quot;:{&quot;title&quot;:&quot;云监控报警: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>报警标题:</strong> {{.incident.title}}\n<strong>级别:</strong> {{.incident.severity}}&quot;,&quot;enable&quot;:true},&quot;IncidentResolutionNotify&quot;:{&quot;title&quot;:&quot;云监控报警已解决: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>报警标题:</strong> {{.incident.title}}\n<strong>级别:</strong> {{.incident.severity}}&quot;,&quot;enable&quot;:true}}},&quot;en&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}\n<strong>Events:</strong> {{len .events}}&quot;,&quot;incidentLifeCycleNotifyTemplates&quot;:{&quot;IncidentCreationNotify&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}&quot;,&quot;enable&quot;:true},&quot;IncidentResolutionNotify&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert Resolved: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}&quot;,&quot;enable&quot;:true}}}}</p>
         */
        @NameInMap("templates")
        public java.util.Map<String, java.util.Map<String, ?>> templates;

        /**
         * <strong>example:</strong>
         * <p>DING</p>
         */
        @NameInMap("type")
        public String type;

        public static ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates self = new ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates();
            return TeaModel.build(map, self);
        }

        public ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates setAlertNotifyTemplateId(String alertNotifyTemplateId) {
            this.alertNotifyTemplateId = alertNotifyTemplateId;
            return this;
        }
        public String getAlertNotifyTemplateId() {
            return this.alertNotifyTemplateId;
        }

        public ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates setAlertNotifyTemplateName(String alertNotifyTemplateName) {
            this.alertNotifyTemplateName = alertNotifyTemplateName;
            return this;
        }
        public String getAlertNotifyTemplateName() {
            return this.alertNotifyTemplateName;
        }

        public ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates setProgramLang(String programLang) {
            this.programLang = programLang;
            return this;
        }
        public String getProgramLang() {
            return this.programLang;
        }

        public ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates setTemplates(java.util.Map<String, java.util.Map<String, ?>> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getTemplates() {
            return this.templates;
        }

        public ListAlertNotifyTemplatesResponseBodyAlertNotifyTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
