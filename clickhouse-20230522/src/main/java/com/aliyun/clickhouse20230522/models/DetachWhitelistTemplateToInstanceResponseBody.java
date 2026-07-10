// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DetachWhitelistTemplateToInstanceResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DetachWhitelistTemplateToInstanceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachWhitelistTemplateToInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachWhitelistTemplateToInstanceResponseBody self = new DetachWhitelistTemplateToInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachWhitelistTemplateToInstanceResponseBody setData(DetachWhitelistTemplateToInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetachWhitelistTemplateToInstanceResponseBodyData getData() {
        return this.data;
    }

    public DetachWhitelistTemplateToInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetachWhitelistTemplateToInstanceResponseBodyDataDetachFailList extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>my-database</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The reason the detach operation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>处理异常</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static DetachWhitelistTemplateToInstanceResponseBodyDataDetachFailList build(java.util.Map<String, ?> map) throws Exception {
            DetachWhitelistTemplateToInstanceResponseBodyDataDetachFailList self = new DetachWhitelistTemplateToInstanceResponseBodyDataDetachFailList();
            return TeaModel.build(map, self);
        }

        public DetachWhitelistTemplateToInstanceResponseBodyDataDetachFailList setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DetachWhitelistTemplateToInstanceResponseBodyDataDetachFailList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplatesDbInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>asdfwef</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplatesDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplatesDbInstances self = new DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplatesDbInstances();
            return TeaModel.build(map, self);
        }

        public DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplatesDbInstances setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplates extends TeaModel {
        /**
         * <p>A list of associated instances.</p>
         */
        @NameInMap("DbInstances")
        public java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplatesDbInstances> dbInstances;

        /**
         * <p>The IP whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1,10.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The whitelist template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g-asdfwem</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The whitelist template name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_template</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplates build(java.util.Map<String, ?> map) throws Exception {
            DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplates self = new DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplates();
            return TeaModel.build(map, self);
        }

        public DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplates setDbInstances(java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplatesDbInstances> dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }
        public java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplatesDbInstances> getDbInstances() {
            return this.dbInstances;
        }

        public DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplates setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedList extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>my-database</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>A list of whitelist templates.</p>
         */
        @NameInMap("Templates")
        public java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplates> templates;

        public static DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedList build(java.util.Map<String, ?> map) throws Exception {
            DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedList self = new DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedList();
            return TeaModel.build(map, self);
        }

        public DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedList setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedList setTemplates(java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedListTemplates> getTemplates() {
            return this.templates;
        }

    }

    public static class DetachWhitelistTemplateToInstanceResponseBodyData extends TeaModel {
        /**
         * <p>A list of instances that failed to detach.</p>
         */
        @NameInMap("DetachFailList")
        public java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachFailList> detachFailList;

        /**
         * <p>A list of successfully detached instances.</p>
         */
        @NameInMap("DetachSuccessedList")
        public java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedList> detachSuccessedList;

        /**
         * <p>The status of the operation. A value of <code>ok</code> indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Status")
        public String status;

        public static DetachWhitelistTemplateToInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetachWhitelistTemplateToInstanceResponseBodyData self = new DetachWhitelistTemplateToInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetachWhitelistTemplateToInstanceResponseBodyData setDetachFailList(java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachFailList> detachFailList) {
            this.detachFailList = detachFailList;
            return this;
        }
        public java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachFailList> getDetachFailList() {
            return this.detachFailList;
        }

        public DetachWhitelistTemplateToInstanceResponseBodyData setDetachSuccessedList(java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedList> detachSuccessedList) {
            this.detachSuccessedList = detachSuccessedList;
            return this;
        }
        public java.util.List<DetachWhitelistTemplateToInstanceResponseBodyDataDetachSuccessedList> getDetachSuccessedList() {
            return this.detachSuccessedList;
        }

        public DetachWhitelistTemplateToInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
