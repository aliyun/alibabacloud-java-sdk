// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAlertNotifyTemplateRequest extends TeaModel {
    /**
     * <p>The name of the notification template.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("alertNotifyTemplateName")
    public String alertNotifyTemplateName;

    /**
     * <p>The multilingual notification templates. The key is the language code: zh for Chinese and en for English. The value is the template configuration object for the specified language. When a notification is sent, the corresponding template is selected based on the recipient\&quot;s language. The body format varies by type: Markdown for DING, WEIXIN, and FEISHU; HTML for EMAIL; plain text for SMS, CALL, and SLACK; and JSON for CUSTOM.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;zh&quot;:{&quot;title&quot;:&quot;云监控报警: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>报警标题:</strong> {{.incident.title}}\n<strong>级别:</strong> {{.incident.severity}}\n<strong>事件数:</strong> {{len .events}}&quot;,&quot;incidentLifeCycleNotifyTemplates&quot;:&quot;{\&quot;IncidentCreationNotify\&quot;:{\&quot;title\&quot;:\&quot;云监控报警: {{.incident.title}}\&quot;,\&quot;content\&quot;:\&quot;<strong>报警标题:</strong> {{.incident.title}}\\n<strong>级别:</strong> {{.incident.severity}}\&quot;,\&quot;enable\&quot;:true},\&quot;IncidentResolutionNotify\&quot;:{\&quot;title\&quot;:\&quot;云监控报警已解决: {{.incident.title}}\&quot;,\&quot;content\&quot;:\&quot;<strong>报警标题:</strong> {{.incident.title}}\\n<strong>级别:</strong> {{.incident.severity}}\&quot;,\&quot;enable\&quot;:true}}&quot;},&quot;en&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}\n<strong>Events:</strong> {{len .events}}&quot;,&quot;incidentLifeCycleNotifyTemplates&quot;:&quot;{\&quot;IncidentCreationNotify\&quot;:{\&quot;title\&quot;:\&quot;CloudMonitor Alert: {{.incident.title}}\&quot;,\&quot;content\&quot;:\&quot;<strong>Alert Title:</strong> {{.incident.title}}\\n<strong>Severity:</strong> {{.incident.severity}}\&quot;,\&quot;enable\&quot;:true},\&quot;IncidentResolutionNotify\&quot;:{\&quot;title\&quot;:\&quot;CloudMonitor Alert Resolved: {{.incident.title}}\&quot;,\&quot;content\&quot;:\&quot;<strong>Alert Title:</strong> {{.incident.title}}\\n<strong>Severity:</strong> {{.incident.severity}}\&quot;,\&quot;enable\&quot;:true}}&quot;}}</p>
     */
    @NameInMap("templates")
    public java.util.Map<String, java.util.Map<String, ?>> templates;

    public static UpdateAlertNotifyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertNotifyTemplateRequest self = new UpdateAlertNotifyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertNotifyTemplateRequest setAlertNotifyTemplateName(String alertNotifyTemplateName) {
        this.alertNotifyTemplateName = alertNotifyTemplateName;
        return this;
    }
    public String getAlertNotifyTemplateName() {
        return this.alertNotifyTemplateName;
    }

    public UpdateAlertNotifyTemplateRequest setTemplates(java.util.Map<String, java.util.Map<String, ?>> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getTemplates() {
        return this.templates;
    }

}
