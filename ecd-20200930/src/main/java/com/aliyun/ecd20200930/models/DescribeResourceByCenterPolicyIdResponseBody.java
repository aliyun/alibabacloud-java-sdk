// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeResourceByCenterPolicyIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>48174475-5EB2-5F99-A9E9-6F892D645****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceModelList")
    public java.util.List<DescribeResourceByCenterPolicyIdResponseBodyResourceModelList> resourceModelList;

    public static DescribeResourceByCenterPolicyIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceByCenterPolicyIdResponseBody self = new DescribeResourceByCenterPolicyIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceByCenterPolicyIdResponseBody setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public DescribeResourceByCenterPolicyIdResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeResourceByCenterPolicyIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceByCenterPolicyIdResponseBody setResourceModelList(java.util.List<DescribeResourceByCenterPolicyIdResponseBodyResourceModelList> resourceModelList) {
        this.resourceModelList = resourceModelList;
        return this;
    }
    public java.util.List<DescribeResourceByCenterPolicyIdResponseBodyResourceModelList> getResourceModelList() {
        return this.resourceModelList;
    }

    public static class DescribeResourceByCenterPolicyIdResponseBodyResourceModelListAppModelList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>alipic-powergem</p>
         */
        @NameInMap("AppName")
        public String appName;

        public static DescribeResourceByCenterPolicyIdResponseBodyResourceModelListAppModelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceByCenterPolicyIdResponseBodyResourceModelListAppModelList self = new DescribeResourceByCenterPolicyIdResponseBodyResourceModelListAppModelList();
            return TeaModel.build(map, self);
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelListAppModelList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelListAppModelList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class DescribeResourceByCenterPolicyIdResponseBodyResourceModelList extends TeaModel {
        @NameInMap("AppModelList")
        public java.util.List<DescribeResourceByCenterPolicyIdResponseBodyResourceModelListAppModelList> appModelList;

        /**
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>eds.enterprise_office.8c32g</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <strong>example:</strong>
         * <p>0.125</p>
         */
        @NameInMap("GpuCount")
        public Double gpuCount;

        /**
         * <strong>example:</strong>
         * <p>2GiB</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <strong>example:</strong>
         * <p>postPaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <strong>example:</strong>
         * <p>rg-d7pasxsd3b9nhq**</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ResourceGroupRelCount")
        public Integer resourceGroupRelCount;

        /**
         * <strong>example:</strong>
         * <p>ecd-7o96aa08fr****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeResourceByCenterPolicyIdResponseBodyResourceModelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceByCenterPolicyIdResponseBodyResourceModelList self = new DescribeResourceByCenterPolicyIdResponseBodyResourceModelList();
            return TeaModel.build(map, self);
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setAppModelList(java.util.List<DescribeResourceByCenterPolicyIdResponseBodyResourceModelListAppModelList> appModelList) {
            this.appModelList = appModelList;
            return this;
        }
        public java.util.List<DescribeResourceByCenterPolicyIdResponseBodyResourceModelListAppModelList> getAppModelList() {
            return this.appModelList;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setGpuCount(Double gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Double getGpuCount() {
            return this.gpuCount;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setResourceGroupRelCount(Integer resourceGroupRelCount) {
            this.resourceGroupRelCount = resourceGroupRelCount;
            return this;
        }
        public Integer getResourceGroupRelCount() {
            return this.resourceGroupRelCount;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeResourceByCenterPolicyIdResponseBodyResourceModelList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
