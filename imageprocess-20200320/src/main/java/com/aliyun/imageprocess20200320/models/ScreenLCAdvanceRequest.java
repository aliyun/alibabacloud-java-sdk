// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenLCAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<ScreenLCAdvanceRequestURLList> URLList;

    public static ScreenLCAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenLCAdvanceRequest self = new ScreenLCAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ScreenLCAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ScreenLCAdvanceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ScreenLCAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ScreenLCAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ScreenLCAdvanceRequest setURLList(java.util.List<ScreenLCAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenLCAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class ScreenLCAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static ScreenLCAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenLCAdvanceRequestURLList self = new ScreenLCAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenLCAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
