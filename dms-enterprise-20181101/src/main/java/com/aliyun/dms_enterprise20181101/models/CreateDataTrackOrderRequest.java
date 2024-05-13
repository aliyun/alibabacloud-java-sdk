// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataTrackOrderRequest extends TeaModel {
    /**
     * <p>The purpose or objective of the data tracking ticket. This parameter is used to help reduce unnecessary communication.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The parameters of the ticket.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Param")
    public CreateDataTrackOrderRequestParam param;

    /**
     * <p>The IDs of the operators that are related to the ticket.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<String> relatedUserList;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateDataTrackOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataTrackOrderRequest self = new CreateDataTrackOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataTrackOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataTrackOrderRequest setParam(CreateDataTrackOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateDataTrackOrderRequestParam getParam() {
        return this.param;
    }

    public CreateDataTrackOrderRequest setRelatedUserList(java.util.List<String> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<String> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateDataTrackOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateDataTrackOrderRequestParam extends TeaModel {
        /**
         * <p>The ID of the database. You can call the [SearchDatabases](https://help.aliyun.com/document_detail/141876.html) operation to query the ID of the database.</p>
         * <br>
         * <p>> You can call this operation to create a data tracking ticket for only physical databases. This operation is not applicable to logical databases.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbId")
        public String dbId;

        /**
         * <p>The end time of the time range in which you want to track data operations. The time must be in the yyyy-MM-dd HH:mm:ss format.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("JobEndTime")
        public String jobEndTime;

        /**
         * <p>The start time of the time range in which you want to track data operations. The time must be in the yyyy-MM-dd HH:mm:ss format.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("JobStartTime")
        public String jobStartTime;

        /**
         * <p>The names of the tables for which you want to track data operations.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("TableNames")
        public java.util.List<String> tableNames;

        /**
         * <p>The types of data operations that you want to track.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("TrackTypes")
        public java.util.List<String> trackTypes;

        public static CreateDataTrackOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataTrackOrderRequestParam self = new CreateDataTrackOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateDataTrackOrderRequestParam setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public CreateDataTrackOrderRequestParam setJobEndTime(String jobEndTime) {
            this.jobEndTime = jobEndTime;
            return this;
        }
        public String getJobEndTime() {
            return this.jobEndTime;
        }

        public CreateDataTrackOrderRequestParam setJobStartTime(String jobStartTime) {
            this.jobStartTime = jobStartTime;
            return this;
        }
        public String getJobStartTime() {
            return this.jobStartTime;
        }

        public CreateDataTrackOrderRequestParam setTableNames(java.util.List<String> tableNames) {
            this.tableNames = tableNames;
            return this;
        }
        public java.util.List<String> getTableNames() {
            return this.tableNames;
        }

        public CreateDataTrackOrderRequestParam setTrackTypes(java.util.List<String> trackTypes) {
            this.trackTypes = trackTypes;
            return this;
        }
        public java.util.List<String> getTrackTypes() {
            return this.trackTypes;
        }

    }

}
