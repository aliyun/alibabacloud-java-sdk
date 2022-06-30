// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class CreateMigrationJobRequest extends TeaModel {
    @NameInMap("migrationJobList")
    public java.util.List<CreateMigrationJobRequestMigrationJobList> migrationJobList;

    @NameInMap("type")
    public String type;

    public static CreateMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationJobRequest self = new CreateMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateMigrationJobRequest setMigrationJobList(java.util.List<CreateMigrationJobRequestMigrationJobList> migrationJobList) {
        this.migrationJobList = migrationJobList;
        return this;
    }
    public java.util.List<CreateMigrationJobRequestMigrationJobList> getMigrationJobList() {
        return this.migrationJobList;
    }

    public CreateMigrationJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateMigrationJobRequestMigrationJobList extends TeaModel {
        // 目的
        @NameInMap("destination")
        public String destination;

        // 目的IP
        @NameInMap("destinationIp")
        public String destinationIp;

        // region
        @NameInMap("destinationRegion")
        public String destinationRegion;

        // 任务创建时间
        @NameInMap("jobGmtCreate")
        public String jobGmtCreate;

        // 任务最后修改时间
        @NameInMap("jobGmtModified")
        public String jobGmtModified;

        // 任务名称
        @NameInMap("name")
        public String name;

        // 来源系统的速度
        @NameInMap("originalPercent")
        public String originalPercent;

        // 来源系统的进度
        @NameInMap("originalProgress")
        public String originalProgress;

        // 来源系统状态
        @NameInMap("originalStatus")
        public String originalStatus;

        // 来源系统的jobID；
        @NameInMap("outSideId")
        public String outSideId;

        // 扩展字段
        @NameInMap("properties")
        public String properties;

        // 源
        @NameInMap("source")
        public String source;

        // 源IP
        @NameInMap("sourceIp")
        public String sourceIp;

        public static CreateMigrationJobRequestMigrationJobList build(java.util.Map<String, ?> map) throws Exception {
            CreateMigrationJobRequestMigrationJobList self = new CreateMigrationJobRequestMigrationJobList();
            return TeaModel.build(map, self);
        }

        public CreateMigrationJobRequestMigrationJobList setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public CreateMigrationJobRequestMigrationJobList setDestinationIp(String destinationIp) {
            this.destinationIp = destinationIp;
            return this;
        }
        public String getDestinationIp() {
            return this.destinationIp;
        }

        public CreateMigrationJobRequestMigrationJobList setDestinationRegion(String destinationRegion) {
            this.destinationRegion = destinationRegion;
            return this;
        }
        public String getDestinationRegion() {
            return this.destinationRegion;
        }

        public CreateMigrationJobRequestMigrationJobList setJobGmtCreate(String jobGmtCreate) {
            this.jobGmtCreate = jobGmtCreate;
            return this;
        }
        public String getJobGmtCreate() {
            return this.jobGmtCreate;
        }

        public CreateMigrationJobRequestMigrationJobList setJobGmtModified(String jobGmtModified) {
            this.jobGmtModified = jobGmtModified;
            return this;
        }
        public String getJobGmtModified() {
            return this.jobGmtModified;
        }

        public CreateMigrationJobRequestMigrationJobList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMigrationJobRequestMigrationJobList setOriginalPercent(String originalPercent) {
            this.originalPercent = originalPercent;
            return this;
        }
        public String getOriginalPercent() {
            return this.originalPercent;
        }

        public CreateMigrationJobRequestMigrationJobList setOriginalProgress(String originalProgress) {
            this.originalProgress = originalProgress;
            return this;
        }
        public String getOriginalProgress() {
            return this.originalProgress;
        }

        public CreateMigrationJobRequestMigrationJobList setOriginalStatus(String originalStatus) {
            this.originalStatus = originalStatus;
            return this;
        }
        public String getOriginalStatus() {
            return this.originalStatus;
        }

        public CreateMigrationJobRequestMigrationJobList setOutSideId(String outSideId) {
            this.outSideId = outSideId;
            return this;
        }
        public String getOutSideId() {
            return this.outSideId;
        }

        public CreateMigrationJobRequestMigrationJobList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public CreateMigrationJobRequestMigrationJobList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateMigrationJobRequestMigrationJobList setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

    }

}
