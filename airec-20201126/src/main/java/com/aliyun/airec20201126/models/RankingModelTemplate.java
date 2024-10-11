// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RankingModelTemplate extends TeaModel {
    @NameInMap("Meta")
    public RankingModelTemplateMeta meta;

    /**
     * <strong>example:</strong>
     * <p>TRAINING_SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>a-a-a</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("VersionNum")
    public Long versionNum;

    public static RankingModelTemplate build(java.util.Map<String, ?> map) throws Exception {
        RankingModelTemplate self = new RankingModelTemplate();
        return TeaModel.build(map, self);
    }

    public RankingModelTemplate setMeta(RankingModelTemplateMeta meta) {
        this.meta = meta;
        return this;
    }
    public RankingModelTemplateMeta getMeta() {
        return this.meta;
    }

    public RankingModelTemplate setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RankingModelTemplate setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public RankingModelTemplate setVersionNum(Long versionNum) {
        this.versionNum = versionNum;
        return this;
    }
    public Long getVersionNum() {
        return this.versionNum;
    }

    public static class RankingModelTemplateMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Authorized")
        public Boolean authorized;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRun")
        public Boolean autoRun;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoRunTime")
        public Long autoRunTime;

        /**
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("AutoRunType")
        public String autoRunType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanDeploy")
        public Boolean canDeploy;

        /**
         * <strong>example:</strong>
         * <p>train_config {}</p>
         */
        @NameInMap("Conf")
        public String conf;

        /**
         * <strong>example:</strong>
         * <p>NOT_DEPLOYED</p>
         */
        @NameInMap("DeployStatus")
        public String deployStatus;

        /**
         * <strong>example:</strong>
         * <p>2021-12-06T03:01:41.217Z</p>
         */
        @NameInMap("LastEditTime")
        public String lastEditTime;

        /**
         * <strong>example:</strong>
         * <p>模型A</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>acs:ram::111:role/aliyunodpspaidefaultrole</p>
         */
        @NameInMap("OssArn")
        public String ossArn;

        /**
         * <strong>example:</strong>
         * <p>bucket-a</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-beijing.aliyuncs.com</p>
         */
        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("SampleId")
        public String sampleId;

        /**
         * <strong>example:</strong>
         * <p>样本1</p>
         */
        @NameInMap("SampleName")
        public String sampleName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SampleTimeWindow")
        public Long sampleTimeWindow;

        /**
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("SampleTimeWindowType")
        public String sampleTimeWindowType;

        /**
         * <strong>example:</strong>
         * <p>MULTI_TOWER</p>
         */
        @NameInMap("Type")
        public String type;

        public static RankingModelTemplateMeta build(java.util.Map<String, ?> map) throws Exception {
            RankingModelTemplateMeta self = new RankingModelTemplateMeta();
            return TeaModel.build(map, self);
        }

        public RankingModelTemplateMeta setAuthorized(Boolean authorized) {
            this.authorized = authorized;
            return this;
        }
        public Boolean getAuthorized() {
            return this.authorized;
        }

        public RankingModelTemplateMeta setAutoRun(Boolean autoRun) {
            this.autoRun = autoRun;
            return this;
        }
        public Boolean getAutoRun() {
            return this.autoRun;
        }

        public RankingModelTemplateMeta setAutoRunTime(Long autoRunTime) {
            this.autoRunTime = autoRunTime;
            return this;
        }
        public Long getAutoRunTime() {
            return this.autoRunTime;
        }

        public RankingModelTemplateMeta setAutoRunType(String autoRunType) {
            this.autoRunType = autoRunType;
            return this;
        }
        public String getAutoRunType() {
            return this.autoRunType;
        }

        public RankingModelTemplateMeta setCanDeploy(Boolean canDeploy) {
            this.canDeploy = canDeploy;
            return this;
        }
        public Boolean getCanDeploy() {
            return this.canDeploy;
        }

        public RankingModelTemplateMeta setConf(String conf) {
            this.conf = conf;
            return this;
        }
        public String getConf() {
            return this.conf;
        }

        public RankingModelTemplateMeta setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public RankingModelTemplateMeta setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        public RankingModelTemplateMeta setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RankingModelTemplateMeta setOssArn(String ossArn) {
            this.ossArn = ossArn;
            return this;
        }
        public String getOssArn() {
            return this.ossArn;
        }

        public RankingModelTemplateMeta setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public RankingModelTemplateMeta setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public RankingModelTemplateMeta setSampleId(String sampleId) {
            this.sampleId = sampleId;
            return this;
        }
        public String getSampleId() {
            return this.sampleId;
        }

        public RankingModelTemplateMeta setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public RankingModelTemplateMeta setSampleTimeWindow(Long sampleTimeWindow) {
            this.sampleTimeWindow = sampleTimeWindow;
            return this;
        }
        public Long getSampleTimeWindow() {
            return this.sampleTimeWindow;
        }

        public RankingModelTemplateMeta setSampleTimeWindowType(String sampleTimeWindowType) {
            this.sampleTimeWindowType = sampleTimeWindowType;
            return this;
        }
        public String getSampleTimeWindowType() {
            return this.sampleTimeWindowType;
        }

        public RankingModelTemplateMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
