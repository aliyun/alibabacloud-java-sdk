// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateStructSyncOrderRequest extends TeaModel {
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("Param")
    public CreateStructSyncOrderRequestParam param;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    @NameInMap("Tid")
    public Long tid;

    public static CreateStructSyncOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStructSyncOrderRequest self = new CreateStructSyncOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateStructSyncOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateStructSyncOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateStructSyncOrderRequest setParam(CreateStructSyncOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateStructSyncOrderRequestParam getParam() {
        return this.param;
    }

    public CreateStructSyncOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStructSyncOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateStructSyncOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateStructSyncOrderRequestParamSource extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("DbSearchName")
        public String dbSearchName;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("VersionId")
        public String versionId;

        public static CreateStructSyncOrderRequestParamSource build(java.util.Map<String, ?> map) throws Exception {
            CreateStructSyncOrderRequestParamSource self = new CreateStructSyncOrderRequestParamSource();
            return TeaModel.build(map, self);
        }

        public CreateStructSyncOrderRequestParamSource setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateStructSyncOrderRequestParamSource setDbSearchName(String dbSearchName) {
            this.dbSearchName = dbSearchName;
            return this;
        }
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        public CreateStructSyncOrderRequestParamSource setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public CreateStructSyncOrderRequestParamSource setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class CreateStructSyncOrderRequestParamTableInfoList extends TeaModel {
        @NameInMap("SourceTableName")
        public String sourceTableName;

        @NameInMap("TargetTableName")
        public String targetTableName;

        public static CreateStructSyncOrderRequestParamTableInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateStructSyncOrderRequestParamTableInfoList self = new CreateStructSyncOrderRequestParamTableInfoList();
            return TeaModel.build(map, self);
        }

        public CreateStructSyncOrderRequestParamTableInfoList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public CreateStructSyncOrderRequestParamTableInfoList setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

    }

    public static class CreateStructSyncOrderRequestParamTarget extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("DbSearchName")
        public String dbSearchName;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("VersionId")
        public String versionId;

        public static CreateStructSyncOrderRequestParamTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateStructSyncOrderRequestParamTarget self = new CreateStructSyncOrderRequestParamTarget();
            return TeaModel.build(map, self);
        }

        public CreateStructSyncOrderRequestParamTarget setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateStructSyncOrderRequestParamTarget setDbSearchName(String dbSearchName) {
            this.dbSearchName = dbSearchName;
            return this;
        }
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        public CreateStructSyncOrderRequestParamTarget setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public CreateStructSyncOrderRequestParamTarget setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class CreateStructSyncOrderRequestParam extends TeaModel {
        @NameInMap("IgnoreError")
        public Boolean ignoreError;

        @NameInMap("Source")
        public CreateStructSyncOrderRequestParamSource source;

        @NameInMap("TableInfoList")
        public java.util.List<CreateStructSyncOrderRequestParamTableInfoList> tableInfoList;

        @NameInMap("Target")
        public CreateStructSyncOrderRequestParamTarget target;

        public static CreateStructSyncOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateStructSyncOrderRequestParam self = new CreateStructSyncOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateStructSyncOrderRequestParam setIgnoreError(Boolean ignoreError) {
            this.ignoreError = ignoreError;
            return this;
        }
        public Boolean getIgnoreError() {
            return this.ignoreError;
        }

        public CreateStructSyncOrderRequestParam setSource(CreateStructSyncOrderRequestParamSource source) {
            this.source = source;
            return this;
        }
        public CreateStructSyncOrderRequestParamSource getSource() {
            return this.source;
        }

        public CreateStructSyncOrderRequestParam setTableInfoList(java.util.List<CreateStructSyncOrderRequestParamTableInfoList> tableInfoList) {
            this.tableInfoList = tableInfoList;
            return this;
        }
        public java.util.List<CreateStructSyncOrderRequestParamTableInfoList> getTableInfoList() {
            return this.tableInfoList;
        }

        public CreateStructSyncOrderRequestParam setTarget(CreateStructSyncOrderRequestParamTarget target) {
            this.target = target;
            return this;
        }
        public CreateStructSyncOrderRequestParamTarget getTarget() {
            return this.target;
        }

    }

}
