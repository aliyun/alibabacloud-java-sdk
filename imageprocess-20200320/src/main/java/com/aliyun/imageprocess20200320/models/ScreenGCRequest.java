// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenGCRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<ScreenGCRequestURLList> URLList;

    public static ScreenGCRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenGCRequest self = new ScreenGCRequest();
        return TeaModel.build(map, self);
    }

    public ScreenGCRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ScreenGCRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ScreenGCRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ScreenGCRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ScreenGCRequest setURLList(java.util.List<ScreenGCRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenGCRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class ScreenGCRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static ScreenGCRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenGCRequestURLList self = new ScreenGCRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenGCRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
