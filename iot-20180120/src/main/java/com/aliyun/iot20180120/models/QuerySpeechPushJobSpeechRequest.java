// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobSpeechRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobCode")
    public String jobCode;

    @NameInMap("PageId")
    public Integer pageId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QuerySpeechPushJobSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobSpeechRequest self = new QuerySpeechPushJobSpeechRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobSpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySpeechPushJobSpeechRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public QuerySpeechPushJobSpeechRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySpeechPushJobSpeechRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
