// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListExtensionsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PagingInfo")
    public ListExtensionsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The extensions returned on pages.</p>
     */
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

        /**
         * <p>The code of the event.</p>
         */
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
        /**
         * <p>The name of the event.</p>
         */
        @NameInMap("BindEventList")
        public java.util.List<ListExtensionsResponseBodyPagingInfoExtensionsBindEventList> bindEventList;

        /**
         * <p>The extension point events.</p>
         */
        @NameInMap("ExtensionCode")
        public String extensionCode;

        /**
         * <p>The name of the extension.</p>
         */
        @NameInMap("ExtensionDesc")
        public String extensionDesc;

        /**
         * <p>The ID of the RAM user.</p>
         */
        @NameInMap("ExtensionName")
        public String extensionName;

        /**
         * <p>The unique code of the extension.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The description of the extension.</p>
         */
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
        /**
         * <p>The state of the extension. Valid values:</p>
         * <br>
         * <p>0: Testing</p>
         * <br>
         * <p>1: Publishing</p>
         * <br>
         * <p>3: Disabled</p>
         * <br>
         * <p>4: Processing</p>
         * <br>
         * <p>5: Approved</p>
         * <br>
         * <p>6: Approve Failed</p>
         */
        @NameInMap("Extensions")
        public java.util.List<ListExtensionsResponseBodyPagingInfoExtensions> extensions;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The extensions.</p>
         */
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
