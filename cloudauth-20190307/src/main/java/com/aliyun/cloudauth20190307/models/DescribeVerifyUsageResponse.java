// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyUsageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("VerifyUsageList")
    @Validation(required = true)
    public java.util.List<DescribeVerifyUsageResponseVerifyUsageList> verifyUsageList;

    public static DescribeVerifyUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyUsageResponse self = new DescribeVerifyUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyUsageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyUsageResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVerifyUsageResponse setVerifyUsageList(java.util.List<DescribeVerifyUsageResponseVerifyUsageList> verifyUsageList) {
        this.verifyUsageList = verifyUsageList;
        return this;
    }
    public java.util.List<DescribeVerifyUsageResponseVerifyUsageList> getVerifyUsageList() {
        return this.verifyUsageList;
    }

    public static class DescribeVerifyUsageResponseVerifyUsageList extends TeaModel {
        @NameInMap("BizType")
        @Validation(required = true)
        public String bizType;

        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("PassCount")
        @Validation(required = true)
        public Long passCount;

        @NameInMap("FailCount")
        @Validation(required = true)
        public Long failCount;

        public static DescribeVerifyUsageResponseVerifyUsageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyUsageResponseVerifyUsageList self = new DescribeVerifyUsageResponseVerifyUsageList();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyUsageResponseVerifyUsageList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeVerifyUsageResponseVerifyUsageList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeVerifyUsageResponseVerifyUsageList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeVerifyUsageResponseVerifyUsageList setPassCount(Long passCount) {
            this.passCount = passCount;
            return this;
        }
        public Long getPassCount() {
            return this.passCount;
        }

        public DescribeVerifyUsageResponseVerifyUsageList setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

    }

}
