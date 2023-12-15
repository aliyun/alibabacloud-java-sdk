// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenECAdvanceRequest extends TeaModel {
    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("URLList")
    public java.util.List<ScreenECAdvanceRequestURLList> URLList;

    public static ScreenECAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenECAdvanceRequest self = new ScreenECAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ScreenECAdvanceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ScreenECAdvanceRequest setURLList(java.util.List<ScreenECAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenECAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class ScreenECAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static ScreenECAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenECAdvanceRequestURLList self = new ScreenECAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenECAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
