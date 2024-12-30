// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListPublishRecordsResponseBody extends TeaModel {
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
    public ListPublishRecordsResponseBodyListResult listResult;

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

    public static ListPublishRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishRecordsResponseBody self = new ListPublishRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPublishRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPublishRecordsResponseBody setListResult(ListPublishRecordsResponseBodyListResult listResult) {
        this.listResult = listResult;
        return this;
    }
    public ListPublishRecordsResponseBodyListResult getListResult() {
        return this.listResult;
    }

    public ListPublishRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPublishRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublishRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPublishRecordsResponseBodyListResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChangeType")
        public Integer changeType;

        /**
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:10:10</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

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
         * <p>test_lc__20241118171502</p>
         */
        @NameInMap("PublishName")
        public String publishName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PublishStatus")
        public Integer publishStatus;

        /**
         * <strong>example:</strong>
         * <p>307999999</p>
         */
        @NameInMap("Publisher")
        public String publisher;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("PublisherName")
        public String publisherName;

        public static ListPublishRecordsResponseBodyListResultData build(java.util.Map<String, ?> map) throws Exception {
            ListPublishRecordsResponseBodyListResultData self = new ListPublishRecordsResponseBodyListResultData();
            return TeaModel.build(map, self);
        }

        public ListPublishRecordsResponseBodyListResultData setChangeType(Integer changeType) {
            this.changeType = changeType;
            return this;
        }
        public Integer getChangeType() {
            return this.changeType;
        }

        public ListPublishRecordsResponseBodyListResultData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListPublishRecordsResponseBodyListResultData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListPublishRecordsResponseBodyListResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListPublishRecordsResponseBodyListResultData setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public ListPublishRecordsResponseBodyListResultData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPublishRecordsResponseBodyListResultData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListPublishRecordsResponseBodyListResultData setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListPublishRecordsResponseBodyListResultData setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListPublishRecordsResponseBodyListResultData setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListPublishRecordsResponseBodyListResultData setObjectVersion(String objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }
        public String getObjectVersion() {
            return this.objectVersion;
        }

        public ListPublishRecordsResponseBodyListResultData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListPublishRecordsResponseBodyListResultData setPublishName(String publishName) {
            this.publishName = publishName;
            return this;
        }
        public String getPublishName() {
            return this.publishName;
        }

        public ListPublishRecordsResponseBodyListResultData setPublishStatus(Integer publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public Integer getPublishStatus() {
            return this.publishStatus;
        }

        public ListPublishRecordsResponseBodyListResultData setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }
        public String getPublisher() {
            return this.publisher;
        }

        public ListPublishRecordsResponseBodyListResultData setPublisherName(String publisherName) {
            this.publisherName = publisherName;
            return this;
        }
        public String getPublisherName() {
            return this.publisherName;
        }

    }

    public static class ListPublishRecordsResponseBodyListResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListPublishRecordsResponseBodyListResultData> data;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPublishRecordsResponseBodyListResult build(java.util.Map<String, ?> map) throws Exception {
            ListPublishRecordsResponseBodyListResult self = new ListPublishRecordsResponseBodyListResult();
            return TeaModel.build(map, self);
        }

        public ListPublishRecordsResponseBodyListResult setData(java.util.List<ListPublishRecordsResponseBodyListResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListPublishRecordsResponseBodyListResultData> getData() {
            return this.data;
        }

        public ListPublishRecordsResponseBodyListResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
