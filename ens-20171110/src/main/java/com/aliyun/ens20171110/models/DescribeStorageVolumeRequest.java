// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeStorageVolumeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen-3</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <strong>example:</strong>
     * <p>sgw-****</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsEnable")
    public Integer isEnable;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>d-***</p>
     */
    @NameInMap("StorageId")
    public String storageId;

    /**
     * <strong>example:</strong>
     * <p>sv-***</p>
     */
    @NameInMap("VolumeId")
    public String volumeId;

    public static DescribeStorageVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageVolumeRequest self = new DescribeStorageVolumeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStorageVolumeRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeStorageVolumeRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeStorageVolumeRequest setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public Integer getIsEnable() {
        return this.isEnable;
    }

    public DescribeStorageVolumeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageVolumeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageVolumeRequest setStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }
    public String getStorageId() {
        return this.storageId;
    }

    public DescribeStorageVolumeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    public String getVolumeId() {
        return this.volumeId;
    }

}
