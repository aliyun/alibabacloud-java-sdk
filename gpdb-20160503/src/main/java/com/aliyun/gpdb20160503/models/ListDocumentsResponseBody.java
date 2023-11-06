// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListDocumentsResponseBody extends TeaModel {
    @NameInMap("Items")
    public ListDocumentsResponseBodyItems items;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static ListDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentsResponseBody self = new ListDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDocumentsResponseBody setItems(ListDocumentsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListDocumentsResponseBodyItems getItems() {
        return this.items;
    }

    public ListDocumentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDocumentsResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListDocumentsResponseBodyItemsDocumentList extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Source")
        public String source;

        public static ListDocumentsResponseBodyItemsDocumentList build(java.util.Map<String, ?> map) throws Exception {
            ListDocumentsResponseBodyItemsDocumentList self = new ListDocumentsResponseBodyItemsDocumentList();
            return TeaModel.build(map, self);
        }

        public ListDocumentsResponseBodyItemsDocumentList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListDocumentsResponseBodyItemsDocumentList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class ListDocumentsResponseBodyItems extends TeaModel {
        @NameInMap("DocumentList")
        public java.util.List<ListDocumentsResponseBodyItemsDocumentList> documentList;

        public static ListDocumentsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListDocumentsResponseBodyItems self = new ListDocumentsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListDocumentsResponseBodyItems setDocumentList(java.util.List<ListDocumentsResponseBodyItemsDocumentList> documentList) {
            this.documentList = documentList;
            return this;
        }
        public java.util.List<ListDocumentsResponseBodyItemsDocumentList> getDocumentList() {
            return this.documentList;
        }

    }

}
