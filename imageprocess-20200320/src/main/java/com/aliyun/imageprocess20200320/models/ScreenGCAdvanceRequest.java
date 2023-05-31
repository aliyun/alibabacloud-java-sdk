// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenGCAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<ScreenGCAdvanceRequestURLList> URLList;

    public static ScreenGCAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenGCAdvanceRequest self = new ScreenGCAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ScreenGCAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ScreenGCAdvanceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ScreenGCAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ScreenGCAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ScreenGCAdvanceRequest setURLList(java.util.List<ScreenGCAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenGCAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class ScreenGCAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static ScreenGCAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenGCAdvanceRequestURLList self = new ScreenGCAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenGCAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
