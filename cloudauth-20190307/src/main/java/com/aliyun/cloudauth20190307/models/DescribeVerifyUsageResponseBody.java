// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyUsageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VerifyUsageList")
    public java.util.List<DescribeVerifyUsageResponseBodyVerifyUsageList> verifyUsageList;

    public static DescribeVerifyUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyUsageResponseBody self = new DescribeVerifyUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyUsageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVerifyUsageResponseBody setVerifyUsageList(java.util.List<DescribeVerifyUsageResponseBodyVerifyUsageList> verifyUsageList) {
        this.verifyUsageList = verifyUsageList;
        return this;
    }
    public java.util.List<DescribeVerifyUsageResponseBodyVerifyUsageList> getVerifyUsageList() {
        return this.verifyUsageList;
    }

    public static class DescribeVerifyUsageResponseBodyVerifyUsageList extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Date")
        public String date;

        @NameInMap("FailCount")
        public Long failCount;

        @NameInMap("PassCount")
        public Long passCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeVerifyUsageResponseBodyVerifyUsageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyUsageResponseBodyVerifyUsageList self = new DescribeVerifyUsageResponseBodyVerifyUsageList();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyUsageResponseBodyVerifyUsageList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeVerifyUsageResponseBodyVerifyUsageList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeVerifyUsageResponseBodyVerifyUsageList setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public DescribeVerifyUsageResponseBodyVerifyUsageList setPassCount(Long passCount) {
            this.passCount = passCount;
            return this;
        }
        public Long getPassCount() {
            return this.passCount;
        }

        public DescribeVerifyUsageResponseBodyVerifyUsageList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
