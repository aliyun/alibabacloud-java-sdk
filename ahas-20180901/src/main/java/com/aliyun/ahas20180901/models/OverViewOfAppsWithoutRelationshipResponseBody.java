// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class OverViewOfAppsWithoutRelationshipResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public OverViewOfAppsWithoutRelationshipResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static OverViewOfAppsWithoutRelationshipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OverViewOfAppsWithoutRelationshipResponseBody self = new OverViewOfAppsWithoutRelationshipResponseBody();
        return TeaModel.build(map, self);
    }

    public OverViewOfAppsWithoutRelationshipResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OverViewOfAppsWithoutRelationshipResponseBody setData(OverViewOfAppsWithoutRelationshipResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OverViewOfAppsWithoutRelationshipResponseBodyData getData() {
        return this.data;
    }

    public OverViewOfAppsWithoutRelationshipResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OverViewOfAppsWithoutRelationshipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OverViewOfAppsWithoutRelationshipResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OverViewOfAppsWithoutRelationshipResponseBodyDataApps extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Groups")
        public java.util.List<String> groups;

        @NameInMap("Metrics")
        public java.util.Map<String, ?> metrics;

        @NameInMap("Status")
        public String status;

        public static OverViewOfAppsWithoutRelationshipResponseBodyDataApps build(java.util.Map<String, ?> map) throws Exception {
            OverViewOfAppsWithoutRelationshipResponseBodyDataApps self = new OverViewOfAppsWithoutRelationshipResponseBodyDataApps();
            return TeaModel.build(map, self);
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyDataApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyDataApps setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyDataApps setMetrics(java.util.Map<String, ?> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.Map<String, ?> getMetrics() {
            return this.metrics;
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyDataApps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class OverViewOfAppsWithoutRelationshipResponseBodyDataRelations extends TeaModel {
        @NameInMap("From")
        public String from;

        @NameInMap("To")
        public String to;

        public static OverViewOfAppsWithoutRelationshipResponseBodyDataRelations build(java.util.Map<String, ?> map) throws Exception {
            OverViewOfAppsWithoutRelationshipResponseBodyDataRelations self = new OverViewOfAppsWithoutRelationshipResponseBodyDataRelations();
            return TeaModel.build(map, self);
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyDataRelations setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyDataRelations setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class OverViewOfAppsWithoutRelationshipResponseBodyData extends TeaModel {
        @NameInMap("AppNames")
        public java.util.List<String> appNames;

        @NameInMap("Apps")
        public java.util.List<OverViewOfAppsWithoutRelationshipResponseBodyDataApps> apps;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Relations")
        public java.util.List<OverViewOfAppsWithoutRelationshipResponseBodyDataRelations> relations;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static OverViewOfAppsWithoutRelationshipResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OverViewOfAppsWithoutRelationshipResponseBodyData self = new OverViewOfAppsWithoutRelationshipResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyData setAppNames(java.util.List<String> appNames) {
            this.appNames = appNames;
            return this;
        }
        public java.util.List<String> getAppNames() {
            return this.appNames;
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyData setApps(java.util.List<OverViewOfAppsWithoutRelationshipResponseBodyDataApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<OverViewOfAppsWithoutRelationshipResponseBodyDataApps> getApps() {
            return this.apps;
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyData setRelations(java.util.List<OverViewOfAppsWithoutRelationshipResponseBodyDataRelations> relations) {
            this.relations = relations;
            return this;
        }
        public java.util.List<OverViewOfAppsWithoutRelationshipResponseBodyDataRelations> getRelations() {
            return this.relations;
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public OverViewOfAppsWithoutRelationshipResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
