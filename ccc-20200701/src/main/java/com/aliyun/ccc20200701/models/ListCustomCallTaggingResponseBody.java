// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCustomCallTaggingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCustomCallTaggingResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListCustomCallTaggingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomCallTaggingResponseBody self = new ListCustomCallTaggingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomCallTaggingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCustomCallTaggingResponseBody setData(ListCustomCallTaggingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCustomCallTaggingResponseBodyData getData() {
        return this.data;
    }

    public ListCustomCallTaggingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCustomCallTaggingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCustomCallTaggingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCustomCallTaggingResponseBodyDataListCallTagList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TagName")
        public String tagName;

        public static ListCustomCallTaggingResponseBodyDataListCallTagList build(java.util.Map<String, ?> map) throws Exception {
            ListCustomCallTaggingResponseBodyDataListCallTagList self = new ListCustomCallTaggingResponseBodyDataListCallTagList();
            return TeaModel.build(map, self);
        }

        public ListCustomCallTaggingResponseBodyDataListCallTagList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCustomCallTaggingResponseBodyDataListCallTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class ListCustomCallTaggingResponseBodyDataList extends TeaModel {
        @NameInMap("CallTagList")
        public java.util.List<ListCustomCallTaggingResponseBodyDataListCallTagList> callTagList;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Number")
        public String number;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListCustomCallTaggingResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCustomCallTaggingResponseBodyDataList self = new ListCustomCallTaggingResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCustomCallTaggingResponseBodyDataList setCallTagList(java.util.List<ListCustomCallTaggingResponseBodyDataListCallTagList> callTagList) {
            this.callTagList = callTagList;
            return this;
        }
        public java.util.List<ListCustomCallTaggingResponseBodyDataListCallTagList> getCallTagList() {
            return this.callTagList;
        }

        public ListCustomCallTaggingResponseBodyDataList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListCustomCallTaggingResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomCallTaggingResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCustomCallTaggingResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListCustomCallTaggingResponseBodyDataList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListCustomCallTaggingResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListCustomCallTaggingResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCustomCallTaggingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomCallTaggingResponseBodyData self = new ListCustomCallTaggingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomCallTaggingResponseBodyData setList(java.util.List<ListCustomCallTaggingResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCustomCallTaggingResponseBodyDataList> getList() {
            return this.list;
        }

        public ListCustomCallTaggingResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCustomCallTaggingResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCustomCallTaggingResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
