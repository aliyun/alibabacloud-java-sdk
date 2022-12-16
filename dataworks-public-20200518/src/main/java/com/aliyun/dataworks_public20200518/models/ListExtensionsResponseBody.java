// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListExtensionsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListExtensionsResponseBodyPagingInfo pagingInfo;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExtensionsResponseBody self = new ListExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExtensionsResponseBody setPagingInfo(ListExtensionsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListExtensionsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListExtensionsResponseBodyPagingInfoExtensionsBindEventList extends TeaModel {
        @NameInMap("EventCode")
        public String eventCode;

        @NameInMap("EventName")
        public String eventName;

        public static ListExtensionsResponseBodyPagingInfoExtensionsBindEventList build(java.util.Map<String, ?> map) throws Exception {
            ListExtensionsResponseBodyPagingInfoExtensionsBindEventList self = new ListExtensionsResponseBodyPagingInfoExtensionsBindEventList();
            return TeaModel.build(map, self);
        }

        public ListExtensionsResponseBodyPagingInfoExtensionsBindEventList setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public ListExtensionsResponseBodyPagingInfoExtensionsBindEventList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

    }

    public static class ListExtensionsResponseBodyPagingInfoExtensions extends TeaModel {
        @NameInMap("BindEventList")
        public java.util.List<ListExtensionsResponseBodyPagingInfoExtensionsBindEventList> bindEventList;

        @NameInMap("ExtensionCode")
        public String extensionCode;

        @NameInMap("ExtensionDesc")
        public String extensionDesc;

        @NameInMap("ExtensionName")
        public String extensionName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Status")
        public Integer status;

        public static ListExtensionsResponseBodyPagingInfoExtensions build(java.util.Map<String, ?> map) throws Exception {
            ListExtensionsResponseBodyPagingInfoExtensions self = new ListExtensionsResponseBodyPagingInfoExtensions();
            return TeaModel.build(map, self);
        }

        public ListExtensionsResponseBodyPagingInfoExtensions setBindEventList(java.util.List<ListExtensionsResponseBodyPagingInfoExtensionsBindEventList> bindEventList) {
            this.bindEventList = bindEventList;
            return this;
        }
        public java.util.List<ListExtensionsResponseBodyPagingInfoExtensionsBindEventList> getBindEventList() {
            return this.bindEventList;
        }

        public ListExtensionsResponseBodyPagingInfoExtensions setExtensionCode(String extensionCode) {
            this.extensionCode = extensionCode;
            return this;
        }
        public String getExtensionCode() {
            return this.extensionCode;
        }

        public ListExtensionsResponseBodyPagingInfoExtensions setExtensionDesc(String extensionDesc) {
            this.extensionDesc = extensionDesc;
            return this;
        }
        public String getExtensionDesc() {
            return this.extensionDesc;
        }

        public ListExtensionsResponseBodyPagingInfoExtensions setExtensionName(String extensionName) {
            this.extensionName = extensionName;
            return this;
        }
        public String getExtensionName() {
            return this.extensionName;
        }

        public ListExtensionsResponseBodyPagingInfoExtensions setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListExtensionsResponseBodyPagingInfoExtensions setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListExtensionsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Extensions")
        public java.util.List<ListExtensionsResponseBodyPagingInfoExtensions> extensions;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListExtensionsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListExtensionsResponseBodyPagingInfo self = new ListExtensionsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListExtensionsResponseBodyPagingInfo setExtensions(java.util.List<ListExtensionsResponseBodyPagingInfoExtensions> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.List<ListExtensionsResponseBodyPagingInfoExtensions> getExtensions() {
            return this.extensions;
        }

        public ListExtensionsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListExtensionsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListExtensionsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
