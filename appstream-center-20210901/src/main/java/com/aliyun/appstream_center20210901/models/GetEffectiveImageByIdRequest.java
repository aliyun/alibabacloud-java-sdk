// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetEffectiveImageByIdRequest extends TeaModel {
    /**
     * <p>The ID of the business region to query. If this parameter is not specified, regions are not filtered by this parameter. The returned regions are still constrained by the product type and the visible scope of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The content language of the community image documentation in BCP 47 format, such as zh-CN and en-US. Default value: zh-CN.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ContentLocale")
    public String contentLocale;

    /**
     * <p>Specifies whether to skip filtering based on the operating system and adaptation status of adapted applications. Default value: false. A value of false retains only applications that match the image operating system and have completed adaptation. A value of true skips these two filters. Application type filtering is still controlled by the API operation and the ShowHidden parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IgnoreFilter")
    public Boolean ignoreFilter;

    /**
     * <p>The image ID. This parameter is required when querying effective versions.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-bp1example****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image type. Valid values:</p>
     * <ul>
     * <li>System: system images.</li>
     * <li>User: custom images.</li>
     * <li>Shared: shared images.</li>
     * <li>Community: community images.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The product type, such as CloudDesktop (Cloud Desktop), CloudApp (Cloud App), and WuyingServer (workstation).</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Specifies the additional virtual application types to include in the response besides the default user and system applications. Valid values:</p>
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

    public static GetEffectiveImageByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEffectiveImageByIdRequest self = new GetEffectiveImageByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetEffectiveImageByIdRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public GetEffectiveImageByIdRequest setContentLocale(String contentLocale) {
        this.contentLocale = contentLocale;
        return this;
    }
    public String getContentLocale() {
        return this.contentLocale;
    }

    public GetEffectiveImageByIdRequest setIgnoreFilter(Boolean ignoreFilter) {
        this.ignoreFilter = ignoreFilter;
        return this;
    }
    public Boolean getIgnoreFilter() {
        return this.ignoreFilter;
    }

    public GetEffectiveImageByIdRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetEffectiveImageByIdRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public GetEffectiveImageByIdRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetEffectiveImageByIdRequest setShowHidden(String showHidden) {
        this.showHidden = showHidden;
        return this;
    }
    public String getShowHidden() {
        return this.showHidden;
    }

}
