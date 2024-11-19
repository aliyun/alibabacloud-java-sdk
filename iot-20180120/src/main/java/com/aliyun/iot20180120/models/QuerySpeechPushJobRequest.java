// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-060*****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>tBUm***********************QPGT</p>
     */
    @NameInMap("JobCode")
    public String jobCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageId")
    public Integer pageId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0Ykj************************Av0I</p>
     */
    @NameInMap("ProjectCode")
    public String projectCode;

    /**
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("PushMode")
    public String pushMode;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
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
