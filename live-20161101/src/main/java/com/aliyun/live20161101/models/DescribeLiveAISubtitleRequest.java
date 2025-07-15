// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAISubtitleRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the default subtitle template. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * <p>**</p>
     * <p>**Note **The default template includes the built-in parameter configurations. You can specify the copyFrom parameter when you call the AddLiveAISubtitle operation to use the default template.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Valid values: [1,100].</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Valid values: [1,100].</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the subtitle template.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("SubtitleId")
    public String subtitleId;

    /**
     * <p>The name of the subtitle template. The name can contain only digits, letters, and hyphens (-). The name cannot start with a hyphen.</p>
     * 
     * <strong>example:</strong>
     * <p>sub01</p>
     */
    @NameInMap("SubtitleName")
    public String subtitleName;

    public static DescribeLiveAISubtitleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAISubtitleRequest self = new DescribeLiveAISubtitleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAISubtitleRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeLiveAISubtitleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveAISubtitleRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLiveAISubtitleRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveAISubtitleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveAISubtitleRequest setSubtitleId(String subtitleId) {
        this.subtitleId = subtitleId;
        return this;
    }
    public String getSubtitleId() {
        return this.subtitleId;
    }

    public DescribeLiveAISubtitleRequest setSubtitleName(String subtitleName) {
        this.subtitleName = subtitleName;
        return this;
    }
    public String getSubtitleName() {
        return this.subtitleName;
    }

}
