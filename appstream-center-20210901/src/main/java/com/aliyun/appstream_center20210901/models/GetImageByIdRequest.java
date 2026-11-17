// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetImageByIdRequest extends TeaModel {
    /**
     * <p>The ID of the business region to query. If this parameter is not specified, regions are not filtered by this parameter. The returned regions are still subject to the visibility scope of the product and the account.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>Specifies whether to skip the operating system and adaptation status filtering for adapted applications. Default value: false. A value of false indicates that only applications whose operating system matches the image and whose adaptation is complete are retained. A value of true indicates that these two filters are skipped. Application type filtering is still controlled by the API and ShowHidden.</p>
     */
    @NameInMap("IgnoreFilter")
    public Boolean ignoreFilter;

    /**
     * <p>The image ID. You must specify at least one of ImageId and VersionId. If only this parameter is specified, the online version is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-bp1example****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The product type, such as CloudDesktop (Cloud Desktop), CloudApp (Cloud App), or WuyingServer (WUYING Workspace Enterprise Edition workstation).</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The types of virtual applications to include in addition to the default user applications and system applications. Valid values:</p>
     * <ul>
     * <li>VIRTUAL_DESKTOP_APP: desktop virtual applications.</li>
     * <li>ALL_VIRTUAL_APP: all virtual applications.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VIRTUAL_DESKTOP_APP</p>
     */
    @NameInMap("ShowHidden")
    public String showHidden;

    /**
     * <p>The image version ID. You can specify this parameter alone to query a specific version. If both ImageId and VersionId are specified, the version must belong to the specified image.</p>
     * 
     * <strong>example:</strong>
     * <p>iv-xxx</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static GetImageByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageByIdRequest self = new GetImageByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetImageByIdRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public GetImageByIdRequest setIgnoreFilter(Boolean ignoreFilter) {
        this.ignoreFilter = ignoreFilter;
        return this;
    }
    public Boolean getIgnoreFilter() {
        return this.ignoreFilter;
    }

    public GetImageByIdRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetImageByIdRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetImageByIdRequest setShowHidden(String showHidden) {
        this.showHidden = showHidden;
        return this;
    }
    public String getShowHidden() {
        return this.showHidden;
    }

    public GetImageByIdRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
