// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppImageShrinkRequest extends TeaModel {
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
    public String regionIdListShrink;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("WillDistribute")
    public Boolean willDistribute;

    public static ListAppImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppImageShrinkRequest self = new ListAppImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAppImageShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppImageShrinkRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public ListAppImageShrinkRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ListAppImageShrinkRequest setImageUid(String imageUid) {
        this.imageUid = imageUid;
        return this;
    }
    public String getImageUid() {
        return this.imageUid;
    }

    public ListAppImageShrinkRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ListAppImageShrinkRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListAppImageShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppImageShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppImageShrinkRequest setRegionIdListShrink(String regionIdListShrink) {
        this.regionIdListShrink = regionIdListShrink;
        return this;
    }
    public String getRegionIdListShrink() {
        return this.regionIdListShrink;
    }

    public ListAppImageShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListAppImageShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ListAppImageShrinkRequest setWillDistribute(Boolean willDistribute) {
        this.willDistribute = willDistribute;
        return this;
    }
    public Boolean getWillDistribute() {
        return this.willDistribute;
    }

}
