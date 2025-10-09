// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityTemplatesResponseBody extends TeaModel {
    /**
     * <p>Paged query results of data quality rule templates.</p>
     */
    @NameInMap("PageInfo")
    public ListDataQualityTemplatesResponseBodyPageInfo pageInfo;

    /**
     * <p>The API request ID, which is generated as a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc14115***159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityTemplatesResponseBody self = new ListDataQualityTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityTemplatesResponseBody setPageInfo(ListDataQualityTemplatesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListDataQualityTemplatesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListDataQualityTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates extends TeaModel {
        /**
         * <p>The time when the data quality rule template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1729816478147</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator of the data quality rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>7892346529452</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The ID of the data quality rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>819cf1f8-29be-4f94-a9d0-c5c06c0c3d2a</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the data quality rule template was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1729816478147</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The last updater of the data quality rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>205250754596036836</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The owner of the data quality rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>205250754596036836</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7635</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Specific configurations of the data quality rule template. For more information, see <a href="~2963394~">Data quality Spec configuration description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;assertion&quot;: &quot;anomaly detection fro id_not_null_cnt&quot;,
         *     &quot;id_not_null_cnt&quot;: {
         *         &quot;query&quot;: &quot;SELECT COUNT(*) AS cnt FROM ${tableName} WHERE dt = \&quot;$[yyyymmdd-1]\&quot;;&quot;
         *     },
         *     &quot;identity&quot;: &quot;819cf1f8-29be-4f94-a9d0-c5c06c0c3d2a&quot;
         * }</p>
         */
        @NameInMap("Spec")
        public String spec;

        public static ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates self = new ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates();
            return TeaModel.build(map, self);
        }

        public ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ListDataQualityTemplatesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The list of rule templates.</p>
         */
        @NameInMap("DataQualityTemplates")
        public java.util.List<ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates> dataQualityTemplates;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataQualityTemplatesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityTemplatesResponseBodyPageInfo self = new ListDataQualityTemplatesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityTemplatesResponseBodyPageInfo setDataQualityTemplates(java.util.List<ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates> dataQualityTemplates) {
            this.dataQualityTemplates = dataQualityTemplates;
            return this;
        }
        public java.util.List<ListDataQualityTemplatesResponseBodyPageInfoDataQualityTemplates> getDataQualityTemplates() {
            return this.dataQualityTemplates;
        }

        public ListDataQualityTemplatesResponseBodyPageInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityTemplatesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityTemplatesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
