// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAdvicesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>566331F9-5AB3-550F-B745-A730331F97A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAdvicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvicesResponseBody self = new DescribeAdvicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvicesResponseBody setData(DescribeAdvicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAdvicesResponseBodyData getData() {
        return this.data;
    }

    public DescribeAdvicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAdvicesResponseBodyDataAdvice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234567891234567</p>
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

        @NameInMap("CheckPlanId")
        public Long checkPlanId;

        /**
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;key&quot;:&quot;EcsHighCpuUtilization_xxxx&quot;,
         *         &quot;value&quot;:xxx
         *     },
         *     {
         *         &quot;key&quot;:&quot;EcsHighCpuUtilization_xxxx&quot;,
         *         &quot;value&quot;:xxx
         *     },
         *     {
         *         &quot;key&quot;:&quot;EcsHighCpuUtilization_xxxx&quot;,
         *         &quot;value&quot;:xxx
         *     },
         * ]</p>
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
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
         * <p>{
         *     &quot;resourceId&quot;: xxxx,
         *     &quot;resourceName&quot;: xxxxxx,
         *     &quot;regionId&quot;: xxxx,
         *     ...
         * }</p>
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
        public Integer severity;

        public static DescribeAdvicesResponseBodyDataAdvice build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvicesResponseBodyDataAdvice self = new DescribeAdvicesResponseBodyDataAdvice();
            return TeaModel.build(map, self);
        }

        public DescribeAdvicesResponseBodyDataAdvice setAliyunId(Long aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public Long getAliyunId() {
            return this.aliyunId;
        }

        public DescribeAdvicesResponseBodyDataAdvice setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public DescribeAdvicesResponseBodyDataAdvice setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public DescribeAdvicesResponseBodyDataAdvice setCheckPlanId(Long checkPlanId) {
            this.checkPlanId = checkPlanId;
            return this;
        }
        public Long getCheckPlanId() {
            return this.checkPlanId;
        }

        public DescribeAdvicesResponseBodyDataAdvice setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeAdvicesResponseBodyDataAdvice setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAdvicesResponseBodyDataAdvice setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeAdvicesResponseBodyDataAdvice setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAdvicesResponseBodyDataAdvice setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAdvicesResponseBodyDataAdvice setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public DescribeAdvicesResponseBodyDataAdvice setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeAdvicesResponseBodyDataAdvice setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeAdvicesResponseBodyDataAdvice setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeAdvicesResponseBodyDataAdvice setSeverity(Integer severity) {
            this.severity = severity;
            return this;
        }
        public Integer getSeverity() {
            return this.severity;
        }

    }

    public static class DescribeAdvicesResponseBodyData extends TeaModel {
        @NameInMap("Advice")
        public java.util.List<DescribeAdvicesResponseBodyDataAdvice> advice;

        public static DescribeAdvicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvicesResponseBodyData self = new DescribeAdvicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAdvicesResponseBodyData setAdvice(java.util.List<DescribeAdvicesResponseBodyDataAdvice> advice) {
            this.advice = advice;
            return this;
        }
        public java.util.List<DescribeAdvicesResponseBodyDataAdvice> getAdvice() {
            return this.advice;
        }

    }

}
