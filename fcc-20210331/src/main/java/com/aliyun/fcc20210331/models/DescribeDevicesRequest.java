// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DescribeDevicesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("IsvId")
    public String isvId;

    public static DescribeDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesRequest self = new DescribeDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDevicesRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public DescribeDevicesRequest setIsvId(String isvId) {
        this.isvId = isvId;
        return this;
    }
    public String getIsvId() {
        return this.isvId;
    }

}
