// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListUserVectorDatasRequest extends TeaModel {
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

    // 上传日期
    @NameInMap("UploadDate")
    public String uploadDate;

    public static ListUserVectorDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserVectorDatasRequest self = new ListUserVectorDatasRequest();
        return TeaModel.build(map, self);
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
