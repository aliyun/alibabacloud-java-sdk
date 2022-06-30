// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSurveyJobCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("error")
    public String error;

    public static DescribeSurveyJobCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSurveyJobCountResponseBody self = new DescribeSurveyJobCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSurveyJobCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSurveyJobCountResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DescribeSurveyJobCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSurveyJobCountResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

}
