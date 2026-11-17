// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListImageBaseInfoResponseBody extends TeaModel {
    /**
     * <p>The result code of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of images that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The list of basic image information on the current page.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListImageBaseInfoResponseBodyData> data;

    /**
     * <p>The result message of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number returned as specified in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page as specified in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8737D130-BFD0-5D51-96F6-C08EB1139A25</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates success, and a value of false indicates failure.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListImageBaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageBaseInfoResponseBody self = new ListImageBaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageBaseInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListImageBaseInfoResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListImageBaseInfoResponseBody setData(java.util.List<ListImageBaseInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListImageBaseInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListImageBaseInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListImageBaseInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListImageBaseInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImageBaseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageBaseInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListImageBaseInfoResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the image belongs. A value of 0 indicates a system image.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The business line code to which the image belongs. This corresponds to the BizType request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizType")
        public Integer bizType;

        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The distribution name of the image operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>Ubuntu 22.04 64-bit</p>
         */
        @NameInMap("Distro")
        public String distro;

        /**
         * <p>The time when the image was created. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the image was last updated. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The image ID. The IDs of custom images are generated by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>img-bp13mu****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoImage</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The image type. A value of System indicates a system image, User indicates a custom image, Shared indicates a shared image, and Community indicates a community image.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The ID of the latest sub-version of this image.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("LatestVersionId")
        public String latestVersionId;

        /**
         * <p>The ID of the sub-version currently used to read the main image information for this image.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxxx</p>
         */
        @NameInMap("OnlineVersionId")
        public String onlineVersionId;

        /**
         * <p>The image operating system type. A value of Windows indicates the Windows operating system, Linux indicates the Linux operating system, Android indicates the Android operating system, and Unknown indicates an unknown operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The image package type. A value of Ecs indicates an ECS image, Vhd indicates a VHD image, Container indicates a container image, Ecs_Container indicates an ECS and container combined image, and K8s_Node indicates a Kubernetes node image.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The product type to which the image belongs. Examples: CloudDesktop (WUYING Workspace), CloudApp (WUYING Cloud App), and WuyingServer (WUYING Workstation).</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The image protocol type. A value of ASP indicates the Alibaba Cloud proprietary ASP protocol, and HDX indicates the HDX protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The image status. A value of INIT indicates initializing, CREATING indicates creating, AVAILABLE indicates available, and CREATE_FAILED indicates creation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListImageBaseInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListImageBaseInfoResponseBodyData self = new ListImageBaseInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListImageBaseInfoResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListImageBaseInfoResponseBodyData setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public ListImageBaseInfoResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListImageBaseInfoResponseBodyData setDistro(String distro) {
            this.distro = distro;
            return this;
        }
        public String getDistro() {
            return this.distro;
        }

        public ListImageBaseInfoResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListImageBaseInfoResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListImageBaseInfoResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImageBaseInfoResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListImageBaseInfoResponseBodyData setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public ListImageBaseInfoResponseBodyData setLatestVersionId(String latestVersionId) {
            this.latestVersionId = latestVersionId;
            return this;
        }
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        public ListImageBaseInfoResponseBodyData setOnlineVersionId(String onlineVersionId) {
            this.onlineVersionId = onlineVersionId;
            return this;
        }
        public String getOnlineVersionId() {
            return this.onlineVersionId;
        }

        public ListImageBaseInfoResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListImageBaseInfoResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public ListImageBaseInfoResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListImageBaseInfoResponseBodyData setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListImageBaseInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
