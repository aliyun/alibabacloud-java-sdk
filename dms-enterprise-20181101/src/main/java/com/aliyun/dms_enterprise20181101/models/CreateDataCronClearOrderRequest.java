// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCronClearOrderRequest extends TeaModel {
    /**
     * <p>The ID of the ticket.</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>Indicates whether the database is a logical database. Valid values:</p>
     * <br>
     * <p>*   **true**: The database is a logical database.</p>
     * <p>*   **false**: The database is not a logical database.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The databases for which you want to clear historical data.</p>
     */
    @NameInMap("Param")
    public CreateDataCronClearOrderRequestParam param;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  The ID of the tenant is displayed when you move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the [View information about the current tenant](~~181330~~) section of the Manage DMS tenants topic.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <p>The reason for the data change.</p>
     */
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
        /**
         * <p>The amount of time taken to run the task. Unit: hours.</p>
         * <br>
         * <p>>  If the **specifyDuration** parameter is set to **true**, this parameter is required.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The retention period of the historical data. Unit: days. For example, if you set the parameter to 7, DMS deletes the data that is retained for more than seven days.</p>
         */
        @NameInMap("FilterSQL")
        public String filterSQL;

        /**
         * <p>The crontab expression that you can use to run the task at a specified time. For more information, see [Crontab expression](~~206581~~).</p>
         */
        @NameInMap("RemainDays")
        public Long remainDays;

        /**
         * <p>The parameters of the ticket.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The error message.</p>
         */
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
        /**
         * <p>The type of time granularity. If the ColumnName parameter specifies a field of a time type, this parameter is required. Valid values:</p>
         * <br>
         * <p>*   **MILLISECONDS**: milliseconds</p>
         * <p>*   **SECONDS**: seconds</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The tables for which you want to clear historical data.</p>
         */
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
        /**
         * <p>The purpose or objective of the data change. This reduces unnecessary communication.</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The stakeholders of this operation. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than Data Management (DMS) administrators and database administrators (DBAs) are not allowed to view the ticket details.</p>
         */
        @NameInMap("CronClearItemList")
        public java.util.List<CreateDataCronClearOrderRequestParamCronClearItemList> cronClearItemList;

        /**
         * <p>The name of the field.</p>
         */
        @NameInMap("CronFormat")
        public String cronFormat;

        /**
         * <p>The ID of the database. You can call the [SearchDatabases](~~141876~~) operation to query the ID of the database.</p>
         */
        @NameInMap("DbItemList")
        public java.util.List<CreateDataCronClearOrderRequestParamDbItemList> dbItemList;

        /**
         * <p>The key of the attachment for the ticket. The attachment provides more instructions for this operation.</p>
         * <br>
         * <p>You can call the [GetUserUploadFileJob](~~206069~~) operation to query the key of the attachment.</p>
         */
        @NameInMap("DurationHour")
        public Long durationHour;

        /**
         * <p>The name of the table. You can call the [ListTables](~~141878~~) operation to query the name of the table.</p>
         */
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
