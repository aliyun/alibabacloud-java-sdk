// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAvatarTrainingJobsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListAvatarTrainingJobsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAvatarTrainingJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvatarTrainingJobsResponseBody self = new ListAvatarTrainingJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvatarTrainingJobsResponseBody setData(ListAvatarTrainingJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAvatarTrainingJobsResponseBodyData getData() {
        return this.data;
    }

    public ListAvatarTrainingJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvatarTrainingJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList extends TeaModel {
        @NameInMap("AvatarDescription")
        public String avatarDescription;

        /**
         * <strong>example:</strong>
         * <p>Avatar-XXX</p>
         */
        @NameInMap("AvatarId")
        public String avatarId;

        @NameInMap("AvatarName")
        public String avatarName;

        /**
         * <strong>example:</strong>
         * <p>2DAvatar</p>
         */
        @NameInMap("AvatarType")
        public String avatarType;

        /**
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:40Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:40Z</p>
         */
        @NameInMap("FirstTrainingTime")
        public String firstTrainingTime;

        /**
         * <strong>example:</strong>
         * <p><em><strong><strong>aded114489ea02e0addf93</strong></strong></em></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:40Z</p>
         */
        @NameInMap("LastTrainingTime")
        public String lastTrainingTime;

        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p><em><strong><strong>aded114489ea02e0addf93</strong></strong></em></p>
         */
        @NameInMap("Portrait")
        public String portrait;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList self = new ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList();
            return TeaModel.build(map, self);
        }

        public ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList setAvatarDescription(String avatarDescription) {
            this.avatarDescription = avatarDescription;
            return this;
        }
        public String getAvatarDescription() {
            return this.avatarDescription;
        }

        public ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList setAvatarId(String avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public String getAvatarId() {
            return this.avatarId;
        }

        public ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList setAvatarName(String avatarName) {
            this.avatarName = avatarName;
            return this;
        }
        public String getAvatarName() {
            return this.avatarName;
        }

        public ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList setAvatarType(String avatarType) {
            this.avatarType = avatarType;
            return this;
        }
        public String getAvatarType() {
            return this.avatarType;
        }

        public ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList setFirstTrainingTime(String firstTrainingTime) {
            this.firstTrainingTime = firstTrainingTime;
            return this;
        }
        public String getFirstTrainingTime() {
            return this.firstTrainingTime;
        }

        public ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList setLastTrainingTime(String lastTrainingTime) {
            this.lastTrainingTime = lastTrainingTime;
            return this;
        }
        public String getLastTrainingTime() {
            return this.lastTrainingTime;
        }

        public ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList setPortrait(String portrait) {
            this.portrait = portrait;
            return this;
        }
        public String getPortrait() {
            return this.portrait;
        }

        public ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAvatarTrainingJobsResponseBodyData extends TeaModel {
        @NameInMap("AvatarTrainingJobList")
        public java.util.List<ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList> avatarTrainingJobList;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListAvatarTrainingJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAvatarTrainingJobsResponseBodyData self = new ListAvatarTrainingJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAvatarTrainingJobsResponseBodyData setAvatarTrainingJobList(java.util.List<ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList> avatarTrainingJobList) {
            this.avatarTrainingJobList = avatarTrainingJobList;
            return this;
        }
        public java.util.List<ListAvatarTrainingJobsResponseBodyDataAvatarTrainingJobList> getAvatarTrainingJobList() {
            return this.avatarTrainingJobList;
        }

        public ListAvatarTrainingJobsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
