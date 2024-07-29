// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RouteRulesConflictInfo extends TeaModel {
    @NameInMap("conflicts")
    public java.util.List<RouteRulesConflictInfoConflicts> conflicts;

    @NameInMap("domainInfo")
    public RouteRulesConflictInfoDomainInfo domainInfo;

    public static RouteRulesConflictInfo build(java.util.Map<String, ?> map) throws Exception {
        RouteRulesConflictInfo self = new RouteRulesConflictInfo();
        return TeaModel.build(map, self);
    }

    public RouteRulesConflictInfo setConflicts(java.util.List<RouteRulesConflictInfoConflicts> conflicts) {
        this.conflicts = conflicts;
        return this;
    }
    public java.util.List<RouteRulesConflictInfoConflicts> getConflicts() {
        return this.conflicts;
    }

    public RouteRulesConflictInfo setDomainInfo(RouteRulesConflictInfoDomainInfo domainInfo) {
        this.domainInfo = domainInfo;
        return this;
    }
    public RouteRulesConflictInfoDomainInfo getDomainInfo() {
        return this.domainInfo;
    }

    public static class RouteRulesConflictInfoConflictsDetailsConflictingMatchOperationInfo extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("operationId")
        public String operationId;

        public static RouteRulesConflictInfoConflictsDetailsConflictingMatchOperationInfo build(java.util.Map<String, ?> map) throws Exception {
            RouteRulesConflictInfoConflictsDetailsConflictingMatchOperationInfo self = new RouteRulesConflictInfoConflictsDetailsConflictingMatchOperationInfo();
            return TeaModel.build(map, self);
        }

        public RouteRulesConflictInfoConflictsDetailsConflictingMatchOperationInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RouteRulesConflictInfoConflictsDetailsConflictingMatchOperationInfo setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

    }

    public static class RouteRulesConflictInfoConflictsDetailsConflictingMatch extends TeaModel {
        @NameInMap("match")
        public HttpRouteMatch match;

        @NameInMap("operationInfo")
        public RouteRulesConflictInfoConflictsDetailsConflictingMatchOperationInfo operationInfo;

        public static RouteRulesConflictInfoConflictsDetailsConflictingMatch build(java.util.Map<String, ?> map) throws Exception {
            RouteRulesConflictInfoConflictsDetailsConflictingMatch self = new RouteRulesConflictInfoConflictsDetailsConflictingMatch();
            return TeaModel.build(map, self);
        }

        public RouteRulesConflictInfoConflictsDetailsConflictingMatch setMatch(HttpRouteMatch match) {
            this.match = match;
            return this;
        }
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        public RouteRulesConflictInfoConflictsDetailsConflictingMatch setOperationInfo(RouteRulesConflictInfoConflictsDetailsConflictingMatchOperationInfo operationInfo) {
            this.operationInfo = operationInfo;
            return this;
        }
        public RouteRulesConflictInfoConflictsDetailsConflictingMatchOperationInfo getOperationInfo() {
            return this.operationInfo;
        }

    }

    public static class RouteRulesConflictInfoConflictsDetailsDetectedMatchOperationInfo extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("operationId")
        public String operationId;

        public static RouteRulesConflictInfoConflictsDetailsDetectedMatchOperationInfo build(java.util.Map<String, ?> map) throws Exception {
            RouteRulesConflictInfoConflictsDetailsDetectedMatchOperationInfo self = new RouteRulesConflictInfoConflictsDetailsDetectedMatchOperationInfo();
            return TeaModel.build(map, self);
        }

        public RouteRulesConflictInfoConflictsDetailsDetectedMatchOperationInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RouteRulesConflictInfoConflictsDetailsDetectedMatchOperationInfo setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

    }

    public static class RouteRulesConflictInfoConflictsDetailsDetectedMatch extends TeaModel {
        @NameInMap("match")
        public HttpRouteMatch match;

        @NameInMap("operationInfo")
        public RouteRulesConflictInfoConflictsDetailsDetectedMatchOperationInfo operationInfo;

        public static RouteRulesConflictInfoConflictsDetailsDetectedMatch build(java.util.Map<String, ?> map) throws Exception {
            RouteRulesConflictInfoConflictsDetailsDetectedMatch self = new RouteRulesConflictInfoConflictsDetailsDetectedMatch();
            return TeaModel.build(map, self);
        }

        public RouteRulesConflictInfoConflictsDetailsDetectedMatch setMatch(HttpRouteMatch match) {
            this.match = match;
            return this;
        }
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        public RouteRulesConflictInfoConflictsDetailsDetectedMatch setOperationInfo(RouteRulesConflictInfoConflictsDetailsDetectedMatchOperationInfo operationInfo) {
            this.operationInfo = operationInfo;
            return this;
        }
        public RouteRulesConflictInfoConflictsDetailsDetectedMatchOperationInfo getOperationInfo() {
            return this.operationInfo;
        }

    }

    public static class RouteRulesConflictInfoConflictsDetails extends TeaModel {
        @NameInMap("conflictingMatch")
        public RouteRulesConflictInfoConflictsDetailsConflictingMatch conflictingMatch;

        @NameInMap("detectedMatch")
        public RouteRulesConflictInfoConflictsDetailsDetectedMatch detectedMatch;

        @NameInMap("level")
        public String level;

        public static RouteRulesConflictInfoConflictsDetails build(java.util.Map<String, ?> map) throws Exception {
            RouteRulesConflictInfoConflictsDetails self = new RouteRulesConflictInfoConflictsDetails();
            return TeaModel.build(map, self);
        }

        public RouteRulesConflictInfoConflictsDetails setConflictingMatch(RouteRulesConflictInfoConflictsDetailsConflictingMatch conflictingMatch) {
            this.conflictingMatch = conflictingMatch;
            return this;
        }
        public RouteRulesConflictInfoConflictsDetailsConflictingMatch getConflictingMatch() {
            return this.conflictingMatch;
        }

        public RouteRulesConflictInfoConflictsDetails setDetectedMatch(RouteRulesConflictInfoConflictsDetailsDetectedMatch detectedMatch) {
            this.detectedMatch = detectedMatch;
            return this;
        }
        public RouteRulesConflictInfoConflictsDetailsDetectedMatch getDetectedMatch() {
            return this.detectedMatch;
        }

        public RouteRulesConflictInfoConflictsDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class RouteRulesConflictInfoConflictsEnvironmentInfo extends TeaModel {
        @NameInMap("environmentId")
        public String environmentId;

        @NameInMap("name")
        public String name;

        public static RouteRulesConflictInfoConflictsEnvironmentInfo build(java.util.Map<String, ?> map) throws Exception {
            RouteRulesConflictInfoConflictsEnvironmentInfo self = new RouteRulesConflictInfoConflictsEnvironmentInfo();
            return TeaModel.build(map, self);
        }

        public RouteRulesConflictInfoConflictsEnvironmentInfo setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public RouteRulesConflictInfoConflictsEnvironmentInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class RouteRulesConflictInfoConflicts extends TeaModel {
        @NameInMap("details")
        public java.util.List<RouteRulesConflictInfoConflictsDetails> details;

        @NameInMap("environmentInfo")
        public RouteRulesConflictInfoConflictsEnvironmentInfo environmentInfo;

        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("resourceName")
        public String resourceName;

        @NameInMap("resourceType")
        public String resourceType;

        public static RouteRulesConflictInfoConflicts build(java.util.Map<String, ?> map) throws Exception {
            RouteRulesConflictInfoConflicts self = new RouteRulesConflictInfoConflicts();
            return TeaModel.build(map, self);
        }

        public RouteRulesConflictInfoConflicts setDetails(java.util.List<RouteRulesConflictInfoConflictsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<RouteRulesConflictInfoConflictsDetails> getDetails() {
            return this.details;
        }

        public RouteRulesConflictInfoConflicts setEnvironmentInfo(RouteRulesConflictInfoConflictsEnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }
        public RouteRulesConflictInfoConflictsEnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        public RouteRulesConflictInfoConflicts setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public RouteRulesConflictInfoConflicts setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public RouteRulesConflictInfoConflicts setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class RouteRulesConflictInfoDomainInfo extends TeaModel {
        @NameInMap("domainId")
        public String domainId;

        @NameInMap("name")
        public String name;

        public static RouteRulesConflictInfoDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            RouteRulesConflictInfoDomainInfo self = new RouteRulesConflictInfoDomainInfo();
            return TeaModel.build(map, self);
        }

        public RouteRulesConflictInfoDomainInfo setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public RouteRulesConflictInfoDomainInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
