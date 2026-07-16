// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListVersionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7EBEC214-805D-5FE9-AEED-258FE0F8850F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version list of the site.</p>
     */
    @NameInMap("SiteVersionList")
    public java.util.List<ListVersionsResponseBodySiteVersionList> siteVersionList;

    public static ListVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsResponseBody self = new ListVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVersionsResponseBody setSiteVersionList(java.util.List<ListVersionsResponseBodySiteVersionList> siteVersionList) {
        this.siteVersionList = siteVersionList;
        return this;
    }
    public java.util.List<ListVersionsResponseBodySiteVersionList> getSiteVersionList() {
        return this.siteVersionList;
    }

    public static class ListVersionsResponseBodySiteVersionList extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-15T17:41:27+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>站点A使用多个环境。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The environment list of the site version. The version may have no environment or one or more environments configured, such as the default environment or environment 2.</p>
         */
        @NameInMap("EnvironmentNameList")
        public java.util.List<String> environmentNameList;

        /**
         * <p>The parent version of the site version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParentSiteVersion")
        public Integer parentSiteVersion;

        /**
         * <p>Indicates whether the version is read-only. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The site version.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><p><strong>online</strong>: active.</p>
         * </li>
         * <li><p><strong>configuring</strong>: being configured.</p>
         * </li>
         * <li><p><strong>configure_faild</strong>: configuration failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-15T17:41:27+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListVersionsResponseBodySiteVersionList build(java.util.Map<String, ?> map) throws Exception {
            ListVersionsResponseBodySiteVersionList self = new ListVersionsResponseBodySiteVersionList();
            return TeaModel.build(map, self);
        }

        public ListVersionsResponseBodySiteVersionList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVersionsResponseBodySiteVersionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVersionsResponseBodySiteVersionList setEnvironmentNameList(java.util.List<String> environmentNameList) {
            this.environmentNameList = environmentNameList;
            return this;
        }
        public java.util.List<String> getEnvironmentNameList() {
            return this.environmentNameList;
        }

        public ListVersionsResponseBodySiteVersionList setParentSiteVersion(Integer parentSiteVersion) {
            this.parentSiteVersion = parentSiteVersion;
            return this;
        }
        public Integer getParentSiteVersion() {
            return this.parentSiteVersion;
        }

        public ListVersionsResponseBodySiteVersionList setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ListVersionsResponseBodySiteVersionList setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public ListVersionsResponseBodySiteVersionList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVersionsResponseBodySiteVersionList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
