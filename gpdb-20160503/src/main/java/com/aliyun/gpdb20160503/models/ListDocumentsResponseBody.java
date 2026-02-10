// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListDocumentsResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Items")
    public ListDocumentsResponseBodyItems items;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>fail</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentsResponseBody self = new ListDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDocumentsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
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

    public ListDocumentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
