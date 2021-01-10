// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DescribeFaceGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("TotalNum")
    public Long totalNum;

    @NameInMap("Groups")
    public java.util.List<DescribeFaceGroupsResponseBodyGroups> groups;

    public static DescribeFaceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceGroupsResponseBody self = new DescribeFaceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaceGroupsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeFaceGroupsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeFaceGroupsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public DescribeFaceGroupsResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeFaceGroupsResponseBody setGroups(java.util.List<DescribeFaceGroupsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<DescribeFaceGroupsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public static class DescribeFaceGroupsResponseBodyGroups extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreationTime")
        public String creationTime;

        public static DescribeFaceGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaceGroupsResponseBodyGroups self = new DescribeFaceGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeFaceGroupsResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeFaceGroupsResponseBodyGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFaceGroupsResponseBodyGroups setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

    }

}
