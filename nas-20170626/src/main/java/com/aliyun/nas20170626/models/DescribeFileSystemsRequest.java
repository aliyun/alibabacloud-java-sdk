// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("FileSystemType")
    public String fileSystemType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Tag")
    public java.util.List<DescribeFileSystemsRequestTag> tag;

    public static DescribeFileSystemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemsRequest self = new DescribeFileSystemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeFileSystemsRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public DescribeFileSystemsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeFileSystemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileSystemsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileSystemsRequest setTag(java.util.List<DescribeFileSystemsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeFileSystemsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeFileSystemsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeFileSystemsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsRequestTag self = new DescribeFileSystemsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFileSystemsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
