// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class StartTaskForDistributeImageRequest extends TeaModel {
    @NameInMap("DestinationRegionList")
    public java.util.List<String> destinationRegionList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-07jyldnd9i*****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <strong>example:</strong>
     * <p>RETRY</p>
     */
    @NameInMap("RetryType")
    public String retryType;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
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
