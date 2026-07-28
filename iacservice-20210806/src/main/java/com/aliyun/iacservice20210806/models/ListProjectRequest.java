// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListProjectRequest extends TeaModel {
    /**
     * <p>The search keyword. Name-based search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test-case2</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public String pageNumber;

    /**
     * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("tag")
    public java.util.List<ListProjectRequestTag> tag;

    public static ListProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRequest self = new ListProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListProjectRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListProjectRequest setTag(java.util.List<ListProjectRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListProjectRequestTag> getTag() {
        return this.tag;
    }

    public static class ListProjectRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("value")
        public String value;

        public static ListProjectRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListProjectRequestTag self = new ListProjectRequestTag();
            return TeaModel.build(map, self);
        }

        public ListProjectRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProjectRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
