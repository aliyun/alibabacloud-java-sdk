// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListAutoDisposeEntitiesResponseBody extends TeaModel {
    /**
     * <p>A list of AI-powered automated analysis entities.</p>
     */
    @NameInMap("AutoDecisionEntities")
    public java.util.List<ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities> autoDecisionEntities;

    /**
     * <p>The current page number. The value must be greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The maximum number of entries returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. An empty value indicates that all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAutoDisposeEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoDisposeEntitiesResponseBody self = new ListAutoDisposeEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoDisposeEntitiesResponseBody setAutoDecisionEntities(java.util.List<ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities> autoDecisionEntities) {
        this.autoDecisionEntities = autoDecisionEntities;
        return this;
    }
    public java.util.List<ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities> getAutoDecisionEntities() {
        return this.autoDecisionEntities;
    }

    public ListAutoDisposeEntitiesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAutoDisposeEntitiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAutoDisposeEntitiesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAutoDisposeEntitiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAutoDisposeEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoDisposeEntitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities extends TeaModel {
        /**
         * <p>The alert rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20403189</p>
         */
        @NameInMap("AlertId")
        public String alertId;

        /**
         * <p>The disposal method. Valid values:</p>
         * <ul>
         * <li><p><code>ignore</code>: Ignore.</p>
         * </li>
         * <li><p><code>dispose</code>: Playbook-based disposal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dispose</p>
         */
        @NameInMap("DisposalMethod")
        public String disposalMethod;

        /**
         * <p>The disposal ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1ec121479b341a61886dbd2c4ccd*****</p>
         */
        @NameInMap("DisposeRecordId")
        public String disposeRecordId;

        /**
         * <p>The entity name.</p>
         * 
         * <strong>example:</strong>
         * <p>/apps/ext/ka****</p>
         */
        @NameInMap("EntityName")
        public String entityName;

        /**
         * <p>The entity type. Valid values:</p>
         * <ul>
         * <li><p><code>ip</code>: An IP address.</p>
         * </li>
         * <li><p><code>domain</code>: A domain.</p>
         * </li>
         * <li><p><code>process</code>: A process.</p>
         * </li>
         * <li><p><code>file</code>: A file.</p>
         * </li>
         * <li><p><code>host</code>: A host.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>process</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The entity UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>022ed6c601514a370cc9e3acd37a****</p>
         */
        @NameInMap("EntityUuid")
        public String entityUuid;

        /**
         * <p>The playbook UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>6fd2b143-e420-4c1b-a118-e764*****</p>
         */
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        /**
         * <p>The unique identifier (UUID) of the entry.</p>
         * 
         * <strong>example:</strong>
         * <p>0d23f133-22d7-4388-b738-ab******</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities build(java.util.Map<String, ?> map) throws Exception {
            ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities self = new ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities();
            return TeaModel.build(map, self);
        }

        public ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities setAlertId(String alertId) {
            this.alertId = alertId;
            return this;
        }
        public String getAlertId() {
            return this.alertId;
        }

        public ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities setDisposalMethod(String disposalMethod) {
            this.disposalMethod = disposalMethod;
            return this;
        }
        public String getDisposalMethod() {
            return this.disposalMethod;
        }

        public ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities setDisposeRecordId(String disposeRecordId) {
            this.disposeRecordId = disposeRecordId;
            return this;
        }
        public String getDisposeRecordId() {
            return this.disposeRecordId;
        }

        public ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities setEntityUuid(String entityUuid) {
            this.entityUuid = entityUuid;
            return this;
        }
        public String getEntityUuid() {
            return this.entityUuid;
        }

        public ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        public ListAutoDisposeEntitiesResponseBodyAutoDecisionEntities setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
