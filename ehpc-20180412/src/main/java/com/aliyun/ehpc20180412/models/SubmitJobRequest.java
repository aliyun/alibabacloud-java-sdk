// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitJobRequest extends TeaModel {
    @NameInMap("JobRetry")
    public SubmitJobRequestJobRetry jobRetry;

    /**
     * <p>The job array.</p>
     * <p>Format: X-Y:Z. The minimum index value X is the first index. The maximum index value Y is the last index. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
     * 
     * <strong>example:</strong>
     * <p>1-10:2</p>
     */
    @NameInMap("ArrayRequest")
    public String arrayRequest;

    /**
     * <p>Specifies whether to use an asynchronous link to submit the job.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Async")
    public Boolean async;

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
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the user that runs the job.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/188572.html">ListUsers</a> operation to query the users of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>./LammpsTest/lammps.pbs</p>
     */
    @NameInMap("CommandLine")
    public String commandLine;

    /**
     * <p>The number of CPU cores required by a single compute node.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The maximum GPU usage required by a single compute node.</p>
     * <p>The parameter takes effect only when the cluster uses PBS and a compute node is a GPU-accelerated instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/92176.html">ListQueues</a> operation to query the name of the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>workq</p>
     */
    @NameInMap("JobQueue")
    public String jobQueue;

    /**
     * <p>The maximum memory usage required by a single compute node. Unit: GB, MB, or KB. The unit is case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>1GB</p>
     */
    @NameInMap("Mem")
    public String mem;

    /**
     * <p>job1</p>
     * 
     * <strong>example:</strong>
     * <p>jobtest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of compute nodes required to run the job.</p>
     * <blockquote>
     * <p>If the parameter is not specified, the Cpu, Task, Thread, Mem, and Gpu parameters become invalid.</p>
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
     * <p>./Tem</p>
     */
    @NameInMap("PackagePath")
    public String packagePath;

    /**
     * <p>The command to perform on the job after the job is submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>example.sh</p>
     */
    @NameInMap("PostCmdLine")
    public String postCmdLine;

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
     * <p>The password that corresponds to the username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testuser</p>
     */
    @NameInMap("RunasUser")
    public String runasUser;

    /**
     * <p>The name of the job. The name must be 6 to 30 characters in length and start with a letter. It can contain letters, digits, and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("RunasUserPassword")
    public String runasUserPassword;

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
     * <p>The number of processes created for a single compute node.</p>
     * <p>The parameter is applicable to Message Passing Interface (MPI) jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Task")
    public Integer task;

    /**
     * <p>The number of threads created for a single compute node.</p>
     * <p>The parameter is applicable to OpenMP jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Thread")
    public Integer thread;

    /**
     * <p>The command for file decompression. The command that is used to decompress the job files downloaded from an OSS bucket. Valid values:</p>
     * <ul>
     * <li>tar xzf: Decompresses GZIP files.</li>
     * <li>tar xf: Decompresses TAR files.</li>
     * <li>unzip: Decompresses ZIP files.</li>
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
     * <p>[{Name:test1,Value:value1},{Name:test2,Value:value2}]</p>
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
        /**
         * <p>The number of retries for the job. Valid values: 1 to 10. You can only retry jobs that are run on the PBS clusters.</p>
         * <blockquote>
         * <p> If this parameter is left empty, the JobRetry.Priority and JobRetry.OnExitCode parameters do not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The retry condition of the job. If the exit code is the value of the parameter, the job retry is triggered.</p>
         * <blockquote>
         * <p> If this parameter is left empty, the job retry is triggered when the exit code is not 0.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OnExitCode")
        public Integer onExitCode;

        /**
         * <p>The priority of the job retry. Valid values: 0 to 9. A larger value indicates a higher priority.</p>
         * <blockquote>
         * <p> If this parameter is left empty, the priority of the job retry is min {Priority of the original job +1, 9}.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
