// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechListRequest extends TeaModel {
    @NameInMap("ProjectCode")
    public String projectCode;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageId")
    public Integer pageId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QuerySpeechListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechListRequest self = new QuerySpeechListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpeechListRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public QuerySpeechListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySpeechListRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySpeechListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
