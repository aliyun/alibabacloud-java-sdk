// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>TestJob</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The job configurations.</p>
     */
    @NameInMap("JobSpec")
    public CreateJobRequestJobSpec jobSpec;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateJobRequest setJobSpec(CreateJobRequestJobSpec jobSpec) {
        this.jobSpec = jobSpec;
        return this;
    }
    public CreateJobRequestJobSpec getJobSpec() {
        return this.jobSpec;
    }

    public static class CreateJobRequestJobSpecResources extends TeaModel {
        /**
         * <p>The number of vCPUs to be allocated to each compute node.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The number of GPUs to be allocated to each compute node.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpus")
        public Integer gpus;

        /**
         * <p>The memory size to be allocated to each compute node. The memory size is in string format. Unit: MB or GB.</p>
         * 
         * <strong>example:</strong>
         * <p>4gb</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The number of compute nodes to be allocated to the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Nodes")
        public Integer nodes;

        public static CreateJobRequestJobSpecResources build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestJobSpecResources self = new CreateJobRequestJobSpecResources();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestJobSpecResources setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public CreateJobRequestJobSpecResources setGpus(Integer gpus) {
            this.gpus = gpus;
            return this;
        }
        public Integer getGpus() {
            return this.gpus;
        }

        public CreateJobRequestJobSpecResources setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public CreateJobRequestJobSpecResources setNodes(Integer nodes) {
            this.nodes = nodes;
            return this;
        }
        public Integer getNodes() {
            return this.nodes;
        }

    }

    public static class CreateJobRequestJobSpec extends TeaModel {
        /**
         * <p>The jobs in the queue.</p>
         * <p>Format: X-Y:Z. X is the minimum index value. Y is the maximum index value. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.</p>
         * 
         * <strong>example:</strong>
         * <p>1-5:2</p>
         */
        @NameInMap("ArrayRequest")
        public String arrayRequest;

        /**
         * <p>The command or script to run the job. If you want to use a command, you must specify the full path of the command, for example, /bin/ping.</p>
         * <p>If you want to use a script, you must make sure that you have the execution permissions on it. By default, the user root directory ~/ is used as the default script path on the cluster side. If your script is not in that directory, you must specify the full path in this parameter, such as /home/xxx/job.sh</p>
         * <p>If you want to run the job directly by using the CLI, you must specify the absolute path of the command and add two hyphens and a space (-- ) before the path, such as -- /bin/ping -c 10 localhost.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/xxx/test.job</p>
         */
        @NameInMap("CommandLine")
        public String commandLine;

        /**
         * <p>The queue to which the job belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>comp</p>
         */
        @NameInMap("JobQueue")
        public String jobQueue;

        /**
         * <p>The post-processing command of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>/bin/sleep 10</p>
         */
        @NameInMap("PostCmdLine")
        public String postCmdLine;

        /**
         * <p>The job priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The resource configurations of the job.</p>
         */
        @NameInMap("Resources")
        public CreateJobRequestJobSpecResources resources;

        /**
         * <p>The cluster-side user as which you want to submit the job.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        @NameInMap("RunasUser")
        public String runasUser;

        /**
         * <p>The password of the user specified by the RunasUser parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RunasUserPassword")
        public String runasUserPassword;

        /**
         * <p>The path of the standard error output file of the job. You need to specify the full path.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/xxx/job.err</p>
         */
        @NameInMap("StderrPath")
        public String stderrPath;

        /**
         * <p>The path of the standard output file of the job. You need to specify the full path.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/xxx/job.out</p>
         */
        @NameInMap("StdoutPath")
        public String stdoutPath;

        /**
         * <p>The environment variables of the job. The value is a string in the JSON array format. Each array member is a JSON object that contains two members: Name and Value. Name indicates the name of the environment variable, and Value indicates the value of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;x&quot;, &quot;Value&quot;:&quot;y&quot;}]</p>
         */
        @NameInMap("Variables")
        public String variables;

        /**
         * <p>The maximum duration for which the job can be run. Format: <code>hour: minute: second</code>. For example, <code>01:00:00</code> indicates 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p>360:48:50</p>
         */
        @NameInMap("WallTime")
        public String wallTime;

        public static CreateJobRequestJobSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestJobSpec self = new CreateJobRequestJobSpec();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestJobSpec setArrayRequest(String arrayRequest) {
            this.arrayRequest = arrayRequest;
            return this;
        }
        public String getArrayRequest() {
            return this.arrayRequest;
        }

        public CreateJobRequestJobSpec setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public CreateJobRequestJobSpec setJobQueue(String jobQueue) {
            this.jobQueue = jobQueue;
            return this;
        }
        public String getJobQueue() {
            return this.jobQueue;
        }

        public CreateJobRequestJobSpec setPostCmdLine(String postCmdLine) {
            this.postCmdLine = postCmdLine;
            return this;
        }
        public String getPostCmdLine() {
            return this.postCmdLine;
        }

        public CreateJobRequestJobSpec setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public CreateJobRequestJobSpec setResources(CreateJobRequestJobSpecResources resources) {
            this.resources = resources;
            return this;
        }
        public CreateJobRequestJobSpecResources getResources() {
            return this.resources;
        }

        public CreateJobRequestJobSpec setRunasUser(String runasUser) {
            this.runasUser = runasUser;
            return this;
        }
        public String getRunasUser() {
            return this.runasUser;
        }

        public CreateJobRequestJobSpec setRunasUserPassword(String runasUserPassword) {
            this.runasUserPassword = runasUserPassword;
            return this;
        }
        public String getRunasUserPassword() {
            return this.runasUserPassword;
        }

        public CreateJobRequestJobSpec setStderrPath(String stderrPath) {
            this.stderrPath = stderrPath;
            return this;
        }
        public String getStderrPath() {
            return this.stderrPath;
        }

        public CreateJobRequestJobSpec setStdoutPath(String stdoutPath) {
            this.stdoutPath = stdoutPath;
            return this;
        }
        public String getStdoutPath() {
            return this.stdoutPath;
        }

        public CreateJobRequestJobSpec setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

        public CreateJobRequestJobSpec setWallTime(String wallTime) {
            this.wallTime = wallTime;
            return this;
        }
        public String getWallTime() {
            return this.wallTime;
        }

    }

}
