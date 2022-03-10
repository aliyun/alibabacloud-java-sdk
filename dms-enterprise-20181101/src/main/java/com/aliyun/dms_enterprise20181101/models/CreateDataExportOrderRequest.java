// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataExportOrderRequest extends TeaModel {
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("Param")
    public CreateDataExportOrderRequestParam param;

    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    @NameInMap("Tid")
    public Long tid;

    public static CreateDataExportOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataExportOrderRequest self = new CreateDataExportOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataExportOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDataExportOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataExportOrderRequest setParam(CreateDataExportOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateDataExportOrderRequestParam getParam() {
        return this.param;
    }

    public CreateDataExportOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateDataExportOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateDataExportOrderRequestParamDbItemList extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("Logic")
        public Boolean logic;

        public static CreateDataExportOrderRequestParamDbItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateDataExportOrderRequestParamDbItemList self = new CreateDataExportOrderRequestParamDbItemList();
            return TeaModel.build(map, self);
        }

        public CreateDataExportOrderRequestParamDbItemList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateDataExportOrderRequestParamDbItemList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

    }

    public static class CreateDataExportOrderRequestParam extends TeaModel {
        @NameInMap("Classify")
        public String classify;

        @NameInMap("DbItemList")
        public java.util.List<CreateDataExportOrderRequestParamDbItemList> dbItemList;

        @NameInMap("ExecSQL")
        public String execSQL;

        public static CreateDataExportOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataExportOrderRequestParam self = new CreateDataExportOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateDataExportOrderRequestParam setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public CreateDataExportOrderRequestParam setDbItemList(java.util.List<CreateDataExportOrderRequestParamDbItemList> dbItemList) {
            this.dbItemList = dbItemList;
            return this;
        }
        public java.util.List<CreateDataExportOrderRequestParamDbItemList> getDbItemList() {
            return this.dbItemList;
        }

        public CreateDataExportOrderRequestParam setExecSQL(String execSQL) {
            this.execSQL = execSQL;
            return this;
        }
        public String getExecSQL() {
            return this.execSQL;
        }

    }

}
