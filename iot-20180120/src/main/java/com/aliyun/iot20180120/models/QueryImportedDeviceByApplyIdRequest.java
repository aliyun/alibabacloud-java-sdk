// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryImportedDeviceByApplyIdRequest extends TeaModel {
    @NameInMap("ApplyId")
    public Long applyId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryImportedDeviceByApplyIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryImportedDeviceByApplyIdRequest self = new QueryImportedDeviceByApplyIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryImportedDeviceByApplyIdRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public QueryImportedDeviceByApplyIdRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryImportedDeviceByApplyIdRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryImportedDeviceByApplyIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
