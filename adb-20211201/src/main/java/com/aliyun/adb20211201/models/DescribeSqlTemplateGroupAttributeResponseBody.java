// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlTemplateGroupAttributeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SqlTemplateGroup")
    public DescribeSqlTemplateGroupAttributeResponseBodySqlTemplateGroup sqlTemplateGroup;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSqlTemplateGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlTemplateGroupAttributeResponseBody self = new DescribeSqlTemplateGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlTemplateGroupAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlTemplateGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlTemplateGroupAttributeResponseBody setSqlTemplateGroup(DescribeSqlTemplateGroupAttributeResponseBodySqlTemplateGroup sqlTemplateGroup) {
        this.sqlTemplateGroup = sqlTemplateGroup;
        return this;
    }
    public DescribeSqlTemplateGroupAttributeResponseBodySqlTemplateGroup getSqlTemplateGroup() {
        return this.sqlTemplateGroup;
    }

    public DescribeSqlTemplateGroupAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSqlTemplateGroupAttributeResponseBodySqlTemplateGroup extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TemplateGroupId")
        public Long templateGroupId;

        @NameInMap("TemplateGroupName")
        public String templateGroupName;

        public static DescribeSqlTemplateGroupAttributeResponseBodySqlTemplateGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlTemplateGroupAttributeResponseBodySqlTemplateGroup self = new DescribeSqlTemplateGroupAttributeResponseBodySqlTemplateGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSqlTemplateGroupAttributeResponseBodySqlTemplateGroup setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeSqlTemplateGroupAttributeResponseBodySqlTemplateGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSqlTemplateGroupAttributeResponseBodySqlTemplateGroup setTemplateGroupId(Long templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public Long getTemplateGroupId() {
            return this.templateGroupId;
        }

        public DescribeSqlTemplateGroupAttributeResponseBodySqlTemplateGroup setTemplateGroupName(String templateGroupName) {
            this.templateGroupName = templateGroupName;
            return this;
        }
        public String getTemplateGroupName() {
            return this.templateGroupName;
        }

    }

}
