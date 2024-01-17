// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeUserWhiteListsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("UserWhiteListInfos")
    public DescribeUserWhiteListsResponseBodyUserWhiteListInfos userWhiteListInfos;

    public static DescribeUserWhiteListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserWhiteListsResponseBody self = new DescribeUserWhiteListsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserWhiteListsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserWhiteListsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUserWhiteListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserWhiteListsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUserWhiteListsResponseBody setUserWhiteListInfos(DescribeUserWhiteListsResponseBodyUserWhiteListInfos userWhiteListInfos) {
        this.userWhiteListInfos = userWhiteListInfos;
        return this;
    }
    public DescribeUserWhiteListsResponseBodyUserWhiteListInfos getUserWhiteListInfos() {
        return this.userWhiteListInfos;
    }

    public static class DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo extends TeaModel {
        @NameInMap("AoneId")
        public String aoneId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public Long uid;

        @NameInMap("Value")
        public String value;

        public static DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo self = new DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo setAoneId(String aoneId) {
            this.aoneId = aoneId;
            return this;
        }
        public String getAoneId() {
            return this.aoneId;
        }

        public DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeUserWhiteListsResponseBodyUserWhiteListInfos extends TeaModel {
        @NameInMap("UserWhiteListInfo")
        public java.util.List<DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo> userWhiteListInfo;

        public static DescribeUserWhiteListsResponseBodyUserWhiteListInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserWhiteListsResponseBodyUserWhiteListInfos self = new DescribeUserWhiteListsResponseBodyUserWhiteListInfos();
            return TeaModel.build(map, self);
        }

        public DescribeUserWhiteListsResponseBodyUserWhiteListInfos setUserWhiteListInfo(java.util.List<DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo> userWhiteListInfo) {
            this.userWhiteListInfo = userWhiteListInfo;
            return this;
        }
        public java.util.List<DescribeUserWhiteListsResponseBodyUserWhiteListInfosUserWhiteListInfo> getUserWhiteListInfo() {
            return this.userWhiteListInfo;
        }

    }

}
