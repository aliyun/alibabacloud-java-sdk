// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SaveDataServiceApiTestResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    @NameInMap("AutoGenerate")
    public Boolean autoGenerate;

    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ResultSample")
    public String resultSample;

    public static SaveDataServiceApiTestResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDataServiceApiTestResultRequest self = new SaveDataServiceApiTestResultRequest();
        return TeaModel.build(map, self);
    }

    public SaveDataServiceApiTestResultRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public SaveDataServiceApiTestResultRequest setAutoGenerate(Boolean autoGenerate) {
        this.autoGenerate = autoGenerate;
        return this;
    }
    public Boolean getAutoGenerate() {
        return this.autoGenerate;
    }

    public SaveDataServiceApiTestResultRequest setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public SaveDataServiceApiTestResultRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SaveDataServiceApiTestResultRequest setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

}
