// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class PredictCVDRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<PredictCVDRequestURLList> URLList;

    public static PredictCVDRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictCVDRequest self = new PredictCVDRequest();
        return TeaModel.build(map, self);
    }

    public PredictCVDRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public PredictCVDRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public PredictCVDRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public PredictCVDRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public PredictCVDRequest setURLList(java.util.List<PredictCVDRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<PredictCVDRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class PredictCVDRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static PredictCVDRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            PredictCVDRequestURLList self = new PredictCVDRequestURLList();
            return TeaModel.build(map, self);
        }

        public PredictCVDRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
