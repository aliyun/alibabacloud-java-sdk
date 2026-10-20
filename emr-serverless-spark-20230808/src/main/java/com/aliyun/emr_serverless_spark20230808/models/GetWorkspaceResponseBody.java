// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The workspace object.</p>
     */
    @NameInMap("workspace")
    public GetWorkspaceResponseBodyWorkspace workspace;

    public static GetWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponseBody self = new GetWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceResponseBody setWorkspace(GetWorkspaceResponseBodyWorkspace workspace) {
        this.workspace = workspace;
        return this;
    }
    public GetWorkspaceResponseBodyWorkspace getWorkspace() {
        return this.workspace;
    }

    public static class GetWorkspaceResponseBodyWorkspacePrePaidQuota extends TeaModel {
        /**
         * <p>The amount of resources currently allocated.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cu&quot;: 100}</p>
         */
        @NameInMap("allocatedResource")
        public String allocatedResource;

        /**
         * <p>Specifies whether auto-renewal is enabled for the resource.</p>
         * <ul>
         * <li>true: Auto-renewal is enabled. The resource is automatically renewed upon expiration.</li>
         * <li>false: Auto-renewal is disabled. The resource is stopped upon expiration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("autoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>The time when the workspace was created. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1791802817000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The expiration time of the GPU subscription quota. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1779768979586</p>
         */
        @NameInMap("expireTime")
        public Long expireTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-df0tghlhat1776wy-klbifz8l</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The maximum amount of resources that can be used.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cu&quot;: 100}</p>
         */
        @NameInMap("maxResource")
        public String maxResource;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>298581757170384</p>
         */
        @NameInMap("orderId")
        public String orderId;

        /**
         * <p>The order status.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("paymentStatus")
        public String paymentStatus;

        /**
         * <p>The amount of resources currently used.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cu&quot;: 50}</p>
         */
        @NameInMap("usedResource")
        public String usedResource;

        public static GetWorkspaceResponseBodyWorkspacePrePaidQuota build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyWorkspacePrePaidQuota self = new GetWorkspaceResponseBodyWorkspacePrePaidQuota();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuota setAllocatedResource(String allocatedResource) {
            this.allocatedResource = allocatedResource;
            return this;
        }
        public String getAllocatedResource() {
            return this.allocatedResource;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuota setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuota setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuota setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuota setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuota setMaxResource(String maxResource) {
            this.maxResource = maxResource;
            return this;
        }
        public String getMaxResource() {
            return this.maxResource;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuota setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuota setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuota setUsedResource(String usedResource) {
            this.usedResource = usedResource;
            return this;
        }
        public String getUsedResource() {
            return this.usedResource;
        }

    }

    public static class GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu extends TeaModel {
        /**
         * <p>Specifies whether auto-renewal is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("autoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cpuCoreCount")
        public String cpuCoreCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1782292672000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1782292772000</p>
         */
        @NameInMap("expireTime")
        public Long expireTime;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gpuAmount")
        public Integer gpuAmount;

        /**
         * <p>The number of GPU instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gpuMachineNum")
        public Integer gpuMachineNum;

        /**
         * <p>The GPU memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("gpuMemorySize")
        public Long gpuMemorySize;

        /**
         * <p>The number of GPU instances.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("gpuNum")
        public Integer gpuNum;

        /**
         * <p>The GPU instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn7i-c8g1.2xlarge</p>
         */
        @NameInMap("gpuSpec")
        public String gpuSpec;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-xxxxxx-quota-gpu-xxxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The instance family.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5</p>
         */
        @NameInMap("instanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The instance type ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.small</p>
         */
        @NameInMap("instanceTypeId")
        public String instanceTypeId;

        /**
         * <p>The memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("memorySize")
        public String memorySize;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2345634254</p>
         */
        @NameInMap("orderId")
        public String orderId;

        /**
         * <p>The order status.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("paymentStatus")
        public String paymentStatus;

        public static GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu self = new GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setCpuCoreCount(String cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public String getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setGpuAmount(Integer gpuAmount) {
            this.gpuAmount = gpuAmount;
            return this;
        }
        public Integer getGpuAmount() {
            return this.gpuAmount;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setGpuMachineNum(Integer gpuMachineNum) {
            this.gpuMachineNum = gpuMachineNum;
            return this;
        }
        public Integer getGpuMachineNum() {
            return this.gpuMachineNum;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setGpuMemorySize(Long gpuMemorySize) {
            this.gpuMemorySize = gpuMemorySize;
            return this;
        }
        public Long getGpuMemorySize() {
            return this.gpuMemorySize;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setGpuNum(Integer gpuNum) {
            this.gpuNum = gpuNum;
            return this;
        }
        public Integer getGpuNum() {
            return this.gpuNum;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

    }

    public static class GetWorkspaceResponseBodyWorkspaceStateChangeReason extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The status information of the node pod.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("message")
        public String message;

        public static GetWorkspaceResponseBodyWorkspaceStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyWorkspaceStateChangeReason self = new GetWorkspaceResponseBodyWorkspaceStateChangeReason();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyWorkspaceStateChangeReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetWorkspaceResponseBodyWorkspaceStateChangeReason setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class GetWorkspaceResponseBodyWorkspaceTags extends TeaModel {
        /**
         * <p>The tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;COST\&quot;]</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>3d775731-9ec1-4fe2-a00d-061d51fce677</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static GetWorkspaceResponseBodyWorkspaceTags build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyWorkspaceTags self = new GetWorkspaceResponseBodyWorkspaceTags();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyWorkspaceTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetWorkspaceResponseBodyWorkspaceTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetWorkspaceResponseBodyWorkspace extends TeaModel {
        /**
         * <p>Specifies whether auto-renewal is enabled. This parameter is required for subscription workspaces.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoRenew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal period. This parameter is required for subscription workspaces.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("autoRenewPeriod")
        public Integer autoRenewPeriod;

        /**
         * <p>The auto-renewal cycle. This parameter is required for subscription workspaces.</p>
         * 
         * <strong>example:</strong>
         * <p>YEAR, MONTH, WEEK, DAY, HOUR, MINUTE</p>
         */
        @NameInMap("autoRenewPeriodUnit")
        public String autoRenewPeriodUnit;

        /**
         * <p>The time when the workspace was created. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1776824869000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The DLF catalog information.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("dlfCatalogId")
        public String dlfCatalogId;

        /**
         * <p>The bound DLF type.</p>
         * 
         * <strong>example:</strong>
         * <p>DLF-NEXT</p>
         */
        @NameInMap("dlfType")
        public String dlfType;

        /**
         * <p>The subscription duration. This parameter is required for subscription workspaces.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <p>The time when the workspace is released.</p>
         * 
         * <strong>example:</strong>
         * <p>1786586477000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The reason for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>out of stock</p>
         */
        @NameInMap("failReason")
        public String failReason;

        /**
         * <p>The list of GPU instance types.</p>
         */
        @NameInMap("gpuSpec")
        public java.util.List<String> gpuSpec;

        /**
         * <p>The IP whitelist of the workspace.</p>
         */
        @NameInMap("ipWhiteList")
        public java.util.List<String> ipWhiteList;

        /**
         * <p>The unit of the subscription period. This parameter is required for subscription workspaces.</p>
         * 
         * <strong>example:</strong>
         * <p>YEAR, MONTH, WEEK, DAY, HOUR, MINUTE</p>
         */
        @NameInMap("paymentDurationUnit")
        public String paymentDurationUnit;

        /**
         * <p>The payment status.</p>
         * 
         * <strong>example:</strong>
         * <p>PAID/UNPAID</p>
         */
        @NameInMap("paymentStatus")
        public String paymentStatus;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo or Subscription</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The information about the subscription resource quota.</p>
         */
        @NameInMap("prePaidQuota")
        public GetWorkspaceResponseBodyWorkspacePrePaidQuota prePaidQuota;

        /**
         * <p>The list of GPU subscription quotas.</p>
         */
        @NameInMap("prePaidQuotaGpu")
        public java.util.List<GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu> prePaidQuotaGpu;

        /**
         * <p>The name of the RAM role used to execute Spark jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("ramRoleName")
        public String ramRoleName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The reason why the workspace is released.</p>
         * 
         * <strong>example:</strong>
         * <p>stable</p>
         */
        @NameInMap("releaseType")
        public String releaseType;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek4f7uj74wdthi</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The UID of the user who created the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>13*************</p>
         */
        @NameInMap("resourceOwnerId")
        public String resourceOwnerId;

        /**
         * <p>The resource specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cu&quot;: 100}</p>
         */
        @NameInMap("resourceSpec")
        public String resourceSpec;

        /**
         * <p>The information about the workspace status change.</p>
         */
        @NameInMap("stateChangeReason")
        public GetWorkspaceResponseBodyWorkspaceStateChangeReason stateChangeReason;

        /**
         * <p>The OSS path.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-result</p>
         */
        @NameInMap("storage")
        public String storage;

        /**
         * <p>The tag keys.</p>
         */
        @NameInMap("tags")
        public java.util.List<GetWorkspaceResponseBodyWorkspaceTags> tags;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-******</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>Spark batch job workspace-1</p>
         */
        @NameInMap("workspaceName")
        public String workspaceName;

        /**
         * <p>The workspace status.</p>
         * 
         * <strong>example:</strong>
         * <p>STARTING,RUNNING,TERMINATED</p>
         */
        @NameInMap("workspaceStatus")
        public String workspaceStatus;

        public static GetWorkspaceResponseBodyWorkspace build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyWorkspace self = new GetWorkspaceResponseBodyWorkspace();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyWorkspace setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public GetWorkspaceResponseBodyWorkspace setAutoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public GetWorkspaceResponseBodyWorkspace setAutoRenewPeriodUnit(String autoRenewPeriodUnit) {
            this.autoRenewPeriodUnit = autoRenewPeriodUnit;
            return this;
        }
        public String getAutoRenewPeriodUnit() {
            return this.autoRenewPeriodUnit;
        }

        public GetWorkspaceResponseBodyWorkspace setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetWorkspaceResponseBodyWorkspace setDlfCatalogId(String dlfCatalogId) {
            this.dlfCatalogId = dlfCatalogId;
            return this;
        }
        public String getDlfCatalogId() {
            return this.dlfCatalogId;
        }

        public GetWorkspaceResponseBodyWorkspace setDlfType(String dlfType) {
            this.dlfType = dlfType;
            return this;
        }
        public String getDlfType() {
            return this.dlfType;
        }

        public GetWorkspaceResponseBodyWorkspace setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetWorkspaceResponseBodyWorkspace setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetWorkspaceResponseBodyWorkspace setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public GetWorkspaceResponseBodyWorkspace setGpuSpec(java.util.List<String> gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public java.util.List<String> getGpuSpec() {
            return this.gpuSpec;
        }

        public GetWorkspaceResponseBodyWorkspace setIpWhiteList(java.util.List<String> ipWhiteList) {
            this.ipWhiteList = ipWhiteList;
            return this;
        }
        public java.util.List<String> getIpWhiteList() {
            return this.ipWhiteList;
        }

        public GetWorkspaceResponseBodyWorkspace setPaymentDurationUnit(String paymentDurationUnit) {
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }
        public String getPaymentDurationUnit() {
            return this.paymentDurationUnit;
        }

        public GetWorkspaceResponseBodyWorkspace setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        public GetWorkspaceResponseBodyWorkspace setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public GetWorkspaceResponseBodyWorkspace setPrePaidQuota(GetWorkspaceResponseBodyWorkspacePrePaidQuota prePaidQuota) {
            this.prePaidQuota = prePaidQuota;
            return this;
        }
        public GetWorkspaceResponseBodyWorkspacePrePaidQuota getPrePaidQuota() {
            return this.prePaidQuota;
        }

        public GetWorkspaceResponseBodyWorkspace setPrePaidQuotaGpu(java.util.List<GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu> prePaidQuotaGpu) {
            this.prePaidQuotaGpu = prePaidQuotaGpu;
            return this;
        }
        public java.util.List<GetWorkspaceResponseBodyWorkspacePrePaidQuotaGpu> getPrePaidQuotaGpu() {
            return this.prePaidQuotaGpu;
        }

        public GetWorkspaceResponseBodyWorkspace setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public GetWorkspaceResponseBodyWorkspace setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetWorkspaceResponseBodyWorkspace setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public GetWorkspaceResponseBodyWorkspace setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetWorkspaceResponseBodyWorkspace setResourceOwnerId(String resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public GetWorkspaceResponseBodyWorkspace setResourceSpec(String resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public String getResourceSpec() {
            return this.resourceSpec;
        }

        public GetWorkspaceResponseBodyWorkspace setStateChangeReason(GetWorkspaceResponseBodyWorkspaceStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }
        public GetWorkspaceResponseBodyWorkspaceStateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        public GetWorkspaceResponseBodyWorkspace setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public String getStorage() {
            return this.storage;
        }

        public GetWorkspaceResponseBodyWorkspace setTags(java.util.List<GetWorkspaceResponseBodyWorkspaceTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetWorkspaceResponseBodyWorkspaceTags> getTags() {
            return this.tags;
        }

        public GetWorkspaceResponseBodyWorkspace setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetWorkspaceResponseBodyWorkspace setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public GetWorkspaceResponseBodyWorkspace setWorkspaceStatus(String workspaceStatus) {
            this.workspaceStatus = workspaceStatus;
            return this;
        }
        public String getWorkspaceStatus() {
            return this.workspaceStatus;
        }

    }

}
