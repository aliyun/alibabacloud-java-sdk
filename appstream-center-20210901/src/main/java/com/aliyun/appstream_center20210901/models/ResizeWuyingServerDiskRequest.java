// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ResizeWuyingServerDiskRequest extends TeaModel {
    /**
     * <p>The size and specifications of the data cloud disks.</p>
     */
    @NameInMap("DataDiskList")
    public java.util.List<ResizeWuyingServerDiskRequestDataDiskList> dataDiskList;

    /**
     * <p>The product type.</p>
     * 
     * <strong>example:</strong>
     * <p>WuyingServer</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The new size of the system cloud disk, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>220</p>
     */
    @NameInMap("SystemDiskNewSize")
    public Integer systemDiskNewSize;

    /**
     * <p>The ID of the WUYING Workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-0bw2f11****dial</p>
     */
    @NameInMap("WuyingServerId")
    public String wuyingServerId;

    public static ResizeWuyingServerDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeWuyingServerDiskRequest self = new ResizeWuyingServerDiskRequest();
        return TeaModel.build(map, self);
    }

    public ResizeWuyingServerDiskRequest setDataDiskList(java.util.List<ResizeWuyingServerDiskRequestDataDiskList> dataDiskList) {
        this.dataDiskList = dataDiskList;
        return this;
    }
    public java.util.List<ResizeWuyingServerDiskRequestDataDiskList> getDataDiskList() {
        return this.dataDiskList;
    }

    public ResizeWuyingServerDiskRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ResizeWuyingServerDiskRequest setSystemDiskNewSize(Integer systemDiskNewSize) {
        this.systemDiskNewSize = systemDiskNewSize;
        return this;
    }
    public Integer getSystemDiskNewSize() {
        return this.systemDiskNewSize;
    }

    public ResizeWuyingServerDiskRequest setWuyingServerId(String wuyingServerId) {
        this.wuyingServerId = wuyingServerId;
        return this;
    }
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

    public static class ResizeWuyingServerDiskRequestDataDiskList extends TeaModel {
        /**
         * <p>The disk number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DiskNo")
        public String diskNo;

        /**
         * <p>The disk subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_DATA</p>
         */
        @NameInMap("DiskSubType")
        public String diskSubType;

        /**
         * <p>The type of disk data included in the image. By default, the system cloud disk and data cloud disks of the instance are included.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The new size.</p>
         * 
         * <strong>example:</strong>
         * <p>220</p>
         */
        @NameInMap("NewSize")
        public Integer newSize;

        public static ResizeWuyingServerDiskRequestDataDiskList build(java.util.Map<String, ?> map) throws Exception {
            ResizeWuyingServerDiskRequestDataDiskList self = new ResizeWuyingServerDiskRequestDataDiskList();
            return TeaModel.build(map, self);
        }

        public ResizeWuyingServerDiskRequestDataDiskList setDiskNo(String diskNo) {
            this.diskNo = diskNo;
            return this;
        }
        public String getDiskNo() {
            return this.diskNo;
        }

        public ResizeWuyingServerDiskRequestDataDiskList setDiskSubType(String diskSubType) {
            this.diskSubType = diskSubType;
            return this;
        }
        public String getDiskSubType() {
            return this.diskSubType;
        }

        public ResizeWuyingServerDiskRequestDataDiskList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ResizeWuyingServerDiskRequestDataDiskList setNewSize(Integer newSize) {
            this.newSize = newSize;
            return this;
        }
        public Integer getNewSize() {
            return this.newSize;
        }

    }

}
