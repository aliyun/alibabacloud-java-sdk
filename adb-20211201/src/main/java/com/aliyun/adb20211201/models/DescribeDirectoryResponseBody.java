// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDirectoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Directories")
    public java.util.List<DescribeDirectoryResponseBodyDirectories> directories;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoryResponseBody self = new DescribeDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeDirectoryResponseBody setDirectories(java.util.List<DescribeDirectoryResponseBodyDirectories> directories) {
        this.directories = directories;
        return this;
    }
    public java.util.List<DescribeDirectoryResponseBodyDirectories> getDirectories() {
        return this.directories;
    }

    public DescribeDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDirectoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDirectoryResponseBodyDirectories extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("IsLeaf")
        public Boolean isLeaf;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Payload")
        public Long payload;

        @NameInMap("ProjectCode")
        public Long projectCode;

        public static DescribeDirectoryResponseBodyDirectories build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoryResponseBodyDirectories self = new DescribeDirectoryResponseBodyDirectories();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoryResponseBodyDirectories setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDirectoryResponseBodyDirectories setIsLeaf(Boolean isLeaf) {
            this.isLeaf = isLeaf;
            return this;
        }
        public Boolean getIsLeaf() {
            return this.isLeaf;
        }

        public DescribeDirectoryResponseBodyDirectories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDirectoryResponseBodyDirectories setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public DescribeDirectoryResponseBodyDirectories setPayload(Long payload) {
            this.payload = payload;
            return this;
        }
        public Long getPayload() {
            return this.payload;
        }

        public DescribeDirectoryResponseBodyDirectories setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

    }

}
