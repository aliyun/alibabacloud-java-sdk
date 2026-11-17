// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListImageBaseInfoRequest extends TeaModel {
    /**
     * <p>The business line code. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The image ID. You can specify multiple IDs separated by commas (,). The query matches any of the specified IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The keyword for querying images. Fuzzy matching is performed on both the image name and the image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The image type. Valid values: System (system image), User (custom image), Shared (shared image), and Community (community image).</p>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The image operating system type. Valid values: Windows (Windows operating system), Linux (Linux operating system), Android (Android operating system), and Unknown (unknown operating system).</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The image package type. Valid values: Ecs (ECS image), Vhd (VHD image), Container (container image), Ecs_Container (ECS and container combined image), and K8s_Node (Kubernetes node image).</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The page number of the page to return. Pages start from page 1. If you do not specify this parameter or specify a value less than 1, the first page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100. If the value is less than 1, 10 is used. If the value is greater than 100, 100 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type, used to filter the products to which the images belong. Examples: CloudDesktop (WUYING Workspace), CloudApp (WUYING Cloud App), and WuyingServer (WUYING Workstation).</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The image protocol type. Valid values: ASP (Alibaba Cloud proprietary ASP protocol) and HDX (HDX protocol).</p>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The image status. Valid values: INIT (initializing), CREATING (creating), AVAILABLE (available), and CREATE_FAILED (creation failed). If you do not specify this parameter, all non-deleted images are queried. Deleted images are not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListImageBaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageBaseInfoRequest self = new ListImageBaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListImageBaseInfoRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListImageBaseInfoRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ListImageBaseInfoRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ListImageBaseInfoRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public ListImageBaseInfoRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListImageBaseInfoRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public ListImageBaseInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListImageBaseInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImageBaseInfoRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListImageBaseInfoRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public ListImageBaseInfoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
