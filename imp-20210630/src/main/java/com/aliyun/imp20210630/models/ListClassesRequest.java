// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListClassesRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 查询页码，从1开始，传空默认查询第1页。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页显示个数，最大支持50，参数为空默认显示个数为10。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 课程状态，0-未开课 1-上课中 2-已下课，不传则返回所有课程。
    @NameInMap("Status")
    public Integer status;

    public static ListClassesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClassesRequest self = new ListClassesRequest();
        return TeaModel.build(map, self);
    }

    public ListClassesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListClassesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClassesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClassesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
