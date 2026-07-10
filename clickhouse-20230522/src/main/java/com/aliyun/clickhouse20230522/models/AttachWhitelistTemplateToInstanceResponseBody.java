// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class AttachWhitelistTemplateToInstanceResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public AttachWhitelistTemplateToInstanceResponseBodyData data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachWhitelistTemplateToInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachWhitelistTemplateToInstanceResponseBody self = new AttachWhitelistTemplateToInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachWhitelistTemplateToInstanceResponseBody setData(AttachWhitelistTemplateToInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AttachWhitelistTemplateToInstanceResponseBodyData getData() {
        return this.data;
    }

    public AttachWhitelistTemplateToInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AttachWhitelistTemplateToInstanceResponseBodyDataAttachFailList extends TeaModel {
        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>my-database</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The reason for the attachment failure.</p>
         * 
         * <strong>example:</strong>
         * <p>处理异常</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static AttachWhitelistTemplateToInstanceResponseBodyDataAttachFailList build(java.util.Map<String, ?> map) throws Exception {
            AttachWhitelistTemplateToInstanceResponseBodyDataAttachFailList self = new AttachWhitelistTemplateToInstanceResponseBodyDataAttachFailList();
            return TeaModel.build(map, self);
        }

        public AttachWhitelistTemplateToInstanceResponseBodyDataAttachFailList setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public AttachWhitelistTemplateToInstanceResponseBodyDataAttachFailList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplatesDbInstances extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>asdfwef</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplatesDbInstances build(java.util.Map<String, ?> map) throws Exception {
            AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplatesDbInstances self = new AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplatesDbInstances();
            return TeaModel.build(map, self);
        }

        public AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplatesDbInstances setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplates extends TeaModel {
        /**
         * <p>The list of attached instances.</p>
         */
        @NameInMap("DbInstances")
        public java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplatesDbInstances> dbInstances;

        /**
         * <p>The IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1,10.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The ID of the whitelist template.</p>
         * 
         * <strong>example:</strong>
         * <p>g-asdfwem</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the whitelist template.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_template</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplates build(java.util.Map<String, ?> map) throws Exception {
            AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplates self = new AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplates();
            return TeaModel.build(map, self);
        }

        public AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplates setDbInstances(java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplatesDbInstances> dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }
        public java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplatesDbInstances> getDbInstances() {
            return this.dbInstances;
        }

        public AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplates setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedList extends TeaModel {
        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>my-database</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The list of whitelist templates.</p>
         */
        @NameInMap("Templates")
        public java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplates> templates;

        public static AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedList build(java.util.Map<String, ?> map) throws Exception {
            AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedList self = new AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedList();
            return TeaModel.build(map, self);
        }

        public AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedList setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedList setTemplates(java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedListTemplates> getTemplates() {
            return this.templates;
        }

    }

    public static class AttachWhitelistTemplateToInstanceResponseBodyData extends TeaModel {
        /**
         * <p>Instances that failed to be attached.</p>
         */
        @NameInMap("AttachFailList")
        public java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachFailList> attachFailList;

        /**
         * <p>Instances to which the template was successfully attached.</p>
         */
        @NameInMap("AttachSuccessedList")
        public java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedList> attachSuccessedList;

        /**
         * <p>The status of the operation. A value of <code>ok</code> indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Status")
        public String status;

        public static AttachWhitelistTemplateToInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AttachWhitelistTemplateToInstanceResponseBodyData self = new AttachWhitelistTemplateToInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AttachWhitelistTemplateToInstanceResponseBodyData setAttachFailList(java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachFailList> attachFailList) {
            this.attachFailList = attachFailList;
            return this;
        }
        public java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachFailList> getAttachFailList() {
            return this.attachFailList;
        }

        public AttachWhitelistTemplateToInstanceResponseBodyData setAttachSuccessedList(java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedList> attachSuccessedList) {
            this.attachSuccessedList = attachSuccessedList;
            return this;
        }
        public java.util.List<AttachWhitelistTemplateToInstanceResponseBodyDataAttachSuccessedList> getAttachSuccessedList() {
            return this.attachSuccessedList;
        }

        public AttachWhitelistTemplateToInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
