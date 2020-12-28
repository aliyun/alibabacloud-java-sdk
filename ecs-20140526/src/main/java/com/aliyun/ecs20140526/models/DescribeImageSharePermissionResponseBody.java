// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSharePermissionResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShareGroups")
    public java.util.List<DescribeImageSharePermissionResponseBodyShareGroups> shareGroups;

    @NameInMap("Accounts")
    public java.util.List<DescribeImageSharePermissionResponseBodyAccounts> accounts;

    public static DescribeImageSharePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSharePermissionResponseBody self = new DescribeImageSharePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageSharePermissionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeImageSharePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageSharePermissionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageSharePermissionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImageSharePermissionResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImageSharePermissionResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageSharePermissionResponseBody setShareGroups(java.util.List<DescribeImageSharePermissionResponseBodyShareGroups> shareGroups) {
        this.shareGroups = shareGroups;
        return this;
    }
    public java.util.List<DescribeImageSharePermissionResponseBodyShareGroups> getShareGroups() {
        return this.shareGroups;
    }

    public DescribeImageSharePermissionResponseBody setAccounts(java.util.List<DescribeImageSharePermissionResponseBodyAccounts> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<DescribeImageSharePermissionResponseBodyAccounts> getAccounts() {
        return this.accounts;
    }

    public static class DescribeImageSharePermissionResponseBodyShareGroups extends TeaModel {
        @NameInMap("Group")
        public String group;

        public static DescribeImageSharePermissionResponseBodyShareGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseBodyShareGroups self = new DescribeImageSharePermissionResponseBodyShareGroups();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseBodyShareGroups setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class DescribeImageSharePermissionResponseBodyAccounts extends TeaModel {
        @NameInMap("AliyunId")
        public String aliyunId;

        public static DescribeImageSharePermissionResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseBodyAccounts self = new DescribeImageSharePermissionResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseBodyAccounts setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

    }

}
