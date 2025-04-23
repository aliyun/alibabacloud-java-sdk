// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobTemplatesResponseBody extends TeaModel {
    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The queue of the job.</p>
         * <p>Format: X-Y:Z. X is the minimum index value. Y is the maximum index value. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
         * 
         * <strong>example:</strong>
         * <p>2-7:2</p>
         */
        @NameInMap("ArrayRequest")
        public String arrayRequest;

        /**
         * <p>The maximum running time of the job. Valid formats:</p>
         * <ul>
         * <li>hh:mm:ss</li>
         * <li>mm:ss</li>
         * <li>ss</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12:00:00</p>
         */
        @NameInMap("ClockTime")
        public String clockTime;

        /**
         * <p>The command that is used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>./LammpsTest/lammps.pbs</p>
         */
        @NameInMap("CommandLine")
        public String commandLine;

        /**
         * <p>The maximum GPU usage for individual compute nodes. Valid values: 1 to 8.</p>
         * <p>The parameter takes effect only when the cluster uses PBS and a compute node is a GPU-accelerated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The ID of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-job-tmpl-6RxO5y****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The URL of the job files that are uploaded to an Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-beijing.aliyuncs.com/test.py">https://test.oss-cn-beijing.aliyuncs.com/test.py</a></p>
         */
        @NameInMap("InputFileUrl")
        public String inputFileUrl;

        /**
         * <p>The maximum memory usage of a single compute node. The unit can be GB, MB, or KB, and is case-insensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>1GB</p>
         */
        @NameInMap("Mem")
        public String mem;

        /**
         * <p>The name of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>job1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of compute nodes. Valid values: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Node")
        public Integer node;

        /**
         * <p>The path that is used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>./jobfolder</p>
         */
        @NameInMap("PackagePath")
        public String packagePath;

        /**
         * <p>The priority of the job. Valid values: 0 to 9. A larger value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The queue of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>workq</p>
         */
        @NameInMap("Queue")
        public String queue;

        /**
         * <p>Specifies whether the job can be rerun. Valid values:</p>
         * <ul>
         * <li>true: The job can be rerun.</li>
         * <li>false: The job cannot be rerun.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReRunable")
        public Boolean reRunable;

        /**
         * <p>The name of the user that runs the job.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("RunasUser")
        public String runasUser;

        /**
         * <p>The output file path of stderr.</p>
         * 
         * <strong>example:</strong>
         * <p>./LammpsTest</p>
         */
        @NameInMap("StderrRedirectPath")
        public String stderrRedirectPath;

        /**
         * <p>The output file path of stdout.</p>
         * 
         * <strong>example:</strong>
         * <p>./Lammps</p>
         */
        @NameInMap("StdoutRedirectPath")
        public String stdoutRedirectPath;

        /**
         * <p>The number of tasks required by a single compute node. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Task")
        public Integer task;

        /**
         * <p>The number of threads required by a single task. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Thread")
        public Integer thread;

        /**
         * <p>The command that is used to decompress the job files downloaded from an OSS bucket. The parameter takes effect only when WithUnzipCmd is set to true. Valid values:</p>
         * <ul>
         * <li>tar xzf: decompresses GZIP files.</li>
         * <li>tar xf: decompresses TAR files.</li>
         * <li>unzip: decompresses ZIP files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tar xzf</p>
         */
        @NameInMap("UnzipCmd")
        public String unzipCmd;

        /**
         * <p>The environment variables of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>[{Name:,Value:},{Name:,Value:}]</p>
         */
        @NameInMap("Variables")
        public String variables;

        /**
         * <p>Specifies whether to decompress the job files downloaded from an OSS bucket. Valid value:</p>
         * <ul>
         * <li>true: decompresses the job file.</li>
         * <li>false: does not decompress the job file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
