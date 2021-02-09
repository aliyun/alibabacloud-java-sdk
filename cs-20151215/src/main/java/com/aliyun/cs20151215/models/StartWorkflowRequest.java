// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StartWorkflowRequest extends TeaModel {
    // 工作流类型，可选值：wgs或mapping。
    @NameInMap("workflow_type")
    public String workflowType;

    // SLA类型，可选值：s、g、p。 白银级（s）：超过90 Gbp的部分，按1.5 Gbp/min计算增加的时间。 黄金级（g）：超过90 Gbp的部分，按2 Gbp/min计算增加的时间。 铂金级（p）：超过90 Gbp的部分，按3 Gbp/min计算增加的时间。
    @NameInMap("service")
    public String service;

    // mapping oss数据的存放region。
    @NameInMap("mapping_oss_region")
    public String mappingOssRegion;

    // mapping的第一个fastq文件名。
    @NameInMap("mapping_fastq_first_filename")
    public String mappingFastqFirstFilename;

    // mapping的第二个fastq文件名。
    @NameInMap("mapping_fastq_second_filename")
    public String mappingFastqSecondFilename;

    // 存放mapping的bucket名称。
    @NameInMap("mapping_bucket_name")
    public String mappingBucketName;

    // mapping的fastq文件路径。
    @NameInMap("mapping_fastq_path")
    public String mappingFastqPath;

    // mapping的reference文件位置。
    @NameInMap("mapping_reference_path")
    public String mappingReferencePath;

    // 是否进行dup。
    @NameInMap("mapping_is_mark_dup")
    public String mappingIsMarkDup;

    // bam文件输出路径。
    @NameInMap("mapping_bam_out_path")
    public String mappingBamOutPath;

    // bam文件输出名称。
    @NameInMap("mapping_bam_out_filename")
    public String mappingBamOutFilename;

    // wgs oss数据的存放region。
    @NameInMap("wgs_oss_region")
    public String wgsOssRegion;

    // wgs的第一个fastq文件名。
    @NameInMap("wgs_fastq_first_filename")
    public String wgsFastqFirstFilename;

    // wgs的第二个fastq文件名。
    @NameInMap("wgs_fastq_second_filename")
    public String wgsFastqSecondFilename;

    // 存放wgs的bucket名称。
    @NameInMap("wgs_bucket_name")
    public String wgsBucketName;

    // wgs的fastq文件路径。
    @NameInMap("wgs_fastq_path")
    public String wgsFastqPath;

    // wgs的reference文件路径。
    @NameInMap("wgs_reference_path")
    public String wgsReferencePath;

    // wgs的vcf输出路径。
    @NameInMap("wgs_vcf_out_path")
    public String wgsVcfOutPath;

    // wgs的vcf输出文件名称。
    @NameInMap("wgs_vcf_out_filename")
    public String wgsVcfOutFilename;

    public static StartWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowRequest self = new StartWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public StartWorkflowRequest setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
        return this;
    }
    public String getWorkflowType() {
        return this.workflowType;
    }

    public StartWorkflowRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public StartWorkflowRequest setMappingOssRegion(String mappingOssRegion) {
        this.mappingOssRegion = mappingOssRegion;
        return this;
    }
    public String getMappingOssRegion() {
        return this.mappingOssRegion;
    }

    public StartWorkflowRequest setMappingFastqFirstFilename(String mappingFastqFirstFilename) {
        this.mappingFastqFirstFilename = mappingFastqFirstFilename;
        return this;
    }
    public String getMappingFastqFirstFilename() {
        return this.mappingFastqFirstFilename;
    }

    public StartWorkflowRequest setMappingFastqSecondFilename(String mappingFastqSecondFilename) {
        this.mappingFastqSecondFilename = mappingFastqSecondFilename;
        return this;
    }
    public String getMappingFastqSecondFilename() {
        return this.mappingFastqSecondFilename;
    }

    public StartWorkflowRequest setMappingBucketName(String mappingBucketName) {
        this.mappingBucketName = mappingBucketName;
        return this;
    }
    public String getMappingBucketName() {
        return this.mappingBucketName;
    }

    public StartWorkflowRequest setMappingFastqPath(String mappingFastqPath) {
        this.mappingFastqPath = mappingFastqPath;
        return this;
    }
    public String getMappingFastqPath() {
        return this.mappingFastqPath;
    }

    public StartWorkflowRequest setMappingReferencePath(String mappingReferencePath) {
        this.mappingReferencePath = mappingReferencePath;
        return this;
    }
    public String getMappingReferencePath() {
        return this.mappingReferencePath;
    }

    public StartWorkflowRequest setMappingIsMarkDup(String mappingIsMarkDup) {
        this.mappingIsMarkDup = mappingIsMarkDup;
        return this;
    }
    public String getMappingIsMarkDup() {
        return this.mappingIsMarkDup;
    }

    public StartWorkflowRequest setMappingBamOutPath(String mappingBamOutPath) {
        this.mappingBamOutPath = mappingBamOutPath;
        return this;
    }
    public String getMappingBamOutPath() {
        return this.mappingBamOutPath;
    }

    public StartWorkflowRequest setMappingBamOutFilename(String mappingBamOutFilename) {
        this.mappingBamOutFilename = mappingBamOutFilename;
        return this;
    }
    public String getMappingBamOutFilename() {
        return this.mappingBamOutFilename;
    }

    public StartWorkflowRequest setWgsOssRegion(String wgsOssRegion) {
        this.wgsOssRegion = wgsOssRegion;
        return this;
    }
    public String getWgsOssRegion() {
        return this.wgsOssRegion;
    }

    public StartWorkflowRequest setWgsFastqFirstFilename(String wgsFastqFirstFilename) {
        this.wgsFastqFirstFilename = wgsFastqFirstFilename;
        return this;
    }
    public String getWgsFastqFirstFilename() {
        return this.wgsFastqFirstFilename;
    }

    public StartWorkflowRequest setWgsFastqSecondFilename(String wgsFastqSecondFilename) {
        this.wgsFastqSecondFilename = wgsFastqSecondFilename;
        return this;
    }
    public String getWgsFastqSecondFilename() {
        return this.wgsFastqSecondFilename;
    }

    public StartWorkflowRequest setWgsBucketName(String wgsBucketName) {
        this.wgsBucketName = wgsBucketName;
        return this;
    }
    public String getWgsBucketName() {
        return this.wgsBucketName;
    }

    public StartWorkflowRequest setWgsFastqPath(String wgsFastqPath) {
        this.wgsFastqPath = wgsFastqPath;
        return this;
    }
    public String getWgsFastqPath() {
        return this.wgsFastqPath;
    }

    public StartWorkflowRequest setWgsReferencePath(String wgsReferencePath) {
        this.wgsReferencePath = wgsReferencePath;
        return this;
    }
    public String getWgsReferencePath() {
        return this.wgsReferencePath;
    }

    public StartWorkflowRequest setWgsVcfOutPath(String wgsVcfOutPath) {
        this.wgsVcfOutPath = wgsVcfOutPath;
        return this;
    }
    public String getWgsVcfOutPath() {
        return this.wgsVcfOutPath;
    }

    public StartWorkflowRequest setWgsVcfOutFilename(String wgsVcfOutFilename) {
        this.wgsVcfOutFilename = wgsVcfOutFilename;
        return this;
    }
    public String getWgsVcfOutFilename() {
        return this.wgsVcfOutFilename;
    }

}
