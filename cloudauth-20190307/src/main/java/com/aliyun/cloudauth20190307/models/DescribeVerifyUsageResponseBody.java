// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyUsageResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VerifyUsageList")
    public java.util.List<DescribeVerifyUsageResponseBodyVerifyUsageList> verifyUsageList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVerifyUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyUsageResponseBody self = new DescribeVerifyUsageResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeVerifyUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVerifyUsageResponseBodyVerifyUsageList extends TeaModel {
        @NameInMap("PassCount")
        public Long passCount;

        @NameInMap("FailCount")
        public Long failCount;

        @NameInMap("Date")
        public String date;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("BizType")
        public String bizType;

        public static DescribeVerifyUsageResponseBodyVerifyUsageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyUsageResponseBodyVerifyUsageList self = new DescribeVerifyUsageResponseBodyVerifyUsageList();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyUsageResponseBodyVerifyUsageList setPassCount(Long passCount) {
            this.passCount = passCount;
            return this;
        }
        public Long getPassCount() {
            return this.passCount;
        }

        public DescribeVerifyUsageResponseBodyVerifyUsageList setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public DescribeVerifyUsageResponseBodyVerifyUsageList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeVerifyUsageResponseBodyVerifyUsageList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeVerifyUsageResponseBodyVerifyUsageList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

    }

}
