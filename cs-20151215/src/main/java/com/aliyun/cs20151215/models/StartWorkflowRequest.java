// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StartWorkflowRequest extends TeaModel {
    /**
     * <p>The name of the output BAM file.</p>
     */
    @NameInMap("mapping_bam_out_filename")
    public String mappingBamOutFilename;

    /**
     * <p>The output path of the Binary Alignment Map (BAM) file.</p>
     */
    @NameInMap("mapping_bam_out_path")
    public String mappingBamOutPath;

    /**
     * <p>The name of the OSS bucket that stores the data of the mapping workflow.</p>
     */
    @NameInMap("mapping_bucket_name")
    public String mappingBucketName;

    /**
     * <p>The name of the first FASTQ file of the mapping workflow.</p>
     */
    @NameInMap("mapping_fastq_first_filename")
    public String mappingFastqFirstFilename;

    /**
     * <p>The path of the FASTQ files of the mapping workflow.</p>
     */
    @NameInMap("mapping_fastq_path")
    public String mappingFastqPath;

    /**
     * <p>The name of the second FASTQ file of the mapping workflow.</p>
     */
    @NameInMap("mapping_fastq_second_filename")
    public String mappingFastqSecondFilename;

    /**
     * <p>Specifies whether to mark duplicate values.</p>
     */
    @NameInMap("mapping_is_mark_dup")
    public String mappingIsMarkDup;

    /**
     * <p>The region where the Object Storage Service (OSS) bucket that stores the data of the mapping workflow is deployed.</p>
     */
    @NameInMap("mapping_oss_region")
    public String mappingOssRegion;

    /**
     * <p>The path of the reference files of the mapping workflow.</p>
     */
    @NameInMap("mapping_reference_path")
    public String mappingReferencePath;

    /**
     * <p>The type of service-level agreement (SLA). Valid values:</p>
     * <br>
     * <p>*   s: the silver level (S-level). It requires 1 extra minute to process every 1.5 billion base pairs beyond the limit of 90 billion base pairs.</p>
     * <p>*   g: the gold level (G-level). It requires 1 extra minute to process every 2 billion base pairs beyond the limit of 90 billion base pairs.</p>
     * <p>*   p: the platinum level (P-level). It requires 1 extra minute to process every 3 billion base pairs beyond the limit of 90 billion base pairs.</p>
     */
    @NameInMap("service")
    public String service;

    /**
     * <p>The name of the OSS bucket that stores the data of the WGS workflow.</p>
     */
    @NameInMap("wgs_bucket_name")
    public String wgsBucketName;

    /**
     * <p>The name of the first FASTQ file of the WGS workflow.</p>
     */
    @NameInMap("wgs_fastq_first_filename")
    public String wgsFastqFirstFilename;

    /**
     * <p>The path of the FASTQ files of the WGS workflow.</p>
     */
    @NameInMap("wgs_fastq_path")
    public String wgsFastqPath;

    /**
     * <p>The name of the second FASTQ file of the WGS workflow.</p>
     */
    @NameInMap("wgs_fastq_second_filename")
    public String wgsFastqSecondFilename;

    /**
     * <p>The region where the OSS bucket that stores the data of the whole genome sequencing (WGS) workflow is deployed.</p>
     */
    @NameInMap("wgs_oss_region")
    public String wgsOssRegion;

    /**
     * <p>The path of the reference files of the WGS workflow.</p>
     */
    @NameInMap("wgs_reference_path")
    public String wgsReferencePath;

    /**
     * <p>The name of the output VCF file.</p>
     */
    @NameInMap("wgs_vcf_out_filename")
    public String wgsVcfOutFilename;

    /**
     * <p>The output path of the Variant Call Format (VCF) file.</p>
     */
    @NameInMap("wgs_vcf_out_path")
    public String wgsVcfOutPath;

    /**
     * <p>The type of workflow. Valid values: wgs and mapping.</p>
     */
    @NameInMap("workflow_type")
    public String workflowType;

    public static StartWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowRequest self = new StartWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public StartWorkflowRequest setMappingBamOutFilename(String mappingBamOutFilename) {
        this.mappingBamOutFilename = mappingBamOutFilename;
        return this;
    }
    public String getMappingBamOutFilename() {
        return this.mappingBamOutFilename;
    }

    public StartWorkflowRequest setMappingBamOutPath(String mappingBamOutPath) {
        this.mappingBamOutPath = mappingBamOutPath;
        return this;
    }
    public String getMappingBamOutPath() {
        return this.mappingBamOutPath;
    }

    public StartWorkflowRequest setMappingBucketName(String mappingBucketName) {
        this.mappingBucketName = mappingBucketName;
        return this;
    }
    public String getMappingBucketName() {
        return this.mappingBucketName;
    }

    public StartWorkflowRequest setMappingFastqFirstFilename(String mappingFastqFirstFilename) {
        this.mappingFastqFirstFilename = mappingFastqFirstFilename;
        return this;
    }
    public String getMappingFastqFirstFilename() {
        return this.mappingFastqFirstFilename;
    }

    public StartWorkflowRequest setMappingFastqPath(String mappingFastqPath) {
        this.mappingFastqPath = mappingFastqPath;
        return this;
    }
    public String getMappingFastqPath() {
        return this.mappingFastqPath;
    }

    public StartWorkflowRequest setMappingFastqSecondFilename(String mappingFastqSecondFilename) {
        this.mappingFastqSecondFilename = mappingFastqSecondFilename;
        return this;
    }
    public String getMappingFastqSecondFilename() {
        return this.mappingFastqSecondFilename;
    }

    public StartWorkflowRequest setMappingIsMarkDup(String mappingIsMarkDup) {
        this.mappingIsMarkDup = mappingIsMarkDup;
        return this;
    }
    public String getMappingIsMarkDup() {
        return this.mappingIsMarkDup;
    }

    public StartWorkflowRequest setMappingOssRegion(String mappingOssRegion) {
        this.mappingOssRegion = mappingOssRegion;
        return this;
    }
    public String getMappingOssRegion() {
        return this.mappingOssRegion;
    }

    public StartWorkflowRequest setMappingReferencePath(String mappingReferencePath) {
        this.mappingReferencePath = mappingReferencePath;
        return this;
    }
    public String getMappingReferencePath() {
        return this.mappingReferencePath;
    }

    public StartWorkflowRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public StartWorkflowRequest setWgsBucketName(String wgsBucketName) {
        this.wgsBucketName = wgsBucketName;
        return this;
    }
    public String getWgsBucketName() {
        return this.wgsBucketName;
    }

    public StartWorkflowRequest setWgsFastqFirstFilename(String wgsFastqFirstFilename) {
        this.wgsFastqFirstFilename = wgsFastqFirstFilename;
        return this;
    }
    public String getWgsFastqFirstFilename() {
        return this.wgsFastqFirstFilename;
    }

    public StartWorkflowRequest setWgsFastqPath(String wgsFastqPath) {
        this.wgsFastqPath = wgsFastqPath;
        return this;
    }
    public String getWgsFastqPath() {
        return this.wgsFastqPath;
    }

    public StartWorkflowRequest setWgsFastqSecondFilename(String wgsFastqSecondFilename) {
        this.wgsFastqSecondFilename = wgsFastqSecondFilename;
        return this;
    }
    public String getWgsFastqSecondFilename() {
        return this.wgsFastqSecondFilename;
    }

    public StartWorkflowRequest setWgsOssRegion(String wgsOssRegion) {
        this.wgsOssRegion = wgsOssRegion;
        return this;
    }
    public String getWgsOssRegion() {
        return this.wgsOssRegion;
    }

    public StartWorkflowRequest setWgsReferencePath(String wgsReferencePath) {
        this.wgsReferencePath = wgsReferencePath;
        return this;
    }
    public String getWgsReferencePath() {
        return this.wgsReferencePath;
    }

    public StartWorkflowRequest setWgsVcfOutFilename(String wgsVcfOutFilename) {
        this.wgsVcfOutFilename = wgsVcfOutFilename;
        return this;
    }
    public String getWgsVcfOutFilename() {
        return this.wgsVcfOutFilename;
    }

    public StartWorkflowRequest setWgsVcfOutPath(String wgsVcfOutPath) {
        this.wgsVcfOutPath = wgsVcfOutPath;
        return this;
    }
    public String getWgsVcfOutPath() {
        return this.wgsVcfOutPath;
    }

    public StartWorkflowRequest setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
        return this;
    }
    public String getWorkflowType() {
        return this.workflowType;
    }

}
