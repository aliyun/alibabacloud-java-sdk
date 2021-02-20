// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessLogDispatchStatusResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlsConfigStatus")
    public java.util.List<DescribeWebAccessLogDispatchStatusResponseBodySlsConfigStatus> slsConfigStatus;

    public static DescribeWebAccessLogDispatchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessLogDispatchStatusResponseBody self = new DescribeWebAccessLogDispatchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessLogDispatchStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebAccessLogDispatchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebAccessLogDispatchStatusResponseBody setSlsConfigStatus(java.util.List<DescribeWebAccessLogDispatchStatusResponseBodySlsConfigStatus> slsConfigStatus) {
        this.slsConfigStatus = slsConfigStatus;
        return this;
    }
    public java.util.List<DescribeWebAccessLogDispatchStatusResponseBodySlsConfigStatus> getSlsConfigStatus() {
        return this.slsConfigStatus;
    }

    public static class DescribeWebAccessLogDispatchStatusResponseBodySlsConfigStatus extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Enable")
        public Boolean enable;

        public static DescribeWebAccessLogDispatchStatusResponseBodySlsConfigStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebAccessLogDispatchStatusResponseBodySlsConfigStatus self = new DescribeWebAccessLogDispatchStatusResponseBodySlsConfigStatus();
            return TeaModel.build(map, self);
        }

        public DescribeWebAccessLogDispatchStatusResponseBodySlsConfigStatus setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWebAccessLogDispatchStatusResponseBodySlsConfigStatus setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
