// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class AnalyzeChestVesselAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    // 1
    @NameInMap("URLList")
    public java.util.List<AnalyzeChestVesselAdvanceRequestURLList> URLList;

    public static AnalyzeChestVesselAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeChestVesselAdvanceRequest self = new AnalyzeChestVesselAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeChestVesselAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public AnalyzeChestVesselAdvanceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public AnalyzeChestVesselAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public AnalyzeChestVesselAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public AnalyzeChestVesselAdvanceRequest setURLList(java.util.List<AnalyzeChestVesselAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<AnalyzeChestVesselAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class AnalyzeChestVesselAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static AnalyzeChestVesselAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeChestVesselAdvanceRequestURLList self = new AnalyzeChestVesselAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public AnalyzeChestVesselAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
