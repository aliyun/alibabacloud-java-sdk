// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateWhitelistTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateWhitelistTemplateResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWhitelistTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistTemplateResponseBody self = new CreateWhitelistTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistTemplateResponseBody setData(CreateWhitelistTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWhitelistTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateWhitelistTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateWhitelistTemplateResponseBodyDataTemplates extends TeaModel {
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

        public static CreateWhitelistTemplateResponseBodyDataTemplates build(java.util.Map<String, ?> map) throws Exception {
            CreateWhitelistTemplateResponseBodyDataTemplates self = new CreateWhitelistTemplateResponseBodyDataTemplates();
            return TeaModel.build(map, self);
        }

        public CreateWhitelistTemplateResponseBodyDataTemplates setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public CreateWhitelistTemplateResponseBodyDataTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateWhitelistTemplateResponseBodyDataTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class CreateWhitelistTemplateResponseBodyData extends TeaModel {
        @NameInMap("Templates")
        public java.util.List<CreateWhitelistTemplateResponseBodyDataTemplates> templates;

        public static CreateWhitelistTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWhitelistTemplateResponseBodyData self = new CreateWhitelistTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWhitelistTemplateResponseBodyData setTemplates(java.util.List<CreateWhitelistTemplateResponseBodyDataTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<CreateWhitelistTemplateResponseBodyDataTemplates> getTemplates() {
            return this.templates;
        }

    }

}
