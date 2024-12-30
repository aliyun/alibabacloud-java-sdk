// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskVersionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetBatchTaskVersionsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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

    public static GetBatchTaskVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskVersionsResponseBody self = new GetBatchTaskVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBatchTaskVersionsResponseBody setData(GetBatchTaskVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBatchTaskVersionsResponseBodyData getData() {
        return this.data;
    }

    public GetBatchTaskVersionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBatchTaskVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBatchTaskVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchTaskVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:10:10</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:10:10</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>n_10231001</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>10232111011</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Published")
        public Boolean published;

        /**
         * <strong>example:</strong>
         * <p>20110110</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList self = new GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

        public GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetBatchTaskVersionsResponseBodyData extends TeaModel {
        @NameInMap("BatchTaskVersionList")
        public java.util.List<GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList> batchTaskVersionList;

        public static GetBatchTaskVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskVersionsResponseBodyData self = new GetBatchTaskVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskVersionsResponseBodyData setBatchTaskVersionList(java.util.List<GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList> batchTaskVersionList) {
            this.batchTaskVersionList = batchTaskVersionList;
            return this;
        }
        public java.util.List<GetBatchTaskVersionsResponseBodyDataBatchTaskVersionList> getBatchTaskVersionList() {
            return this.batchTaskVersionList;
        }

    }

}
