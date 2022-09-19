// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlTemplateGroupsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SqlTemplateGroups")
    public java.util.List<DescribeSqlTemplateGroupsResponseBodySqlTemplateGroups> sqlTemplateGroups;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSqlTemplateGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlTemplateGroupsResponseBody self = new DescribeSqlTemplateGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlTemplateGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlTemplateGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlTemplateGroupsResponseBody setSqlTemplateGroups(java.util.List<DescribeSqlTemplateGroupsResponseBodySqlTemplateGroups> sqlTemplateGroups) {
        this.sqlTemplateGroups = sqlTemplateGroups;
        return this;
    }
    public java.util.List<DescribeSqlTemplateGroupsResponseBodySqlTemplateGroups> getSqlTemplateGroups() {
        return this.sqlTemplateGroups;
    }

    public DescribeSqlTemplateGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSqlTemplateGroupsResponseBodySqlTemplateGroups extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TemplateGroupId")
        public Long templateGroupId;

        @NameInMap("TemplateGroupName")
        public String templateGroupName;

        public static DescribeSqlTemplateGroupsResponseBodySqlTemplateGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlTemplateGroupsResponseBodySqlTemplateGroups self = new DescribeSqlTemplateGroupsResponseBodySqlTemplateGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSqlTemplateGroupsResponseBodySqlTemplateGroups setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeSqlTemplateGroupsResponseBodySqlTemplateGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSqlTemplateGroupsResponseBodySqlTemplateGroups setTemplateGroupId(Long templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public Long getTemplateGroupId() {
            return this.templateGroupId;
        }

        public DescribeSqlTemplateGroupsResponseBodySqlTemplateGroups setTemplateGroupName(String templateGroupName) {
            this.templateGroupName = templateGroupName;
            return this;
        }
        public String getTemplateGroupName() {
            return this.templateGroupName;
        }

    }

}
