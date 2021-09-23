// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeTagsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Tags")
    public DescribeTagsResponseBodyTags tags;

    public static DescribeTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponseBody self = new DescribeTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeTagsResponseBody setTags(DescribeTagsResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeTagsResponseBodyTags getTags() {
        return this.tags;
    }

    public static class DescribeTagsResponseBodyTagsTagFileSystemIds extends TeaModel {
        @NameInMap("FileSystemId")
        public java.util.List<String> fileSystemId;

        public static DescribeTagsResponseBodyTagsTagFileSystemIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTagsTagFileSystemIds self = new DescribeTagsResponseBodyTagsTagFileSystemIds();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTagsTagFileSystemIds setFileSystemId(java.util.List<String> fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public java.util.List<String> getFileSystemId() {
            return this.fileSystemId;
        }

    }

    public static class DescribeTagsResponseBodyTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("FileSystemIds")
        public DescribeTagsResponseBodyTagsTagFileSystemIds fileSystemIds;

        public static DescribeTagsResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTagsTag self = new DescribeTagsResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTagsResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeTagsResponseBodyTagsTag setFileSystemIds(DescribeTagsResponseBodyTagsTagFileSystemIds fileSystemIds) {
            this.fileSystemIds = fileSystemIds;
            return this;
        }
        public DescribeTagsResponseBodyTagsTagFileSystemIds getFileSystemIds() {
            return this.fileSystemIds;
        }

    }

    public static class DescribeTagsResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeTagsResponseBodyTagsTag> tag;

        public static DescribeTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTags self = new DescribeTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTags setTag(java.util.List<DescribeTagsResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeTagsResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
