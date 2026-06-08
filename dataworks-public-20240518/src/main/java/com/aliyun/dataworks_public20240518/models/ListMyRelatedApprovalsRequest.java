// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMyRelatedApprovalsRequest extends TeaModel {
    @NameInMap("AccessTypes")
    public java.util.List<String> accessTypes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("DefSchema")
    public String defSchema;

    /**
     * <strong>example:</strong>
     * <p>1779724799999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Grantee")
    public ListMyRelatedApprovalsRequestGrantee grantee;

    /**
     * <strong>example:</strong>
     * <p>eyJpZCI6MTIzfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Resource")
    public ListMyRelatedApprovalsRequestResource resource;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;table&quot;, &quot;column&quot;]</p>
     */
    @NameInMap("ResourceType")
    public java.util.List<String> resourceType;

    /**
     * <strong>example:</strong>
     * <p>1771948800000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>WAIT_APPROVAL</p>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListMyRelatedApprovalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyRelatedApprovalsRequest self = new ListMyRelatedApprovalsRequest();
        return TeaModel.build(map, self);
    }

    public ListMyRelatedApprovalsRequest setAccessTypes(java.util.List<String> accessTypes) {
        this.accessTypes = accessTypes;
        return this;
    }
    public java.util.List<String> getAccessTypes() {
        return this.accessTypes;
    }

    public ListMyRelatedApprovalsRequest setDefSchema(String defSchema) {
        this.defSchema = defSchema;
        return this;
    }
    public String getDefSchema() {
        return this.defSchema;
    }

    public ListMyRelatedApprovalsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListMyRelatedApprovalsRequest setGrantee(ListMyRelatedApprovalsRequestGrantee grantee) {
        this.grantee = grantee;
        return this;
    }
    public ListMyRelatedApprovalsRequestGrantee getGrantee() {
        return this.grantee;
    }

    public ListMyRelatedApprovalsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMyRelatedApprovalsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMyRelatedApprovalsRequest setResource(ListMyRelatedApprovalsRequestResource resource) {
        this.resource = resource;
        return this;
    }
    public ListMyRelatedApprovalsRequestResource getResource() {
        return this.resource;
    }

    public ListMyRelatedApprovalsRequest setResourceType(java.util.List<String> resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public java.util.List<String> getResourceType() {
        return this.resourceType;
    }

    public ListMyRelatedApprovalsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListMyRelatedApprovalsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static class ListMyRelatedApprovalsRequestGrantee extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ROLE_3133343434</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <strong>example:</strong>
         * <p>RamRole</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static ListMyRelatedApprovalsRequestGrantee build(java.util.Map<String, ?> map) throws Exception {
            ListMyRelatedApprovalsRequestGrantee self = new ListMyRelatedApprovalsRequestGrantee();
            return TeaModel.build(map, self);
        }

        public ListMyRelatedApprovalsRequestGrantee setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListMyRelatedApprovalsRequestGrantee setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListMyRelatedApprovalsRequestResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        @NameInMap("MetaData")
        public java.util.Map<String, ?> metaData;

        public static ListMyRelatedApprovalsRequestResource build(java.util.Map<String, ?> map) throws Exception {
            ListMyRelatedApprovalsRequestResource self = new ListMyRelatedApprovalsRequestResource();
            return TeaModel.build(map, self);
        }

        public ListMyRelatedApprovalsRequestResource setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListMyRelatedApprovalsRequestResource setDefVersion(String defVersion) {
            this.defVersion = defVersion;
            return this;
        }
        public String getDefVersion() {
            return this.defVersion;
        }

        public ListMyRelatedApprovalsRequestResource setMetaData(java.util.Map<String, ?> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

    }

}
