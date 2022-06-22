// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyProcessOverviewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyProcessOverviewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyProcessOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyProcessOverviewResponseBody self = new QueryTopologyProcessOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyProcessOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyProcessOverviewResponseBody setData(QueryTopologyProcessOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyProcessOverviewResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyProcessOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyProcessOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyProcessOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyProcessOverviewResponseBodyDataProcessApplications extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("blockQps")
        public Long blockQps;

        @NameInMap("commandLine")
        public String commandLine;

        @NameInMap("cpu")
        public Float cpu;

        @NameInMap("exception")
        public Long exception;

        @NameInMap("flowLimitOpened")
        public Boolean flowLimitOpened;

        @NameInMap("id")
        public String id;

        @NameInMap("mem")
        public Float mem;

        @NameInMap("passQps")
        public Long passQps;

        @NameInMap("rt")
        public Float rt;

        public static QueryTopologyProcessOverviewResponseBodyDataProcessApplications build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyProcessOverviewResponseBodyDataProcessApplications self = new QueryTopologyProcessOverviewResponseBodyDataProcessApplications();
            return TeaModel.build(map, self);
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessApplications setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessApplications setBlockQps(Long blockQps) {
            this.blockQps = blockQps;
            return this;
        }
        public Long getBlockQps() {
            return this.blockQps;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessApplications setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessApplications setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessApplications setException(Long exception) {
            this.exception = exception;
            return this;
        }
        public Long getException() {
            return this.exception;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessApplications setFlowLimitOpened(Boolean flowLimitOpened) {
            this.flowLimitOpened = flowLimitOpened;
            return this;
        }
        public Boolean getFlowLimitOpened() {
            return this.flowLimitOpened;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessApplications setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessApplications setMem(Float mem) {
            this.mem = mem;
            return this;
        }
        public Float getMem() {
            return this.mem;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessApplications setPassQps(Long passQps) {
            this.passQps = passQps;
            return this;
        }
        public Long getPassQps() {
            return this.passQps;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessApplications setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

    }

    public static class QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsInstances extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("label")
        public String label;

        public static QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsInstances build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsInstances self = new QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsInstances();
            return TeaModel.build(map, self);
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsInstances setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsInstances setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsRequests extends TeaModel {
        @NameInMap("commandLine")
        public String commandLine;

        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        public static QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsRequests build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsRequests self = new QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsRequests();
            return TeaModel.build(map, self);
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsRequests setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsRequests setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsRequests setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponents extends TeaModel {
        @NameInMap("instances")
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsInstances> instances;

        @NameInMap("label")
        public String label;

        @NameInMap("requests")
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsRequests> requests;

        @NameInMap("type")
        public String type;

        public static QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponents self = new QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponents setInstances(java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsInstances> getInstances() {
            return this.instances;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponents setRequests(java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsRequests> requests) {
            this.requests = requests;
            return this;
        }
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponentsRequests> getRequests() {
            return this.requests;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTopologyProcessOverviewResponseBodyDataProcessComponentTags extends TeaModel {
        @NameInMap("ids")
        public java.util.List<String> ids;

        @NameInMap("label")
        public String label;

        public static QueryTopologyProcessOverviewResponseBodyDataProcessComponentTags build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyProcessOverviewResponseBodyDataProcessComponentTags self = new QueryTopologyProcessOverviewResponseBodyDataProcessComponentTags();
            return TeaModel.build(map, self);
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessComponentTags setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessComponentTags setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents extends TeaModel {
        @NameInMap("commandLine")
        public String commandLine;

        @NameInMap("cpu")
        public Float cpu;

        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("mem")
        public Float mem;

        @NameInMap("type")
        public String type;

        public static QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents self = new QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents setMem(Float mem) {
            this.mem = mem;
            return this;
        }
        public Float getMem() {
            return this.mem;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTopologyProcessOverviewResponseBodyDataProcess extends TeaModel {
        @NameInMap("applications")
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessApplications> applications;

        @NameInMap("cloudComponents")
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponents> cloudComponents;

        @NameInMap("componentTags")
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessComponentTags> componentTags;

        @NameInMap("thirdComponents")
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents> thirdComponents;

        public static QueryTopologyProcessOverviewResponseBodyDataProcess build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyProcessOverviewResponseBodyDataProcess self = new QueryTopologyProcessOverviewResponseBodyDataProcess();
            return TeaModel.build(map, self);
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcess setApplications(java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessApplications> getApplications() {
            return this.applications;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcess setCloudComponents(java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponents> cloudComponents) {
            this.cloudComponents = cloudComponents;
            return this;
        }
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessCloudComponents> getCloudComponents() {
            return this.cloudComponents;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcess setComponentTags(java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessComponentTags> componentTags) {
            this.componentTags = componentTags;
            return this;
        }
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessComponentTags> getComponentTags() {
            return this.componentTags;
        }

        public QueryTopologyProcessOverviewResponseBodyDataProcess setThirdComponents(java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents> thirdComponents) {
            this.thirdComponents = thirdComponents;
            return this;
        }
        public java.util.List<QueryTopologyProcessOverviewResponseBodyDataProcessThirdComponents> getThirdComponents() {
            return this.thirdComponents;
        }

    }

    public static class QueryTopologyProcessOverviewResponseBodyData extends TeaModel {
        @NameInMap("process")
        public QueryTopologyProcessOverviewResponseBodyDataProcess process;

        public static QueryTopologyProcessOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyProcessOverviewResponseBodyData self = new QueryTopologyProcessOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyProcessOverviewResponseBodyData setProcess(QueryTopologyProcessOverviewResponseBodyDataProcess process) {
            this.process = process;
            return this;
        }
        public QueryTopologyProcessOverviewResponseBodyDataProcess getProcess() {
            return this.process;
        }

    }

}
