// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitJobRequest extends TeaModel {
    @NameInMap("JobRetry")
    public SubmitJobRequestJobRetry jobRetry;

    /**
     * <p>The job array.</p>
     * <br>
     * <p>Format: X-Y:Z. The minimum index value X is the first index. The maximum index value Y is the last index. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
     */
    @NameInMap("ArrayRequest")
    public String arrayRequest;

    /**
     * <p>Specifies whether to use an asynchronous link to submit the job.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The maximum running time of the job. Valid formats:</p>
     * <br>
     * <p>*   hh:mm:ss</p>
     * <p>*   mm:ss</p>
     * <p>*   ss</p>
     * <br>
     * <p>We recommend that you use the hh:mm:ss format. If the maximum running time is 12 hours, set the value to 12:00:00.</p>
     */
    @NameInMap("ClockTime")
    public String clockTime;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The command that is used to run the job.</p>
     */
    @NameInMap("CommandLine")
    public String commandLine;

    /**
     * <p>The ID of the containerized application. If you want to use a container application, you must specify its ID.</p>
     * <br>
     * <p>You can call the [ListContainerApps](~~87333~~) operation to query the container application ID.</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The number of CPU cores required by a single compute node.</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The maximum GPU usage required by a single compute node.</p>
     * <br>
     * <p>The parameter takes effect only when the cluster uses PBS and a compute node is a GPU-accelerated instance.</p>
     */
    @NameInMap("Gpu")
    public Integer gpu;

    /**
     * <p>The URL of the job file that is uploaded to an Object Storage Service (OSS) bucket.</p>
     */
    @NameInMap("InputFileUrl")
    public String inputFileUrl;

    /**
     * <p>The name of the queue in which the job is run.</p>
     * <br>
     * <p>You can call the [ListQueues](~~92176~~) operation to query the name of the queue.</p>
     */
    @NameInMap("JobQueue")
    public String jobQueue;

    /**
     * <p>The maximum memory usage required by a single compute node. Unit: GB, MB, or KB. The unit is case-insensitive.</p>
     */
    @NameInMap("Mem")
    public String mem;

    /**
     * <p>The name of the job. The name must be 6 to 30 characters in length and start with a letter. It can contain letters, digits, and periods (.).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of compute nodes required to run the job.</p>
     * <br>
     * <p>> If the parameter is not specified, the Cpu, Task, Thread, Mem, and Gpu parameters become invalid.</p>
     */
    @NameInMap("Node")
    public Integer node;

    /**
     * <p>The path that is used to run the job.</p>
     */
    @NameInMap("PackagePath")
    public String packagePath;

    /**
     * <p>The command to perform on the job after the job is submitted.</p>
     */
    @NameInMap("PostCmdLine")
    public String postCmdLine;

    /**
     * <p>The priority of the job. Valid values: 0 to 9. A larger value indicates a higher priority.</p>
     * <br>
     * <p>Default value: 0.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>Specifies whether the job can be rerun. Valid values:</p>
     * <br>
     * <p>*   true: The job can be rerun.</p>
     * <p>*   false: The job cannot be rerun.</p>
     */
    @NameInMap("ReRunable")
    public Boolean reRunable;

    /**
     * <p>The name of the user that runs the job.</p>
     * <br>
     * <p>You can call the [ListUsers](~~188572~~) operation to query the users of the cluster.</p>
     */
    @NameInMap("RunasUser")
    public String runasUser;

    /**
     * <p>The password that corresponds to the username.</p>
     */
    @NameInMap("RunasUserPassword")
    public String runasUserPassword;

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
     * <p>The number of processes created for a single compute node.</p>
     * <br>
     * <p>The parameter is applicable to Message Passing Interface (MPI) jobs.</p>
     */
    @NameInMap("Task")
    public Integer task;

    /**
     * <p>The number of threads created for a single compute node.</p>
     * <br>
     * <p>The parameter is applicable to OpenMP jobs.</p>
     */
    @NameInMap("Thread")
    public Integer thread;

    /**
     * <p>The command for file decompression. The command that is used to decompress the job files downloaded from an OSS bucket. Valid values:</p>
     * <br>
     * <p>*   tar xzf: Decompresses GZIP files.</p>
     * <p>*   tar xf: Decompresses TAR files.</p>
     * <p>*   unzip: Decompresses ZIP files.</p>
     */
    @NameInMap("UnzipCmd")
    public String unzipCmd;

    /**
     * <p>The runtime variables passed to the job. They can be accessed by using environment variables in the executable file.</p>
     */
    @NameInMap("Variables")
    public String variables;

    public static SubmitJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobRequest self = new SubmitJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitJobRequest setJobRetry(SubmitJobRequestJobRetry jobRetry) {
        this.jobRetry = jobRetry;
        return this;
    }
    public SubmitJobRequestJobRetry getJobRetry() {
        return this.jobRetry;
    }

    public SubmitJobRequest setArrayRequest(String arrayRequest) {
        this.arrayRequest = arrayRequest;
        return this;
    }
    public String getArrayRequest() {
        return this.arrayRequest;
    }

    public SubmitJobRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public SubmitJobRequest setClockTime(String clockTime) {
        this.clockTime = clockTime;
        return this;
    }
    public String getClockTime() {
        return this.clockTime;
    }

    public SubmitJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SubmitJobRequest setCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }
    public String getCommandLine() {
        return this.commandLine;
    }

    public SubmitJobRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public SubmitJobRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public SubmitJobRequest setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public SubmitJobRequest setInputFileUrl(String inputFileUrl) {
        this.inputFileUrl = inputFileUrl;
        return this;
    }
    public String getInputFileUrl() {
        return this.inputFileUrl;
    }

    public SubmitJobRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public SubmitJobRequest setMem(String mem) {
        this.mem = mem;
        return this;
    }
    public String getMem() {
        return this.mem;
    }

    public SubmitJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitJobRequest setNode(Integer node) {
        this.node = node;
        return this;
    }
    public Integer getNode() {
        return this.node;
    }

    public SubmitJobRequest setPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }
    public String getPackagePath() {
        return this.packagePath;
    }

    public SubmitJobRequest setPostCmdLine(String postCmdLine) {
        this.postCmdLine = postCmdLine;
        return this;
    }
    public String getPostCmdLine() {
        return this.postCmdLine;
    }

    public SubmitJobRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public SubmitJobRequest setReRunable(Boolean reRunable) {
        this.reRunable = reRunable;
        return this;
    }
    public Boolean getReRunable() {
        return this.reRunable;
    }

    public SubmitJobRequest setRunasUser(String runasUser) {
        this.runasUser = runasUser;
        return this;
    }
    public String getRunasUser() {
        return this.runasUser;
    }

    public SubmitJobRequest setRunasUserPassword(String runasUserPassword) {
        this.runasUserPassword = runasUserPassword;
        return this;
    }
    public String getRunasUserPassword() {
        return this.runasUserPassword;
    }

    public SubmitJobRequest setStderrRedirectPath(String stderrRedirectPath) {
        this.stderrRedirectPath = stderrRedirectPath;
        return this;
    }
    public String getStderrRedirectPath() {
        return this.stderrRedirectPath;
    }

    public SubmitJobRequest setStdoutRedirectPath(String stdoutRedirectPath) {
        this.stdoutRedirectPath = stdoutRedirectPath;
        return this;
    }
    public String getStdoutRedirectPath() {
        return this.stdoutRedirectPath;
    }

    public SubmitJobRequest setTask(Integer task) {
        this.task = task;
        return this;
    }
    public Integer getTask() {
        return this.task;
    }

    public SubmitJobRequest setThread(Integer thread) {
        this.thread = thread;
        return this;
    }
    public Integer getThread() {
        return this.thread;
    }

    public SubmitJobRequest setUnzipCmd(String unzipCmd) {
        this.unzipCmd = unzipCmd;
        return this;
    }
    public String getUnzipCmd() {
        return this.unzipCmd;
    }

    public SubmitJobRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

    public static class SubmitJobRequestJobRetry extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("OnExitCode")
        public Integer onExitCode;

        @NameInMap("Priority")
        public Integer priority;

        public static SubmitJobRequestJobRetry build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobRequestJobRetry self = new SubmitJobRequestJobRetry();
            return TeaModel.build(map, self);
        }

        public SubmitJobRequestJobRetry setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public SubmitJobRequestJobRetry setOnExitCode(Integer onExitCode) {
            this.onExitCode = onExitCode;
            return this;
        }
        public Integer getOnExitCode() {
            return this.onExitCode;
        }

        public SubmitJobRequestJobRetry setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
