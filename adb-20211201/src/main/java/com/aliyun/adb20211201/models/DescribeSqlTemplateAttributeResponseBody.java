// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlTemplateAttributeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SqlTemplate")
    public DescribeSqlTemplateAttributeResponseBodySqlTemplate sqlTemplate;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSqlTemplateAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlTemplateAttributeResponseBody self = new DescribeSqlTemplateAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlTemplateAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlTemplateAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlTemplateAttributeResponseBody setSqlTemplate(DescribeSqlTemplateAttributeResponseBodySqlTemplate sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
        return this;
    }
    public DescribeSqlTemplateAttributeResponseBodySqlTemplate getSqlTemplate() {
        return this.sqlTemplate;
    }

    public DescribeSqlTemplateAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSqlTemplateAttributeResponseBodySqlTemplate extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateValue")
        public String templateValue;

        public static DescribeSqlTemplateAttributeResponseBodySqlTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlTemplateAttributeResponseBodySqlTemplate self = new DescribeSqlTemplateAttributeResponseBodySqlTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeSqlTemplateAttributeResponseBodySqlTemplate setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeSqlTemplateAttributeResponseBodySqlTemplate setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSqlTemplateAttributeResponseBodySqlTemplate setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public DescribeSqlTemplateAttributeResponseBodySqlTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeSqlTemplateAttributeResponseBodySqlTemplate setTemplateValue(String templateValue) {
            this.templateValue = templateValue;
            return this;
        }
        public String getTemplateValue() {
            return this.templateValue;
        }

    }

}
