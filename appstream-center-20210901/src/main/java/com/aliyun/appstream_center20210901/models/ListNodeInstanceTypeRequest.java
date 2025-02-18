// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListNodeInstanceTypeRequest extends TeaModel {
    /**
     * <p>The ID of the region where the resource resides. For information about the supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cn-shanghai: China (Shanghai)</li>
     * <li>cn-hangzhou: China (Hangzhou)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("Cpu")
    public Float cpu;

    @NameInMap("Gpu")
    public Float gpu;

    @NameInMap("GpuMemory")
    public Integer gpuMemory;

    /**
     * <p>The language that you want to use.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>en-US: English (US)</li>
     * <li>zh-CN: Simplified Chinese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The resource type that you want to query. If you do not configure this parameter, all resource types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.vgpu.4c8g.2g</p>
     */
    @NameInMap("NodeInstanceType")
    public String nodeInstanceType;

    @NameInMap("NodeInstanceTypeFamily")
    public String nodeInstanceTypeFamily;

    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The operating system that is supported.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>Windows: the Windows operating system</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SortType")
    public String sortType;

    public static ListNodeInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInstanceTypeRequest self = new ListNodeInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeInstanceTypeRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ListNodeInstanceTypeRequest setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public ListNodeInstanceTypeRequest setGpu(Float gpu) {
        this.gpu = gpu;
        return this;
    }
    public Float getGpu() {
        return this.gpu;
    }

    public ListNodeInstanceTypeRequest setGpuMemory(Integer gpuMemory) {
        this.gpuMemory = gpuMemory;
        return this;
    }
    public Integer getGpuMemory() {
        return this.gpuMemory;
    }

    public ListNodeInstanceTypeRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListNodeInstanceTypeRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public ListNodeInstanceTypeRequest setNodeInstanceType(String nodeInstanceType) {
        this.nodeInstanceType = nodeInstanceType;
        return this;
    }
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    public ListNodeInstanceTypeRequest setNodeInstanceTypeFamily(String nodeInstanceTypeFamily) {
        this.nodeInstanceTypeFamily = nodeInstanceTypeFamily;
        return this;
    }
    public String getNodeInstanceTypeFamily() {
        return this.nodeInstanceTypeFamily;
    }

    public ListNodeInstanceTypeRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListNodeInstanceTypeRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListNodeInstanceTypeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodeInstanceTypeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodeInstanceTypeRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListNodeInstanceTypeRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

}
