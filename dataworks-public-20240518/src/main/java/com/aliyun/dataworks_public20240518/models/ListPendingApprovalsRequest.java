// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPendingApprovalsRequest extends TeaModel {
    /**
     * <p>The access types.</p>
     */
    @NameInMap("AccessTypes")
    public java.util.List<String> accessTypes;

    /**
     * <p>The resource schema type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("DefSchema")
    public String defSchema;

    /**
     * <p>The end time of the query range, specified as a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1779724799999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The grantee object used to filter results.</p>
     */
    @NameInMap("Grantee")
    public ListPendingApprovalsRequestGrantee grantee;

    /**
     * <p>The token used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJpZCI6MTIzfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return per page. Default: 10. Maximum: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The criteria to filter resources.</p>
     */
    @NameInMap("Resource")
    public ListPendingApprovalsRequestResource resource;

    /**
     * <p>The resource type, which corresponds to a leaf node name. You can specify multiple values. A business context can map to multiple leaf node names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;table&quot;, &quot;column&quot;]</p>
     */
    @NameInMap("ResourceType")
    public java.util.List<String> resourceType;

    /**
     * <p>The start time of the query range, specified as a Unix timestamp in milliseconds.</p>
     * 
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
         * <p>The ID of the principal.</p>
         * 
         * <strong>example:</strong>
         * <p>ROLE_3133343434</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The type of principal.</p>
         * 
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
         * <p>The <code>name</code> of the <code>ResourceSchema</code> used to parse the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("DefSchema")
        public String defSchema;

        /**
         * <p>The <code>version</code> of the <code>ResourceSchema</code> used to parse the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("DefVersion")
        public String defVersion;

        /**
         * <p>The resource metadata. Its content is constrained by the <code>ResourceSchema</code>.</p>
         */
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
