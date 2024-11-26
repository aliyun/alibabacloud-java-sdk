// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ApiRouteConflictInfo extends TeaModel {
    @NameInMap("conflicts")
    public java.util.List<ApiRouteConflictInfoConflicts> conflicts;

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
        @NameInMap("name")
        public String name;

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
        @NameInMap("match")
        public HttpRouteMatch match;

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
        @NameInMap("name")
        public String name;

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
        @NameInMap("match")
        public HttpRouteMatch match;

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
        @NameInMap("conflictingMatch")
        public ApiRouteConflictInfoConflictsDetailsConflictingMatch conflictingMatch;

        @NameInMap("detectedMatch")
        public ApiRouteConflictInfoConflictsDetailsDetectedMatch detectedMatch;

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
        @NameInMap("environmentId")
        public String environmentId;

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
        @NameInMap("name")
        public String name;

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
        @NameInMap("details")
        public java.util.List<ApiRouteConflictInfoConflictsDetails> details;

        @NameInMap("environmentInfo")
        public ApiRouteConflictInfoConflictsEnvironmentInfo environmentInfo;

        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("resourceName")
        public String resourceName;

        @NameInMap("resourceType")
        public String resourceType;

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
        @NameInMap("domainId")
        public String domainId;

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
