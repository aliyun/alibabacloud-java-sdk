// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessLogDispatchStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the log analysis feature is enabled for domain names.</p>
     */
    @NameInMap("SlsConfigStatus")
    public java.util.List<DescribeWebAccessLogDispatchStatusResponseBodySlsConfigStatus> slsConfigStatus;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebAccessLogDispatchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessLogDispatchStatusResponseBody self = new DescribeWebAccessLogDispatchStatusResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeWebAccessLogDispatchStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWebAccessLogDispatchStatusResponseBodySlsConfigStatus extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether the log analysis feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
