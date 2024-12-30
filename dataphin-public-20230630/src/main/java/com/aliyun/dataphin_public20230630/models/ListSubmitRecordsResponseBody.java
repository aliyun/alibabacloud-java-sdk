// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSubmitRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ListResult")
    public ListSubmitRecordsResponseBodyListResult listResult;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSubmitRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubmitRecordsResponseBody self = new ListSubmitRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubmitRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubmitRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSubmitRecordsResponseBody setListResult(ListSubmitRecordsResponseBodyListResult listResult) {
        this.listResult = listResult;
        return this;
    }
    public ListSubmitRecordsResponseBodyListResult getListResult() {
        return this.listResult;
    }

    public ListSubmitRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubmitRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubmitRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSubmitRecordsResponseBodyListResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChangeType")
        public Integer changeType;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <strong>example:</strong>
         * <p>1241844456</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>n_123456</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <strong>example:</strong>
         * <p>对象A</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObjectVersion")
        public String objectVersion;

        /**
         * <strong>example:</strong>
         * <p>1241844456</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>提交信息</p>
         */
        @NameInMap("SubmitComment")
        public String submitComment;

        /**
         * <strong>example:</strong>
         * <p>307999999</p>
         */
        @NameInMap("Submitter")
        public String submitter;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("SubmitterName")
        public String submitterName;

        public static ListSubmitRecordsResponseBodyListResultData build(java.util.Map<String, ?> map) throws Exception {
            ListSubmitRecordsResponseBodyListResultData self = new ListSubmitRecordsResponseBodyListResultData();
            return TeaModel.build(map, self);
        }

        public ListSubmitRecordsResponseBodyListResultData setChangeType(Integer changeType) {
            this.changeType = changeType;
            return this;
        }
        public Integer getChangeType() {
            return this.changeType;
        }

        public ListSubmitRecordsResponseBodyListResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSubmitRecordsResponseBodyListResultData setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public ListSubmitRecordsResponseBodyListResultData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSubmitRecordsResponseBodyListResultData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListSubmitRecordsResponseBodyListResultData setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListSubmitRecordsResponseBodyListResultData setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListSubmitRecordsResponseBodyListResultData setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListSubmitRecordsResponseBodyListResultData setObjectVersion(String objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }
        public String getObjectVersion() {
            return this.objectVersion;
        }

        public ListSubmitRecordsResponseBodyListResultData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListSubmitRecordsResponseBodyListResultData setSubmitComment(String submitComment) {
            this.submitComment = submitComment;
            return this;
        }
        public String getSubmitComment() {
            return this.submitComment;
        }

        public ListSubmitRecordsResponseBodyListResultData setSubmitter(String submitter) {
            this.submitter = submitter;
            return this;
        }
        public String getSubmitter() {
            return this.submitter;
        }

        public ListSubmitRecordsResponseBodyListResultData setSubmitterName(String submitterName) {
            this.submitterName = submitterName;
            return this;
        }
        public String getSubmitterName() {
            return this.submitterName;
        }

    }

    public static class ListSubmitRecordsResponseBodyListResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListSubmitRecordsResponseBodyListResultData> data;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSubmitRecordsResponseBodyListResult build(java.util.Map<String, ?> map) throws Exception {
            ListSubmitRecordsResponseBodyListResult self = new ListSubmitRecordsResponseBodyListResult();
            return TeaModel.build(map, self);
        }

        public ListSubmitRecordsResponseBodyListResult setData(java.util.List<ListSubmitRecordsResponseBodyListResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListSubmitRecordsResponseBodyListResultData> getData() {
            return this.data;
        }

        public ListSubmitRecordsResponseBodyListResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
