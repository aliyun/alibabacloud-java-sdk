// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeJVSInstanceResponseBody extends TeaModel {
    /**
     * <p>A list of JVS instances.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeJVSInstanceResponseBodyData> data;

    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. If this field is empty, there are no more results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeJVSInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJVSInstanceResponseBody self = new DescribeJVSInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJVSInstanceResponseBody setData(java.util.List<DescribeJVSInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeJVSInstanceResponseBodyData> getData() {
        return this.data;
    }

    public DescribeJVSInstanceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeJVSInstanceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeJVSInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJVSInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeJVSInstanceResponseBodyDataCreditConfig extends TeaModel {
        /**
         * <p>The Credit limit.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("CreditLimit")
        public Long creditLimit;

        /**
         * <p>The limit period.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("LimitPeriod")
        public String limitPeriod;

        public static DescribeJVSInstanceResponseBodyDataCreditConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeJVSInstanceResponseBodyDataCreditConfig self = new DescribeJVSInstanceResponseBodyDataCreditConfig();
            return TeaModel.build(map, self);
        }

        public DescribeJVSInstanceResponseBodyDataCreditConfig setCreditLimit(Long creditLimit) {
            this.creditLimit = creditLimit;
            return this;
        }
        public Long getCreditLimit() {
            return this.creditLimit;
        }

        public DescribeJVSInstanceResponseBodyDataCreditConfig setLimitPeriod(String limitPeriod) {
            this.limitPeriod = limitPeriod;
            return this;
        }
        public String getLimitPeriod() {
            return this.limitPeriod;
        }

    }

    public static class DescribeJVSInstanceResponseBodyDataUsedCredit extends TeaModel {
        /**
         * <p>The amount of Credit.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Credit")
        public Long credit;

        /**
         * <p>The calculation period for used Credit.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("LimitPeriod")
        public String limitPeriod;

        public static DescribeJVSInstanceResponseBodyDataUsedCredit build(java.util.Map<String, ?> map) throws Exception {
            DescribeJVSInstanceResponseBodyDataUsedCredit self = new DescribeJVSInstanceResponseBodyDataUsedCredit();
            return TeaModel.build(map, self);
        }

        public DescribeJVSInstanceResponseBodyDataUsedCredit setCredit(Long credit) {
            this.credit = credit;
            return this;
        }
        public Long getCredit() {
            return this.credit;
        }

        public DescribeJVSInstanceResponseBodyDataUsedCredit setLimitPeriod(String limitPeriod) {
            this.limitPeriod = limitPeriod;
            return this;
        }
        public String getLimitPeriod() {
            return this.limitPeriod;
        }

    }

    public static class DescribeJVSInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The time the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-10T01:31:32Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The Credit limit configuration. If you apply multiple configurations, the latest one overwrites the others.</p>
         */
        @NameInMap("CreditConfig")
        public java.util.List<DescribeJVSInstanceResponseBodyDataCreditConfig> creditConfig;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-10T01:31:32Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-uto81vfd8t8z****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("JvsPackageId")
        public String jvsPackageId;

        /**
         * <p>The time the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-10T01:31:32Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The amount of used Credit.</p>
         */
        @NameInMap("UsedCredit")
        public java.util.List<DescribeJVSInstanceResponseBodyDataUsedCredit> usedCredit;

        public static DescribeJVSInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeJVSInstanceResponseBodyData self = new DescribeJVSInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeJVSInstanceResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeJVSInstanceResponseBodyData setCreditConfig(java.util.List<DescribeJVSInstanceResponseBodyDataCreditConfig> creditConfig) {
            this.creditConfig = creditConfig;
            return this;
        }
        public java.util.List<DescribeJVSInstanceResponseBodyDataCreditConfig> getCreditConfig() {
            return this.creditConfig;
        }

        public DescribeJVSInstanceResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeJVSInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeJVSInstanceResponseBodyData setJvsPackageId(String jvsPackageId) {
            this.jvsPackageId = jvsPackageId;
            return this;
        }
        public String getJvsPackageId() {
            return this.jvsPackageId;
        }

        public DescribeJVSInstanceResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeJVSInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeJVSInstanceResponseBodyData setUsedCredit(java.util.List<DescribeJVSInstanceResponseBodyDataUsedCredit> usedCredit) {
            this.usedCredit = usedCredit;
            return this;
        }
        public java.util.List<DescribeJVSInstanceResponseBodyDataUsedCredit> getUsedCredit() {
            return this.usedCredit;
        }

    }

}
