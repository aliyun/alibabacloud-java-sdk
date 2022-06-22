// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class OverViewOfAppsWithRelationshipResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public OverViewOfAppsWithRelationshipResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static OverViewOfAppsWithRelationshipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OverViewOfAppsWithRelationshipResponseBody self = new OverViewOfAppsWithRelationshipResponseBody();
        return TeaModel.build(map, self);
    }

    public OverViewOfAppsWithRelationshipResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OverViewOfAppsWithRelationshipResponseBody setData(OverViewOfAppsWithRelationshipResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OverViewOfAppsWithRelationshipResponseBodyData getData() {
        return this.data;
    }

    public OverViewOfAppsWithRelationshipResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OverViewOfAppsWithRelationshipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OverViewOfAppsWithRelationshipResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OverViewOfAppsWithRelationshipResponseBodyDataApps extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Groups")
        public java.util.List<String> groups;

        @NameInMap("Metrics")
        public java.util.Map<String, ?> metrics;

        @NameInMap("Status")
        public String status;

        public static OverViewOfAppsWithRelationshipResponseBodyDataApps build(java.util.Map<String, ?> map) throws Exception {
            OverViewOfAppsWithRelationshipResponseBodyDataApps self = new OverViewOfAppsWithRelationshipResponseBodyDataApps();
            return TeaModel.build(map, self);
        }

        public OverViewOfAppsWithRelationshipResponseBodyDataApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public OverViewOfAppsWithRelationshipResponseBodyDataApps setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        public OverViewOfAppsWithRelationshipResponseBodyDataApps setMetrics(java.util.Map<String, ?> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.Map<String, ?> getMetrics() {
            return this.metrics;
        }

        public OverViewOfAppsWithRelationshipResponseBodyDataApps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class OverViewOfAppsWithRelationshipResponseBodyDataRelations extends TeaModel {
        @NameInMap("From")
        public String from;

        @NameInMap("To")
        public String to;

        public static OverViewOfAppsWithRelationshipResponseBodyDataRelations build(java.util.Map<String, ?> map) throws Exception {
            OverViewOfAppsWithRelationshipResponseBodyDataRelations self = new OverViewOfAppsWithRelationshipResponseBodyDataRelations();
            return TeaModel.build(map, self);
        }

        public OverViewOfAppsWithRelationshipResponseBodyDataRelations setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public OverViewOfAppsWithRelationshipResponseBodyDataRelations setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class OverViewOfAppsWithRelationshipResponseBodyData extends TeaModel {
        @NameInMap("AppNames")
        public java.util.List<String> appNames;

        @NameInMap("Apps")
        public java.util.List<OverViewOfAppsWithRelationshipResponseBodyDataApps> apps;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Relations")
        public java.util.List<OverViewOfAppsWithRelationshipResponseBodyDataRelations> relations;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static OverViewOfAppsWithRelationshipResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OverViewOfAppsWithRelationshipResponseBodyData self = new OverViewOfAppsWithRelationshipResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OverViewOfAppsWithRelationshipResponseBodyData setAppNames(java.util.List<String> appNames) {
            this.appNames = appNames;
            return this;
        }
        public java.util.List<String> getAppNames() {
            return this.appNames;
        }

        public OverViewOfAppsWithRelationshipResponseBodyData setApps(java.util.List<OverViewOfAppsWithRelationshipResponseBodyDataApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<OverViewOfAppsWithRelationshipResponseBodyDataApps> getApps() {
            return this.apps;
        }

        public OverViewOfAppsWithRelationshipResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public OverViewOfAppsWithRelationshipResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public OverViewOfAppsWithRelationshipResponseBodyData setRelations(java.util.List<OverViewOfAppsWithRelationshipResponseBodyDataRelations> relations) {
            this.relations = relations;
            return this;
        }
        public java.util.List<OverViewOfAppsWithRelationshipResponseBodyDataRelations> getRelations() {
            return this.relations;
        }

        public OverViewOfAppsWithRelationshipResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public OverViewOfAppsWithRelationshipResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
