// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetLogSampleRequest extends TeaModel {
    @NameInMap("AppField")
    public String appField;

    @NameInMap("AppValue")
    public String appValue;

    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("LogField")
    public String logField;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetLogSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogSampleRequest self = new GetLogSampleRequest();
        return TeaModel.build(map, self);
    }

    public GetLogSampleRequest setAppField(String appField) {
        this.appField = appField;
        return this;
    }
    public String getAppField() {
        return this.appField;
    }

    public GetLogSampleRequest setAppValue(String appValue) {
        this.appValue = appValue;
        return this;
    }
    public String getAppValue() {
        return this.appValue;
    }

    public GetLogSampleRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public GetLogSampleRequest setLogField(String logField) {
        this.logField = logField;
        return this;
    }
    public String getLogField() {
        return this.logField;
    }

    public GetLogSampleRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
