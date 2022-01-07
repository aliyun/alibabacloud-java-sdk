// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateFreeLockCorrectOrderRequest extends TeaModel {
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("Param")
    public CreateFreeLockCorrectOrderRequestParam param;

    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    @NameInMap("Tid")
    public Long tid;

    public static CreateFreeLockCorrectOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFreeLockCorrectOrderRequest self = new CreateFreeLockCorrectOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateFreeLockCorrectOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateFreeLockCorrectOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateFreeLockCorrectOrderRequest setParam(CreateFreeLockCorrectOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateFreeLockCorrectOrderRequestParam getParam() {
        return this.param;
    }

    public CreateFreeLockCorrectOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateFreeLockCorrectOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateFreeLockCorrectOrderRequestParamDbItemList extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("Logic")
        public Boolean logic;

        public static CreateFreeLockCorrectOrderRequestParamDbItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateFreeLockCorrectOrderRequestParamDbItemList self = new CreateFreeLockCorrectOrderRequestParamDbItemList();
            return TeaModel.build(map, self);
        }

        public CreateFreeLockCorrectOrderRequestParamDbItemList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateFreeLockCorrectOrderRequestParamDbItemList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

    }

    public static class CreateFreeLockCorrectOrderRequestParam extends TeaModel {
        @NameInMap("AttachmentName")
        public String attachmentName;

        @NameInMap("Classify")
        public String classify;

        @NameInMap("DbItemList")
        public java.util.List<CreateFreeLockCorrectOrderRequestParamDbItemList> dbItemList;

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

        public static CreateFreeLockCorrectOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateFreeLockCorrectOrderRequestParam self = new CreateFreeLockCorrectOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateFreeLockCorrectOrderRequestParam setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public CreateFreeLockCorrectOrderRequestParam setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public CreateFreeLockCorrectOrderRequestParam setDbItemList(java.util.List<CreateFreeLockCorrectOrderRequestParamDbItemList> dbItemList) {
            this.dbItemList = dbItemList;
            return this;
        }
        public java.util.List<CreateFreeLockCorrectOrderRequestParamDbItemList> getDbItemList() {
            return this.dbItemList;
        }

        public CreateFreeLockCorrectOrderRequestParam setExecSQL(String execSQL) {
            this.execSQL = execSQL;
            return this;
        }
        public String getExecSQL() {
            return this.execSQL;
        }

        public CreateFreeLockCorrectOrderRequestParam setRollbackAttachmentName(String rollbackAttachmentName) {
            this.rollbackAttachmentName = rollbackAttachmentName;
            return this;
        }
        public String getRollbackAttachmentName() {
            return this.rollbackAttachmentName;
        }

        public CreateFreeLockCorrectOrderRequestParam setRollbackSQL(String rollbackSQL) {
            this.rollbackSQL = rollbackSQL;
            return this;
        }
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        public CreateFreeLockCorrectOrderRequestParam setRollbackSqlType(String rollbackSqlType) {
            this.rollbackSqlType = rollbackSqlType;
            return this;
        }
        public String getRollbackSqlType() {
            return this.rollbackSqlType;
        }

        public CreateFreeLockCorrectOrderRequestParam setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

    }

}
