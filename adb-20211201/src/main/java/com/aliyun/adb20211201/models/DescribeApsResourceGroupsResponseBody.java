// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsResourceGroupsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeApsResourceGroupsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeApsResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsResourceGroupsResponseBody self = new DescribeApsResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApsResourceGroupsResponseBody setData(DescribeApsResourceGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApsResourceGroupsResponseBodyData getData() {
        return this.data;
    }

    public DescribeApsResourceGroupsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeApsResourceGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApsResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApsResourceGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeApsResourceGroupsResponseBodyDataResourceGroups extends TeaModel {
        @NameInMap("Available")
        public Boolean available;

        @NameInMap("CuOptions")
        public java.util.List<Long> cuOptions;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("MaxComputeResource")
        public Integer maxComputeResource;

        @NameInMap("MinComputeResource")
        public Integer minComputeResource;

        public static DescribeApsResourceGroupsResponseBodyDataResourceGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsResourceGroupsResponseBodyDataResourceGroups self = new DescribeApsResourceGroupsResponseBodyDataResourceGroups();
            return TeaModel.build(map, self);
        }

        public DescribeApsResourceGroupsResponseBodyDataResourceGroups setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public DescribeApsResourceGroupsResponseBodyDataResourceGroups setCuOptions(java.util.List<Long> cuOptions) {
            this.cuOptions = cuOptions;
            return this;
        }
        public java.util.List<Long> getCuOptions() {
            return this.cuOptions;
        }

        public DescribeApsResourceGroupsResponseBodyDataResourceGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApsResourceGroupsResponseBodyDataResourceGroups setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeApsResourceGroupsResponseBodyDataResourceGroups setMaxComputeResource(Integer maxComputeResource) {
            this.maxComputeResource = maxComputeResource;
            return this;
        }
        public Integer getMaxComputeResource() {
            return this.maxComputeResource;
        }

        public DescribeApsResourceGroupsResponseBodyDataResourceGroups setMinComputeResource(Integer minComputeResource) {
            this.minComputeResource = minComputeResource;
            return this;
        }
        public Integer getMinComputeResource() {
            return this.minComputeResource;
        }

    }

    public static class DescribeApsResourceGroupsResponseBodyData extends TeaModel {
        @NameInMap("ResourceGroups")
        public java.util.List<DescribeApsResourceGroupsResponseBodyDataResourceGroups> resourceGroups;

        @NameInMap("Step")
        public Long step;

        public static DescribeApsResourceGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsResourceGroupsResponseBodyData self = new DescribeApsResourceGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApsResourceGroupsResponseBodyData setResourceGroups(java.util.List<DescribeApsResourceGroupsResponseBodyDataResourceGroups> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }
        public java.util.List<DescribeApsResourceGroupsResponseBodyDataResourceGroups> getResourceGroups() {
            return this.resourceGroups;
        }

        public DescribeApsResourceGroupsResponseBodyData setStep(Long step) {
            this.step = step;
            return this;
        }
        public Long getStep() {
            return this.step;
        }

    }

}
