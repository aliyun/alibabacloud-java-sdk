// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListGroupRequest extends TeaModel {
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
     * <p>The number of results to return per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p-14e80de4866bf7ffed0c4072ed9b37</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("tag")
    public java.util.List<ListGroupRequestTag> tag;

    public static ListGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupRequest self = new ListGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListGroupRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListGroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListGroupRequest setTag(java.util.List<ListGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class ListGroupRequestTag extends TeaModel {
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
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static ListGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListGroupRequestTag self = new ListGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public ListGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
