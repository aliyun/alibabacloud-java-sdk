// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class StartTaskForDistributeImageRequest extends TeaModel {
    /**
     * <p>The regions to which you want to replicate the image.</p>
     */
    @NameInMap("DestinationRegionList")
    public java.util.List<String> destinationRegionList;

    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-07jyldnd9i*****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The product type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudDesktop: Elastic Desktop Service</li>
     * <li>CloudApp: App Streaming</li>
     * <li>WuyingServer: Workstation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>This parameter is not publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>RETRY</p>
     */
    @NameInMap("RetryType")
    public String retryType;

    /**
     * <p>The region where the source image is located. If you leave this parameter empty, a random region is selected.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The ID of the image version. If you do not specify this parameter, the latest image version is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>iv-07jyldnd9i****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static StartTaskForDistributeImageRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTaskForDistributeImageRequest self = new StartTaskForDistributeImageRequest();
        return TeaModel.build(map, self);
    }

    public StartTaskForDistributeImageRequest setDestinationRegionList(java.util.List<String> destinationRegionList) {
        this.destinationRegionList = destinationRegionList;
        return this;
    }
    public java.util.List<String> getDestinationRegionList() {
        return this.destinationRegionList;
    }

    public StartTaskForDistributeImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public StartTaskForDistributeImageRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public StartTaskForDistributeImageRequest setRetryType(String retryType) {
        this.retryType = retryType;
        return this;
    }
    public String getRetryType() {
        return this.retryType;
    }

    public StartTaskForDistributeImageRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public StartTaskForDistributeImageRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
