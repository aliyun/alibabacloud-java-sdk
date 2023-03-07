// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class EditJobTemplateRequest extends TeaModel {
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
     * <p>The name of the job template.</p>
     * <br>
     * <p>You can call the [ListJobTemplates](~~87248~~) operation to obtain the job template name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the compute nodes. Valid values: 1 to 500.</p>
     * <br>
     * <p>>  If the parameter is not specified, the Task, Thread, Mem, and Gpu parameters become invalid.</p>
     */
    @NameInMap("Node")
    public Integer node;

    /**
     * <p>The path that is used to run the job.</p>
     */
    @NameInMap("PackagePath")
    public String packagePath;

    /**
     * <p>The priority of the job. Valid values: 0 to 9. A large value indicates a high priority.</p>
     * <br>
     * <p>Default value: 0</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The name of the queue.</p>
     */
    @NameInMap("Queue")
    public String queue;

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
     * <p>The ID of the job template.</p>
     * <br>
     * <p>You can call the [ListJobTemplates](~~87248~~) operation to obtain the job template ID.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

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
     * <p>*   true: The job files are decompressed.</p>
     * <p>*   false: The job files are not decompressed.</p>
     */
    @NameInMap("WithUnzipCmd")
    public Boolean withUnzipCmd;

    public static EditJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        EditJobTemplateRequest self = new EditJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public EditJobTemplateRequest setArrayRequest(String arrayRequest) {
        this.arrayRequest = arrayRequest;
        return this;
    }
    public String getArrayRequest() {
        return this.arrayRequest;
    }

    public EditJobTemplateRequest setClockTime(String clockTime) {
        this.clockTime = clockTime;
        return this;
    }
    public String getClockTime() {
        return this.clockTime;
    }

    public EditJobTemplateRequest setCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }
    public String getCommandLine() {
        return this.commandLine;
    }

    public EditJobTemplateRequest setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public EditJobTemplateRequest setInputFileUrl(String inputFileUrl) {
        this.inputFileUrl = inputFileUrl;
        return this;
    }
    public String getInputFileUrl() {
        return this.inputFileUrl;
    }

    public EditJobTemplateRequest setMem(String mem) {
        this.mem = mem;
        return this;
    }
    public String getMem() {
        return this.mem;
    }

    public EditJobTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EditJobTemplateRequest setNode(Integer node) {
        this.node = node;
        return this;
    }
    public Integer getNode() {
        return this.node;
    }

    public EditJobTemplateRequest setPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }
    public String getPackagePath() {
        return this.packagePath;
    }

    public EditJobTemplateRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public EditJobTemplateRequest setQueue(String queue) {
        this.queue = queue;
        return this;
    }
    public String getQueue() {
        return this.queue;
    }

    public EditJobTemplateRequest setReRunable(Boolean reRunable) {
        this.reRunable = reRunable;
        return this;
    }
    public Boolean getReRunable() {
        return this.reRunable;
    }

    public EditJobTemplateRequest setRunasUser(String runasUser) {
        this.runasUser = runasUser;
        return this;
    }
    public String getRunasUser() {
        return this.runasUser;
    }

    public EditJobTemplateRequest setStderrRedirectPath(String stderrRedirectPath) {
        this.stderrRedirectPath = stderrRedirectPath;
        return this;
    }
    public String getStderrRedirectPath() {
        return this.stderrRedirectPath;
    }

    public EditJobTemplateRequest setStdoutRedirectPath(String stdoutRedirectPath) {
        this.stdoutRedirectPath = stdoutRedirectPath;
        return this;
    }
    public String getStdoutRedirectPath() {
        return this.stdoutRedirectPath;
    }

    public EditJobTemplateRequest setTask(Integer task) {
        this.task = task;
        return this;
    }
    public Integer getTask() {
        return this.task;
    }

    public EditJobTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public EditJobTemplateRequest setThread(Integer thread) {
        this.thread = thread;
        return this;
    }
    public Integer getThread() {
        return this.thread;
    }

    public EditJobTemplateRequest setUnzipCmd(String unzipCmd) {
        this.unzipCmd = unzipCmd;
        return this;
    }
    public String getUnzipCmd() {
        return this.unzipCmd;
    }

    public EditJobTemplateRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

    public EditJobTemplateRequest setWithUnzipCmd(Boolean withUnzipCmd) {
        this.withUnzipCmd = withUnzipCmd;
        return this;
    }
    public Boolean getWithUnzipCmd() {
        return this.withUnzipCmd;
    }

}
