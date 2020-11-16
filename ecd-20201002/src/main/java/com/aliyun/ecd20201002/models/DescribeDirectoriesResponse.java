// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeDirectoriesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Directories")
    @Validation(required = true)
    public java.util.List<DescribeDirectoriesResponseDirectories> directories;

    public static DescribeDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoriesResponse self = new DescribeDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoriesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDirectoriesResponse setDirectories(java.util.List<DescribeDirectoriesResponseDirectories> directories) {
        this.directories = directories;
        return this;
    }
    public java.util.List<DescribeDirectoriesResponseDirectories> getDirectories() {
        return this.directories;
    }

    public static class DescribeDirectoriesResponseDirectories extends TeaModel {
        @NameInMap("DirectoryId")
        @Validation(required = true)
        public String directoryId;

        @NameInMap("DirectoryType")
        @Validation(required = true)
        public String directoryType;

        public static DescribeDirectoriesResponseDirectories build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseDirectories self = new DescribeDirectoriesResponseDirectories();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseDirectories setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDirectoriesResponseDirectories setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

    }

}
