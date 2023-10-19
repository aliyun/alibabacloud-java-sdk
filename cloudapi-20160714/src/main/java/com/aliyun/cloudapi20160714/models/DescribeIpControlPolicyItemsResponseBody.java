// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeIpControlPolicyItemsResponseBody extends TeaModel {
    /**
     * <p>The information about policies. The information is an array of IpControlPolicyItem data.</p>
     */
    @NameInMap("IpControlPolicyItems")
    public DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItems ipControlPolicyItems;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeIpControlPolicyItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpControlPolicyItemsResponseBody self = new DescribeIpControlPolicyItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpControlPolicyItemsResponseBody setIpControlPolicyItems(DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItems ipControlPolicyItems) {
        this.ipControlPolicyItems = ipControlPolicyItems;
        return this;
    }
    public DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItems getIpControlPolicyItems() {
        return this.ipControlPolicyItems;
    }

    public DescribeIpControlPolicyItemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpControlPolicyItemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpControlPolicyItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpControlPolicyItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The IP addresses or CIDR blocks.</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The time when the policy was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the policy was modified. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the policy.</p>
         */
        @NameInMap("PolicyItemId")
        public String policyItemId;

        public static DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem self = new DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem();
            return TeaModel.build(map, self);
        }

        public DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem setPolicyItemId(String policyItemId) {
            this.policyItemId = policyItemId;
            return this;
        }
        public String getPolicyItemId() {
            return this.policyItemId;
        }

    }

    public static class DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItems extends TeaModel {
        @NameInMap("IpControlPolicyItem")
        public java.util.List<DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem> ipControlPolicyItem;

        public static DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItems self = new DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItems();
            return TeaModel.build(map, self);
        }

        public DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItems setIpControlPolicyItem(java.util.List<DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem> ipControlPolicyItem) {
            this.ipControlPolicyItem = ipControlPolicyItem;
            return this;
        }
        public java.util.List<DescribeIpControlPolicyItemsResponseBodyIpControlPolicyItemsIpControlPolicyItem> getIpControlPolicyItem() {
            return this.ipControlPolicyItem;
        }

    }

}
