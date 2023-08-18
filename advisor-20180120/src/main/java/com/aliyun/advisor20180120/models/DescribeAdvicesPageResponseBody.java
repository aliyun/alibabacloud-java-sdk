// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesPageResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAdvicesPageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAdvicesPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvicesPageResponseBody self = new DescribeAdvicesPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvicesPageResponseBody setData(DescribeAdvicesPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAdvicesPageResponseBodyData getData() {
        return this.data;
    }

    public DescribeAdvicesPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAdvicesPageResponseBodyDataResult extends TeaModel {
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

        /**
         * <p>ID</p>
         */
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

        public static DescribeAdvicesPageResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvicesPageResponseBodyDataResult self = new DescribeAdvicesPageResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DescribeAdvicesPageResponseBodyDataResult setAliyunId(Long aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public Long getAliyunId() {
            return this.aliyunId;
        }

        public DescribeAdvicesPageResponseBodyDataResult setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public DescribeAdvicesPageResponseBodyDataResult setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public DescribeAdvicesPageResponseBodyDataResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeAdvicesPageResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAdvicesPageResponseBodyDataResult setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeAdvicesPageResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAdvicesPageResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAdvicesPageResponseBodyDataResult setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public DescribeAdvicesPageResponseBodyDataResult setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeAdvicesPageResponseBodyDataResult setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeAdvicesPageResponseBodyDataResult setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeAdvicesPageResponseBodyDataResult setSeverity(Long severity) {
            this.severity = severity;
            return this;
        }
        public Long getSeverity() {
            return this.severity;
        }

    }

    public static class DescribeAdvicesPageResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Result")
        public java.util.List<DescribeAdvicesPageResponseBodyDataResult> result;

        @NameInMap("Total")
        public Long total;

        public static DescribeAdvicesPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvicesPageResponseBodyData self = new DescribeAdvicesPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAdvicesPageResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public DescribeAdvicesPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAdvicesPageResponseBodyData setResult(java.util.List<DescribeAdvicesPageResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DescribeAdvicesPageResponseBodyDataResult> getResult() {
            return this.result;
        }

        public DescribeAdvicesPageResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
