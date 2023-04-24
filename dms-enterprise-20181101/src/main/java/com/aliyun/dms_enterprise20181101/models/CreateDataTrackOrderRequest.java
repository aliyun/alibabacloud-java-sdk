// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataTrackOrderRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Param")
    public CreateDataTrackOrderRequestParam param;

    @NameInMap("RelatedUserList")
    public java.util.List<String> relatedUserList;

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
        @NameInMap("DbId")
        public String dbId;

        @NameInMap("JobEndTime")
        public String jobEndTime;

        @NameInMap("JobStartTime")
        public String jobStartTime;

        @NameInMap("TableNames")
        public java.util.List<String> tableNames;

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
