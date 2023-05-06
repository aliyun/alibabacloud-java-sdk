// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListImageByAppIdRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("ImageId")
    public Long imageId;

    @NameInMap("Number")
    public Long number;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("VersionName")
    public String versionName;

    public static ListImageByAppIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageByAppIdRequest self = new ListImageByAppIdRequest();
        return TeaModel.build(map, self);
    }

    public ListImageByAppIdRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ListImageByAppIdRequest setImageId(Long imageId) {
        this.imageId = imageId;
        return this;
    }
    public Long getImageId() {
        return this.imageId;
    }

    public ListImageByAppIdRequest setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public ListImageByAppIdRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListImageByAppIdRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListImageByAppIdRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
