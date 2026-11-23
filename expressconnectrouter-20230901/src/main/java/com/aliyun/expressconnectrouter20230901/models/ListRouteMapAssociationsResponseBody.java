// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ListRouteMapAssociationsResponseBody extends TeaModel {
    /**
     * <p>The details of the access denied error.</p>
     * 
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code that indicates whether the call is successful. A value of 200 indicates success. Other values indicate failure. For more information about the causes of failure, see error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>IllegalParamFormat.EcrId</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace <code>%s</code> in the <strong>ErrMessage</strong> error message.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the <strong>DtsJobId</strong> request parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The param format of EcrId **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The message returned for the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token that is used to start the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query is to be sent.</li>
     * <li>If <strong>NextToken</strong> has a return value, the value indicates the token used to start the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>e0a2dbeb69a8beeeb8194e92b702df3fd3e7bfe6ce7bfc16e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05130E79-588D-5C40-A718-C4863A59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of route map associations.</p>
     */
    @NameInMap("RouteMapAssociationList")
    public java.util.List<ListRouteMapAssociationsResponseBodyRouteMapAssociationList> routeMapAssociationList;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: The call is successful.</li>
     * <li><strong>False</strong>: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of route map associations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRouteMapAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRouteMapAssociationsResponseBody self = new ListRouteMapAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRouteMapAssociationsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListRouteMapAssociationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRouteMapAssociationsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListRouteMapAssociationsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListRouteMapAssociationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRouteMapAssociationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRouteMapAssociationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRouteMapAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRouteMapAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRouteMapAssociationsResponseBody setRouteMapAssociationList(java.util.List<ListRouteMapAssociationsResponseBodyRouteMapAssociationList> routeMapAssociationList) {
        this.routeMapAssociationList = routeMapAssociationList;
        return this;
    }
    public java.util.List<ListRouteMapAssociationsResponseBodyRouteMapAssociationList> getRouteMapAssociationList() {
        return this.routeMapAssociationList;
    }

    public ListRouteMapAssociationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRouteMapAssociationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRouteMapAssociationsResponseBodyRouteMapAssociationList extends TeaModel {
        /**
         * <p>The ID of the route map association.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-routemap-assoc-qdoeneegffq4yv****</p>
         */
        @NameInMap("AssociationId")
        public String associationId;

        /**
         * <p>The direction in which the routing policy is applied. Valid values:</p>
         * <ul>
         * <li><strong>Inbound</strong>: the inbound region gateway direction, indicating the direction in which routing is transmitted to the Express Connect Router (ECR).</li>
         * <li><strong>Outbound</strong>: the outbound region gateway direction, indicating the direction in which routing is transmitted from the Express Connect Router (ECR).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inbound</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The instance ID of the Express Connect Router (ECR).</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-mezk2idmsd0vx2****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <p>The time when the route map association was created.</p>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16T03:34:09Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the route map association was updated.</p>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-29T03:27:24Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The priority of the route map. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The list of region IDs where the route map is distributed and takes effect.</p>
         */
        @NameInMap("RegionIdList")
        public java.util.List<String> regionIdList;

        /**
         * <p>The ID of the route map.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-6m58b17417tg5a****</p>
         */
        @NameInMap("RouteMapId")
        public String routeMapId;

        /**
         * <p>The status of the route map association. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: The association is being created.</li>
         * <li><strong>ACTIVE</strong>: The association is in a normal state, and no operations are in progress.</li>
         * <li><strong>DELETING</strong>: The association is being deleted.</li>
         * <li><strong>UPDATING</strong>: The association is being updated.</li>
         * <li><strong>DELETED</strong>: The association is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version number of the route map. The version number increments when the route map in the CEN is changed.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public Long version;

        public static ListRouteMapAssociationsResponseBodyRouteMapAssociationList build(java.util.Map<String, ?> map) throws Exception {
            ListRouteMapAssociationsResponseBodyRouteMapAssociationList self = new ListRouteMapAssociationsResponseBodyRouteMapAssociationList();
            return TeaModel.build(map, self);
        }

        public ListRouteMapAssociationsResponseBodyRouteMapAssociationList setAssociationId(String associationId) {
            this.associationId = associationId;
            return this;
        }
        public String getAssociationId() {
            return this.associationId;
        }

        public ListRouteMapAssociationsResponseBodyRouteMapAssociationList setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public ListRouteMapAssociationsResponseBodyRouteMapAssociationList setEcrId(String ecrId) {
            this.ecrId = ecrId;
            return this;
        }
        public String getEcrId() {
            return this.ecrId;
        }

        public ListRouteMapAssociationsResponseBodyRouteMapAssociationList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListRouteMapAssociationsResponseBodyRouteMapAssociationList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListRouteMapAssociationsResponseBodyRouteMapAssociationList setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ListRouteMapAssociationsResponseBodyRouteMapAssociationList setRegionIdList(java.util.List<String> regionIdList) {
            this.regionIdList = regionIdList;
            return this;
        }
        public java.util.List<String> getRegionIdList() {
            return this.regionIdList;
        }

        public ListRouteMapAssociationsResponseBodyRouteMapAssociationList setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public ListRouteMapAssociationsResponseBodyRouteMapAssociationList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRouteMapAssociationsResponseBodyRouteMapAssociationList setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
