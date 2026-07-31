// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsResourceGroupsResponseBody extends TeaModel {
    /**
     * <p>The information about the resource groups.</p>
     */
    @NameInMap("Data")
    public DescribeApsResourceGroupsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>Additional information about the call. Valid values:</p>
     * <ul>
     * <li><p>Success is returned if the request is successful.</p>
     * </li>
     * <li><p>An error code is returned if the request fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FC370D7-1D4C-5A8E-805E-F73366382C66</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>True</strong></p>
     * </li>
     * <li><p><strong>False</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <p>Indicates whether the resource group is available. Valid values:</p>
         * <ul>
         * <li><p><strong>True</strong></p>
         * </li>
         * <li><p><strong>False</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Available")
        public Boolean available;

        /**
         * <p>The resource gradient values.</p>
         */
        @NameInMap("CuOptions")
        public java.util.List<Long> cuOptions;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the resource group. Valid values:</p>
         * <ul>
         * <li><p><strong>Interactive</strong></p>
         * </li>
         * <li><p><strong>Job</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For more information about resource groups in Data Lakehouse Edition, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource groups</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Job</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The remaining computing resources, in ACU.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("LeftComputeResource")
        public Integer leftComputeResource;

        /**
         * <p>The maximum reserved computing resources, in ACU.</p>
         * <ul>
         * <li><p>If GroupType is <strong>Interactive</strong>, the maximum reserved computing resources are the current unallocated resources of the cluster, and the step size is 16 ACU.</p>
         * </li>
         * <li><p>If GroupType is <strong>Job</strong>, the maximum reserved computing resources are the current unallocated resources of the cluster, and the step size is 8 ACU.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaxComputeResource")
        public Integer maxComputeResource;

        /**
         * <p>The minimum reserved computing resources, in ACU.</p>
         * <ul>
         * <li><p>If GroupType is <strong>Interactive</strong>, the minimum reserved computing resources are 16 ACU.</p>
         * </li>
         * <li><p>If GroupType is <strong>Job</strong>, the minimum reserved computing resources are 0 ACU.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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

        public DescribeApsResourceGroupsResponseBodyDataResourceGroups setLeftComputeResource(Integer leftComputeResource) {
            this.leftComputeResource = leftComputeResource;
            return this;
        }
        public Integer getLeftComputeResource() {
            return this.leftComputeResource;
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
        /**
         * <p>The resource groups.</p>
         */
        @NameInMap("ResourceGroups")
        public java.util.List<DescribeApsResourceGroupsResponseBodyDataResourceGroups> resourceGroups;

        /**
         * <p>The step size of the resource group, in ACU.</p>
         * <ul>
         * <li><p>If GroupType is <strong>Interactive</strong>, the step size is 16 ACU.</p>
         * </li>
         * <li><p>If GroupType is <strong>Job</strong>, the step size is 8 ACU.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
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
