// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class AnalyzeChestVesselRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<AnalyzeChestVesselRequestURLList> URLList;

    public static AnalyzeChestVesselRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeChestVesselRequest self = new AnalyzeChestVesselRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeChestVesselRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public AnalyzeChestVesselRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public AnalyzeChestVesselRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public AnalyzeChestVesselRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public AnalyzeChestVesselRequest setURLList(java.util.List<AnalyzeChestVesselRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<AnalyzeChestVesselRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class AnalyzeChestVesselRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static AnalyzeChestVesselRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeChestVesselRequestURLList self = new AnalyzeChestVesselRequestURLList();
            return TeaModel.build(map, self);
        }

        public AnalyzeChestVesselRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
