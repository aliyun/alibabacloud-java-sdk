// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetLogColumnTranslateResultRequest extends TeaModel {
    @NameInMap("ColumnValue")
    public String columnValue;

    @NameInMap("TranslateConfig")
    public String translateConfig;

    public static GetLogColumnTranslateResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogColumnTranslateResultRequest self = new GetLogColumnTranslateResultRequest();
        return TeaModel.build(map, self);
    }

    public GetLogColumnTranslateResultRequest setColumnValue(String columnValue) {
        this.columnValue = columnValue;
        return this;
    }
    public String getColumnValue() {
        return this.columnValue;
    }

    public GetLogColumnTranslateResultRequest setTranslateConfig(String translateConfig) {
        this.translateConfig = translateConfig;
        return this;
    }
    public String getTranslateConfig() {
        return this.translateConfig;
    }

}
