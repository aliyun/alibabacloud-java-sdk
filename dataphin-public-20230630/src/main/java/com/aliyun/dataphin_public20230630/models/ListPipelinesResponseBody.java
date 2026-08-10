// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListPipelinesResponseBody extends TeaModel {
    /**
     * <p>The error code. OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The paged query result.</p>
     */
    @NameInMap("Data")
    public ListPipelinesResponseBodyData data;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListPipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesResponseBody self = new ListPipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelinesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPipelinesResponseBody setData(ListPipelinesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPipelinesResponseBodyData getData() {
        return this.data;
    }

    public ListPipelinesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPipelinesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelinesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPipelinesResponseBodyDataList extends TeaModel {
        /**
         * <p>The list of user IDs of development owners.</p>
         */
        @NameInMap("DevelopOwners")
        public java.util.List<String> developOwners;

        /**
         * <p>The directory in which the task resides.</p>
         * 
         * <strong>example:</strong>
         * <p>/dwd/Finance/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12121111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The scheduling node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n_6793582765516849152</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The list of user IDs of O&amp;M owners.</p>
         */
        @NameInMap("OpsOwners")
        public java.util.List<String> opsOwners;

        /**
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1450811</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        /**
         * <p>The schedule type. Valid values:</p>
         * <ul>
         * <li>1: periodic scheduling.</li>
         * <li>3: manual scheduling.</li>
         * <li>5: real-time scheduling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScheduleType")
        public Integer scheduleType;

        /**
         * <p>The list of task tag names.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>DRAFT: draft.</li>
         * <li>SUBMITTING: being submitted.</li>
         * <li>SUBMITTED: submitted.</li>
         * <li>PUBLISHED: published.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUBMITTED</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>0: offline integration.</li>
         * <li>1: real-time integration.</li>
         * <li>13: data aggregation.</li>
         * <li>14: offline unstructured workflow.</li>
         * <li>15: real-time unstructured workflow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        public static ListPipelinesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyDataList self = new ListPipelinesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyDataList setDevelopOwners(java.util.List<String> developOwners) {
            this.developOwners = developOwners;
            return this;
        }
        public java.util.List<String> getDevelopOwners() {
            return this.developOwners;
        }

        public ListPipelinesResponseBodyDataList setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public ListPipelinesResponseBodyDataList setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListPipelinesResponseBodyDataList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListPipelinesResponseBodyDataList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListPipelinesResponseBodyDataList setOpsOwners(java.util.List<String> opsOwners) {
            this.opsOwners = opsOwners;
            return this;
        }
        public java.util.List<String> getOpsOwners() {
            return this.opsOwners;
        }

        public ListPipelinesResponseBodyDataList setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelinesResponseBodyDataList setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public ListPipelinesResponseBodyDataList setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListPipelinesResponseBodyDataList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListPipelinesResponseBodyDataList setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

    public static class ListPipelinesResponseBodyData extends TeaModel {
        /**
         * <p>The list of task information on the current page.</p>
         */
        @NameInMap("List")
        public java.util.List<ListPipelinesResponseBodyDataList> list;

        /**
         * <p>The cursor for the next page (an opaque cursor that the caller does not need to interpret). A null value indicates that there are no more pages. Otherwise, pass this value as the nextCursor parameter in the next request to retrieve the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("NextCursor")
        public Long nextCursor;

        /**
         * <p>The current page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records that match the conditions. On the first page request, the actual total is returned. On subsequent page requests (when nextCursor is passed in), if totalCount is included in the request, the same value is returned. Otherwise, this field is not returned. The total value is a snapshot taken at the time of the first page query and is not updated in real time as data changes during pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>105</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListPipelinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyData self = new ListPipelinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyData setList(java.util.List<ListPipelinesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListPipelinesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListPipelinesResponseBodyData setNextCursor(Long nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }
        public Long getNextCursor() {
            return this.nextCursor;
        }

        public ListPipelinesResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListPipelinesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPipelinesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
