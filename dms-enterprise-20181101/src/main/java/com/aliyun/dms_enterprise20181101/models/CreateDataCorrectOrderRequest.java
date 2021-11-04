// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCorrectOrderRequest extends TeaModel {
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("Param")
    public CreateDataCorrectOrderRequestParam param;

    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    @NameInMap("Tid")
    public Long tid;

    public static CreateDataCorrectOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCorrectOrderRequest self = new CreateDataCorrectOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataCorrectOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDataCorrectOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataCorrectOrderRequest setParam(CreateDataCorrectOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateDataCorrectOrderRequestParam getParam() {
        return this.param;
    }

    public CreateDataCorrectOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateDataCorrectOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateDataCorrectOrderRequestParamDbItemList extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("Logic")
        public Boolean logic;

        public static CreateDataCorrectOrderRequestParamDbItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateDataCorrectOrderRequestParamDbItemList self = new CreateDataCorrectOrderRequestParamDbItemList();
            return TeaModel.build(map, self);
        }

        public CreateDataCorrectOrderRequestParamDbItemList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateDataCorrectOrderRequestParamDbItemList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

    }

    public static class CreateDataCorrectOrderRequestParam extends TeaModel {
        @NameInMap("AttachmentName")
        public String attachmentName;

        @NameInMap("Classify")
        public String classify;

        @NameInMap("DbItemList")
        public java.util.List<CreateDataCorrectOrderRequestParamDbItemList> dbItemList;

        @NameInMap("EstimateAffectRows")
        public Long estimateAffectRows;

        @NameInMap("ExecSQL")
        public String execSQL;

        @NameInMap("RollbackAttachmentName")
        public String rollbackAttachmentName;

        @NameInMap("RollbackSQL")
        public String rollbackSQL;

        @NameInMap("RollbackSqlType")
        public String rollbackSqlType;

        @NameInMap("SqlType")
        public String sqlType;

        public static CreateDataCorrectOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataCorrectOrderRequestParam self = new CreateDataCorrectOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateDataCorrectOrderRequestParam setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public CreateDataCorrectOrderRequestParam setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public CreateDataCorrectOrderRequestParam setDbItemList(java.util.List<CreateDataCorrectOrderRequestParamDbItemList> dbItemList) {
            this.dbItemList = dbItemList;
            return this;
        }
        public java.util.List<CreateDataCorrectOrderRequestParamDbItemList> getDbItemList() {
            return this.dbItemList;
        }

        public CreateDataCorrectOrderRequestParam setEstimateAffectRows(Long estimateAffectRows) {
            this.estimateAffectRows = estimateAffectRows;
            return this;
        }
        public Long getEstimateAffectRows() {
            return this.estimateAffectRows;
        }

        public CreateDataCorrectOrderRequestParam setExecSQL(String execSQL) {
            this.execSQL = execSQL;
            return this;
        }
        public String getExecSQL() {
            return this.execSQL;
        }

        public CreateDataCorrectOrderRequestParam setRollbackAttachmentName(String rollbackAttachmentName) {
            this.rollbackAttachmentName = rollbackAttachmentName;
            return this;
        }
        public String getRollbackAttachmentName() {
            return this.rollbackAttachmentName;
        }

        public CreateDataCorrectOrderRequestParam setRollbackSQL(String rollbackSQL) {
            this.rollbackSQL = rollbackSQL;
            return this;
        }
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        public CreateDataCorrectOrderRequestParam setRollbackSqlType(String rollbackSqlType) {
            this.rollbackSqlType = rollbackSqlType;
            return this;
        }
        public String getRollbackSqlType() {
            return this.rollbackSqlType;
        }

        public CreateDataCorrectOrderRequestParam setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

    }

}
