// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAudioFilesResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public ListAudioFilesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>53223330-EBF1-586B-A2CB-93C3B711FDA0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAudioFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAudioFilesResponseBody self = new ListAudioFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAudioFilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAudioFilesResponseBody setData(ListAudioFilesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAudioFilesResponseBodyData getData() {
        return this.data;
    }

    public ListAudioFilesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAudioFilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAudioFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAudioFilesResponseBodyDataList extends TeaModel {
        /**
         * <p>Audio file name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-file.wav</p>
         */
        @NameInMap("AudioFileName")
        public String audioFileName;

        /**
         * <p>Audio resource ID, which is the UUID of the audio file.</p>
         * 
         * <strong>example:</strong>
         * <p>d5cd7a94-3b6a-47d2-b7fd-0b1cd839bf77</p>
         */
        @NameInMap("AudioResourceId")
        public String audioResourceId;

        /**
         * <p>Audio content threat review result.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("AuditResult")
        public String auditResult;

        /**
         * <p>The creation time of the audio resource.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-05 17:35:45.0</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Display name of the audio resource.</p>
         * 
         * <strong>example:</strong>
         * <p>欢迎语</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The key of the audio resource file in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test/test-file.wav</p>
         */
        @NameInMap("OssFileKey")
        public String ossFileKey;

        /**
         * <p>The status of the audio file.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Last modified time of the audio resource.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-08 15:34:49.0</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        /**
         * <p>The usage of the audio file. The default value is General (used in scenarios such as IVR). Other optional values include HoldMusic (hold music during call waiting).</p>
         * 
         * <strong>example:</strong>
         * <p>General</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static ListAudioFilesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListAudioFilesResponseBodyDataList self = new ListAudioFilesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListAudioFilesResponseBodyDataList setAudioFileName(String audioFileName) {
            this.audioFileName = audioFileName;
            return this;
        }
        public String getAudioFileName() {
            return this.audioFileName;
        }

        public ListAudioFilesResponseBodyDataList setAudioResourceId(String audioResourceId) {
            this.audioResourceId = audioResourceId;
            return this;
        }
        public String getAudioResourceId() {
            return this.audioResourceId;
        }

        public ListAudioFilesResponseBodyDataList setAuditResult(String auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public String getAuditResult() {
            return this.auditResult;
        }

        public ListAudioFilesResponseBodyDataList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListAudioFilesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAudioFilesResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAudioFilesResponseBodyDataList setOssFileKey(String ossFileKey) {
            this.ossFileKey = ossFileKey;
            return this;
        }
        public String getOssFileKey() {
            return this.ossFileKey;
        }

        public ListAudioFilesResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAudioFilesResponseBodyDataList setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public ListAudioFilesResponseBodyDataList setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class ListAudioFilesResponseBodyData extends TeaModel {
        /**
         * <p>The list of audio files.</p>
         */
        @NameInMap("List")
        public java.util.List<ListAudioFilesResponseBodyDataList> list;

        /**
         * <p>The page number, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The paging size, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAudioFilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAudioFilesResponseBodyData self = new ListAudioFilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAudioFilesResponseBodyData setList(java.util.List<ListAudioFilesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListAudioFilesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListAudioFilesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAudioFilesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAudioFilesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
