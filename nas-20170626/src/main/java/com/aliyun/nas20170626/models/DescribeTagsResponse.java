// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Tags")
    @Validation(required = true)
    public DescribeTagsResponseTags tags;

    public static DescribeTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponse self = new DescribeTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeTagsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagsResponse setTags(DescribeTagsResponseTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeTagsResponseTags getTags() {
        return this.tags;
    }

    public static class DescribeTagsResponseTagsTagFileSystemIds extends TeaModel {
        // FileSystemId
        @NameInMap("FileSystemId")
        @Validation(required = true)
        public java.util.List<String> fileSystemId;

        public static DescribeTagsResponseTagsTagFileSystemIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseTagsTagFileSystemIds self = new DescribeTagsResponseTagsTagFileSystemIds();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseTagsTagFileSystemIds setFileSystemId(java.util.List<String> fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public java.util.List<String> getFileSystemId() {
            return this.fileSystemId;
        }

    }

    public static class DescribeTagsResponseTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("FileSystemIds")
        @Validation(required = true)
        public DescribeTagsResponseTagsTagFileSystemIds fileSystemIds;

        public static DescribeTagsResponseTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseTagsTag self = new DescribeTagsResponseTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTagsResponseTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeTagsResponseTagsTag setFileSystemIds(DescribeTagsResponseTagsTagFileSystemIds fileSystemIds) {
            this.fileSystemIds = fileSystemIds;
            return this;
        }
        public DescribeTagsResponseTagsTagFileSystemIds getFileSystemIds() {
            return this.fileSystemIds;
        }

    }

    public static class DescribeTagsResponseTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeTagsResponseTagsTag> tag;

        public static DescribeTagsResponseTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseTags self = new DescribeTagsResponseTags();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseTags setTag(java.util.List<DescribeTagsResponseTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeTagsResponseTagsTag> getTag() {
            return this.tag;
        }

    }

}
