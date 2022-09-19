// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlTemplatesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SqlTemplateGroups")
    public java.util.List<DescribeSqlTemplatesResponseBodySqlTemplateGroups> sqlTemplateGroups;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSqlTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlTemplatesResponseBody self = new DescribeSqlTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlTemplatesResponseBody setSqlTemplateGroups(java.util.List<DescribeSqlTemplatesResponseBodySqlTemplateGroups> sqlTemplateGroups) {
        this.sqlTemplateGroups = sqlTemplateGroups;
        return this;
    }
    public java.util.List<DescribeSqlTemplatesResponseBodySqlTemplateGroups> getSqlTemplateGroups() {
        return this.sqlTemplateGroups;
    }

    public DescribeSqlTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates extends TeaModel {
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

        public static DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates self = new DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates setTemplateValue(String templateValue) {
            this.templateValue = templateValue;
            return this;
        }
        public String getTemplateValue() {
            return this.templateValue;
        }

    }

    public static class DescribeSqlTemplatesResponseBodySqlTemplateGroups extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SqlTemplates")
        public java.util.List<DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates> sqlTemplates;

        @NameInMap("TemplateGroupId")
        public Long templateGroupId;

        @NameInMap("TemplateGroupName")
        public String templateGroupName;

        public static DescribeSqlTemplatesResponseBodySqlTemplateGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlTemplatesResponseBodySqlTemplateGroups self = new DescribeSqlTemplatesResponseBodySqlTemplateGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSqlTemplatesResponseBodySqlTemplateGroups setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeSqlTemplatesResponseBodySqlTemplateGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSqlTemplatesResponseBodySqlTemplateGroups setSqlTemplates(java.util.List<DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates> sqlTemplates) {
            this.sqlTemplates = sqlTemplates;
            return this;
        }
        public java.util.List<DescribeSqlTemplatesResponseBodySqlTemplateGroupsSqlTemplates> getSqlTemplates() {
            return this.sqlTemplates;
        }

        public DescribeSqlTemplatesResponseBodySqlTemplateGroups setTemplateGroupId(Long templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public Long getTemplateGroupId() {
            return this.templateGroupId;
        }

        public DescribeSqlTemplatesResponseBodySqlTemplateGroups setTemplateGroupName(String templateGroupName) {
            this.templateGroupName = templateGroupName;
            return this;
        }
        public String getTemplateGroupName() {
            return this.templateGroupName;
        }

    }

}
