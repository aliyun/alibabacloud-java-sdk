// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCronClearOrderRequest extends TeaModel {
    /**
     * <p>The key of the attachment for the ticket. The attachment provides more instructions for this operation.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to query the key of the attachment.</p>
     * 
     * <strong>example:</strong>
     * <p>order_attachement.txt</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The purpose or objective of the data change. This reduces unnecessary communication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The parameters of the ticket.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Param")
    public CreateDataCronClearOrderRequestParam param;

    /**
     * <p>The stakeholders of this operation. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than Data Management (DMS) administrators and database administrators (DBAs) are not allowed to view the ticket details.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> The ID of the tenant is displayed when you move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the Manage DMS tenants topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123454324</p>
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
         * <p>The name of the field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gmt_create</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>where 1 = 1</p>
         */
        @NameInMap("FilterSQL")
        public String filterSQL;

        /**
         * <p>The retention period of the historical data. Unit: days. For example, if you set the parameter to 7, DMS deletes the data that is retained for more than seven days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("RemainDays")
        public Long remainDays;

        /**
         * <p>The name of the table. You can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to query the name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t1</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The type of time granularity. If the ColumnName parameter specifies a field of a time type, this parameter is required. Valid values:</p>
         * <ul>
         * <li><strong>MILLISECONDS</strong>: milliseconds</li>
         * <li><strong>SECONDS</strong>: seconds</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MILLISECONDS</p>
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
         * <p>The ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabases</a> operation to query the ID of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database.</li>
         * <li><strong>false</strong>: The database is not a logical database.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The reason for the data change.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The tables for which you want to clear historical data.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("CronClearItemList")
        public java.util.List<CreateDataCronClearOrderRequestParamCronClearItemList> cronClearItemList;

        /**
         * <p>The crontab expression that you can use to run the task at a specified time. For more information, see <a href="https://help.aliyun.com/document_detail/206581.html">Crontab expression</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 * * ?</p>
         */
        @NameInMap("CronFormat")
        public String cronFormat;

        /**
         * <p>The databases for which you want to clear historical data.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbItemList")
        public java.util.List<CreateDataCronClearOrderRequestParamDbItemList> dbItemList;

        /**
         * <p>The amount of time taken to run the task. Unit: hours.</p>
         * <blockquote>
         * <p> If the <strong>specifyDuration</strong> parameter is set to <strong>true</strong>, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DurationHour")
        public Long durationHour;

        /**
         * <p>Specifies whether to specify an end time for the task. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: specifies an end time for the task. The task is automatically suspended after this end time.</li>
         * <li><strong>false</strong>: does not specify an end time for the task. The task is stopped after the historical data is cleared.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
