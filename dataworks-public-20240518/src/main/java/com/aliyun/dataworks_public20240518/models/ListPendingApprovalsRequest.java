// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPendingApprovalsRequest extends TeaModel {
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
    public ListPendingApprovalsRequestGrantee grantee;

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
    public ListPendingApprovalsRequestResource resource;

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

    public static ListPendingApprovalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPendingApprovalsRequest self = new ListPendingApprovalsRequest();
        return TeaModel.build(map, self);
    }

    public ListPendingApprovalsRequest setAccessTypes(java.util.List<String> accessTypes) {
        this.accessTypes = accessTypes;
        return this;
    }
    public java.util.List<String> getAccessTypes() {
        return this.accessTypes;
    }

    public ListPendingApprovalsRequest setDefSchema(String defSchema) {
        this.defSchema = defSchema;
        return this;
    }
    public String getDefSchema() {
        return this.defSchema;
    }

    public ListPendingApprovalsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListPendingApprovalsRequest setGrantee(ListPendingApprovalsRequestGrantee grantee) {
        this.grantee = grantee;
        return this;
    }
    public ListPendingApprovalsRequestGrantee getGrantee() {
        return this.grantee;
    }

    public ListPendingApprovalsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPendingApprovalsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPendingApprovalsRequest setResource(ListPendingApprovalsRequestResource resource) {
        this.resource = resource;
        return this;
    }
    public ListPendingApprovalsRequestResource getResource() {
        return this.resource;
    }

    public ListPendingApprovalsRequest setResourceType(java.util.List<String> resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public java.util.List<String> getResourceType() {
        return this.resourceType;
    }

    public ListPendingApprovalsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class ListPendingApprovalsRequestGrantee extends TeaModel {
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

        public static ListPendingApprovalsRequestGrantee build(java.util.Map<String, ?> map) throws Exception {
            ListPendingApprovalsRequestGrantee self = new ListPendingApprovalsRequestGrantee();
            return TeaModel.build(map, self);
        }

        public ListPendingApprovalsRequestGrantee setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListPendingApprovalsRequestGrantee setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListPendingApprovalsRequestResource extends TeaModel {
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

        public static ListPendingApprovalsRequestResource build(java.util.Map<String, ?> map) throws Exception {
            ListPendingApprovalsRequestResource self = new ListPendingApprovalsRequestResource();
            return TeaModel.build(map, self);
        }

        public ListPendingApprovalsRequestResource setDefSchema(String defSchema) {
            this.defSchema = defSchema;
            return this;
        }
        public String getDefSchema() {
            return this.defSchema;
        }

        public ListPendingApprovalsRequestResource setDefVersion(String defVersion) {
            this.defVersion = defVersion;
            return this;
        }
        public String getDefVersion() {
            return this.defVersion;
        }

        public ListPendingApprovalsRequestResource setMetaData(java.util.Map<String, ?> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

    }

}
