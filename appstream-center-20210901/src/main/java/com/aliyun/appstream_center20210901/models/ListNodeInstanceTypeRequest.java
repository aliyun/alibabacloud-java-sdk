// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListNodeInstanceTypeRequest extends TeaModel {
    /**
     * <p>The region ID of the resource. For more information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cpu")
    public Float cpu;

    /**
     * <p>The number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Gpu")
    public Float gpu;

    /**
     * <p>The GPU memory size. This parameter is meaningful only for GPU-accelerated cloud desktops. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("GpuMemory")
    public Integer gpuMemory;

    @NameInMap("InstanceTypeForModify")
    public String instanceTypeForModify;

    /**
     * <p>The language type.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The memory size. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The resource specification type to query. If you leave this parameter empty, all specification types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.vgpu.4c8g.2g</p>
     */
    @NameInMap("NodeInstanceType")
    public String nodeInstanceType;

    /**
     * <p>The instance family.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.vgpu</p>
     */
    @NameInMap("NodeInstanceTypeFamily")
    public String nodeInstanceTypeFamily;

    /**
     * <p>CPU/Memory.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The supported operating system type.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The page number of the query results to display.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of query results per page. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>DESC/ASC.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
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

    public ListNodeInstanceTypeRequest setInstanceTypeForModify(String instanceTypeForModify) {
        this.instanceTypeForModify = instanceTypeForModify;
        return this;
    }
    public String getInstanceTypeForModify() {
        return this.instanceTypeForModify;
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

    public ListNodeInstanceTypeRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
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
