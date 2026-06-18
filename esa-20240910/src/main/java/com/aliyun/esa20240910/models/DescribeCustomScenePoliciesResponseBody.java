// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeCustomScenePoliciesResponseBody extends TeaModel {
    /**
     * <p>The configurations of custom scene policies.</p>
     */
    @NameInMap("DataModule")
    public java.util.List<DescribeCustomScenePoliciesResponseBodyDataModule> dataModule;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The maximum number of policies that you can create.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Quota")
    public Integer quota;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85H66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCustomScenePoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomScenePoliciesResponseBody self = new DescribeCustomScenePoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomScenePoliciesResponseBody setDataModule(java.util.List<DescribeCustomScenePoliciesResponseBodyDataModule> dataModule) {
        this.dataModule = dataModule;
        return this;
    }
    public java.util.List<DescribeCustomScenePoliciesResponseBodyDataModule> getDataModule() {
        return this.dataModule;
    }

    public DescribeCustomScenePoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCustomScenePoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomScenePoliciesResponseBody setQuota(Integer quota) {
        this.quota = quota;
        return this;
    }
    public Integer getQuota() {
        return this.quota;
    }

    public DescribeCustomScenePoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomScenePoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCustomScenePoliciesResponseBodyDataModule extends TeaModel {
        /**
         * <p>The end time of the policy.</p>
         * <p>The time is in UTC and follows the ISO 8601 standard. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-06T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the custom scene policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A list of associated site IDs.</p>
         * <blockquote>
         * <p>This field is deprecated. We recommend that you use the <code>SiteIds</code> field instead.</p>
         * </blockquote>
         */
        @NameInMap("Objects")
        public java.util.List<String> objects;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234****</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>A comma-separated list of site IDs associated with the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****,123457****</p>
         */
        @NameInMap("SiteIds")
        public String siteIds;

        /**
         * <p>The start time of the policy.</p>
         * <p>The time is in UTC and follows the ISO 8601 standard. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-04T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The effective status of the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>disabled</strong>: The policy is disabled.</p>
         * </li>
         * <li><p><strong>pending</strong>: The policy is waiting to take effect.</p>
         * </li>
         * <li><p><strong>running</strong>: The policy is in effect.</p>
         * </li>
         * <li><p><strong>expired</strong>: The policy has expired.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Expired</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template name. Valid value:</p>
         * <ul>
         * <li><strong>promotion</strong>: A major event.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>promotion</p>
         */
        @NameInMap("Template")
        public String template;

        public static DescribeCustomScenePoliciesResponseBodyDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomScenePoliciesResponseBodyDataModule self = new DescribeCustomScenePoliciesResponseBodyDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeCustomScenePoliciesResponseBodyDataModule setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCustomScenePoliciesResponseBodyDataModule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomScenePoliciesResponseBodyDataModule setObjects(java.util.List<String> objects) {
            this.objects = objects;
            return this;
        }
        public java.util.List<String> getObjects() {
            return this.objects;
        }

        public DescribeCustomScenePoliciesResponseBodyDataModule setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeCustomScenePoliciesResponseBodyDataModule setSiteIds(String siteIds) {
            this.siteIds = siteIds;
            return this;
        }
        public String getSiteIds() {
            return this.siteIds;
        }

        public DescribeCustomScenePoliciesResponseBodyDataModule setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCustomScenePoliciesResponseBodyDataModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCustomScenePoliciesResponseBodyDataModule setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

    }

}
