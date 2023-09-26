// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeBlackListsResponseBody extends TeaModel {
    @NameInMap("BlackLists")
    public DescribeBlackListsResponseBodyBlackLists blackLists;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBlackListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackListsResponseBody self = new DescribeBlackListsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlackListsResponseBody setBlackLists(DescribeBlackListsResponseBodyBlackLists blackLists) {
        this.blackLists = blackLists;
        return this;
    }
    public DescribeBlackListsResponseBodyBlackLists getBlackLists() {
        return this.blackLists;
    }

    public DescribeBlackListsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBlackListsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBlackListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlackListsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBlackListsResponseBodyBlackListsBlackList extends TeaModel {
        @NameInMap("BlackContent")
        public String blackContent;

        @NameInMap("BlackType")
        public String blackType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static DescribeBlackListsResponseBodyBlackListsBlackList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlackListsResponseBodyBlackListsBlackList self = new DescribeBlackListsResponseBodyBlackListsBlackList();
            return TeaModel.build(map, self);
        }

        public DescribeBlackListsResponseBodyBlackListsBlackList setBlackContent(String blackContent) {
            this.blackContent = blackContent;
            return this;
        }
        public String getBlackContent() {
            return this.blackContent;
        }

        public DescribeBlackListsResponseBodyBlackListsBlackList setBlackType(String blackType) {
            this.blackType = blackType;
            return this;
        }
        public String getBlackType() {
            return this.blackType;
        }

        public DescribeBlackListsResponseBodyBlackListsBlackList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeBlackListsResponseBodyBlackListsBlackList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBlackListsResponseBodyBlackListsBlackList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class DescribeBlackListsResponseBodyBlackLists extends TeaModel {
        @NameInMap("BlackList")
        public java.util.List<DescribeBlackListsResponseBodyBlackListsBlackList> blackList;

        public static DescribeBlackListsResponseBodyBlackLists build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlackListsResponseBodyBlackLists self = new DescribeBlackListsResponseBodyBlackLists();
            return TeaModel.build(map, self);
        }

        public DescribeBlackListsResponseBodyBlackLists setBlackList(java.util.List<DescribeBlackListsResponseBodyBlackListsBlackList> blackList) {
            this.blackList = blackList;
            return this;
        }
        public java.util.List<DescribeBlackListsResponseBodyBlackListsBlackList> getBlackList() {
            return this.blackList;
        }

    }

}
