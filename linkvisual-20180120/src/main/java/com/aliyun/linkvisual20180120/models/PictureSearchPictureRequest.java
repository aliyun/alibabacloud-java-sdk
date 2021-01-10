// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class PictureSearchPictureRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("SearchPicUrl")
    public String searchPicUrl;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Threshold")
    public Float threshold;

    @NameInMap("ContainPicUrl")
    public Boolean containPicUrl;

    public static PictureSearchPictureRequest build(java.util.Map<String, ?> map) throws Exception {
        PictureSearchPictureRequest self = new PictureSearchPictureRequest();
        return TeaModel.build(map, self);
    }

    public PictureSearchPictureRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public PictureSearchPictureRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public PictureSearchPictureRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public PictureSearchPictureRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PictureSearchPictureRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public PictureSearchPictureRequest setSearchPicUrl(String searchPicUrl) {
        this.searchPicUrl = searchPicUrl;
        return this;
    }
    public String getSearchPicUrl() {
        return this.searchPicUrl;
    }

    public PictureSearchPictureRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public PictureSearchPictureRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public PictureSearchPictureRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public PictureSearchPictureRequest setContainPicUrl(Boolean containPicUrl) {
        this.containPicUrl = containPicUrl;
        return this;
    }
    public Boolean getContainPicUrl() {
        return this.containPicUrl;
    }

}
