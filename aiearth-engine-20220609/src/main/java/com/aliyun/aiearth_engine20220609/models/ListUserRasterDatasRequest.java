// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListUserRasterDatasRequest extends TeaModel {
    @NameInMap("AcquisitionDate")
    public String acquisitionDate;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("FromType")
    public String fromType;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Resolution")
    public Double resolution;

    @NameInMap("UploadDate")
    public String uploadDate;

    public static ListUserRasterDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserRasterDatasRequest self = new ListUserRasterDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListUserRasterDatasRequest setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
        return this;
    }
    public String getAcquisitionDate() {
        return this.acquisitionDate;
    }

    public ListUserRasterDatasRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListUserRasterDatasRequest setFromType(String fromType) {
        this.fromType = fromType;
        return this;
    }
    public String getFromType() {
        return this.fromType;
    }

    public ListUserRasterDatasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListUserRasterDatasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserRasterDatasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserRasterDatasRequest setResolution(Double resolution) {
        this.resolution = resolution;
        return this;
    }
    public Double getResolution() {
        return this.resolution;
    }

    public ListUserRasterDatasRequest setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
        return this;
    }
    public String getUploadDate() {
        return this.uploadDate;
    }

}
