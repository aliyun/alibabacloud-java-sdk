// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAvailableImagesResponseBody extends TeaModel {
    /**
     * <p>The information about the images.</p>
     */
    @NameInMap("Images")
    public java.util.List<ListAvailableImagesResponseBodyImages> images;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListAvailableImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableImagesResponseBody self = new ListAvailableImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableImagesResponseBody setImages(java.util.List<ListAvailableImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListAvailableImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public ListAvailableImagesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAvailableImagesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAvailableImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableImagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAvailableImagesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListAvailableImagesResponseBodyImages extends TeaModel {
        /**
         * <p>The OS architecture of the image. Valid values:</p>
         * <ul>
         * <li>x86_64</li>
         * <li>arm64</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The boot mode of the image. Valid values:</p>
         * <ul>
         * <li>BIOS: Basic Input/Output System (BIOS)</li>
         * <li>UEFI: Unified Extensible Firmware Interface (UEFI)</li>
         * </ul>
         * <blockquote>
         * <p> When you change the OS boot mode of an instance, you must make sure that the boot mode matches the boot mode of the associated image. Otherwise, the instance fails to be booted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>BIOS</p>
         */
        @NameInMap("BootMode")
        public String bootMode;

        /**
         * <p>The image description.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_06_64_20G_alibase_2019071****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>CHESS5V5.0.27</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The image source. Valid values:</p>
         * <ul>
         * <li>system: system images</li>
         * <li>self: custom images</li>
         * <li>others: shared images</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>self</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The OS name in Chinese.</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <p>The OS name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS  7.9 64 bit</p>
         */
        @NameInMap("OSNameEn")
        public String OSNameEn;

        /**
         * <p>The OS. Valid values:</p>
         * <ul>
         * <li>CentOS</li>
         * <li>windows</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The image size. Unit: GiB</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public String size;

        public static ListAvailableImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableImagesResponseBodyImages self = new ListAvailableImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListAvailableImagesResponseBodyImages setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListAvailableImagesResponseBodyImages setBootMode(String bootMode) {
            this.bootMode = bootMode;
            return this;
        }
        public String getBootMode() {
            return this.bootMode;
        }

        public ListAvailableImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAvailableImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListAvailableImagesResponseBodyImages setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListAvailableImagesResponseBodyImages setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListAvailableImagesResponseBodyImages setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public ListAvailableImagesResponseBodyImages setOSNameEn(String OSNameEn) {
            this.OSNameEn = OSNameEn;
            return this;
        }
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        public ListAvailableImagesResponseBodyImages setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListAvailableImagesResponseBodyImages setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}
