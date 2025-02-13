// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesFlatPageResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAdvicesFlatPageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>566331F9-5AB3-550F-B745-A730331F97A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAdvicesFlatPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvicesFlatPageResponseBody self = new DescribeAdvicesFlatPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvicesFlatPageResponseBody setData(DescribeAdvicesFlatPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAdvicesFlatPageResponseBodyData getData() {
        return this.data;
    }

    public DescribeAdvicesFlatPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAdvicesFlatPageResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192895059480****</p>
         */
        @NameInMap("AliyunId")
        public Long aliyunId;

        /**
         * <strong>example:</strong>
         * <p>EcsHighCpuUtilization</p>
         */
        @NameInMap("CheckId")
        public String checkId;

        @NameInMap("CheckName")
        public String checkName;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;:&quot;EcsHighCpuUtilization_xxxx&quot;, &quot;value&quot;:&quot;xxx&quot;}, {&quot;key&quot;:&quot;EcsHighCpuUtilization_xxxx&quot;, &quot;value&quot;:&quot;xxx&quot;}, {&quot;key&quot;:&quot;EcsHighCpuUtilization_xxxx&quot;, &quot;value&quot;:&quot;xxx&quot;}, ]</p>
         */
        @NameInMap("Content")
        public String content;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2023-07-01 00:00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2023-07-01 00:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>40200899</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsExpired")
        public Boolean isExpired;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <strong>example:</strong>
         * <p>{&quot;resourceId&quot;: &quot;i-2zecnwitr2s7aca6****&quot;,&quot;resourceName&quot;: &quot;ecs-20230701&quot;,&quot;regionId&quot;: &quot;cn-hangzhou&quot;,...}</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Severity")
        public Long severity;

        public static DescribeAdvicesFlatPageResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvicesFlatPageResponseBodyDataResult self = new DescribeAdvicesFlatPageResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setAliyunId(Long aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public Long getAliyunId() {
            return this.aliyunId;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeAdvicesFlatPageResponseBodyDataResult setSeverity(Long severity) {
            this.severity = severity;
            return this;
        }
        public Long getSeverity() {
            return this.severity;
        }

    }

    public static class DescribeAdvicesFlatPageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Result")
        public java.util.List<DescribeAdvicesFlatPageResponseBodyDataResult> result;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeAdvicesFlatPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvicesFlatPageResponseBodyData self = new DescribeAdvicesFlatPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAdvicesFlatPageResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public DescribeAdvicesFlatPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAdvicesFlatPageResponseBodyData setResult(java.util.List<DescribeAdvicesFlatPageResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DescribeAdvicesFlatPageResponseBodyDataResult> getResult() {
            return this.result;
        }

        public DescribeAdvicesFlatPageResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
