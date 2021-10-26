// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobTemplatesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public ListJobTemplatesResponseBodyTemplates templates;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListJobTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobTemplatesResponseBody self = new ListJobTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobTemplatesResponseBody setTemplates(ListJobTemplatesResponseBodyTemplates templates) {
        this.templates = templates;
        return this;
    }
    public ListJobTemplatesResponseBodyTemplates getTemplates() {
        return this.templates;
    }

    public ListJobTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobTemplatesResponseBodyTemplatesJobTemplates extends TeaModel {
        @NameInMap("ArrayRequest")
        public String arrayRequest;

        @NameInMap("ClockTime")
        public String clockTime;

        @NameInMap("CommandLine")
        public String commandLine;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Id")
        public String id;

        @NameInMap("Mem")
        public String mem;

        @NameInMap("Name")
        public String name;

        @NameInMap("Node")
        public Integer node;

        @NameInMap("PackagePath")
        public String packagePath;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("ReRunable")
        public Boolean reRunable;

        @NameInMap("RunasUser")
        public String runasUser;

        @NameInMap("StderrRedirectPath")
        public String stderrRedirectPath;

        @NameInMap("StdoutRedirectPath")
        public String stdoutRedirectPath;

        @NameInMap("Task")
        public Integer task;

        @NameInMap("Thread")
        public Integer thread;

        @NameInMap("Variables")
        public String variables;

        public static ListJobTemplatesResponseBodyTemplatesJobTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListJobTemplatesResponseBodyTemplatesJobTemplates self = new ListJobTemplatesResponseBodyTemplatesJobTemplates();
            return TeaModel.build(map, self);
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setArrayRequest(String arrayRequest) {
            this.arrayRequest = arrayRequest;
            return this;
        }
        public String getArrayRequest() {
            return this.arrayRequest;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setClockTime(String clockTime) {
            this.clockTime = clockTime;
            return this;
        }
        public String getClockTime() {
            return this.clockTime;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setMem(String mem) {
            this.mem = mem;
            return this;
        }
        public String getMem() {
            return this.mem;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setNode(Integer node) {
            this.node = node;
            return this;
        }
        public Integer getNode() {
            return this.node;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setPackagePath(String packagePath) {
            this.packagePath = packagePath;
            return this;
        }
        public String getPackagePath() {
            return this.packagePath;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setReRunable(Boolean reRunable) {
            this.reRunable = reRunable;
            return this;
        }
        public Boolean getReRunable() {
            return this.reRunable;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setRunasUser(String runasUser) {
            this.runasUser = runasUser;
            return this;
        }
        public String getRunasUser() {
            return this.runasUser;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setStderrRedirectPath(String stderrRedirectPath) {
            this.stderrRedirectPath = stderrRedirectPath;
            return this;
        }
        public String getStderrRedirectPath() {
            return this.stderrRedirectPath;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setStdoutRedirectPath(String stdoutRedirectPath) {
            this.stdoutRedirectPath = stdoutRedirectPath;
            return this;
        }
        public String getStdoutRedirectPath() {
            return this.stdoutRedirectPath;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setTask(Integer task) {
            this.task = task;
            return this;
        }
        public Integer getTask() {
            return this.task;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setThread(Integer thread) {
            this.thread = thread;
            return this;
        }
        public Integer getThread() {
            return this.thread;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

    }

    public static class ListJobTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("JobTemplates")
        public java.util.List<ListJobTemplatesResponseBodyTemplatesJobTemplates> jobTemplates;

        public static ListJobTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListJobTemplatesResponseBodyTemplates self = new ListJobTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListJobTemplatesResponseBodyTemplates setJobTemplates(java.util.List<ListJobTemplatesResponseBodyTemplatesJobTemplates> jobTemplates) {
            this.jobTemplates = jobTemplates;
            return this;
        }
        public java.util.List<ListJobTemplatesResponseBodyTemplatesJobTemplates> getJobTemplates() {
            return this.jobTemplates;
        }

    }

}
