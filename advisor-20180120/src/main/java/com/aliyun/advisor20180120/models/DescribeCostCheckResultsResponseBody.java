// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckResultsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCostCheckResultsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>566331F9-****-550F-B745-A730331F97A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeCostCheckResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostCheckResultsResponseBody self = new DescribeCostCheckResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCostCheckResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCostCheckResultsResponseBody setData(DescribeCostCheckResultsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCostCheckResultsResponseBodyData getData() {
        return this.data;
    }

    public DescribeCostCheckResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCostCheckResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCostCheckResultsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AdviceCount")
        public Integer adviceCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AdviceResourceCount")
        public Integer adviceResourceCount;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>EbsCostIdleCheck</p>
         */
        @NameInMap("CheckId")
        public String checkId;

        @NameInMap("CheckName")
        public String checkName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentCost")
        public Float currentCost;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpectedSavingCost")
        public Float expectedSavingCost;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OptimizedCost")
        public Float optimizedCost;

        /**
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Severity")
        public Integer severity;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Summary")
        public String summary;

        @NameInMap("Tips")
        public String tips;

        public static DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems self = new DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setAdviceCount(Integer adviceCount) {
            this.adviceCount = adviceCount;
            return this;
        }
        public Integer getAdviceCount() {
            return this.adviceCount;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setAdviceResourceCount(Integer adviceResourceCount) {
            this.adviceResourceCount = adviceResourceCount;
            return this;
        }
        public Integer getAdviceResourceCount() {
            return this.adviceResourceCount;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setCurrentCost(Float currentCost) {
            this.currentCost = currentCost;
            return this;
        }
        public Float getCurrentCost() {
            return this.currentCost;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setExpectedSavingCost(Float expectedSavingCost) {
            this.expectedSavingCost = expectedSavingCost;
            return this;
        }
        public Float getExpectedSavingCost() {
            return this.expectedSavingCost;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setOptimizedCost(Float optimizedCost) {
            this.optimizedCost = optimizedCost;
            return this;
        }
        public Float getOptimizedCost() {
            return this.optimizedCost;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setSeverity(Integer severity) {
            this.severity = severity;
            return this;
        }
        public Integer getSeverity() {
            return this.severity;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class DescribeCostCheckResultsResponseBodyDataViewGroup extends TeaModel {
        @NameInMap("CheckItems")
        public java.util.List<DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems> checkItems;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("GroupCode")
        public String groupCode;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GroupCount")
        public Integer groupCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GroupExpectedSavingCost")
        public Float groupExpectedSavingCost;

        /**
         * <strong>example:</strong>
         * <p>aut***8ainRh1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static DescribeCostCheckResultsResponseBodyDataViewGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostCheckResultsResponseBodyDataViewGroup self = new DescribeCostCheckResultsResponseBodyDataViewGroup();
            return TeaModel.build(map, self);
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroup setCheckItems(java.util.List<DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }
        public java.util.List<DescribeCostCheckResultsResponseBodyDataViewGroupCheckItems> getCheckItems() {
            return this.checkItems;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroup setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroup setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroup setGroupExpectedSavingCost(Float groupExpectedSavingCost) {
            this.groupExpectedSavingCost = groupExpectedSavingCost;
            return this;
        }
        public Float getGroupExpectedSavingCost() {
            return this.groupExpectedSavingCost;
        }

        public DescribeCostCheckResultsResponseBodyDataViewGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeCostCheckResultsResponseBodyData extends TeaModel {
        @NameInMap("AdviceResourceCount")
        public Integer adviceResourceCount;

        /**
         * <strong>example:</strong>
         * <p>Category</p>
         */
        @NameInMap("GroupBy")
        public String groupBy;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NormalCount")
        public Integer normalCount;

        /**
         * <strong>example:</strong>
         * <p>76</p>
         */
        @NameInMap("ResourceCount")
        public Integer resourceCount;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ViewGroup")
        public java.util.List<DescribeCostCheckResultsResponseBodyDataViewGroup> viewGroup;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WarningCount")
        public Integer warningCount;

        public static DescribeCostCheckResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostCheckResultsResponseBodyData self = new DescribeCostCheckResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCostCheckResultsResponseBodyData setAdviceResourceCount(Integer adviceResourceCount) {
            this.adviceResourceCount = adviceResourceCount;
            return this;
        }
        public Integer getAdviceResourceCount() {
            return this.adviceResourceCount;
        }

        public DescribeCostCheckResultsResponseBodyData setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        public String getGroupBy() {
            return this.groupBy;
        }

        public DescribeCostCheckResultsResponseBodyData setNormalCount(Integer normalCount) {
            this.normalCount = normalCount;
            return this;
        }
        public Integer getNormalCount() {
            return this.normalCount;
        }

        public DescribeCostCheckResultsResponseBodyData setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        public DescribeCostCheckResultsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeCostCheckResultsResponseBodyData setViewGroup(java.util.List<DescribeCostCheckResultsResponseBodyDataViewGroup> viewGroup) {
            this.viewGroup = viewGroup;
            return this;
        }
        public java.util.List<DescribeCostCheckResultsResponseBodyDataViewGroup> getViewGroup() {
            return this.viewGroup;
        }

        public DescribeCostCheckResultsResponseBodyData setWarningCount(Integer warningCount) {
            this.warningCount = warningCount;
            return this;
        }
        public Integer getWarningCount() {
            return this.warningCount;
        }

    }

}
