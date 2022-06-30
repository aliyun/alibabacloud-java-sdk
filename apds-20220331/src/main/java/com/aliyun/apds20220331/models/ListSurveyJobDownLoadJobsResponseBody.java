// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyJobDownLoadJobsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("error")
    public String error;

    public static ListSurveyJobDownLoadJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyJobDownLoadJobsResponseBody self = new ListSurveyJobDownLoadJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSurveyJobDownLoadJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSurveyJobDownLoadJobsResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ListSurveyJobDownLoadJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSurveyJobDownLoadJobsResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

}
