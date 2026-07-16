// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEnvironmentsResponseBody extends TeaModel {
    /**
     * <p>The list of environments.</p>
     */
    @NameInMap("EnvironmentList")
    public java.util.List<ListEnvironmentsResponseBodyEnvironmentList> environmentList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEnvironmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsResponseBody self = new ListEnvironmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsResponseBody setEnvironmentList(java.util.List<ListEnvironmentsResponseBodyEnvironmentList> environmentList) {
        this.environmentList = environmentList;
        return this;
    }
    public java.util.List<ListEnvironmentsResponseBodyEnvironmentList> getEnvironmentList() {
        return this.environmentList;
    }

    public ListEnvironmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEnvironmentsResponseBodyEnvironmentList extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-15T08:15:30Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The environment name.</p>
         * 
         * <strong>example:</strong>
         * <p>yichao-test-yctest</p>
         */
        @NameInMap("EnvironmentName")
        public String environmentName;

        /**
         * <p>Indicates whether this is the default environment.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The previous version number.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("PreSiteVersion")
        public Integer preSiteVersion;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>Indicates whether the environment is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The environment rule.</p>
         * 
         * <strong>example:</strong>
         * <p>(&quot;ip&quot; eq &quot;1.1.1.1&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The site version number.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-15T08:16:04Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListEnvironmentsResponseBodyEnvironmentList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyEnvironmentList self = new ListEnvironmentsResponseBodyEnvironmentList();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyEnvironmentList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEnvironmentsResponseBodyEnvironmentList setEnvironmentName(String environmentName) {
            this.environmentName = environmentName;
            return this;
        }
        public String getEnvironmentName() {
            return this.environmentName;
        }

        public ListEnvironmentsResponseBodyEnvironmentList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListEnvironmentsResponseBodyEnvironmentList setPreSiteVersion(Integer preSiteVersion) {
            this.preSiteVersion = preSiteVersion;
            return this;
        }
        public Integer getPreSiteVersion() {
            return this.preSiteVersion;
        }

        public ListEnvironmentsResponseBodyEnvironmentList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListEnvironmentsResponseBodyEnvironmentList setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ListEnvironmentsResponseBodyEnvironmentList setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListEnvironmentsResponseBodyEnvironmentList setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public ListEnvironmentsResponseBodyEnvironmentList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
