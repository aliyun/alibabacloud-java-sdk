// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescirbeWorkflowResponseBody extends TeaModel {
    /**
     * <p>The time when the workflow was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-01-15 16:30:25 +0800 CST</p>
     */
    @NameInMap("create_time")
    public String createTime;

    /**
     * <p>The duration of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>1h15m33.529968361s</p>
     */
    @NameInMap("duration")
    public String duration;

    /**
     * <p>The end time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>0001-01-01 00:00:00 +0000 UTC</p>
     */
    @NameInMap("finish_time")
    public String finishTime;

    /**
     * <p>The size of the input data.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("input_data_size")
    public String inputDataSize;

    /**
     * <p>The name of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>wgs-gpu-97xfn</p>
     */
    @NameInMap("job_name")
    public String jobName;

    /**
     * <p>The namespace to which the workflow belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1171330362041663</p>
     */
    @NameInMap("job_namespace")
    public String jobNamespace;

    /**
     * <p>The size of the output data.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("output_data_size")
    public String outputDataSize;

    /**
     * <p>The current state of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The number of base pairs.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("total_bases")
    public String totalBases;

    /**
     * <p>The number of reads.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("total_reads")
    public String totalReads;

    /**
     * <p>The user input parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;wgs_oss_region\&quot;:\&quot;cn-shenzhen\&quot;,\&quot;wgs_fastq_first_name\&quot;:\&quot;fastq/huada/MGISEQ-200019SZ0002402\&quot;,\&quot;wgs_fastq_second_name\&quot;:\&quot;fastq/huada/MGISEQ-200019SZ0002402\&quot;,\&quot;wgs_bucket_name\&quot;:\&quot;gene-shenzhen\&quot;,\&quot;wgs_vcf_file_name\&quot;:\&quot;output/vcf/huada.vcf\&quot;,\&quot;wgs_bam_file_name\&quot;:\&quot;output/bam/huada.bam\&quot;,\&quot;wgs_reference_file\&quot;:\&quot;hg19\&quot;,\&quot;wgs_service\&quot;:\&quot;g\&quot;}</p>
     */
    @NameInMap("user_input_data")
    public String userInputData;

    public static DescirbeWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescirbeWorkflowResponseBody self = new DescirbeWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescirbeWorkflowResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescirbeWorkflowResponseBody setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public DescirbeWorkflowResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public DescirbeWorkflowResponseBody setInputDataSize(String inputDataSize) {
        this.inputDataSize = inputDataSize;
        return this;
    }
    public String getInputDataSize() {
        return this.inputDataSize;
    }

    public DescirbeWorkflowResponseBody setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DescirbeWorkflowResponseBody setJobNamespace(String jobNamespace) {
        this.jobNamespace = jobNamespace;
        return this;
    }
    public String getJobNamespace() {
        return this.jobNamespace;
    }

    public DescirbeWorkflowResponseBody setOutputDataSize(String outputDataSize) {
        this.outputDataSize = outputDataSize;
        return this;
    }
    public String getOutputDataSize() {
        return this.outputDataSize;
    }

    public DescirbeWorkflowResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescirbeWorkflowResponseBody setTotalBases(String totalBases) {
        this.totalBases = totalBases;
        return this;
    }
    public String getTotalBases() {
        return this.totalBases;
    }

    public DescirbeWorkflowResponseBody setTotalReads(String totalReads) {
        this.totalReads = totalReads;
        return this;
    }
    public String getTotalReads() {
        return this.totalReads;
    }

    public DescirbeWorkflowResponseBody setUserInputData(String userInputData) {
        this.userInputData = userInputData;
        return this;
    }
    public String getUserInputData() {
        return this.userInputData;
    }

}
