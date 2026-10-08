// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBatchTasksResponseBody extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListBatchTasksResponseBodyPageResult pageResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBatchTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTasksResponseBody self = new ListBatchTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBatchTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBatchTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBatchTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBatchTasksResponseBody setPageResult(ListBatchTasksResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListBatchTasksResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListBatchTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBatchTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBatchTasksResponseBodyPageResultResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>订单明细加工任务</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>/dwd</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <strong>example:</strong>
         * <p>7090125821589888</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("LastSubmitStatus")
        public String lastSubmitStatus;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LastVersion")
        public Integer lastVersion;

        /**
         * <strong>example:</strong>
         * <p>dwd_order_detail</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>n_123456</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>dwd_order_detail</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeOutputNameList")
        public java.util.List<String> nodeOutputNameList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OperatorType")
        public Integer operatorType;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        @NameInMap("Published")
        public Boolean published;

        @NameInMap("Released")
        public Boolean released;

        /**
         * <strong>example:</strong>
         * <p>SUBMITTED</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListBatchTasksResponseBodyPageResultResultData build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTasksResponseBodyPageResultResultData self = new ListBatchTasksResponseBodyPageResultResultData();
            return TeaModel.build(map, self);
        }

        public ListBatchTasksResponseBodyPageResultResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBatchTasksResponseBodyPageResultResultData setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public ListBatchTasksResponseBodyPageResultResultData setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListBatchTasksResponseBodyPageResultResultData setLastSubmitStatus(String lastSubmitStatus) {
            this.lastSubmitStatus = lastSubmitStatus;
            return this;
        }
        public String getLastSubmitStatus() {
            return this.lastSubmitStatus;
        }

        public ListBatchTasksResponseBodyPageResultResultData setLastVersion(Integer lastVersion) {
            this.lastVersion = lastVersion;
            return this;
        }
        public Integer getLastVersion() {
            return this.lastVersion;
        }

        public ListBatchTasksResponseBodyPageResultResultData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBatchTasksResponseBodyPageResultResultData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListBatchTasksResponseBodyPageResultResultData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListBatchTasksResponseBodyPageResultResultData setNodeOutputNameList(java.util.List<String> nodeOutputNameList) {
            this.nodeOutputNameList = nodeOutputNameList;
            return this;
        }
        public java.util.List<String> getNodeOutputNameList() {
            return this.nodeOutputNameList;
        }

        public ListBatchTasksResponseBodyPageResultResultData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public ListBatchTasksResponseBodyPageResultResultData setOperatorType(Integer operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public Integer getOperatorType() {
            return this.operatorType;
        }

        public ListBatchTasksResponseBodyPageResultResultData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListBatchTasksResponseBodyPageResultResultData setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ListBatchTasksResponseBodyPageResultResultData setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

        public ListBatchTasksResponseBodyPageResultResultData setReleased(Boolean released) {
            this.released = released;
            return this;
        }
        public Boolean getReleased() {
            return this.released;
        }

        public ListBatchTasksResponseBodyPageResultResultData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListBatchTasksResponseBodyPageResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ResultData")
        public java.util.List<ListBatchTasksResponseBodyPageResultResultData> resultData;

        public static ListBatchTasksResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTasksResponseBodyPageResult self = new ListBatchTasksResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListBatchTasksResponseBodyPageResult setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListBatchTasksResponseBodyPageResult setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListBatchTasksResponseBodyPageResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBatchTasksResponseBodyPageResult setResultData(java.util.List<ListBatchTasksResponseBodyPageResultResultData> resultData) {
            this.resultData = resultData;
            return this;
        }
        public java.util.List<ListBatchTasksResponseBodyPageResultResultData> getResultData() {
            return this.resultData;
        }

    }

}
