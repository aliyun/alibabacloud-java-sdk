// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppImageRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppUid")
    public String appUid;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("ImageUid")
    public String imageUid;

    @NameInMap("Os")
    public String os;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionIdList")
    public java.util.List<String> regionIdList;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("WillDistribute")
    public Boolean willDistribute;

    public static ListAppImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppImageRequest self = new ListAppImageRequest();
        return TeaModel.build(map, self);
    }

    public ListAppImageRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppImageRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public ListAppImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ListAppImageRequest setImageUid(String imageUid) {
        this.imageUid = imageUid;
        return this;
    }
    public String getImageUid() {
        return this.imageUid;
    }

    public ListAppImageRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ListAppImageRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListAppImageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppImageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppImageRequest setRegionIdList(java.util.List<String> regionIdList) {
        this.regionIdList = regionIdList;
        return this;
    }
    public java.util.List<String> getRegionIdList() {
        return this.regionIdList;
    }

    public ListAppImageRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListAppImageRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ListAppImageRequest setWillDistribute(Boolean willDistribute) {
        this.willDistribute = willDistribute;
        return this;
    }
    public Boolean getWillDistribute() {
        return this.willDistribute;
    }

}
