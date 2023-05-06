// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppGroupImagesRequest extends TeaModel {
    @NameInMap("AppGroupName")
    public String appGroupName;

    @NameInMap("AppGroupUid")
    public String appGroupUid;

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

    public static ListAppGroupImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupImagesRequest self = new ListAppGroupImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppGroupImagesRequest setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public ListAppGroupImagesRequest setAppGroupUid(String appGroupUid) {
        this.appGroupUid = appGroupUid;
        return this;
    }
    public String getAppGroupUid() {
        return this.appGroupUid;
    }

    public ListAppGroupImagesRequest setImageUid(String imageUid) {
        this.imageUid = imageUid;
        return this;
    }
    public String getImageUid() {
        return this.imageUid;
    }

    public ListAppGroupImagesRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ListAppGroupImagesRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListAppGroupImagesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAppGroupImagesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppGroupImagesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListAppGroupImagesRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ListAppGroupImagesRequest setWillDistribute(Boolean willDistribute) {
        this.willDistribute = willDistribute;
        return this;
    }
    public Boolean getWillDistribute() {
        return this.willDistribute;
    }

}
