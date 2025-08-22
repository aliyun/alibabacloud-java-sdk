// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListModulesRequest extends TeaModel {
    @NameInMap("groupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("projectId")
    public String projectId;

    @NameInMap("tag")
    public java.util.List<ListModulesRequestTag> tag;

    public static ListModulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModulesRequest self = new ListModulesRequest();
        return TeaModel.build(map, self);
    }

    public ListModulesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListModulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListModulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModulesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListModulesRequest setTag(java.util.List<ListModulesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListModulesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListModulesRequestTag extends TeaModel {
        @NameInMap("tagKey")
        public String tagKey;

        @NameInMap("tagValue")
        public String tagValue;

        public static ListModulesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListModulesRequestTag self = new ListModulesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListModulesRequestTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListModulesRequestTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
