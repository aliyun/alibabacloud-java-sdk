// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAudioFilesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListAudioFilesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("AudioFileName")
        public String audioFileName;

        @NameInMap("AudioResourceId")
        public String audioResourceId;

        @NameInMap("AuditResult")
        public String auditResult;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssFileKey")
        public String ossFileKey;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdatedTime")
        public String updatedTime;

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
        @NameInMap("List")
        public java.util.List<ListAudioFilesResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
