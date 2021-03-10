// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCronClearOrderRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    @NameInMap("Param")
    public CreateDataCronClearOrderRequestParam param;

    @NameInMap("AttachmentKey")
    public String attachmentKey;

    @NameInMap("Tid")
    public Long tid;

    public static CreateDataCronClearOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCronClearOrderRequest self = new CreateDataCronClearOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataCronClearOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataCronClearOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateDataCronClearOrderRequest setParam(CreateDataCronClearOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateDataCronClearOrderRequestParam getParam() {
        return this.param;
    }

    public CreateDataCronClearOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDataCronClearOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
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

    public static class CreateDataCronClearOrderRequestParamCronClearItemList extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("RemainDays")
        public Long remainDays;

        @NameInMap("TimeUnit")
        public String timeUnit;

        @NameInMap("FilterSQL")
        public String filterSQL;

        public static CreateDataCronClearOrderRequestParamCronClearItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateDataCronClearOrderRequestParamCronClearItemList self = new CreateDataCronClearOrderRequestParamCronClearItemList();
            return TeaModel.build(map, self);
        }

        public CreateDataCronClearOrderRequestParamCronClearItemList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public CreateDataCronClearOrderRequestParamCronClearItemList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateDataCronClearOrderRequestParamCronClearItemList setRemainDays(Long remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Long getRemainDays() {
            return this.remainDays;
        }

        public CreateDataCronClearOrderRequestParamCronClearItemList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public CreateDataCronClearOrderRequestParamCronClearItemList setFilterSQL(String filterSQL) {
            this.filterSQL = filterSQL;
            return this;
        }
        public String getFilterSQL() {
            return this.filterSQL;
        }

    }

    public static class CreateDataCronClearOrderRequestParam extends TeaModel {
        @NameInMap("Classify")
        public String classify;

        @NameInMap("DbItemList")
        public java.util.List<CreateDataCronClearOrderRequestParamDbItemList> dbItemList;

        @NameInMap("CronFormat")
        public String cronFormat;

        @NameInMap("CronClearItemList")
        public java.util.List<CreateDataCronClearOrderRequestParamCronClearItemList> cronClearItemList;

        @NameInMap("specifyDuration")
        public Boolean specifyDuration;

        @NameInMap("DurationHour")
        public Long durationHour;

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

        public CreateDataCronClearOrderRequestParam setDbItemList(java.util.List<CreateDataCronClearOrderRequestParamDbItemList> dbItemList) {
            this.dbItemList = dbItemList;
            return this;
        }
        public java.util.List<CreateDataCronClearOrderRequestParamDbItemList> getDbItemList() {
            return this.dbItemList;
        }

        public CreateDataCronClearOrderRequestParam setCronFormat(String cronFormat) {
            this.cronFormat = cronFormat;
            return this;
        }
        public String getCronFormat() {
            return this.cronFormat;
        }

        public CreateDataCronClearOrderRequestParam setCronClearItemList(java.util.List<CreateDataCronClearOrderRequestParamCronClearItemList> cronClearItemList) {
            this.cronClearItemList = cronClearItemList;
            return this;
        }
        public java.util.List<CreateDataCronClearOrderRequestParamCronClearItemList> getCronClearItemList() {
            return this.cronClearItemList;
        }

        public CreateDataCronClearOrderRequestParam setSpecifyDuration(Boolean specifyDuration) {
            this.specifyDuration = specifyDuration;
            return this;
        }
        public Boolean getSpecifyDuration() {
            return this.specifyDuration;
        }

        public CreateDataCronClearOrderRequestParam setDurationHour(Long durationHour) {
            this.durationHour = durationHour;
            return this;
        }
        public Long getDurationHour() {
            return this.durationHour;
        }

    }

}
