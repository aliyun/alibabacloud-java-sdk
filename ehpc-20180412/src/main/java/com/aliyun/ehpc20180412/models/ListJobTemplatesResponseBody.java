// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobTemplatesResponseBody extends TeaModel {
    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of job templates.</p>
     */
    @NameInMap("Templates")
    public ListJobTemplatesResponseBodyTemplates templates;

    /**
     * <p>The total number of returned entries.</p>
     */
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
        /**
         * <p>The job array.</p>
         * <br>
         * <p>Format: X-Y:Z. X is the minimum index value. Y is the maximum index value. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
         */
        @NameInMap("ArrayRequest")
        public String arrayRequest;

        /**
         * <p>The maximum running time of the job. Valid formats:</p>
         * <br>
         * <p>*   hh:mm:ss</p>
         * <p>*   mm:ss</p>
         * <p>*   ss</p>
         */
        @NameInMap("ClockTime")
        public String clockTime;

        /**
         * <p>The command that was used to run the job.</p>
         */
        @NameInMap("CommandLine")
        public String commandLine;

        /**
         * <p>The maximum GPU usage required by a single compute node. Valid values: 1 to 8.</p>
         * <br>
         * <p>The parameter takes effect only when the cluster uses PBS and a compute node is a GPU-accelerated instance.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The ID of the job template.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The URL of the job files that were uploaded to an Object Storage Service (OSS) bucket.</p>
         */
        @NameInMap("InputFileUrl")
        public String inputFileUrl;

        /**
         * <p>The maximum memory usage of a single compute node. The unit can be GB, MB, or KB, and is case-insensitive.</p>
         */
        @NameInMap("Mem")
        public String mem;

        /**
         * <p>The name of the job template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of the compute nodes. Valid values: 1 to 500.</p>
         */
        @NameInMap("Node")
        public Integer node;

        /**
         * <p>The path that was used to run the job.</p>
         */
        @NameInMap("PackagePath")
        public String packagePath;

        /**
         * <p>The priority of the job. Valid values: 0 to 9. A large value indicates a high priority.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The queue of the job.</p>
         */
        @NameInMap("Queue")
        public String queue;

        /**
         * <p>Indicates whether the job can be rerun. Valid values:</p>
         * <br>
         * <p>*   true: The job can be rerun.</p>
         * <p>*   false: The job cannot be rerun.</p>
         */
        @NameInMap("ReRunable")
        public Boolean reRunable;

        /**
         * <p>The name of the user that ran the job.</p>
         */
        @NameInMap("RunasUser")
        public String runasUser;

        /**
         * <p>The output file path of stderr.</p>
         */
        @NameInMap("StderrRedirectPath")
        public String stderrRedirectPath;

        /**
         * <p>The output file path of stdout.</p>
         */
        @NameInMap("StdoutRedirectPath")
        public String stdoutRedirectPath;

        /**
         * <p>The number of tasks required by a single compute node. Valid values: 1 to 1000.</p>
         */
        @NameInMap("Task")
        public Integer task;

        /**
         * <p>The number of threads required by a single compute node. Valid values: 1 to 1000.</p>
         */
        @NameInMap("Thread")
        public Integer thread;

        /**
         * <p>The command that was used to decompress the job files downloaded from an OSS bucket. The parameter takes effect only when WithUnzipCmd is set to true. Valid values:</p>
         * <br>
         * <p>*   tar xzf: decompresses GZIP files.</p>
         * <p>*   tar xf: decompresses TAR files.</p>
         * <p>*   unzip: decompresses ZIP files.</p>
         */
        @NameInMap("UnzipCmd")
        public String unzipCmd;

        /**
         * <p>The environment variables of the job.</p>
         */
        @NameInMap("Variables")
        public String variables;

        /**
         * <p>Indicates whether to decompress the job files downloaded from an OSS bucket. Valid values:</p>
         * <br>
         * <p>*   true: The job files are decompressed.</p>
         * <p>*   false: The job files are not decompressed.</p>
         */
        @NameInMap("WithUnzipCmd")
        public Boolean withUnzipCmd;

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

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setInputFileUrl(String inputFileUrl) {
            this.inputFileUrl = inputFileUrl;
            return this;
        }
        public String getInputFileUrl() {
            return this.inputFileUrl;
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

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setUnzipCmd(String unzipCmd) {
            this.unzipCmd = unzipCmd;
            return this;
        }
        public String getUnzipCmd() {
            return this.unzipCmd;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

        public ListJobTemplatesResponseBodyTemplatesJobTemplates setWithUnzipCmd(Boolean withUnzipCmd) {
            this.withUnzipCmd = withUnzipCmd;
            return this;
        }
        public Boolean getWithUnzipCmd() {
            return this.withUnzipCmd;
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
