// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeCustomScenePoliciesResponseBody extends TeaModel {
    @NameInMap("DataModule")
    public java.util.List<DescribeCustomScenePoliciesResponseBodyDataModule> dataModule;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Quota")
    public Integer quota;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>85H66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>2023-03-06T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Objects")
        public java.util.List<String> objects;

        /**
         * <strong>example:</strong>
         * <p>1234****</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <strong>example:</strong>
         * <p>2023-03-04T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Expired</p>
         */
        @NameInMap("Status")
        public String status;

        /**
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
