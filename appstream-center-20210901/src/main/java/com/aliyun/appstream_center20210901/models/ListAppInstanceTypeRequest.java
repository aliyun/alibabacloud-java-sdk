// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstanceTypeRequest extends TeaModel {
    /**
     * <p>The application image ID. The current session instance type query does not filter based on this parameter. Omit this parameter. Do not infer image compatibility based on whether this parameter is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>img-8z4nztpaqvay4****</p>
     */
    @NameInMap("AppCenterImageId")
    public String appCenterImageId;

    /**
     * <p>The session instance type code. Exact match is performed based on the complete code. If this parameter and <code>AppInstanceTypeList</code> are specified at the same time, the results are filtered by intersection. You can perform a conditional query without this condition first, and then select the returned codes.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.vgpu.4c8g</p>
     */
    @NameInMap("AppInstanceType")
    public String appInstanceType;

    /**
     * <p>The instance type family code. Exact match is performed based on the complete code. Use the instance type family value from the query results. Do not extract it from the instance type name.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6</p>
     */
    @NameInMap("AppInstanceTypeFamily")
    public String appInstanceTypeFamily;

    /**
     * <p>The list of session instance type codes. A maximum of 100 items are supported. This parameter takes effect by intersection with other filtering conditions. If this parameter and <code>AppInstanceType</code> are specified at the same time, the results must also match the single code.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AppInstanceTypeList")
    public java.util.List<String> appInstanceTypeList;

    /**
     * <p>The business region ID. If this parameter is omitted, the region of the current request is used. The available instance types may vary by region and account. You can call the <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListRegions">ListRegions</a> operation to obtain the business region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The instance type category filtering condition. If this parameter is omitted, no category filtering condition is added. Valid values:</p>
     * <ul>
     * <li><code>Cpu</code>: CPU instance type.</li>
     * <li><code>Gpu</code>: GPU instance type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Gpu</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The billing method used to filter available instance types. If this parameter is omitted, no billing method condition is added. Valid values:</p>
     * <ul>
     * <li><code>PrePaid</code>: subscription.</li>
     * <li><code>PostPaid</code>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of CPU cores for exact filtering. Use a decimal numeric string. Unit: cores. If this parameter is omitted, the number of CPU cores is not limited.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Cpu")
    public String cpu;

    /**
     * <p>The GPU memory capacity for exact filtering. Unit: MB. If this parameter is omitted, the GPU memory capacity is not limited.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("GpuMemory")
    public Integer gpuMemory;

    /**
     * <p>The language of the instance type name.</p>
     * <ul>
     * <li><code>zh-CN</code>: Use the Chinese name of the instance type.</li>
     * <li>Other values or omitted: Use the instance type code as the name.</li>
     * </ul>
     * <p>This parameter only affects the display of <code>InstanceTypeName</code> and does not change the instance type code.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The memory capacity for exact filtering. Unit: MB. If this parameter is omitted, the memory capacity is not limited.</p>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The operating system type. In the Wuying Cloud Application (CloudApp) scenario, set the value to:</p>
     * <ul>
     * <li><code>Windows</code>: Windows operating system.</li>
     * </ul>
     * <p>If this parameter is omitted, no operating system filtering condition is added.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The page number. Explicitly specify a page number starting from 1. If this parameter is omitted, the default value 0 is used to query the first batch of results. For subsequent pages, request in the order of 1, 2, and 3.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of instance types returned per page. Unit: entries. Default value: 200. Explicitly set a positive integer that meets your business requirements. The default value here does not represent the maximum value allowed by the service.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. Set the value to the following fixed value when you call this operation:</p>
     * <ul>
     * <li><code>CloudApp</code>: Wuying Cloud Application.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Specifies whether to query the instance type inventory at the same time. Default value: <code>false</code>.</p>
     * <ul>
     * <li><code>true</code>: Queries the inventory and returns InventoryInfo when the inventory information is available.</li>
     * <li><code>false</code>: Queries only the instance types and does not query the inventory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("QueryInventory")
    public Boolean queryInventory;

    public static ListAppInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstanceTypeRequest self = new ListAppInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInstanceTypeRequest setAppCenterImageId(String appCenterImageId) {
        this.appCenterImageId = appCenterImageId;
        return this;
    }
    public String getAppCenterImageId() {
        return this.appCenterImageId;
    }

    public ListAppInstanceTypeRequest setAppInstanceType(String appInstanceType) {
        this.appInstanceType = appInstanceType;
        return this;
    }
    public String getAppInstanceType() {
        return this.appInstanceType;
    }

    public ListAppInstanceTypeRequest setAppInstanceTypeFamily(String appInstanceTypeFamily) {
        this.appInstanceTypeFamily = appInstanceTypeFamily;
        return this;
    }
    public String getAppInstanceTypeFamily() {
        return this.appInstanceTypeFamily;
    }

    public ListAppInstanceTypeRequest setAppInstanceTypeList(java.util.List<String> appInstanceTypeList) {
        this.appInstanceTypeList = appInstanceTypeList;
        return this;
    }
    public java.util.List<String> getAppInstanceTypeList() {
        return this.appInstanceTypeList;
    }

    public ListAppInstanceTypeRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ListAppInstanceTypeRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListAppInstanceTypeRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ListAppInstanceTypeRequest setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public ListAppInstanceTypeRequest setGpuMemory(Integer gpuMemory) {
        this.gpuMemory = gpuMemory;
        return this;
    }
    public Integer getGpuMemory() {
        return this.gpuMemory;
    }

    public ListAppInstanceTypeRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListAppInstanceTypeRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public ListAppInstanceTypeRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListAppInstanceTypeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppInstanceTypeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInstanceTypeRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListAppInstanceTypeRequest setQueryInventory(Boolean queryInventory) {
        this.queryInventory = queryInventory;
        return this;
    }
    public Boolean getQueryInventory() {
        return this.queryInventory;
    }

}
