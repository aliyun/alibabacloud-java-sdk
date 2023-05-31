// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class PredictCVDAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("URLList")
    public java.util.List<PredictCVDAdvanceRequestURLList> URLList;

    public static PredictCVDAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictCVDAdvanceRequest self = new PredictCVDAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public PredictCVDAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public PredictCVDAdvanceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public PredictCVDAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public PredictCVDAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public PredictCVDAdvanceRequest setURLList(java.util.List<PredictCVDAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<PredictCVDAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class PredictCVDAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static PredictCVDAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            PredictCVDAdvanceRequestURLList self = new PredictCVDAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public PredictCVDAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
