// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ListNodeGroupConstraintsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListNodeGroupConstraintsResponseBodyData> data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListNodeGroupConstraintsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupConstraintsResponseBody self = new ListNodeGroupConstraintsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupConstraintsResponseBody setData(java.util.List<ListNodeGroupConstraintsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodeGroupConstraintsResponseBodyData> getData() {
        return this.data;
    }

    public ListNodeGroupConstraintsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListNodeGroupConstraintsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListNodeGroupConstraintsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodeGroupConstraintsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeGroupConstraintsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNodeGroupConstraintsResponseBodyData extends TeaModel {
        @NameInMap("HostGroupType")
        public String hostGroupType;

        @NameInMap("RecommendedInstanceTypes")
        public java.util.List<String> recommendedInstanceTypes;

        @NameInMap("availableDataDiskCategories")
        public java.util.List<String> availableDataDiskCategories;

        @NameInMap("availableInstanceTypes")
        public java.util.List<String> availableInstanceTypes;

        @NameInMap("availableSystemDiskCategories")
        public java.util.List<String> availableSystemDiskCategories;

        @NameInMap("defaultDataDiskCount")
        public Integer defaultDataDiskCount;

        @NameInMap("defaultDataDiskSize")
        public Integer defaultDataDiskSize;

        @NameInMap("defaultNodeCount")
        public Integer defaultNodeCount;

        @NameInMap("defaultSystemDiskSize")
        public Integer defaultSystemDiskSize;

        @NameInMap("maxDataDiskCount")
        public Integer maxDataDiskCount;

        @NameInMap("maxDataDiskSize")
        public Integer maxDataDiskSize;

        @NameInMap("maxNodeCount")
        public Integer maxNodeCount;

        @NameInMap("maxSystemDiskSize")
        public Integer maxSystemDiskSize;

        @NameInMap("minDataDiskCount")
        public Integer minDataDiskCount;

        @NameInMap("minDataDiskSize")
        public Integer minDataDiskSize;

        @NameInMap("minNodeCount")
        public Integer minNodeCount;

        @NameInMap("minSystemDiskSize")
        public Integer minSystemDiskSize;

        @NameInMap("nodeGroupName")
        public String nodeGroupName;

        public static ListNodeGroupConstraintsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodeGroupConstraintsResponseBodyData self = new ListNodeGroupConstraintsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodeGroupConstraintsResponseBodyData setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public ListNodeGroupConstraintsResponseBodyData setRecommendedInstanceTypes(java.util.List<String> recommendedInstanceTypes) {
            this.recommendedInstanceTypes = recommendedInstanceTypes;
            return this;
        }
        public java.util.List<String> getRecommendedInstanceTypes() {
            return this.recommendedInstanceTypes;
        }

        public ListNodeGroupConstraintsResponseBodyData setAvailableDataDiskCategories(java.util.List<String> availableDataDiskCategories) {
            this.availableDataDiskCategories = availableDataDiskCategories;
            return this;
        }
        public java.util.List<String> getAvailableDataDiskCategories() {
            return this.availableDataDiskCategories;
        }

        public ListNodeGroupConstraintsResponseBodyData setAvailableInstanceTypes(java.util.List<String> availableInstanceTypes) {
            this.availableInstanceTypes = availableInstanceTypes;
            return this;
        }
        public java.util.List<String> getAvailableInstanceTypes() {
            return this.availableInstanceTypes;
        }

        public ListNodeGroupConstraintsResponseBodyData setAvailableSystemDiskCategories(java.util.List<String> availableSystemDiskCategories) {
            this.availableSystemDiskCategories = availableSystemDiskCategories;
            return this;
        }
        public java.util.List<String> getAvailableSystemDiskCategories() {
            return this.availableSystemDiskCategories;
        }

        public ListNodeGroupConstraintsResponseBodyData setDefaultDataDiskCount(Integer defaultDataDiskCount) {
            this.defaultDataDiskCount = defaultDataDiskCount;
            return this;
        }
        public Integer getDefaultDataDiskCount() {
            return this.defaultDataDiskCount;
        }

        public ListNodeGroupConstraintsResponseBodyData setDefaultDataDiskSize(Integer defaultDataDiskSize) {
            this.defaultDataDiskSize = defaultDataDiskSize;
            return this;
        }
        public Integer getDefaultDataDiskSize() {
            return this.defaultDataDiskSize;
        }

        public ListNodeGroupConstraintsResponseBodyData setDefaultNodeCount(Integer defaultNodeCount) {
            this.defaultNodeCount = defaultNodeCount;
            return this;
        }
        public Integer getDefaultNodeCount() {
            return this.defaultNodeCount;
        }

        public ListNodeGroupConstraintsResponseBodyData setDefaultSystemDiskSize(Integer defaultSystemDiskSize) {
            this.defaultSystemDiskSize = defaultSystemDiskSize;
            return this;
        }
        public Integer getDefaultSystemDiskSize() {
            return this.defaultSystemDiskSize;
        }

        public ListNodeGroupConstraintsResponseBodyData setMaxDataDiskCount(Integer maxDataDiskCount) {
            this.maxDataDiskCount = maxDataDiskCount;
            return this;
        }
        public Integer getMaxDataDiskCount() {
            return this.maxDataDiskCount;
        }

        public ListNodeGroupConstraintsResponseBodyData setMaxDataDiskSize(Integer maxDataDiskSize) {
            this.maxDataDiskSize = maxDataDiskSize;
            return this;
        }
        public Integer getMaxDataDiskSize() {
            return this.maxDataDiskSize;
        }

        public ListNodeGroupConstraintsResponseBodyData setMaxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = maxNodeCount;
            return this;
        }
        public Integer getMaxNodeCount() {
            return this.maxNodeCount;
        }

        public ListNodeGroupConstraintsResponseBodyData setMaxSystemDiskSize(Integer maxSystemDiskSize) {
            this.maxSystemDiskSize = maxSystemDiskSize;
            return this;
        }
        public Integer getMaxSystemDiskSize() {
            return this.maxSystemDiskSize;
        }

        public ListNodeGroupConstraintsResponseBodyData setMinDataDiskCount(Integer minDataDiskCount) {
            this.minDataDiskCount = minDataDiskCount;
            return this;
        }
        public Integer getMinDataDiskCount() {
            return this.minDataDiskCount;
        }

        public ListNodeGroupConstraintsResponseBodyData setMinDataDiskSize(Integer minDataDiskSize) {
            this.minDataDiskSize = minDataDiskSize;
            return this;
        }
        public Integer getMinDataDiskSize() {
            return this.minDataDiskSize;
        }

        public ListNodeGroupConstraintsResponseBodyData setMinNodeCount(Integer minNodeCount) {
            this.minNodeCount = minNodeCount;
            return this;
        }
        public Integer getMinNodeCount() {
            return this.minNodeCount;
        }

        public ListNodeGroupConstraintsResponseBodyData setMinSystemDiskSize(Integer minSystemDiskSize) {
            this.minSystemDiskSize = minSystemDiskSize;
            return this;
        }
        public Integer getMinSystemDiskSize() {
            return this.minSystemDiskSize;
        }

        public ListNodeGroupConstraintsResponseBodyData setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

    }

}
