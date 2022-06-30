// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSummaryByStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Error")
    public String error;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSummaryByStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryByStatusResponseBody self = new DescribeSummaryByStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryByStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSummaryByStatusResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DescribeSummaryByStatusResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public DescribeSummaryByStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
