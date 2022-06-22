// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryInspectJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryInspectJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static QueryInspectJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInspectJobResponseBody self = new QueryInspectJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInspectJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInspectJobResponseBody setData(QueryInspectJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInspectJobResponseBodyData getData() {
        return this.data;
    }

    public QueryInspectJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInspectJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInspectJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QueryInspectJobResponseBodyDataInspectSchedule extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Cron")
        public String cron;

        @NameInMap("Date")
        public String date;

        @NameInMap("Day")
        public String day;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Termination")
        public String termination;

        @NameInMap("Time")
        public String time;

        @NameInMap("Type")
        public String type;

        @NameInMap("Week")
        public String week;

        public static QueryInspectJobResponseBodyDataInspectSchedule build(java.util.Map<String, ?> map) throws Exception {
            QueryInspectJobResponseBodyDataInspectSchedule self = new QueryInspectJobResponseBodyDataInspectSchedule();
            return TeaModel.build(map, self);
        }

        public QueryInspectJobResponseBodyDataInspectSchedule setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryInspectJobResponseBodyDataInspectSchedule setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryInspectJobResponseBodyDataInspectSchedule setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public QueryInspectJobResponseBodyDataInspectSchedule setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryInspectJobResponseBodyDataInspectSchedule setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public QueryInspectJobResponseBodyDataInspectSchedule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryInspectJobResponseBodyDataInspectSchedule setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryInspectJobResponseBodyDataInspectSchedule setTermination(String termination) {
            this.termination = termination;
            return this;
        }
        public String getTermination() {
            return this.termination;
        }

        public QueryInspectJobResponseBodyDataInspectSchedule setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryInspectJobResponseBodyDataInspectSchedule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryInspectJobResponseBodyDataInspectSchedule setWeek(String week) {
            this.week = week;
            return this;
        }
        public String getWeek() {
            return this.week;
        }

    }

    public static class QueryInspectJobResponseBodyData extends TeaModel {
        @NameInMap("InspectSchedule")
        public QueryInspectJobResponseBodyDataInspectSchedule inspectSchedule;

        @NameInMap("Type")
        public String type;

        public static QueryInspectJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInspectJobResponseBodyData self = new QueryInspectJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInspectJobResponseBodyData setInspectSchedule(QueryInspectJobResponseBodyDataInspectSchedule inspectSchedule) {
            this.inspectSchedule = inspectSchedule;
            return this;
        }
        public QueryInspectJobResponseBodyDataInspectSchedule getInspectSchedule() {
            return this.inspectSchedule;
        }

        public QueryInspectJobResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
