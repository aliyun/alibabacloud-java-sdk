// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenLCRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<ScreenLCRequestURLList> URLList;

    public static ScreenLCRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenLCRequest self = new ScreenLCRequest();
        return TeaModel.build(map, self);
    }

    public ScreenLCRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ScreenLCRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ScreenLCRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ScreenLCRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ScreenLCRequest setURLList(java.util.List<ScreenLCRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenLCRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class ScreenLCRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static ScreenLCRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenLCRequestURLList self = new ScreenLCRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenLCRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
