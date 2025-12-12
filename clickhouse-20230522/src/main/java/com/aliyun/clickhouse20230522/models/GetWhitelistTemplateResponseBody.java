// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class GetWhitelistTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetWhitelistTemplateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetWhitelistTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWhitelistTemplateResponseBody self = new GetWhitelistTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWhitelistTemplateResponseBody setData(GetWhitelistTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWhitelistTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetWhitelistTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetWhitelistTemplateResponseBodyDataTemplatesDbInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cc-asdfwef</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static GetWhitelistTemplateResponseBodyDataTemplatesDbInstances build(java.util.Map<String, ?> map) throws Exception {
            GetWhitelistTemplateResponseBodyDataTemplatesDbInstances self = new GetWhitelistTemplateResponseBodyDataTemplatesDbInstances();
            return TeaModel.build(map, self);
        }

        public GetWhitelistTemplateResponseBodyDataTemplatesDbInstances setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class GetWhitelistTemplateResponseBodyDataTemplates extends TeaModel {
        @NameInMap("DbInstances")
        public java.util.List<GetWhitelistTemplateResponseBodyDataTemplatesDbInstances> dbInstances;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.1,10.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <strong>example:</strong>
         * <p>g-asdfwem</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>demo_template</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static GetWhitelistTemplateResponseBodyDataTemplates build(java.util.Map<String, ?> map) throws Exception {
            GetWhitelistTemplateResponseBodyDataTemplates self = new GetWhitelistTemplateResponseBodyDataTemplates();
            return TeaModel.build(map, self);
        }

        public GetWhitelistTemplateResponseBodyDataTemplates setDbInstances(java.util.List<GetWhitelistTemplateResponseBodyDataTemplatesDbInstances> dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }
        public java.util.List<GetWhitelistTemplateResponseBodyDataTemplatesDbInstances> getDbInstances() {
            return this.dbInstances;
        }

        public GetWhitelistTemplateResponseBodyDataTemplates setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public GetWhitelistTemplateResponseBodyDataTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetWhitelistTemplateResponseBodyDataTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetWhitelistTemplateResponseBodyData extends TeaModel {
        @NameInMap("Templates")
        public java.util.List<GetWhitelistTemplateResponseBodyDataTemplates> templates;

        public static GetWhitelistTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWhitelistTemplateResponseBodyData self = new GetWhitelistTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWhitelistTemplateResponseBodyData setTemplates(java.util.List<GetWhitelistTemplateResponseBodyDataTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<GetWhitelistTemplateResponseBodyDataTemplates> getTemplates() {
            return this.templates;
        }

    }

}
