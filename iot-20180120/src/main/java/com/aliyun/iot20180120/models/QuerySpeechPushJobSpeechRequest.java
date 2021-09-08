// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobSpeechRequest extends TeaModel {
    @NameInMap("JobCode")
    public String jobCode;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageId")
    public Integer pageId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QuerySpeechPushJobSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobSpeechRequest self = new QuerySpeechPushJobSpeechRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobSpeechRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public QuerySpeechPushJobSpeechRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySpeechPushJobSpeechRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySpeechPushJobSpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
