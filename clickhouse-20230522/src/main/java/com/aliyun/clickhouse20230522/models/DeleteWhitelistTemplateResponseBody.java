// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteWhitelistTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteWhitelistTemplateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWhitelistTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhitelistTemplateResponseBody self = new DeleteWhitelistTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWhitelistTemplateResponseBody setData(DeleteWhitelistTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteWhitelistTemplateResponseBodyData getData() {
        return this.data;
    }

    public DeleteWhitelistTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteWhitelistTemplateResponseBodyDataTemplatesDbInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>asdfwef</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        public static DeleteWhitelistTemplateResponseBodyDataTemplatesDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DeleteWhitelistTemplateResponseBodyDataTemplatesDbInstances self = new DeleteWhitelistTemplateResponseBodyDataTemplatesDbInstances();
            return TeaModel.build(map, self);
        }

        public DeleteWhitelistTemplateResponseBodyDataTemplatesDbInstances setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

    }

    public static class DeleteWhitelistTemplateResponseBodyDataTemplates extends TeaModel {
        @NameInMap("DbInstances")
        public java.util.List<DeleteWhitelistTemplateResponseBodyDataTemplatesDbInstances> dbInstances;

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

        public static DeleteWhitelistTemplateResponseBodyDataTemplates build(java.util.Map<String, ?> map) throws Exception {
            DeleteWhitelistTemplateResponseBodyDataTemplates self = new DeleteWhitelistTemplateResponseBodyDataTemplates();
            return TeaModel.build(map, self);
        }

        public DeleteWhitelistTemplateResponseBodyDataTemplates setDbInstances(java.util.List<DeleteWhitelistTemplateResponseBodyDataTemplatesDbInstances> dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }
        public java.util.List<DeleteWhitelistTemplateResponseBodyDataTemplatesDbInstances> getDbInstances() {
            return this.dbInstances;
        }

        public DeleteWhitelistTemplateResponseBodyDataTemplates setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DeleteWhitelistTemplateResponseBodyDataTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class DeleteWhitelistTemplateResponseBodyData extends TeaModel {
        @NameInMap("Templates")
        public java.util.List<DeleteWhitelistTemplateResponseBodyDataTemplates> templates;

        public static DeleteWhitelistTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteWhitelistTemplateResponseBodyData self = new DeleteWhitelistTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteWhitelistTemplateResponseBodyData setTemplates(java.util.List<DeleteWhitelistTemplateResponseBodyDataTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<DeleteWhitelistTemplateResponseBodyDataTemplates> getTemplates() {
            return this.templates;
        }

    }

}
