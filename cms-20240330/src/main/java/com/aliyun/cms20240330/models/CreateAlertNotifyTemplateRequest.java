// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertNotifyTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the notification template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("alertNotifyTemplateId")
    public String alertNotifyTemplateId;

    /**
     * <p>The name of the notification template.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("alertNotifyTemplateName")
    public String alertNotifyTemplateName;

    /**
     * <p>The template syntax type. Currently, only Go is supported. Templates in the title and content fields use the Go template syntax.</p>
     * 
     * <strong>example:</strong>
     * <p>GO</p>
     */
    @NameInMap("programLang")
    public String programLang;

    /**
     * <p>The multilingual notification templates. The key is the language code: zh for Chinese and en for English. The value is the template configuration object for the specified language. When a notification is sent, the corresponding template is selected based on the recipient\&quot;s language. The content format varies by type: Markdown for DING, WEIXIN, and FEISHU; HTML for EMAIL; plain text for SMS, CALL, and SLACK; and JSON for CUSTOM.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;zh&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}\n<strong>Events:</strong> {{len .events}}&quot;,&quot;incidentLifeCycleNotifyTemplates&quot;:&quot;{\&quot;IncidentCreationNotify\&quot;:{\&quot;title\&quot;:\&quot;CloudMonitor Alert: {{.incident.title}}\&quot;,\&quot;content\&quot;:\&quot;<strong>Alert Title:</strong> {{.incident.title}}\\n<strong>Severity:</strong> {{.incident.severity}}\&quot;,\&quot;enable\&quot;:true},\&quot;IncidentResolutionNotify\&quot;:{\&quot;title\&quot;:\&quot;CloudMonitor Alert Resolved: {{.incident.title}}\&quot;,\&quot;content\&quot;:\&quot;<strong>Alert Title:</strong> {{.incident.title}}\\n<strong>Severity:</strong> {{.incident.severity}}\&quot;,\&quot;enable\&quot;:true}}&quot;},&quot;en&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}\n<strong>Events:</strong> {{len .events}}&quot;,&quot;incidentLifeCycleNotifyTemplates&quot;:&quot;{\&quot;IncidentCreationNotify\&quot;:{\&quot;title\&quot;:\&quot;CloudMonitor Alert: {{.incident.title}}\&quot;,\&quot;content\&quot;:\&quot;<strong>Alert Title:</strong> {{.incident.title}}\\n<strong>Severity:</strong> {{.incident.severity}}\&quot;,\&quot;enable\&quot;:true},\&quot;IncidentResolutionNotify\&quot;:{\&quot;title\&quot;:\&quot;CloudMonitor Alert Resolved: {{.incident.title}}\&quot;,\&quot;content\&quot;:\&quot;<strong>Alert Title:</strong> {{.incident.title}}\\n<strong>Severity:</strong> {{.incident.severity}}\&quot;,\&quot;enable\&quot;:true}}&quot;}}</p>
     */
    @NameInMap("templates")
    public java.util.Map<String, java.util.Map<String, ?>> templates;

    /**
     * <p>The notification channel type. Valid values:</p>
     * <ul>
     * <li>DING</li>
     * <li>WEIXIN</li>
     * <li>FEISHU</li>
     * <li>SLACK</li>
     * <li>CUSTOM</li>
     * <li>TEAMS</li>
     * <li>SMS</li>
     * <li>EMAIL</li>
     * <li>CALL</li>
     * <li>PAGER_DUTY</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DING</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateAlertNotifyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertNotifyTemplateRequest self = new CreateAlertNotifyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertNotifyTemplateRequest setAlertNotifyTemplateId(String alertNotifyTemplateId) {
        this.alertNotifyTemplateId = alertNotifyTemplateId;
        return this;
    }
    public String getAlertNotifyTemplateId() {
        return this.alertNotifyTemplateId;
    }

    public CreateAlertNotifyTemplateRequest setAlertNotifyTemplateName(String alertNotifyTemplateName) {
        this.alertNotifyTemplateName = alertNotifyTemplateName;
        return this;
    }
    public String getAlertNotifyTemplateName() {
        return this.alertNotifyTemplateName;
    }

    public CreateAlertNotifyTemplateRequest setProgramLang(String programLang) {
        this.programLang = programLang;
        return this;
    }
    public String getProgramLang() {
        return this.programLang;
    }

    public CreateAlertNotifyTemplateRequest setTemplates(java.util.Map<String, java.util.Map<String, ?>> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getTemplates() {
        return this.templates;
    }

    public CreateAlertNotifyTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
