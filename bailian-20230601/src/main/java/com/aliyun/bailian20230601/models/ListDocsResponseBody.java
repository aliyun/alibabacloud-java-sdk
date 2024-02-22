// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ListDocsResponseBody extends TeaModel {
    @NameInMap("Docs")
    public java.util.List<ListDocsResponseBodyDocs> docs;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static ListDocsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDocsResponseBody self = new ListDocsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDocsResponseBody setDocs(java.util.List<ListDocsResponseBodyDocs> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<ListDocsResponseBodyDocs> getDocs() {
        return this.docs;
    }

    public ListDocsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListDocsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDocsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDocsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListDocsResponseBodyDocsTags extends TeaModel {
        @NameInMap("TagId")
        public String tagId;

        @NameInMap("TagName")
        public String tagName;

        public static ListDocsResponseBodyDocsTags build(java.util.Map<String, ?> map) throws Exception {
            ListDocsResponseBodyDocsTags self = new ListDocsResponseBodyDocsTags();
            return TeaModel.build(map, self);
        }

        public ListDocsResponseBodyDocsTags setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ListDocsResponseBodyDocsTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class ListDocsResponseBodyDocs extends TeaModel {
        @NameInMap("DocId")
        public String docId;

        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Size")
        public String size;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListDocsResponseBodyDocsTags> tags;

        @NameInMap("Type")
        public String type;

        @NameInMap("UploadTime")
        public String uploadTime;

        public static ListDocsResponseBodyDocs build(java.util.Map<String, ?> map) throws Exception {
            ListDocsResponseBodyDocs self = new ListDocsResponseBodyDocs();
            return TeaModel.build(map, self);
        }

        public ListDocsResponseBodyDocs setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public ListDocsResponseBodyDocs setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public ListDocsResponseBodyDocs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDocsResponseBodyDocs setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListDocsResponseBodyDocs setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListDocsResponseBodyDocs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDocsResponseBodyDocs setTags(java.util.List<ListDocsResponseBodyDocsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListDocsResponseBodyDocsTags> getTags() {
            return this.tags;
        }

        public ListDocsResponseBodyDocs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDocsResponseBodyDocs setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

    }

}
