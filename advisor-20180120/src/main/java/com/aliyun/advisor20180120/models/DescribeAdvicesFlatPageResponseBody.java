// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesFlatPageResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAdvicesFlatPageResponseBodyData data;

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
        @NameInMap("AliyunId")
        public Long aliyunId;

        @NameInMap("CheckId")
        public String checkId;

        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("Content")
        public String content;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsExpired")
        public Boolean isExpired;

        @NameInMap("Product")
        public String product;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("ResourceId")
        public String resourceId;

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
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Result")
        public java.util.List<DescribeAdvicesFlatPageResponseBodyDataResult> result;

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
