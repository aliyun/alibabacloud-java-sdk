// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvisorChecksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeAdvisorChecksResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAdvisorChecksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvisorChecksResponseBody self = new DescribeAdvisorChecksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvisorChecksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAdvisorChecksResponseBody setData(DescribeAdvisorChecksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAdvisorChecksResponseBodyData getData() {
        return this.data;
    }

    public DescribeAdvisorChecksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAdvisorChecksResponseBodyDataAdvisorCheck extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("OperateColumn")
        public String operateColumn;

        @NameInMap("Product")
        public String product;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tips")
        public String tips;

        @NameInMap("ViewColumn")
        public String viewColumn;

        public static DescribeAdvisorChecksResponseBodyDataAdvisorCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvisorChecksResponseBodyDataAdvisorCheck self = new DescribeAdvisorChecksResponseBodyDataAdvisorCheck();
            return TeaModel.build(map, self);
        }

        public DescribeAdvisorChecksResponseBodyDataAdvisorCheck setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAdvisorChecksResponseBodyDataAdvisorCheck setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeAdvisorChecksResponseBodyDataAdvisorCheck setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAdvisorChecksResponseBodyDataAdvisorCheck setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeAdvisorChecksResponseBodyDataAdvisorCheck setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAdvisorChecksResponseBodyDataAdvisorCheck setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAdvisorChecksResponseBodyDataAdvisorCheck setOperateColumn(String operateColumn) {
            this.operateColumn = operateColumn;
            return this;
        }
        public String getOperateColumn() {
            return this.operateColumn;
        }

        public DescribeAdvisorChecksResponseBodyDataAdvisorCheck setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeAdvisorChecksResponseBodyDataAdvisorCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAdvisorChecksResponseBodyDataAdvisorCheck setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public DescribeAdvisorChecksResponseBodyDataAdvisorCheck setViewColumn(String viewColumn) {
            this.viewColumn = viewColumn;
            return this;
        }
        public String getViewColumn() {
            return this.viewColumn;
        }

    }

    public static class DescribeAdvisorChecksResponseBodyData extends TeaModel {
        @NameInMap("AdvisorCheck")
        public java.util.List<DescribeAdvisorChecksResponseBodyDataAdvisorCheck> advisorCheck;

        public static DescribeAdvisorChecksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvisorChecksResponseBodyData self = new DescribeAdvisorChecksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAdvisorChecksResponseBodyData setAdvisorCheck(java.util.List<DescribeAdvisorChecksResponseBodyDataAdvisorCheck> advisorCheck) {
            this.advisorCheck = advisorCheck;
            return this;
        }
        public java.util.List<DescribeAdvisorChecksResponseBodyDataAdvisorCheck> getAdvisorCheck() {
            return this.advisorCheck;
        }

    }

}
