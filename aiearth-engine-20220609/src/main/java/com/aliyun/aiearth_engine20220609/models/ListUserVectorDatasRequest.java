// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListUserVectorDatasRequest extends TeaModel {
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

    @NameInMap("UploadDate")
    public String uploadDate;

    public static ListUserVectorDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserVectorDatasRequest self = new ListUserVectorDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListUserVectorDatasRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListUserVectorDatasRequest setFromType(String fromType) {
        this.fromType = fromType;
        return this;
    }
    public String getFromType() {
        return this.fromType;
    }

    public ListUserVectorDatasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListUserVectorDatasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserVectorDatasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserVectorDatasRequest setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
        return this;
    }
    public String getUploadDate() {
        return this.uploadDate;
    }

}
