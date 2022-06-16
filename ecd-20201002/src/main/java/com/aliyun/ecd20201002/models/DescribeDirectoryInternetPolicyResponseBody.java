// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeDirectoryInternetPolicyResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDirectoryInternetPolicyResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDirectoryInternetPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoryInternetPolicyResponseBody self = new DescribeDirectoryInternetPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoryInternetPolicyResponseBody setData(DescribeDirectoryInternetPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDirectoryInternetPolicyResponseBodyData getData() {
        return this.data;
    }

    public DescribeDirectoryInternetPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDirectoryInternetPolicyResponseBodyData extends TeaModel {
        @NameInMap("DomainList")
        public String domainList;

        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        @NameInMap("Status")
        public String status;

        public static DescribeDirectoryInternetPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoryInternetPolicyResponseBodyData self = new DescribeDirectoryInternetPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoryInternetPolicyResponseBodyData setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

        public DescribeDirectoryInternetPolicyResponseBodyData setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeDirectoryInternetPolicyResponseBodyData setPolicyGroupName(String policyGroupName) {
            this.policyGroupName = policyGroupName;
            return this;
        }
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        public DescribeDirectoryInternetPolicyResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
