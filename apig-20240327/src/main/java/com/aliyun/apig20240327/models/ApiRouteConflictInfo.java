// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ApiRouteConflictInfo extends TeaModel {
    /**
     * <p>The conflicts.</p>
     */
    @NameInMap("conflicts")
    public java.util.List<ApiRouteConflictInfoConflicts> conflicts;

    /**
     * <p>The conflicting routes.</p>
     */
    @NameInMap("domainInfo")
    public ApiRouteConflictInfoDomainInfo domainInfo;

    public static ApiRouteConflictInfo build(java.util.Map<String, ?> map) throws Exception {
        ApiRouteConflictInfo self = new ApiRouteConflictInfo();
        return TeaModel.build(map, self);
    }

    public ApiRouteConflictInfo setConflicts(java.util.List<ApiRouteConflictInfoConflicts> conflicts) {
        this.conflicts = conflicts;
        return this;
    }
    public java.util.List<ApiRouteConflictInfoConflicts> getConflicts() {
        return this.conflicts;
    }

    public ApiRouteConflictInfo setDomainInfo(ApiRouteConflictInfoDomainInfo domainInfo) {
        this.domainInfo = domainInfo;
        return this;
    }
    public ApiRouteConflictInfoDomainInfo getDomainInfo() {
        return this.domainInfo;
    }

    public static class ApiRouteConflictInfoConflictsDetailsConflictingMatchOperationInfo extends TeaModel {
        /**
         * <p>The operation name.</p>
         * 
         * <strong>example:</strong>
         * <p>GetItem</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>op-cq35jadlhtgrv07***</p>
         */
        @NameInMap("operationId")
        public String operationId;

        public static ApiRouteConflictInfoConflictsDetailsConflictingMatchOperationInfo build(java.util.Map<String, ?> map) throws Exception {
            ApiRouteConflictInfoConflictsDetailsConflictingMatchOperationInfo self = new ApiRouteConflictInfoConflictsDetailsConflictingMatchOperationInfo();
            return TeaModel.build(map, self);
        }

        public ApiRouteConflictInfoConflictsDetailsConflictingMatchOperationInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ApiRouteConflictInfoConflictsDetailsConflictingMatchOperationInfo setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

    }

    public static class ApiRouteConflictInfoConflictsDetailsConflictingMatch extends TeaModel {
        /**
         * <p>The matching rule.</p>
         */
        @NameInMap("match")
        public HttpRouteMatch match;

        /**
         * <p>The corresponding operation information if the conflicting target is an API.</p>
         */
        @NameInMap("operationInfo")
        public ApiRouteConflictInfoConflictsDetailsConflictingMatchOperationInfo operationInfo;

        public static ApiRouteConflictInfoConflictsDetailsConflictingMatch build(java.util.Map<String, ?> map) throws Exception {
            ApiRouteConflictInfoConflictsDetailsConflictingMatch self = new ApiRouteConflictInfoConflictsDetailsConflictingMatch();
            return TeaModel.build(map, self);
        }

        public ApiRouteConflictInfoConflictsDetailsConflictingMatch setMatch(HttpRouteMatch match) {
            this.match = match;
            return this;
        }
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        public ApiRouteConflictInfoConflictsDetailsConflictingMatch setOperationInfo(ApiRouteConflictInfoConflictsDetailsConflictingMatchOperationInfo operationInfo) {
            this.operationInfo = operationInfo;
            return this;
        }
        public ApiRouteConflictInfoConflictsDetailsConflictingMatchOperationInfo getOperationInfo() {
            return this.operationInfo;
        }

    }

    public static class ApiRouteConflictInfoConflictsDetailsDetectedMatchOperationInfo extends TeaModel {
        /**
         * <p>The operation name.</p>
         * 
         * <strong>example:</strong>
         * <p>GetItemV2</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>op-cqf17dllhtgng1m**</p>
         */
        @NameInMap("operationId")
        public String operationId;

        public static ApiRouteConflictInfoConflictsDetailsDetectedMatchOperationInfo build(java.util.Map<String, ?> map) throws Exception {
            ApiRouteConflictInfoConflictsDetailsDetectedMatchOperationInfo self = new ApiRouteConflictInfoConflictsDetailsDetectedMatchOperationInfo();
            return TeaModel.build(map, self);
        }

        public ApiRouteConflictInfoConflictsDetailsDetectedMatchOperationInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ApiRouteConflictInfoConflictsDetailsDetectedMatchOperationInfo setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

    }

    public static class ApiRouteConflictInfoConflictsDetailsDetectedMatch extends TeaModel {
        /**
         * <p>The matching rule information of the object being detected.</p>
         */
        @NameInMap("match")
        public HttpRouteMatch match;

        /**
         * <p>If the object is an API, the conflicting operation information needs to be returned.</p>
         */
        @NameInMap("operationInfo")
        public ApiRouteConflictInfoConflictsDetailsDetectedMatchOperationInfo operationInfo;

        public static ApiRouteConflictInfoConflictsDetailsDetectedMatch build(java.util.Map<String, ?> map) throws Exception {
            ApiRouteConflictInfoConflictsDetailsDetectedMatch self = new ApiRouteConflictInfoConflictsDetailsDetectedMatch();
            return TeaModel.build(map, self);
        }

        public ApiRouteConflictInfoConflictsDetailsDetectedMatch setMatch(HttpRouteMatch match) {
            this.match = match;
            return this;
        }
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        public ApiRouteConflictInfoConflictsDetailsDetectedMatch setOperationInfo(ApiRouteConflictInfoConflictsDetailsDetectedMatchOperationInfo operationInfo) {
            this.operationInfo = operationInfo;
            return this;
        }
        public ApiRouteConflictInfoConflictsDetailsDetectedMatchOperationInfo getOperationInfo() {
            return this.operationInfo;
        }

    }

    public static class ApiRouteConflictInfoConflictsDetails extends TeaModel {
        /**
         * <p>The matching rule information of the conflicting target.</p>
         */
        @NameInMap("conflictingMatch")
        public ApiRouteConflictInfoConflictsDetailsConflictingMatch conflictingMatch;

        /**
         * <p>The matching rule information of the object being detected.</p>
         */
        @NameInMap("detectedMatch")
        public ApiRouteConflictInfoConflictsDetailsDetectedMatch detectedMatch;

        /**
         * <p>The conflict level. Valid values: Critical, Warning, and Informational.</p>
         * 
         * <strong>example:</strong>
         * <p>Critical</p>
         */
        @NameInMap("level")
        public String level;

        public static ApiRouteConflictInfoConflictsDetails build(java.util.Map<String, ?> map) throws Exception {
            ApiRouteConflictInfoConflictsDetails self = new ApiRouteConflictInfoConflictsDetails();
            return TeaModel.build(map, self);
        }

        public ApiRouteConflictInfoConflictsDetails setConflictingMatch(ApiRouteConflictInfoConflictsDetailsConflictingMatch conflictingMatch) {
            this.conflictingMatch = conflictingMatch;
            return this;
        }
        public ApiRouteConflictInfoConflictsDetailsConflictingMatch getConflictingMatch() {
            return this.conflictingMatch;
        }

        public ApiRouteConflictInfoConflictsDetails setDetectedMatch(ApiRouteConflictInfoConflictsDetailsDetectedMatch detectedMatch) {
            this.detectedMatch = detectedMatch;
            return this;
        }
        public ApiRouteConflictInfoConflictsDetailsDetectedMatch getDetectedMatch() {
            return this.detectedMatch;
        }

        public ApiRouteConflictInfoConflictsDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class ApiRouteConflictInfoConflictsEnvironmentInfo extends TeaModel {
        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cquqsollhtgidd***</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>The environment name.</p>
         * 
         * <strong>example:</strong>
         * <p>itemcenter-dev</p>
         */
        @NameInMap("name")
        public String name;

        public static ApiRouteConflictInfoConflictsEnvironmentInfo build(java.util.Map<String, ?> map) throws Exception {
            ApiRouteConflictInfoConflictsEnvironmentInfo self = new ApiRouteConflictInfoConflictsEnvironmentInfo();
            return TeaModel.build(map, self);
        }

        public ApiRouteConflictInfoConflictsEnvironmentInfo setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public ApiRouteConflictInfoConflictsEnvironmentInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ApiRouteConflictInfoConflictsRouteInfo extends TeaModel {
        /**
         * <p>The route name.</p>
         * 
         * <strong>example:</strong>
         * <p>itemcenter-route</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-cr82undlhtgrlej***</p>
         */
        @NameInMap("routeId")
        public String routeId;

        public static ApiRouteConflictInfoConflictsRouteInfo build(java.util.Map<String, ?> map) throws Exception {
            ApiRouteConflictInfoConflictsRouteInfo self = new ApiRouteConflictInfoConflictsRouteInfo();
            return TeaModel.build(map, self);
        }

        public ApiRouteConflictInfoConflictsRouteInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ApiRouteConflictInfoConflictsRouteInfo setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

    public static class ApiRouteConflictInfoConflicts extends TeaModel {
        /**
         * <p>The details about the conflicts.</p>
         */
        @NameInMap("details")
        public java.util.List<ApiRouteConflictInfoConflictsDetails> details;

        /**
         * <p>For APIs, conflicts exist in the specific environment. If the conflict object is a route, ignore.</p>
         */
        @NameInMap("environmentInfo")
        public ApiRouteConflictInfoConflictsEnvironmentInfo environmentInfo;

        /**
         * <p>The conflicting resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>api-crdclqllhtggm***</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The conflicting resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>item-stock</p>
         */
        @NameInMap("resourceName")
        public String resourceName;

        /**
         * <p>The type of the conflicting resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RestApi</li>
         * <li>HttpApiRoute</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HttpApiRoute</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The route information.</p>
         */
        @NameInMap("routeInfo")
        public ApiRouteConflictInfoConflictsRouteInfo routeInfo;

        public static ApiRouteConflictInfoConflicts build(java.util.Map<String, ?> map) throws Exception {
            ApiRouteConflictInfoConflicts self = new ApiRouteConflictInfoConflicts();
            return TeaModel.build(map, self);
        }

        public ApiRouteConflictInfoConflicts setDetails(java.util.List<ApiRouteConflictInfoConflictsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ApiRouteConflictInfoConflictsDetails> getDetails() {
            return this.details;
        }

        public ApiRouteConflictInfoConflicts setEnvironmentInfo(ApiRouteConflictInfoConflictsEnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }
        public ApiRouteConflictInfoConflictsEnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        public ApiRouteConflictInfoConflicts setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ApiRouteConflictInfoConflicts setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ApiRouteConflictInfoConflicts setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ApiRouteConflictInfoConflicts setRouteInfo(ApiRouteConflictInfoConflictsRouteInfo routeInfo) {
            this.routeInfo = routeInfo;
            return this;
        }
        public ApiRouteConflictInfoConflictsRouteInfo getRouteInfo() {
            return this.routeInfo;
        }

    }

    public static class ApiRouteConflictInfoDomainInfo extends TeaModel {
        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cqookcllhtgvof7e***</p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>httpbin</p>
         */
        @NameInMap("name")
        public String name;

        public static ApiRouteConflictInfoDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            ApiRouteConflictInfoDomainInfo self = new ApiRouteConflictInfoDomainInfo();
            return TeaModel.build(map, self);
        }

        public ApiRouteConflictInfoDomainInfo setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public ApiRouteConflictInfoDomainInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
