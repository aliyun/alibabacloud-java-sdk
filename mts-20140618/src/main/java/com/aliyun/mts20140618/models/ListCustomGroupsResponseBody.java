// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCustomGroupsResponseBody extends TeaModel {
    @NameInMap("CustomGroups")
    public ListCustomGroupsResponseBodyCustomGroups customGroups;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>580e8ce3-3b80-44c5-9f3f-36ac3cc5bdd5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCustomGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomGroupsResponseBody self = new ListCustomGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomGroupsResponseBody setCustomGroups(ListCustomGroupsResponseBodyCustomGroups customGroups) {
        this.customGroups = customGroups;
        return this;
    }
    public ListCustomGroupsResponseBodyCustomGroups getCustomGroups() {
        return this.customGroups;
    }

    public ListCustomGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomGroupsResponseBodyCustomGroupsCustomGroup extends TeaModel {
        @NameInMap("CustomGroupDescription")
        public String customGroupDescription;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomGroupId")
        public String customGroupId;

        @NameInMap("CustomGroupName")
        public String customGroupName;

        public static ListCustomGroupsResponseBodyCustomGroupsCustomGroup build(java.util.Map<String, ?> map) throws Exception {
            ListCustomGroupsResponseBodyCustomGroupsCustomGroup self = new ListCustomGroupsResponseBodyCustomGroupsCustomGroup();
            return TeaModel.build(map, self);
        }

        public ListCustomGroupsResponseBodyCustomGroupsCustomGroup setCustomGroupDescription(String customGroupDescription) {
            this.customGroupDescription = customGroupDescription;
            return this;
        }
        public String getCustomGroupDescription() {
            return this.customGroupDescription;
        }

        public ListCustomGroupsResponseBodyCustomGroupsCustomGroup setCustomGroupId(String customGroupId) {
            this.customGroupId = customGroupId;
            return this;
        }
        public String getCustomGroupId() {
            return this.customGroupId;
        }

        public ListCustomGroupsResponseBodyCustomGroupsCustomGroup setCustomGroupName(String customGroupName) {
            this.customGroupName = customGroupName;
            return this;
        }
        public String getCustomGroupName() {
            return this.customGroupName;
        }

    }

    public static class ListCustomGroupsResponseBodyCustomGroups extends TeaModel {
        @NameInMap("CustomGroup")
        public java.util.List<ListCustomGroupsResponseBodyCustomGroupsCustomGroup> customGroup;

        public static ListCustomGroupsResponseBodyCustomGroups build(java.util.Map<String, ?> map) throws Exception {
            ListCustomGroupsResponseBodyCustomGroups self = new ListCustomGroupsResponseBodyCustomGroups();
            return TeaModel.build(map, self);
        }

        public ListCustomGroupsResponseBodyCustomGroups setCustomGroup(java.util.List<ListCustomGroupsResponseBodyCustomGroupsCustomGroup> customGroup) {
            this.customGroup = customGroup;
            return this;
        }
        public java.util.List<ListCustomGroupsResponseBodyCustomGroupsCustomGroup> getCustomGroup() {
            return this.customGroup;
        }

    }

}
