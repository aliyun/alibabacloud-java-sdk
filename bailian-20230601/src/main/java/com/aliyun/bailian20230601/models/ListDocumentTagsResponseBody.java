// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ListDocumentTagsResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagList")
    public java.util.List<ListDocumentTagsResponseBodyTagList> tagList;

    @NameInMap("Total")
    public Integer total;

    public static ListDocumentTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentTagsResponseBody self = new ListDocumentTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDocumentTagsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListDocumentTagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDocumentTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDocumentTagsResponseBody setTagList(java.util.List<ListDocumentTagsResponseBodyTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<ListDocumentTagsResponseBodyTagList> getTagList() {
        return this.tagList;
    }

    public ListDocumentTagsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListDocumentTagsResponseBodyTagList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("TagId")
        public String tagId;

        public static ListDocumentTagsResponseBodyTagList build(java.util.Map<String, ?> map) throws Exception {
            ListDocumentTagsResponseBodyTagList self = new ListDocumentTagsResponseBodyTagList();
            return TeaModel.build(map, self);
        }

        public ListDocumentTagsResponseBodyTagList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDocumentTagsResponseBodyTagList setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

    }

}
