// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCronClearOrderRequest extends TeaModel {
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("Param")
    public CreateDataCronClearOrderRequestParam param;

    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    @NameInMap("Tid")
    public Long tid;

    public static CreateDataCronClearOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCronClearOrderRequest self = new CreateDataCronClearOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataCronClearOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDataCronClearOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataCronClearOrderRequest setParam(CreateDataCronClearOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateDataCronClearOrderRequestParam getParam() {
        return this.param;
    }

    public CreateDataCronClearOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateDataCronClearOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateDataCronClearOrderRequestParamCronClearItemList extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("FilterSQL")
        public String filterSQL;

        @NameInMap("RemainDays")
        public Long remainDays;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TimeUnit")
        public String timeUnit;

        public static CreateDataCronClearOrderRequestParamCronClearItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateDataCronClearOrderRequestParamCronClearItemList self = new CreateDataCronClearOrderRequestParamCronClearItemList();
            return TeaModel.build(map, self);
        }

        public CreateDataCronClearOrderRequestParamCronClearItemList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateDataCronClearOrderRequestParamCronClearItemList setFilterSQL(String filterSQL) {
            this.filterSQL = filterSQL;
            return this;
        }
        public String getFilterSQL() {
            return this.filterSQL;
        }

        public CreateDataCronClearOrderRequestParamCronClearItemList setRemainDays(Long remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Long getRemainDays() {
            return this.remainDays;
        }

        public CreateDataCronClearOrderRequestParamCronClearItemList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public CreateDataCronClearOrderRequestParamCronClearItemList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class CreateDataCronClearOrderRequestParamDbItemList extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("Logic")
        public Boolean logic;

        public static CreateDataCronClearOrderRequestParamDbItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateDataCronClearOrderRequestParamDbItemList self = new CreateDataCronClearOrderRequestParamDbItemList();
            return TeaModel.build(map, self);
        }

        public CreateDataCronClearOrderRequestParamDbItemList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateDataCronClearOrderRequestParamDbItemList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

    }

    public static class CreateDataCronClearOrderRequestParam extends TeaModel {
        @NameInMap("Classify")
        public String classify;

        @NameInMap("CronClearItemList")
        public java.util.List<CreateDataCronClearOrderRequestParamCronClearItemList> cronClearItemList;

        @NameInMap("CronFormat")
        public String cronFormat;

        @NameInMap("DbItemList")
        public java.util.List<CreateDataCronClearOrderRequestParamDbItemList> dbItemList;

        @NameInMap("DurationHour")
        public Long durationHour;

        @NameInMap("specifyDuration")
        public Boolean specifyDuration;

        public static CreateDataCronClearOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataCronClearOrderRequestParam self = new CreateDataCronClearOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateDataCronClearOrderRequestParam setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public CreateDataCronClearOrderRequestParam setCronClearItemList(java.util.List<CreateDataCronClearOrderRequestParamCronClearItemList> cronClearItemList) {
            this.cronClearItemList = cronClearItemList;
            return this;
        }
        public java.util.List<CreateDataCronClearOrderRequestParamCronClearItemList> getCronClearItemList() {
            return this.cronClearItemList;
        }

        public CreateDataCronClearOrderRequestParam setCronFormat(String cronFormat) {
            this.cronFormat = cronFormat;
            return this;
        }
        public String getCronFormat() {
            return this.cronFormat;
        }

        public CreateDataCronClearOrderRequestParam setDbItemList(java.util.List<CreateDataCronClearOrderRequestParamDbItemList> dbItemList) {
            this.dbItemList = dbItemList;
            return this;
        }
        public java.util.List<CreateDataCronClearOrderRequestParamDbItemList> getDbItemList() {
            return this.dbItemList;
        }

        public CreateDataCronClearOrderRequestParam setDurationHour(Long durationHour) {
            this.durationHour = durationHour;
            return this;
        }
        public Long getDurationHour() {
            return this.durationHour;
        }

        public CreateDataCronClearOrderRequestParam setSpecifyDuration(Boolean specifyDuration) {
            this.specifyDuration = specifyDuration;
            return this;
        }
        public Boolean getSpecifyDuration() {
            return this.specifyDuration;
        }

    }

}
