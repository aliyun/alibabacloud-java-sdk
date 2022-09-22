// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenECRequest extends TeaModel {
    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("URLList")
    public java.util.List<ScreenECRequestURLList> URLList;

    public static ScreenECRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenECRequest self = new ScreenECRequest();
        return TeaModel.build(map, self);
    }

    public ScreenECRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ScreenECRequest setURLList(java.util.List<ScreenECRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenECRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class ScreenECRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static ScreenECRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenECRequestURLList self = new ScreenECRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenECRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
