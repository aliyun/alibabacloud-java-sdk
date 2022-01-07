// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobCode")
    public String jobCode;

    @NameInMap("PageId")
    public Integer pageId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectCode")
    public String projectCode;

    @NameInMap("PushMode")
    public String pushMode;

    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    public static QuerySpeechPushJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobRequest self = new QuerySpeechPushJobRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySpeechPushJobRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public QuerySpeechPushJobRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySpeechPushJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySpeechPushJobRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public QuerySpeechPushJobRequest setPushMode(String pushMode) {
        this.pushMode = pushMode;
        return this;
    }
    public String getPushMode() {
        return this.pushMode;
    }

    public QuerySpeechPushJobRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
