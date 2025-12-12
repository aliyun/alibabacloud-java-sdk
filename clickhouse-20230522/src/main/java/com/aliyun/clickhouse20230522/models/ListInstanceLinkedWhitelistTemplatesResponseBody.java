// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ListInstanceLinkedWhitelistTemplatesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListInstanceLinkedWhitelistTemplatesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstanceLinkedWhitelistTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceLinkedWhitelistTemplatesResponseBody self = new ListInstanceLinkedWhitelistTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceLinkedWhitelistTemplatesResponseBody setData(ListInstanceLinkedWhitelistTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstanceLinkedWhitelistTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListInstanceLinkedWhitelistTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstanceLinkedWhitelistTemplatesResponseBodyDataTemplates extends TeaModel {
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

        public static ListInstanceLinkedWhitelistTemplatesResponseBodyDataTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceLinkedWhitelistTemplatesResponseBodyDataTemplates self = new ListInstanceLinkedWhitelistTemplatesResponseBodyDataTemplates();
            return TeaModel.build(map, self);
        }

        public ListInstanceLinkedWhitelistTemplatesResponseBodyDataTemplates setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public ListInstanceLinkedWhitelistTemplatesResponseBodyDataTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListInstanceLinkedWhitelistTemplatesResponseBodyDataTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class ListInstanceLinkedWhitelistTemplatesResponseBodyData extends TeaModel {
        @NameInMap("Templates")
        public java.util.List<ListInstanceLinkedWhitelistTemplatesResponseBodyDataTemplates> templates;

        public static ListInstanceLinkedWhitelistTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceLinkedWhitelistTemplatesResponseBodyData self = new ListInstanceLinkedWhitelistTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceLinkedWhitelistTemplatesResponseBodyData setTemplates(java.util.List<ListInstanceLinkedWhitelistTemplatesResponseBodyDataTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<ListInstanceLinkedWhitelistTemplatesResponseBodyDataTemplates> getTemplates() {
            return this.templates;
        }

    }

}
