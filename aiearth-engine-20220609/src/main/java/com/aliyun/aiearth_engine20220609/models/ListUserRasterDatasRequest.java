// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListUserRasterDatasRequest extends TeaModel {
    // 采集日期
    @NameInMap("AcquisitionDate")
    public String acquisitionDate;

    // 来源类型，个人上传：personal，任务结果：result
    @NameInMap("FromType")
    public String fromType;

    // 名称
    @NameInMap("Name")
    public String name;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 分辨率
    @NameInMap("Resolution")
    public Double resolution;

    // 上传日期
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
