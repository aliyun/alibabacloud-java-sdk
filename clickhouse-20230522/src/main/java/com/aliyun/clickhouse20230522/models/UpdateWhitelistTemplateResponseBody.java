// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class UpdateWhitelistTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateWhitelistTemplateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWhitelistTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhitelistTemplateResponseBody self = new UpdateWhitelistTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWhitelistTemplateResponseBody setData(UpdateWhitelistTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateWhitelistTemplateResponseBodyData getData() {
        return this.data;
    }

    public UpdateWhitelistTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateWhitelistTemplateResponseBodyDataTemplatesDbInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>asdfwef</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        public static UpdateWhitelistTemplateResponseBodyDataTemplatesDbInstances build(java.util.Map<String, ?> map) throws Exception {
            UpdateWhitelistTemplateResponseBodyDataTemplatesDbInstances self = new UpdateWhitelistTemplateResponseBodyDataTemplatesDbInstances();
            return TeaModel.build(map, self);
        }

        public UpdateWhitelistTemplateResponseBodyDataTemplatesDbInstances setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

    }

    public static class UpdateWhitelistTemplateResponseBodyDataTemplates extends TeaModel {
        @NameInMap("DbInstances")
        public java.util.List<UpdateWhitelistTemplateResponseBodyDataTemplatesDbInstances> dbInstances;

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

        public static UpdateWhitelistTemplateResponseBodyDataTemplates build(java.util.Map<String, ?> map) throws Exception {
            UpdateWhitelistTemplateResponseBodyDataTemplates self = new UpdateWhitelistTemplateResponseBodyDataTemplates();
            return TeaModel.build(map, self);
        }

        public UpdateWhitelistTemplateResponseBodyDataTemplates setDbInstances(java.util.List<UpdateWhitelistTemplateResponseBodyDataTemplatesDbInstances> dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }
        public java.util.List<UpdateWhitelistTemplateResponseBodyDataTemplatesDbInstances> getDbInstances() {
            return this.dbInstances;
        }

        public UpdateWhitelistTemplateResponseBodyDataTemplates setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public UpdateWhitelistTemplateResponseBodyDataTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class UpdateWhitelistTemplateResponseBodyData extends TeaModel {
        @NameInMap("Templates")
        public java.util.List<UpdateWhitelistTemplateResponseBodyDataTemplates> templates;

        public static UpdateWhitelistTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateWhitelistTemplateResponseBodyData self = new UpdateWhitelistTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateWhitelistTemplateResponseBodyData setTemplates(java.util.List<UpdateWhitelistTemplateResponseBodyDataTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<UpdateWhitelistTemplateResponseBodyDataTemplates> getTemplates() {
            return this.templates;
        }

    }

}
