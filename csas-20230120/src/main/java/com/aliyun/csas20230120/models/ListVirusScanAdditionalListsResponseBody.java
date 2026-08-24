// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanAdditionalListsResponseBody extends TeaModel {
    @NameInMap("AdditionalLists")
    public java.util.List<ListVirusScanAdditionalListsResponseBodyAdditionalLists> additionalLists;

    /**
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVirusScanAdditionalListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanAdditionalListsResponseBody self = new ListVirusScanAdditionalListsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirusScanAdditionalListsResponseBody setAdditionalLists(java.util.List<ListVirusScanAdditionalListsResponseBodyAdditionalLists> additionalLists) {
        this.additionalLists = additionalLists;
        return this;
    }
    public java.util.List<ListVirusScanAdditionalListsResponseBodyAdditionalLists> getAdditionalLists() {
        return this.additionalLists;
    }

    public ListVirusScanAdditionalListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVirusScanAdditionalListsResponseBodyAdditionalListsListsListDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-08-21 10:24:31</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>.tmp</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>additional-list-4d7b1e9a6c38****</p>
         */
        @NameInMap("ListId")
        public String listId;

        public static ListVirusScanAdditionalListsResponseBodyAdditionalListsListsListDetail build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanAdditionalListsResponseBodyAdditionalListsListsListDetail self = new ListVirusScanAdditionalListsResponseBodyAdditionalListsListsListDetail();
            return TeaModel.build(map, self);
        }

        public ListVirusScanAdditionalListsResponseBodyAdditionalListsListsListDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVirusScanAdditionalListsResponseBodyAdditionalListsListsListDetail setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListVirusScanAdditionalListsResponseBodyAdditionalListsListsListDetail setListId(String listId) {
            this.listId = listId;
            return this;
        }
        public String getListId() {
            return this.listId;
        }

    }

    public static class ListVirusScanAdditionalListsResponseBodyAdditionalListsLists extends TeaModel {
        @NameInMap("ListDetail")
        public java.util.List<ListVirusScanAdditionalListsResponseBodyAdditionalListsListsListDetail> listDetail;

        /**
         * <strong>example:</strong>
         * <p>Whitelist</p>
         */
        @NameInMap("ListType")
        public String listType;

        public static ListVirusScanAdditionalListsResponseBodyAdditionalListsLists build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanAdditionalListsResponseBodyAdditionalListsLists self = new ListVirusScanAdditionalListsResponseBodyAdditionalListsLists();
            return TeaModel.build(map, self);
        }

        public ListVirusScanAdditionalListsResponseBodyAdditionalListsLists setListDetail(java.util.List<ListVirusScanAdditionalListsResponseBodyAdditionalListsListsListDetail> listDetail) {
            this.listDetail = listDetail;
            return this;
        }
        public java.util.List<ListVirusScanAdditionalListsResponseBodyAdditionalListsListsListDetail> getListDetail() {
            return this.listDetail;
        }

        public ListVirusScanAdditionalListsResponseBodyAdditionalListsLists setListType(String listType) {
            this.listType = listType;
            return this;
        }
        public String getListType() {
            return this.listType;
        }

    }

    public static class ListVirusScanAdditionalListsResponseBodyAdditionalLists extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FileSuffix</p>
         */
        @NameInMap("AdditionalType")
        public String additionalType;

        @NameInMap("Lists")
        public java.util.List<ListVirusScanAdditionalListsResponseBodyAdditionalListsLists> lists;

        public static ListVirusScanAdditionalListsResponseBodyAdditionalLists build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanAdditionalListsResponseBodyAdditionalLists self = new ListVirusScanAdditionalListsResponseBodyAdditionalLists();
            return TeaModel.build(map, self);
        }

        public ListVirusScanAdditionalListsResponseBodyAdditionalLists setAdditionalType(String additionalType) {
            this.additionalType = additionalType;
            return this;
        }
        public String getAdditionalType() {
            return this.additionalType;
        }

        public ListVirusScanAdditionalListsResponseBodyAdditionalLists setLists(java.util.List<ListVirusScanAdditionalListsResponseBodyAdditionalListsLists> lists) {
            this.lists = lists;
            return this;
        }
        public java.util.List<ListVirusScanAdditionalListsResponseBodyAdditionalListsLists> getLists() {
            return this.lists;
        }

    }

}
