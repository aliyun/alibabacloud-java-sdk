// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobTemplateRequest extends TeaModel {
    /**
     * <p>The job array.</p>
     * <p>Format: X-Y:Z. X is the minimum index value. Y is the maximum index value. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
     * 
     * <strong>example:</strong>
     * <p>1-10:2</p>
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
     * <p>We recommend that you use the hh:mm:ss format. If the maximum running time is 12 hours, set the value to 12:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>12:00:00</p>
     */
    @NameInMap("ClockTime")
    public String clockTime;

    /**
     * <p>The command that is used to run the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>./LammpsTest/lammps.pbs</p>
     */
    @NameInMap("CommandLine")
    public String commandLine;

    /**
     * <p>The maximum GPU usage required by a single compute node. Valid values: 1 to 8.</p>
     * <p>The parameter takes effect only when the cluster uses PBS and a compute node is a GPU-accelerated instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Gpu")
    public Integer gpu;

    /**
     * <p>The URL of the job files that are uploaded to an Object Storage Service (OSS) bucket.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://test.oss-cn-beijing.aliyuncs.com/test.py">https://test.oss-cn-beijing.aliyuncs.com/test.py</a></p>
     */
    @NameInMap("InputFileUrl")
    public String inputFileUrl;

    /**
     * <p>The maximum memory usage required by a single compute node. Unit: GB, MB, or KB. The unit is case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>1GB</p>
     */
    @NameInMap("Mem")
    public String mem;

    /**
     * <p>The name of the job template. The name must be 2 to 64 characters in length. It must start with a letter and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jobtemplate1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of compute nodes. Valid values: 1 to 500.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the Task, Thread, Mem, or GPU parameters do not take effect.</p>
     * </blockquote>
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
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The name of the queue in which the job is run.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/92176.html">ListQueues</a> operation to query the name of the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>workq</p>
     */
    @NameInMap("Queue")
    public String queue;

    /**
     * <p>Specifies whether to automatically rerun the job after the job fails. Valid value:</p>
     * <ul>
     * <li>true: reruns the job.</li>
     * <li>false: does not rerun the job.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ReRunable")
    public Boolean reRunable;

    /**
     * <p>The name of the user that runs the job.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/188572.html">ListUsers</a> operation to query the users of the cluster.</p>
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
     * <p>./LammpsTest</p>
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
     * <p>The number of threads required by a single compute node. Valid values: 1 to 1000.</p>
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
     * <p>The runtime variables passed to the job. They can be accessed by using environment variables in the executable file.</p>
     * 
     * <strong>example:</strong>
     * <p>[{Name:,Value:},{Name:,Value:}]</p>
     */
    @NameInMap("Variables")
    public String variables;

    /**
     * <p>Specifies whether to decompress the job files downloaded from an OSS bucket. Valid values:</p>
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
