// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobTemplateRequest extends TeaModel {
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
     * <br>
     * <p>We recommend that you use the hh:mm:ss format. If the maximum running time is 12 hours, set the value to 12:00:00.</p>
     */
    @NameInMap("ClockTime")
    public String clockTime;

    /**
     * <p>The command that is used to run the job.</p>
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
     * <p>The URL of the job files that are uploaded to an Object Storage Service (OSS) bucket.</p>
     */
    @NameInMap("InputFileUrl")
    public String inputFileUrl;

    /**
     * <p>The maximum memory usage required by a single compute node. Unit: GB, MB, or KB. The unit is case-insensitive.</p>
     */
    @NameInMap("Mem")
    public String mem;

    /**
     * <p>The name of the job template. The name must be 2 to 64 characters in length. It must start with a letter and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of compute nodes. Valid values: 1 to 500.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the Task, Thread, Mem, or GPU parameters do not take effect.</p>
     */
    @NameInMap("Node")
    public Integer node;

    /**
     * <p>The path that is used to run the job.</p>
     */
    @NameInMap("PackagePath")
    public String packagePath;

    /**
     * <p>The priority of the job. Valid values: 0 to 9. A larger value indicates a higher priority.</p>
     * <br>
     * <p>Default value: 0.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The name of the queue in which the job is run.</p>
     * <br>
     * <p>You can call the [ListQueues](~~92176~~) operation to query the name of the queue.</p>
     */
    @NameInMap("Queue")
    public String queue;

    /**
     * <p>Specifies whether to automatically rerun the job after the job fails. Valid value:</p>
     * <br>
     * <p>*   true: reruns the job.</p>
     * <p>*   false: does not rerun the job.</p>
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
     * <p>The command that is used to decompress the job files downloaded from an OSS bucket. The parameter takes effect only when WithUnzipCmd is set to true. Valid values:</p>
     * <br>
     * <p>*   tar xzf: decompresses GZIP files.</p>
     * <p>*   tar xf: decompresses TAR files.</p>
     * <p>*   unzip: decompresses ZIP files.</p>
     */
    @NameInMap("UnzipCmd")
    public String unzipCmd;

    /**
     * <p>The runtime variables passed to the job. They can be accessed by using environment variables in the executable file.</p>
     */
    @NameInMap("Variables")
    public String variables;

    /**
     * <p>Specifies whether to decompress the job files downloaded from an OSS bucket. Valid values:</p>
     * <br>
     * <p>*   true: decompresses the job file.</p>
     * <p>*   false: does not decompress the job file.</p>
     */
    @NameInMap("WithUnzipCmd")
    public Boolean withUnzipCmd;

    public static CreateJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobTemplateRequest self = new CreateJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobTemplateRequest setArrayRequest(String arrayRequest) {
        this.arrayRequest = arrayRequest;
        return this;
    }
    public String getArrayRequest() {
        return this.arrayRequest;
    }

    public CreateJobTemplateRequest setClockTime(String clockTime) {
        this.clockTime = clockTime;
        return this;
    }
    public String getClockTime() {
        return this.clockTime;
    }

    public CreateJobTemplateRequest setCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }
    public String getCommandLine() {
        return this.commandLine;
    }

    public CreateJobTemplateRequest setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public CreateJobTemplateRequest setInputFileUrl(String inputFileUrl) {
        this.inputFileUrl = inputFileUrl;
        return this;
    }
    public String getInputFileUrl() {
        return this.inputFileUrl;
    }

    public CreateJobTemplateRequest setMem(String mem) {
        this.mem = mem;
        return this;
    }
    public String getMem() {
        return this.mem;
    }

    public CreateJobTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateJobTemplateRequest setNode(Integer node) {
        this.node = node;
        return this;
    }
    public Integer getNode() {
        return this.node;
    }

    public CreateJobTemplateRequest setPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }
    public String getPackagePath() {
        return this.packagePath;
    }

    public CreateJobTemplateRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateJobTemplateRequest setQueue(String queue) {
        this.queue = queue;
        return this;
    }
    public String getQueue() {
        return this.queue;
    }

    public CreateJobTemplateRequest setReRunable(Boolean reRunable) {
        this.reRunable = reRunable;
        return this;
    }
    public Boolean getReRunable() {
        return this.reRunable;
    }

    public CreateJobTemplateRequest setRunasUser(String runasUser) {
        this.runasUser = runasUser;
        return this;
    }
    public String getRunasUser() {
        return this.runasUser;
    }

    public CreateJobTemplateRequest setStderrRedirectPath(String stderrRedirectPath) {
        this.stderrRedirectPath = stderrRedirectPath;
        return this;
    }
    public String getStderrRedirectPath() {
        return this.stderrRedirectPath;
    }

    public CreateJobTemplateRequest setStdoutRedirectPath(String stdoutRedirectPath) {
        this.stdoutRedirectPath = stdoutRedirectPath;
        return this;
    }
    public String getStdoutRedirectPath() {
        return this.stdoutRedirectPath;
    }

    public CreateJobTemplateRequest setTask(Integer task) {
        this.task = task;
        return this;
    }
    public Integer getTask() {
        return this.task;
    }

    public CreateJobTemplateRequest setThread(Integer thread) {
        this.thread = thread;
        return this;
    }
    public Integer getThread() {
        return this.thread;
    }

    public CreateJobTemplateRequest setUnzipCmd(String unzipCmd) {
        this.unzipCmd = unzipCmd;
        return this;
    }
    public String getUnzipCmd() {
        return this.unzipCmd;
    }

    public CreateJobTemplateRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

    public CreateJobTemplateRequest setWithUnzipCmd(Boolean withUnzipCmd) {
        this.withUnzipCmd = withUnzipCmd;
        return this;
    }
    public Boolean getWithUnzipCmd() {
        return this.withUnzipCmd;
    }

}
