// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetAppVersionsRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>V-Ray</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The image source. Valid values:</p>
     * <ul>
     * <li><p>Public: public images provided by Alibaba Cloud.</p>
     * </li>
     * <li><p>Custom: custom images added by you.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("ImageCategory")
    public String imageCategory;

    /**
     * <p>The image type. Valid values:</p>
     * <ul>
     * <li><p>VM: virtual machine images.</p>
     * </li>
     * <li><p>Container: container images.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VM</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static GetAppVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppVersionsRequest self = new GetAppVersionsRequest();
        return TeaModel.build(map, self);
    }

    public GetAppVersionsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppVersionsRequest setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
    }

    public GetAppVersionsRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public GetAppVersionsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetAppVersionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
