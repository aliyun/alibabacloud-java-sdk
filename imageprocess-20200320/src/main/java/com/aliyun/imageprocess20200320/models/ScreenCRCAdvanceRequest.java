// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenCRCAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<ScreenCRCAdvanceRequestURLList> URLList;

    public static ScreenCRCAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenCRCAdvanceRequest self = new ScreenCRCAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ScreenCRCAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ScreenCRCAdvanceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ScreenCRCAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ScreenCRCAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ScreenCRCAdvanceRequest setURLList(java.util.List<ScreenCRCAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenCRCAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class ScreenCRCAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static ScreenCRCAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenCRCAdvanceRequestURLList self = new ScreenCRCAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenCRCAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
