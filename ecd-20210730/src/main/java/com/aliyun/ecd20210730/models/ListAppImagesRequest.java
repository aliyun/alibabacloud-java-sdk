// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppImagesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppUid")
    public String appUid;

    @NameInMap("ImageUid")
    public String imageUid;

    @NameInMap("Os")
    public String os;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("WillDistribute")
    public Boolean willDistribute;

    public static ListAppImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppImagesRequest self = new ListAppImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppImagesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppImagesRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public ListAppImagesRequest setImageUid(String imageUid) {
        this.imageUid = imageUid;
        return this;
    }
    public String getImageUid() {
        return this.imageUid;
    }

    public ListAppImagesRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ListAppImagesRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListAppImagesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAppImagesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppImagesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListAppImagesRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ListAppImagesRequest setWillDistribute(Boolean willDistribute) {
        this.willDistribute = willDistribute;
        return this;
    }
    public Boolean getWillDistribute() {
        return this.willDistribute;
    }

}
