// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAIStudioRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the virtual studio template that you want to query. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>dbe61b87-db9a-448f-8757-a875edb3f944</p>
     */
    @NameInMap("StudioId")
    public String studioId;

    /**
     * <p>The name of the virtual studio template.</p>
     * 
     * <strong>example:</strong>
     * <p>sub02</p>
     */
    @NameInMap("StudioName")
    public String studioName;

    public static DescribeLiveAIStudioRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAIStudioRequest self = new DescribeLiveAIStudioRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAIStudioRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveAIStudioRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLiveAIStudioRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveAIStudioRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveAIStudioRequest setStudioId(String studioId) {
        this.studioId = studioId;
        return this;
    }
    public String getStudioId() {
        return this.studioId;
    }

    public DescribeLiveAIStudioRequest setStudioName(String studioName) {
        this.studioName = studioName;
        return this;
    }
    public String getStudioName() {
        return this.studioName;
    }

}
